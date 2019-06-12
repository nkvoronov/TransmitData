package com.nkvoronov.transmitdata;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        String user = "ЖЫвотное";
        String msg = "дырку от бублика";

        user = getIntent().getExtras().getString("username");
        msg = getIntent().getExtras().getString("message");

        TextView infoTextView = (TextView)findViewById(R.id.tw_message);
        infoTextView.setText(user + ", вам передали " + msg);
    }

}
