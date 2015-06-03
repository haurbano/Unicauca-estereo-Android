package movil.salt.unicaucaestereo.fragments;


import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import movil.salt.unicaucaestereo.MainActivity;
import movil.salt.unicaucaestereo.R;
import movil.salt.unicaucaestereo.models.DBProgramacion;
import movil.salt.unicaucaestereo.models.Programa;
import movil.salt.unicaucaestereo.servicios.Reproducir;

/**
 * A simple {@link android.support.v4.app.Fragment} subclass.
 */
public class Envivo extends Fragment implements View.OnClickListener, MediaPlayer.OnPreparedListener {
    String URL_EMISORA = "http://emisora.unicauca.edu.co:8000/stream";
    String ESTADO_PLAY = "play";
    String ESTADO_REANUDAR = "reanudar";

    ImageView play;
    ImageView pause;
    View v;
    MediaPlayer mediaPlayer;

    TextView txt_estado;
    String estado = "Detenido";

    TextView txt_nombre_programa,txt_director_programa,txt_hora_programa;
    Intent intent;

    public Envivo() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_envivo, container, false);



        play = (ImageView) v.findViewById(R.id.btn_emisora_play);
        pause = (ImageView) v.findViewById(R.id.btn_emisora_pause);

        txt_nombre_programa = (TextView) v.findViewById(R.id.txt_nombre_programa);
        txt_director_programa = (TextView) v.findViewById(R.id.txt_director_programa);
        txt_hora_programa = (TextView) v.findViewById(R.id.txt_hora_programa);

        getProgramaActual();

        play.setOnClickListener(this);
        pause.setOnClickListener(this);

        //mediaPlayer = new MediaPlayer();

        intent = new Intent(v.getContext(),Reproducir.class);


        return v;
    }





    @Override
    public void onClick(View view) {
        intent.putExtra("url",URL_EMISORA);
        switch (view.getId())
        {

            case R.id.btn_emisora_play:

                if (estado == "Detenido")
                {

                    intent.putExtra("estado", ESTADO_PLAY);
                    try {
                        getActivity().startService(intent);
                        estado = "pause";

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                else {
                        getActivity().startService(intent);
                }
                break;

            case R.id.btn_emisora_pause:
                //intent.putExtra("estado", ESTADO_REANUDAR);
                if (estado != "Detenido")
                {
                    getActivity().stopService(intent);
                }
                break;
        }

    }

    public void getProgramaActual()
    {
        DBProgramacion dbProgramacion = new DBProgramacion(v.getContext(), MainActivity.DB_NAME, null, 1);
        Programa proActual = new Programa();
        proActual = dbProgramacion.getProgramaActual(v.getContext());

        if (proActual != null)
        {
            txt_nombre_programa.setText(proActual.getName());
            txt_director_programa.setText(proActual.getDirector());
            String hora = proActual.getStartTime()+":"+proActual.getStartMin()+" - "+proActual.getEndTime()+":"+proActual.getEndMin();
            txt_hora_programa.setText(hora);

            //Log.d("Programa actual",proActual.getName());
            //Log.d("Programa actual",proActual.getAnnouncer());
            //Log.d("Programa actual",proActual.getDirector());
        }
        else
        {

            Log.d("Progroma actual: ","NULOOOO");
        }
    }

    @Override
    public void onPrepared(MediaPlayer mediaPlayer) {
        txt_estado.setText("En vivo");
        mediaPlayer.start();
    }
}
