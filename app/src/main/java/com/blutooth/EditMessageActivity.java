package com.blutooth;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Context;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class EditMessageActivity extends AppCompatActivity {
    TextView tv_connectDevice;
    EditText et_EditData;
    Toolbar toolbar;
    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_message);

        toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        setTitle("Enter Message");

        tv_connectDevice = findViewById(R.id.tv_connectDevice);
        et_EditData = findViewById(R.id.et_EditData);
    }
}
