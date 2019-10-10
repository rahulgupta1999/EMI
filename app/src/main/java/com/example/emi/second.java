package com.example.emi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
       Bundle b=getIntent().getExtras();
        double emi=b.getDouble("em");
        TextView t=(TextView)findViewById(R.id.txt);
        t.setText("EMI ="+emi);

    }
}
