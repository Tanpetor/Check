package com.example.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView Log,Pass,Res;
    Button Check;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Check = findViewById(R.id.Check);
        Pass = findViewById(R.id.Password);
        Log = findViewById(R.id.Login);
        Res = findViewById(R.id.Result);
        Check.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String l, p;
        String log = Log.getText().toString();
        String pass = Pass.getText().toString();
        l = "12345";
        p = "12345";
        if(l.equals(log) && p.equals(pass)){
            Res.setTextColor(Color.GREEN);
            Res.setText("Right");
        }else {
            Res.setTextColor(Color.RED);
            Res.setText("Wrong");
        }
        Log.setText("");
        Pass.setText("");
    }
}