package com.example.emi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import static java.lang.Math.pow;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void calculate(View view)
    {
        EditText intreast=(EditText)findViewById(R.id.intreast);
        EditText principal=(EditText)findViewById(R.id.amount);
        EditText instno=(EditText)findViewById(R.id.instNo);
        Switch s=  (Switch)findViewById(R.id.yearly);
        double rate=Double.parseDouble(intreast.getText().toString());
        double amount=Double.parseDouble(principal.getText().toString());
        int i=Integer.parseInt(instno.getText().toString());
        if(s.isChecked())
        {
         rate=rate/(1200);
        }else
        {
            rate=rate/100;
        }
       if(intreast.getText().toString().length()== 0)
{
 intreast.setError("Rate field is required !!");
    }
        else if(principal.getText().toString().length()== 0)
        {
            principal.setError("Amount field is required !!");
        }
        else if(instno.getText().toString().length()== 0)
        {
            instno.setError("No of instalments field is required !!");
        }
        else {
    double c = (1 + rate);
    double e = pow(c, i);
    double a = amount * rate * e;
    double d = e - 1;
    double emi = a / d;


    Intent in = new Intent(getApplicationContext(), second.class);
    Bundle k = new Bundle();
    k.putDouble("em", emi);
    in.putExtras(k);
    startActivity(in);
}
    }
    public void clear(View view)
    { EditText ed=(EditText)view;
        ed.setText("");
    }
    public void Reset(View view) {
        EditText intreast = (EditText) findViewById(R.id.intreast);
        intreast.setText("");
        EditText principal = (EditText) findViewById(R.id.amount);
        principal.setText("");
        EditText instno = (EditText) findViewById(R.id.instNo);
        instno.setText("");
        Switch s=  (Switch)findViewById(R.id.yearly);
        if(s.isChecked())
        {
            s.setChecked(false);
        }

    }
}
