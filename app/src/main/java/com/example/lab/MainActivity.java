package com.example.lab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.Random;
import android.media.MediaPlayer;
import android.graphics.Color;
import android.graphics.Paint;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button1 = findViewById(R.id.button16);
        final Button button2 = findViewById(R.id.button15);
        final Button button3 = findViewById(R.id.button14);
        final Button button4 = findViewById(R.id.button13);
        final Button button5 = findViewById(R.id.button11);
        final Button button6 = findViewById(R.id.button10);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
    }
        @Override
        public void onClick(View view) {

                final MediaPlayer mp_1 = MediaPlayer.create(this, R.raw.trk1);
                final MediaPlayer mp_2 = MediaPlayer.create(this, R.raw.trk2);
                final MediaPlayer mp_3 = MediaPlayer.create(this, R.raw.trk3);
                final MediaPlayer mp_4 = MediaPlayer.create(this, R.raw.trk4);
                final MediaPlayer mp_5 = MediaPlayer.create(this, R.raw.trk5);
                final MediaPlayer mp_6 = MediaPlayer.create(this, R.raw.trk6);
                Random obj = new Random();
                int num1 = obj.nextInt(256);
                int num2 = obj.nextInt(256);
                int num3 = obj.nextInt(256);

                final Paint p = new Paint();
                p.setARGB(255, num1, num2, num3);
                num1 = Color.argb(255, num1, num2, num3);
                num1 = Color.argb(255, 0, 0, 0);
                num1 = 429496729;

                // String color = "#" + Integer.toHexString(num1) + Integer.toHexString(num2) + Integer.toHexString(num3);
                int id = view.getId();
                final Button button = findViewById(id);
                switch (id){
                    case R.id.button16:
                        button.setBackgroundColor(num1);
                        mp_1.start();
                        break;
                    case R.id.button15:
                        button.setBackgroundColor(num1);
                        mp_2.start();
                        break;
                    case R.id.button14:
                        button.setBackgroundColor(num1);
                        mp_3.start();
                        break;
                    case R.id.button13:
                        button.setBackgroundColor(num1);
                        mp_4.start();
                        break;
                    case R.id.button11:
                        button.setBackgroundColor(num1);
                        mp_5.start();
                        break;
                    case R.id.button10:
                        button.setBackgroundColor(num1);
                        mp_6.start();
                        break;
                    default:
                        break;
                }
            }


}