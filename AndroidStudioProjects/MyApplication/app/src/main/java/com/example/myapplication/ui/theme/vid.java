package com.example.myapplication.ui.theme;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import androidx.activity.ComponentActivity;
import androidx.annotation.Nullable;

import com.example.myapplication.R;


public class vid extends ComponentActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout8);

        VideoView v1 = (VideoView) findViewById(R.id.video1);
        final MediaController mediacontroller = new MediaController(this);
        mediacontroller.setAnchorView(v1);


        v1.setMediaController(mediacontroller);
        v1.setVideoURI(Uri.parse("https://www.w3schools.com/html/movie.mp4"));
        v1.requestFocus();

        v1.start();


    }
}
}
