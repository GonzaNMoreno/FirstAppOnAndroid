package com.example.gmoreno.myfirstapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by g.moreno on 1/31/2017.
 */
public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        final EditText userName = (EditText) findViewById(R.id.txtUser);
        final EditText password = (EditText) findViewById(R.id.txtPassword);

        Button loggeo = (Button) findViewById(R.id.btnIngresar);
        loggeo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SecondActivity.this, "El usuario es: " + userName.getText().toString() +
                        " y tu contraseña es: " + password.getText().toString(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
