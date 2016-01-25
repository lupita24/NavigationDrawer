package com.example.lupita.prubea1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        txtName = (EditText) findViewById( R.id.editText );

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*
        RelativeLayout MyURL = new RelativeLayout(this);
        TextView MyTV = new TextView(this);
                MyTV.setText("Hello World");
        MyTV.setX(100);
        MyTV.setY(200);
        MyURL.addView(MyTV);*/
        //setContentView(MyURL);
    }

    public void mostrarMensajeLogin(View v) {

        final TextView texto = (TextView) findViewById(R.id.editText);
        Toast mensaje = Toast.makeText(getApplicationContext(), "Perfil de : " + texto.getText(), Toast.LENGTH_SHORT);
        mensaje.show();

        Intent Myintent = new Intent(MainActivity.this, DrawerActivity.class);
        Myintent.putExtra("key", texto.getText());
        MainActivity.this.startActivity(Myintent);

    }
}


