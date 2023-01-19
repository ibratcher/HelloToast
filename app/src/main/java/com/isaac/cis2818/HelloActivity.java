package com.isaac.cis2818;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HelloActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        Intent intent = getIntent();

        String count = intent.getStringExtra("COUNT_VALUE");

        TextView textView = findViewById(R.id.hello_count);

        textView.setText(count);
    }
}