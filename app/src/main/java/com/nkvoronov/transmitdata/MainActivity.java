package com.nkvoronov.transmitdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickTransmit(View view) {
        Intent intent = new Intent(MainActivity.this, TransmitActivity.class);
        startActivity(intent);
    }

    public void onClickAnswer(View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("username", "test");
        intent.putExtra("message", "test");
        startActivity(intent);
    }
}
