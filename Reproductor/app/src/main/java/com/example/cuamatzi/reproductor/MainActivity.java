package com.example.cuamatzi.reproductor;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.BufferedReader;

public class MainActivity extends AppCompatActivity {

    Button playpause;
    MediaPlayer mp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        playpause = findViewById(R.id.Play);
        //Damos en REBUILD Project
        mp = MediaPlayer.create(this,R.raw.musica);
        playpause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mp.isPlaying()){
                    mp.pause();
                    playpause.setBackgroundResource(R.drawable.play);
                    Toast.makeText(MainActivity.this,"PAUSA",Toast.LENGTH_LONG).show();
                }else{
                    mp.start();
                    playpause.setBackgroundResource(R.drawable.pause);
                    Toast.makeText(MainActivity.this,"PLAY",Toast.LENGTH_LONG).show();

                }
            }
        });


    }
}
