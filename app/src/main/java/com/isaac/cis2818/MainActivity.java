package com.isaac.cis2818;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;

    private TextView mShowCount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = findViewById(R.id.show_count);

        if (savedInstanceState != null) {
            String count =
                    savedInstanceState.getString("count");
            mCount = Integer.parseInt(count);
            if (mShowCount != null)
                mShowCount.setText(count);
        }
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("count",
                String.valueOf(mShowCount.getText()));
    }

    public void showToast(View view) {
        Intent intent = new Intent(this, HelloActivity.class);
        intent.putExtra("COUNT_VALUE", Integer.toString(mCount));
        startActivity(intent);
    }

    @SuppressLint("SetTextI18n")
    public void countUp(View view) {
        ++mCount;
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }
    }
}