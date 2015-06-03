package movil.salt.unicaucaestereo.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import movil.salt.unicaucaestereo.R;
import movil.salt.unicaucaestereo.models.Programa;

/**
 * Created by pc on 27/05/2015.
 */
public class AdapterProgramacion extends BaseAdapter {
    List<Programa> data;
    Context context;

    TextView txt_nombre,txt_director,txt_hora;

    public AdapterProgramacion(List<Programa> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup)
    {
        View v;
        if (view == null)
        v = View.inflate(context, R.layout.adapter_programacion,null);
        else
        v=view;

        txt_nombre = (TextView) v.findViewById(R.id.txt_nombre_programa_P);
        txt_director = (TextView) v.findViewById(R.id.txt_director_programa_P);
        txt_hora = (TextView) v.findViewById(R.id.txt_hora_programa_P);

        Programa programa = (Programa) getItem(i);

        txt_nombre.setText(programa.getName());
        txt_director.setText(programa.getDirector());
        String hora = programa.getStartTime()+":"+programa.getStartMin()+" - "+programa.getEndTime()+":"+programa.getEndMin();
        txt_hora.setText(hora);

        return v;
    }
}
