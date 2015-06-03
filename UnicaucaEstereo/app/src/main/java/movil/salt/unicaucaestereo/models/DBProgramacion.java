package movil.salt.unicaucaestereo.models;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by pc on 27/05/2015.
 */
public class DBProgramacion extends SQLiteOpenHelper {
    public static final String DB_NAME = "programacion";

    public DBProgramacion(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String sqlCreate = "CREATE TABLE programacion (id INTEGER AUTO_INCREMENT PRIMARY KEY, name VARCHAR," +
                "startTime INTEGER, startMin INTEGER, endMin INTEGER, endTime INTEGER, description VARCHAR," +
                "announcer VARCHAR, director VARCHAR, day VARCHAR, typep VARCHAR )";
        sqLiteDatabase.execSQL(sqlCreate);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i2) {

    }


    public Programa getProgramaActual(Context context){
        String dia="Sunday";
        Calendar cal = new GregorianCalendar();
        int diaEntero = cal.DAY_OF_MONTH;

        switch (diaEntero){
            case 1:
                dia = "Sunday";
                break;
            case 2:
                dia = "Monday";
                break;
            case 3:
                dia = "Tuesday";
                break;
            case 4:
                dia = "Wednesday";
                break;
            case 5:
                dia = "Thursday";
                break;
            case 6:
                dia = "Friday";
                break;
            case 7:
                dia = "Saturday";
                break;
        }

        Date fecha = new Date();


        Programa proActual = new Programa();
        String sql1= "SELECT * FROM programacion WHERE day = '"+dia+"' AND startTime <= '"+fecha.getHours()+"' AND endTime > '"+fecha.getHours()+"'";
        DBProgramacion dbProgramacion = new DBProgramacion(context,DB_NAME, null, 1);
        SQLiteDatabase db = dbProgramacion.getWritableDatabase();

        Cursor cursor = db.rawQuery(sql1,null);
        if (cursor.getCount() != 0)
        {
            for (int i =0; i< cursor.getCount();i++)
            {
                cursor.moveToPosition(i);
                Log.d("Flag-minutos actuales",""+fecha.getMinutes());
                Log.d("Flag-minutos inicia",""+Integer.parseInt(cursor.getString(3)));
                Log.d("Flag-minutos termina",""+Integer.parseInt(cursor.getString(4)));
                Log.d("Flag-minutos termina","---------------------------------------------");

                if (Integer.parseInt(cursor.getString(3))<=fecha.getMinutes() )
                {
                    proActual.setName(cursor.getString(1));
                    proActual.setStartTime(Integer.parseInt(cursor.getString(2)));
                    proActual.setStartMin(Integer.parseInt(cursor.getString(3)));
                    proActual.setEndMin(Integer.parseInt(cursor.getString(4)));
                    proActual.setEndTime(Integer.parseInt(cursor.getString(5)));
                    proActual.setDescription(cursor.getString(6));
                    proActual.setAnnouncer(cursor.getString(7));
                    proActual.setDirector(cursor.getString(8));
                    proActual.setDay(cursor.getString(9));
                    proActual.setTypep(cursor.getString(10));
                }
                else
                {
                    if ( Integer.parseInt(cursor.getString(4))>fecha.getMinutes())
                    {
                        proActual.setName(cursor.getString(1));
                        proActual.setStartTime(Integer.parseInt(cursor.getString(2)));
                        proActual.setStartMin(Integer.parseInt(cursor.getString(3)));
                        proActual.setEndMin(Integer.parseInt(cursor.getString(4)));
                        proActual.setEndTime(Integer.parseInt(cursor.getString(5)));
                        proActual.setDescription(cursor.getString(6));
                        proActual.setAnnouncer(cursor.getString(7));
                        proActual.setDirector(cursor.getString(8));
                        proActual.setDay(cursor.getString(9));
                        proActual.setTypep(cursor.getString(10));
                    }
                }
            }

        }
        else
        {
            proActual.setName("hora: "+fecha.getMinutes());
            proActual.setDescription("curso de tamaño cero");
        }

        return proActual;
    }


    public ArrayList<Programa> getProgramacionDia(Context context, String dia)
    {


        ArrayList<Programa> programasDia = new ArrayList<>();

        String sql ="SELECT * FROM programacion WHERE day = '"+dia+"'";
        DBProgramacion dbProgramacion = new DBProgramacion(context,DB_NAME, null, 1);
        SQLiteDatabase db = dbProgramacion.getWritableDatabase();

        Cursor cursor = db.rawQuery(sql,null);
        if (cursor.getCount() != 0)
        {
            for (int i =0; i<cursor.getCount();i++)
            {
                Programa pro = new Programa();
                cursor.moveToPosition(i);
                pro.setName(cursor.getString(1));
                Log.d("Nombre desde la consulata: ",cursor.getString(1));
                pro.setStartTime(Integer.parseInt(cursor.getString(2)));
                pro.setStartMin(Integer.parseInt(cursor.getString(3)));
                pro.setEndMin(Integer.parseInt(cursor.getString(4)));
                pro.setEndTime(Integer.parseInt(cursor.getString(5)));
                pro.setDescription(cursor.getString(6));
                pro.setAnnouncer(cursor.getString(7));
                pro.setDirector(cursor.getString(8));
                pro.setDay(cursor.getString(9));
                pro.setTypep(cursor.getString(10));

                programasDia.add(pro);
            }

        }
        else
        {
            programasDia = null;
        }
        return  programasDia;


    }
}
