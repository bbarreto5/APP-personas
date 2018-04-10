package com.example.android.personas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import javax.xml.transform.Source;

public class registrar extends AppCompatActivity {
    private EditText txtcedula, txtnombre, txtapellido;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);
        txtcedula= findViewById(R.id.txtcedula);
        txtnombre= findViewById(R.id.txtnombre);
        txtapellido= findViewById(R.id.txtapellido);
    }

    public void guardar(View v){
        persona p = new persona(txtnombre.getText().toString(),
                txtcedula.getText().toString(),
                txtapellido.getText().toString());
        p.guardar();
        Toast.makeText(this, getResources().getString(R.string.m_1), Toast.LENGTH_SHORT).show();
        txtapellido.setText("");
        txtcedula.setText("");
        txtnombre.setText("");
    }
}
