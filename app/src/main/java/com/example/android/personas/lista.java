package com.example.android.personas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class lista extends AppCompatActivity {
    private TableLayout tabla;
    private ArrayList<persona> personas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);
        tabla=findViewById(R.id.tabla);
        personas=datos.obtener();
        for (int i = 0; i < personas.size(); i++) {
            TableRow fila = new TableRow(this);
            TextView n1 = new TextView(this);
            TextView n2 = new TextView(this);
            TextView n3 = new TextView(this);
            TextView n4 = new TextView(this);

            n1.setText(""+(i+1));
            n2.setText(personas.get(i).getCedula());
            n3.setText(personas.get(i).getNombre());
            n4.setText(personas.get(i).getApellido());
            fila.addView(n1);
            fila.addView(n2);
            fila.addView(n3);
            fila.addView(n4);
            tabla.addView(fila);

        }
    }
}
