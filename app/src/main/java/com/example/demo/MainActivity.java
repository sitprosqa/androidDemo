package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText name=(EditText) findViewById(R.id.name);
        final EditText pass=(EditText) findViewById(R.id.pass);

        Button b1=(Button) findViewById(R.id.button);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nam=name.getText().toString();
                String pas=pass.getText().toString();

                Toast.makeText(MainActivity.this, "Success-> Username: "+nam+" Password: "+pas, Toast.LENGTH_LONG).show();
            }
        });

    }
}
