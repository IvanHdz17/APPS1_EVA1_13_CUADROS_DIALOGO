package com.example.eva1_13_cuadros_dialogo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Eventos Click
    public void onClickCDSistema(View v){
        new AlertDialog.Builder(this)
                .setTitle("Cuadro de dialogo de Android")
                .setMessage("Hola Mundo")
                .setPositiveButton("Ok",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(),"Boton Ok",Toast.LENGTH_SHORT).show();
                            }
                        })
                .setNegativeButton("No",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(),"Boton No",Toast.LENGTH_SHORT).show();
                            }
                        })
                .setNeutralButton("Cancel",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(),"Boton Cancel",Toast.LENGTH_SHORT).show();
                            }
                        })
                .show();
    }

    public void onClickCDCustom(View v){
        Dialog dlgMiCuadroDialogo = new Dialog(this);
        //Asignar layout
        dlgMiCuadroDialogo.setContentView(R.layout.cuadro_dialogo);
        //Vincular los componentes
        TextView txtVwTitu;
        EditText edtTextDatos;
        Button btnAccion;
        txtVwTitu = dlgMiCuadroDialogo.findViewById(R.id.txtVwTitu);
        edtTextDatos = dlgMiCuadroDialogo.findViewById(R.id.edtTextDatos);
        btnAccion = dlgMiCuadroDialogo.findViewById(R.id.btnAccion);
        txtVwTitu.setText("Este es un cuadro de dialogo personalizado");
        btnAccion.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(),edtTextDatos.getText().toString(),
                                Toast.LENGTH_SHORT).show();
                        dlgMiCuadroDialogo.dismiss();
                    }
                }
        );
        dlgMiCuadroDialogo.show();
    }
}