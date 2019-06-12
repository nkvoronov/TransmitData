package com.nkvoronov.transmitdata;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.EditText;

public class TransmitActivity extends AppCompatActivity {
    private EditText userTextEdit;
    private EditText messageTextEdit;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transmit);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        userTextEdit = (EditText) findViewById(R.id.edt_to);
        messageTextEdit = (EditText) findViewById(R.id.edt_message);
        intent = new Intent(this, SecondActivity.class);
    }

    public void onClickTransmit(View view) {
        intent.putExtra("username", userTextEdit.getText().toString());
        intent.putExtra("message", messageTextEdit.getText().toString());
        startActivity(intent);
    }
}
