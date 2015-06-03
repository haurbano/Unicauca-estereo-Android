package movil.salt.unicaucaestereo.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import movil.salt.unicaucaestereo.R;
import movil.salt.unicaucaestereo.models.Cancion;


/**
 * Created by pc on 25/05/2015.
 */
public class AdapterCancion extends BaseAdapter {

    Context context;
    List<Cancion> data;

    public AdapterCancion(Context context,List<Cancion> data)
    {
        this.context = context;
        this.data = data;

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
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v;
        if(view == null)
            v = View.inflate(context, R.layout.adapter_cancion,null);
        else
        v = view;

        Cancion cancion = (Cancion) getItem(i);

        TextView title = (TextView) v.findViewById(R.id.title);
        title.setText(cancion.getTitle());

        TextView artist = (TextView) v.findViewById(R.id.artist);
        artist.setText(cancion.getArtist());
        return v;
    }
}
