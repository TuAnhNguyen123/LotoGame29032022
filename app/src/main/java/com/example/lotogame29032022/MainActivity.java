package com.example.lotogame29032022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView mTvOutPut, mTvHistory;
    Button mBtnReset,mBtnPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnhXa();

        // Arraylist
        ArrayList<String> arr = new ArrayList<>();
        arr.add("A");
        arr.add("B");
        arr.add("C");
        arr.set(0,"D");

    }

    private void AnhXa() {
        mTvOutPut = findViewById(R.id.textViewOutput);
        mTvHistory = findViewById(R.id.textViewHistory);
        mBtnReset = findViewById(R.id.buttonReset);
        mBtnPlay = findViewById(R.id.buttonPlay);
    }
}