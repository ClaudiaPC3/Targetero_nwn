package com.example.usuario.hellothere;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;


public class Main2Activity extends AppCompatActivity {

    public TextView anios, nombres, desci;
    public ImageView login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        anios = (TextView) findViewById(R.id.ageA);
        nombres = (TextView)findViewById(R.id.nameA);
        desci = (TextView)findViewById(R.id.descA);
        login = (ImageView)findViewById(R.id.imageView1A);

        Intent r = getIntent();
        String a = r.getStringExtra("nombre");
        nombres.setText(a);
        String b = r.getStringExtra("edad");
        anios.setText(b);
        String c = r.getStringExtra("desc");
        desci.setText(c);
        String d = r.getStringExtra("logo");
        Picasso.with(this).load(d).into(login);
    }
}
