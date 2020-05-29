package com.example.seekbardemo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private SeekBar seekBar;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // all in one hu hu ha ha

        allInOne();

    }

    public void allInOne()
    {
        seekBar = findViewById(R.id.seekBarId);
        textView = findViewById(R.id.textOfSeek);
        // default text view
        textView.setText("Volume : " + seekBar.getProgress() + "/" + seekBar.getMax());
        // in deafult max size is 100
        // but in case we set it 10


        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                textView.setText("Volume : " + seekBar.getProgress() + "/" + seekBar.getMax());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getApplicationContext(),"onStartTrackingTouch",Toast.LENGTH_LONG).show();

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

                Toast.makeText(getApplicationContext(),"onStopTrackingTouch",Toast.LENGTH_LONG).show();

            }
        });

    }
}
