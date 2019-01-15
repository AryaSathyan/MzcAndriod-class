package com.example.administrator.mzcapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText ed1,ed2;
    Button bu,r,n;
    String getuname,getpassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=(EditText)findViewById(R.id.user);
        ed2=(EditText)findViewById(R.id.pass);
        bu=(Button)findViewById(R.id.login);
        r=(Button)findViewById(R.id.regi);
        n=(Button)findViewById(R.id.next);
        bu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getuname=ed1.getText().toString();
                getpassword=ed2.getText().toString();
                Toast.makeText(getApplicationContext(),getuname,Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getpassword,Toast.LENGTH_SHORT).show();

                //Toast.makeText(getApplicationContext(),"HELLO",Toast.LENGTH_LONG).show();
            }
        });
        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),Registeractiviy.class);
                startActivity(i);
            }
        });
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),Calculator.class);
                startActivity(i);
            }
        });


    }
}
