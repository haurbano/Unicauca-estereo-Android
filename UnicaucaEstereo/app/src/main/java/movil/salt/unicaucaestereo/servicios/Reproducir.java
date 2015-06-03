package movil.salt.unicaucaestereo.servicios;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

import java.io.IOException;

/**
 * Created by pc on 28/05/2015.
 */
public class Reproducir extends Service implements MediaPlayer.OnPreparedListener {



    MediaPlayer mediaPlayer = new MediaPlayer();

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId)
    {
        if (intent.getStringExtra("estado").equalsIgnoreCase("play"))
        {

            mediaPlayer.stop();
            mediaPlayer.reset();
            mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);

            try {
                mediaPlayer.setDataSource(intent.getStringExtra("url"));
                mediaPlayer.setOnPreparedListener(this);
                mediaPlayer.prepareAsync();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else
        {
            mediaPlayer.start();

        }

        return super.onStartCommand(intent, flags, startId);

    }


    @Override
    public void onDestroy() {
        mediaPlayer.pause();
        super.onDestroy();
    }

    @Override
    public void onPrepared(MediaPlayer mediaPlayer) {
        mediaPlayer.start();
    }
}
