package movil.salt.unicaucaestereo;

import android.content.ContentValues;
import android.content.Intent;
import android.content.res.Configuration;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import movil.salt.unicaucaestereo.fragments.About;
import movil.salt.unicaucaestereo.fragments.Envivo;
import movil.salt.unicaucaestereo.fragments.Programacion;
import movil.salt.unicaucaestereo.fragments.Tumusica;
import movil.salt.unicaucaestereo.models.DBProgramacion;
import movil.salt.unicaucaestereo.models.Programa;
import movil.salt.unicaucaestereo.servicios.Reproducir;


public class MainActivity extends ActionBarActivity implements AdapterView.OnItemClickListener, DrawerLayout.DrawerListener {
    public static final String DB_NAME ="programacion";
    public static final String POS = "pos";

    ListView lista_drawer;
    String[] opciones_drawer;
    DrawerLayout drawer;
    ActionBarDrawerToggle toggle;

    Programa programa = new Programa();

    int flagFragment=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //region Drawer


        lista_drawer=(ListView) findViewById(R.id.list_drawer); //obtenemos el ListView de el xml

        opciones_drawer = getResources().getStringArray(R.array.list_drawer_resources);//Obtenemos el array de los recursos que iran en la lista anterior

        //Enviamos los valores de el array_recurso a el ListVire del xml con un adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,opciones_drawer );
        lista_drawer.setAdapter(adapter);

        //Le ponemos un evento al listView para seleccionar una de las opciones
        lista_drawer.setOnItemClickListener(this);
        //Optenemos el drawer para poderlo errar cuando se de click en una opcion
        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);


        //Para mostrar el boton drawer

        drawer.setDrawerListener(this);//Con esta linea se crean los eventos onDrawerSlider, onDrawerOpened, onDrawerClosed, onDrawerStateChanged

        toggle = new ActionBarDrawerToggle(this,drawer,R.string.toggle_abierto,R.string.toggle_cerrado);

        //Para mostrar el boton toogle
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        //endregion

        //Iniciar en el fragment Inicial


        if(savedInstanceState!=null){
            flagFragment = savedInstanceState.getInt(POS);
        }

        fragmentInicial();

        insertProgramas();



    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putInt(POS, flagFragment);

        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Intent intent = new Intent(getApplicationContext(), Reproducir.class);
        stopService(intent);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        flagFragment=i;
        switch (i)
        {
            case 0:
                Envivo envivo = new Envivo();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.content_frame,envivo);
                transaction.commit();
                break;
            case 1:
                Tumusica musica = new Tumusica();
                FragmentTransaction transaction1 = getSupportFragmentManager().beginTransaction();
                transaction1.replace(R.id.content_frame,musica);
                transaction1.commit();
                break;
            case 2:
                Programacion programacion = new Programacion();
                FragmentTransaction transaction2 = getSupportFragmentManager().beginTransaction();
                transaction2.replace(R.id.content_frame,programacion);
                transaction2.commit();
                break;
            case 3:
                About about = new About();
                FragmentTransaction transaction3 = getSupportFragmentManager().beginTransaction();
                transaction3.replace(R.id.content_frame,about);
                transaction3.commit();
                break;
        }
        drawer.closeDrawers();
    }

    public void fragmentInicial()
    {

        FragmentTransaction transaction3 = getSupportFragmentManager().beginTransaction();

        switch (flagFragment)
        {

            case 0:
                Envivo fragment = new Envivo();
                transaction3.replace(R.id.content_frame,fragment);
                break;
            case 1:
                Tumusica musica = new Tumusica();
                transaction3.replace(R.id.content_frame,musica);
                break;
            case 2:
                Programacion programacion = new Programacion();
                transaction3.replace(R.id.content_frame,programacion);
                break;
            case 3:
                About about = new About();
                transaction3.replace(R.id.content_frame,about);
                break;
        }


        transaction3.commit();
    }

    //regiono Eventos_Toggle
    @Override
    public void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        toggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        toggle.onConfigurationChanged(newConfig);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (toggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    //Con estos cuatro eventos ultimos hace el efecto
    @Override
    public void onDrawerSlide(View view, float v) {

        toggle.onDrawerSlide(view,v);
    }

    @Override
    public void onDrawerOpened(View view) {
        toggle.onDrawerOpened(view);
    }

    @Override
    public void onDrawerClosed(View view) {
        toggle.onDrawerClosed(view);
    }

    @Override
    public void onDrawerStateChanged(int i) {
        toggle.onDrawerStateChanged(i);
    }
    //endregion


    public void insertProgramas()
    {
        String sql ="SELECT * FROM programacion";
        ArrayList<Programa> programas = programa.getProgramas();
        DBProgramacion programacion = new DBProgramacion(this, DB_NAME, null, 1);
        SQLiteDatabase db = programacion.getWritableDatabase();
        Cursor cursor = db.rawQuery(sql,null);
        if (db != null) {
            if (cursor.getCount() == 0) {

                for (int i = 0; i < programas.size(); i++) {
                    Programa p = new Programa();
                    p = programas.get(i);
                    ContentValues values = new ContentValues();

                    values.put("name", p.getName());
                    values.put("startTime", p.getStartTime());
                    values.put("startMin", p.getStartMin());
                    values.put("endMin", p.getEndMin());
                    values.put("endTime", p.getEndTime());
                    values.put("description", p.getDescription());
                    values.put("announcer", p.getAnnouncer());
                    values.put("director", p.getDirector());
                    values.put("day", p.getDay());
                    values.put("typep", p.getTypep());

                    db.insert(DB_NAME, null, values);
                }
            }
        }

    }




}
