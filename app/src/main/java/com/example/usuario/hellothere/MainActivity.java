package com.example.usuario.hellothere;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView Listi;
        Listi = (ListView) findViewById(R.id.linear);

        OrigenDeDatos odd = new OrigenDeDatos();
        AdaptadordeListadeDatos adaptador = new AdaptadordeListadeDatos();

        adaptador.arreglo = odd.showAll();
        adaptador.context = this;
        Listi.setAdapter(adaptador);

        /*Se puede cambiar el nombre de adapter view y el position*/
        Listi.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                         @Override
                                         public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                             Intent segunda = new Intent(MainActivity.this, Main2Activity.class);
                                             tarjeta x = (tarjeta) parent.getItemAtPosition(position);
                                             segunda.putExtra("nombre", x.name);
                                             segunda.putExtra("edad", x.age);
                                             segunda.putExtra("logo", x.logo);
                                             segunda.putExtra("desc", x.description);


                                             startActivity(segunda);


                                         }
                                     }


        );


    }
}