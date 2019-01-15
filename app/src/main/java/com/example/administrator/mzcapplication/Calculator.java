package com.example.administrator.mzcapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Calculator extends AppCompatActivity {
EditText ed1,ed2;
    Button b;
    String s1,s2,s3;
    int one,two,three;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        ed1=(EditText)findViewById(R.id.number1);
        ed2=(EditText)findViewById(R.id.number2);
        b=(Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=ed1.getText().toString();
                s2=ed2.getText().toString();
                one=Integer.parseInt(s1);
                two=Integer.parseInt(s2);

                three=one+two;
                s3=String.valueOf(three);
                Toast.makeText(getApplicationContext(),s3,Toast.LENGTH_LONG).show();

            }
        });


    }
}
