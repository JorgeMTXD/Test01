package com.example.test01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtSaludar;
    private Button buttSaludo;
    private Button buttRes;
    private EditText txtNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializarVista();
        creacionClick();
    }

    private void creacionClick() {
        buttSaludo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre;
                nombre = String.valueOf(txtNombre.getText());
                if (nombre.isEmpty()) {

                } else {
                    txtNombre.setText("");
                }
            }
        });
        buttRes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre;
                nombre = String.valueOf(txtNombre.getText());
                txtSaludar.setText("Hola "+nombre+" , Buenos Dias");
            }
        });
    }

    private void inicializarVista() {
        txtSaludar = findViewById(R.id.txtSaludar);
        buttRes = findViewById(R.id.buttRes);
        buttSaludo = findViewById(R.id.buttSaludar);
        txtNombre = findViewById(R.id.txtNombre);
    }

    public void Saludar(){

    }

}
