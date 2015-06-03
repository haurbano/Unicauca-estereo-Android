package movil.salt.unicaucaestereo.fragments;


import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView;
import android.widget.Toast;


import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;

import movil.salt.unicaucaestereo.R;
import movil.salt.unicaucaestereo.adapters.AdapterCancion;
import movil.salt.unicaucaestereo.models.Cancion;
import movil.salt.unicaucaestereo.servicios.Reproducir;

/**
 * A simple {@link android.support.v4.app.Fragment} subclass.
 */
public class Tumusica extends Fragment implements AdapterView.OnItemClickListener, View.OnClickListener, MediaPlayer.OnPreparedListener {
    String ESTADO_PLAY = "play";

    ImageView Play_Pause,Siguiente,Atras,buscar;
    TextView txt_nombre,txt_artista,txt_buscar;
    String URL_MUSICA ="http://www.unicauca.edu.co/emisora/ConexionDBEmisora/index.php";
    View v;
    ListView list_canciones;
    int tamañoList;
    String estado;

    int id=0;

    static final String TEXTO_VOLTEAR_PANTALLA="txt";


    ArrayList<Cancion> canciones;
    ArrayList<Cancion> canciones_busqueda;
    ArrayList<String> titles;
    String Banedra;
    JSONArray data;

    int flag = 0;
    String Estado_emisora = "pause";

    AdapterCancion adapterCancion;

    MediaPlayer mediaPlayer;
    Cancion cancion_selected;

    Intent intent;


    public Tumusica() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.fragment_tumusica, container, false);
        list_canciones = (ListView) v.findViewById(R.id.list_canciones);
        canciones = new ArrayList<>();
        canciones_busqueda = new ArrayList<>();
        titles= new ArrayList<>();
        new TraerCanciones().execute();


        txt_nombre = (TextView) v.findViewById(R.id.txt_nombre);
        txt_artista = (TextView) v.findViewById(R.id.txt_artista);

        buscar = (ImageView) v.findViewById(R.id.btn_buscar_cancion);
        txt_buscar = (TextView) v.findViewById(R.id.txt_buscar_cancion);

        Play_Pause  = (ImageView) v.findViewById(R.id.btn_vivo_pause);
        Siguiente = (ImageView) v.findViewById(R.id.btn_siguiente_cancion);
        Atras = (ImageView) v.findViewById(R.id.btn_atras_cancion);

        list_canciones.setOnItemClickListener(this);

        buscar.setOnClickListener(this);

        if (savedInstanceState != null){
        txt_buscar.setText(savedInstanceState.getString(TEXTO_VOLTEAR_PANTALLA));
        }

        intent = new Intent(v.getContext(), Reproducir.class);

        return v;
    }



    public void ExecutarGet() throws IOException, JSONException {
        HttpClient client = new DefaultHttpClient();
        HttpGet request = new HttpGet(URL_MUSICA);

        HttpResponse response = client.execute(request);
        String rta = EntityUtils.toString(response.getEntity(), "UTF-8");

        try
        {
         Banedra = "Entra try";
        data = new JSONArray(rta);
        for (int i=0; i< data.length();i++) {
            Cancion cancion = new Cancion();
            JSONObject song = data.getJSONObject(i);
            cancion.setId(song.getString("id"));
            cancion.setUri(song.getString("uri"));
            cancion.setTitle(song.getString("title"));
            cancion.setArtist(song.getString("artist"));
            canciones.add(cancion);
            titles.add(cancion.getTitle());
        }
            tamañoList = data.length();

        }catch (Exception e)
        {
            Banedra ="Entra Cath";
        }
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        getActivity().stopService(intent);
        estado= "stop";
        Estado_emisora = "pause";
        Play_Pause.setImageResource(R.drawable.play);
        cancion_selected = new Cancion();
        id = i;

        if (flag == 0)
        cancion_selected = canciones.get(i);
        else
        cancion_selected = canciones_busqueda.get(i);

        txt_nombre.setText(cancion_selected.getTitle());
        txt_artista.setText(cancion_selected.getArtist());

        intent.putExtra("url",cancion_selected.getUri());
        intent.putExtra("estado", ESTADO_PLAY);
        getActivity().startService(intent);
        Play_Pause.setImageResource(R.drawable.pause);
        Estado_emisora = "play";



        Play_Pause.setOnClickListener(this);
        Siguiente.setOnClickListener(this);
        Atras.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        switch (view.getId())
        {
            case R.id.btn_vivo_pause:

               if (Estado_emisora == "pause") {
                   Estado_emisora = "play";
                   Play_Pause.setImageResource(R.drawable.pause);
                   try {
                       if (estado == "pause") {
                           //onPrepared(mediaPlayer);

                           intent.putExtra("url",cancion_selected.getUri());
                           getActivity().startService(intent);

                       } else {

                           intent.putExtra("url",cancion_selected.getUri());
                           getActivity().startService(intent);
                       }
                   } catch (Exception e) {
                       e.printStackTrace();
                   }
               }
               else
               {
                   Play_Pause.setImageResource(R.drawable.play);
                   Estado_emisora = "pause";
                   estado="pause";
                   //txt_estado.setText("Detenido");

                   getActivity().stopService(intent);
                   //mediaPlayer.pause();
               }
                break;
            case R.id.btn_siguiente_cancion:
                getActivity().stopService(intent);
                cancion_selected = new Cancion();
                if(id == canciones.size()-1)
                {
                    id = 0;
                }
                else
                {
                    id = id+1;
                }
                cancion_selected = canciones.get(id);

                intent.putExtra("url",cancion_selected.getUri());
                getActivity().startService(intent);

                txt_nombre.setText(cancion_selected.getTitle());
                txt_artista.setText(cancion_selected.getArtist());


                break;
            case R.id.btn_atras_cancion:
               // mediaPlayer.stop();
                //mediaPlayer.reset();
                getActivity().stopService(intent);
                cancion_selected = new Cancion();
                if (id == 0)
                {
                    id = canciones.size()-1;
                }
                else
                {
                    id = id-1;
                }

                cancion_selected = canciones.get(id);
                 //mediaPlayer.setDataSource(cancion_selected.getUri());
                 intent.putExtra("url",cancion_selected.getUri());
                 getActivity().startService(intent);

                //mediaPlayer.setOnPreparedListener(this);
                //mediaPlayer.prepareAsync();
                txt_nombre.setText(cancion_selected.getTitle());
                txt_artista.setText(cancion_selected.getArtist());

                break;

            case R.id.btn_buscar_cancion:
                try {
                    Buscarcancion(txt_buscar.getText().toString());
                    txt_buscar.setText(" ");
                    InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(txt_buscar.getWindowToken(), 0);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                break;
        }

    }

    @Override
    public void onPrepared(MediaPlayer mediaPlayer) {
        mediaPlayer.start();
    }


    public  class TraerCanciones extends AsyncTask {
        @Override
        protected Object doInBackground(Object[] objects) {
            try {
                ExecutarGet();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Object o) {
            super.onPostExecute(o);
            adapterCancion = new AdapterCancion(v.getContext(),canciones);
            list_canciones.setAdapter(adapterCancion);
        }
    }

    public void Buscarcancion(String nom) throws JSONException {

        canciones_busqueda.clear();
        for (int i=0; i< data.length();i++)
        {
            JSONObject song = data.getJSONObject(i);
            String nombre = song.getString("title").toLowerCase();
            String artista = song.getString("artist").toLowerCase();

            if( nombre.contains(nom.toLowerCase()) || artista.contains(nom.toLowerCase()) )
            {
                flag=1;

                Cancion canB = new Cancion();
                canB.setId(song.getString("id"));
                canB.setUri(song.getString("uri"));
                canB.setTitle(song.getString("title"));
                canB.setArtist(song.getString("artist"));
                canciones_busqueda.add(canB);
            }

        }
        if (flag == 0)
        {
            Toast.makeText(v.getContext(),"No se obtuvieron resultados",Toast.LENGTH_SHORT).show();
        }
        else
        {
            adapterCancion = new AdapterCancion(v.getContext(),canciones_busqueda);
            list_canciones.setAdapter(adapterCancion);
            list_canciones.deferNotifyDataSetChanged();
            list_canciones.invalidateViews();
            list_canciones.refreshDrawableState();
        }



    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        String buscar = txt_buscar.getText().toString();
        outState.putString(TEXTO_VOLTEAR_PANTALLA, buscar);
        super.onSaveInstanceState(outState);
    }
}
