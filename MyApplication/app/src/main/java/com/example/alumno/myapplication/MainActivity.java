package com.example.alumno.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v("vichito",
                "la aplicacion acaba de ingresar");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "gracias por usar", Toast.LENGTH_SHORT).show();
        Log.v("vichito",
                "la aplicacion acaba de ingresar");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("vichito",
                "la aplicacion acaba de ingresar");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("vichito",
                "la aplicacion acaba de ingresar");
    }
}
