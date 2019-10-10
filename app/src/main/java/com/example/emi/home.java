package com.example.emi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Runnable r =new Runnable(){
            @Override
            public void run()
            {
                Intent home=new Intent(home.this,MainActivity.class);
                startActivity(home);
                finish();
            }

        };
        new Handler().postDelayed(r,3000);


    }
}
