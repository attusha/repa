package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView myTextVar;

    private CheckBox chkBox;

    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        myTextVar = findViewById(R.id.myText);
        chkBox = findViewById(R.id.checkBox);
        btn = findViewById(R.id.button);

        myTextVar.setText("new text in TextView");
        chkBox.setChecked(true);
        btn.setEnabled(false);


    }
}