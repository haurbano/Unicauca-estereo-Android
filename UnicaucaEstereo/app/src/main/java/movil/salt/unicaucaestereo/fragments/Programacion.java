package movil.salt.unicaucaestereo.fragments;



import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

import movil.salt.unicaucaestereo.R;
import movil.salt.unicaucaestereo.adapters.TitleFragment;

/**
 * A simple {@link android.support.v4.app.Fragment} subclass.
 */
public class Programacion extends Fragment {
    View v;
    ViewPager pager;
    List<TitleFragment> data;
    PagerAdapter adapter;

    public Programacion() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_programacion2, container, false);

        pager = (ViewPager) v.findViewById(R.id.pager);
        data = new ArrayList<>();

        data.add(new Lunes());
        data.add(new Martes());
        data.add(new Miercoles());
        data.add(new Jueves());
        data.add(new Viernes());
        data.add(new Sabado());
        data.add(new Domingo());

       adapter = new movil.salt.unicaucaestereo.adapters.PagerAdapter(getFragmentManager(),data);
       pager.setAdapter(adapter);


        return v;
    }



}
