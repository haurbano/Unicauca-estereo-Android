package movil.salt.unicaucaestereo.fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

import movil.salt.unicaucaestereo.MainActivity;
import movil.salt.unicaucaestereo.R;
import movil.salt.unicaucaestereo.adapters.AdapterProgramacion;
import movil.salt.unicaucaestereo.adapters.TitleFragment;
import movil.salt.unicaucaestereo.models.DBProgramacion;
import movil.salt.unicaucaestereo.models.Programa;

/**
 * A simple {@link android.app.Fragment} subclass.
 */
public class Viernes extends TitleFragment {

    public final static String dia = "Friday";

    private final String title = "Viernes";
    View v;
    ListView list_viernes;

    public Viernes() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_viernes, container, false);
        list_viernes = (ListView) v.findViewById(R.id.list_viernes);
        cargarProgramas();
        return v;
    }


    @Override
    public String getTitle() {
        return title;
    }

    public void cargarProgramas()
    {
        DBProgramacion dbProgramacion = new DBProgramacion(v.getContext(), MainActivity.DB_NAME, null, 1);
        ArrayList<Programa> programas = new ArrayList<>();
        programas = dbProgramacion.getProgramacionDia(v.getContext(),dia);
        if(programas != null)
        {
            AdapterProgramacion adapter = new AdapterProgramacion(programas, v.getContext());
            list_viernes.setAdapter(adapter);

        }

    }
}
