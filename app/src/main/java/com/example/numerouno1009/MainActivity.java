package com.example.numerouno1009;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String nameApp = "HOLA QUÉ PASA?";
        TextView mTextView = findViewById(R.id.textView);
        mTextView.setText(nameApp);
    }
}