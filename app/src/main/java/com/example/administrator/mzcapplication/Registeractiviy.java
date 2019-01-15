package com.example.administrator.mzcapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Registeractiviy extends AppCompatActivity {
EditText name,address,phone,email,username,passw,confirmpass;
    String n,a,m,e,u,p,c;
    Button cass,cpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registeractiviy);
        name=(EditText)findViewById(R.id.name);
        address=(EditText)findViewById(R.id.Admisionno);
        phone=(EditText)findViewById(R.id.mobileno);
        email=(EditText)findViewById(R.id.email);
        username=(EditText)findViewById(R.id.username);
        passw=(EditText)findViewById(R.id.password);
        confirmpass=(EditText)findViewById(R.id.confirm);
        cass=(Button)findViewById(R.id.reg);
        cpass=(Button)findViewById(R.id.alr);
        cass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n = name.getText().toString();
                a = address.getText().toString();
                m = phone.getText().toString();
                e = email.getText().toString();
                u = username.getText().toString();
                p = passw.getText().toString();
                c = confirmpass.getText().toString();
                if (p.equals(c)) {
                    Toast.makeText(getApplicationContext(), n, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), a, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), m, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), e, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), u, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), p, Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(), c, Toast.LENGTH_LONG).show();

                } else {
                    Toast.makeText(getApplicationContext(), "Password and Confirm password doesn't match", Toast.LENGTH_LONG).show();
                }
            }
        });
        cpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });

    }
}
