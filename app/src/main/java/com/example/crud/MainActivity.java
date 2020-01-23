package com.example.crud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;

public class MainActivity extends AppCompatActivity {
    EditText btn_user,btn_apellidos, btn_edad;
    Button btn_registrar, btn_show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_user = (EditText) findViewById(R.id. btn_user);
        btn_apellidos = (EditText) findViewById(R.id. btn_apellidos);
        btn_edad = (EditText) findViewById(R.id. btn_edad);
        btn_registrar = (Button) findViewById(R.id.btn_register);
        btn_show = (Button) findViewById(R.id.btn_show);
    }

    private void guardar(String nombre, String apellidos, int edad){
        DataBase db = new DataBase(this,"basedatos",null,1);
        MongoClient db =

                try{
                    ContentValues c = new ContentValues();
                    c.put("Nombre",nombre);
                    c.put("Apellidos",apellidos);
                    c.put("Edad", edad);
                    db.insert("Usuario",null);
                    db.close();
                    Toast.makeText(this, "Insertado", Toast.LENGTH_SHORT).show();
                }catch (UnknownError e){
                    Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
                }
    }
}
