package com.codeclan.example.morsecodeapp;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Encoder encoder;
    MorsePlayer player;
    TextView resultTv;
    EditText toEncode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        encoder = new Encoder();
        player = new MorsePlayer();
        resultTv = (TextView) findViewById(R.id.result);
        toEncode = (EditText) findViewById(R.id.to_encode);
    }

    public void updateUI(){
        String toEncode = this.toEncode.getText().toString();
        encoder.setPhrase(toEncode);
        String result = encoder.encode();
        resultTv.setText(result);
    }

    public void encode(View view) {
        updateUI();
    }

    public void play(View view) {
        updateUI();

        player.setMorse(encoder.encode());
        player.start();
    }
}
