package com.example.android.nadyayulipratama_1202150239_modul1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edJml, edMenu;
    Button btapnormal, bteatbus;
    TextView txtmenu, txtjumlah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edJml = (EditText) findViewById((R.id.editText3));
        edMenu = (EditText) findViewById(R.id.editText2);
        btapnormal = (Button) findViewById(R.id.button2);
        bteatbus = (Button) findViewById(R.id.button);

        btapnormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.apnormal);
                double vJmlh;
                String vMenu ;
                vJmlh=Double.valueOf(edJml.getText().toString().trim());
                vMenu=String.valueOf(edMenu.getText().toString().trim());
                Toast.makeText(getApplicationContext(), "Disini aja makan malamnya", Toast.LENGTH_SHORT).show();
            }
        });
        bteatbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView (R.layout.eatbus);
                double vJmlh;
                String vMenu;
                vJmlh=Double.valueOf(edJml.getText().toString().trim());
                vMenu=String.valueOf(edMenu.getText().toString().trim());
                Toast.makeText(getApplicationContext(), "Jangan makan disini karena uang kamu tidak cukup ", Toast.LENGTH_SHORT).show();


            }
        });

    }

}
