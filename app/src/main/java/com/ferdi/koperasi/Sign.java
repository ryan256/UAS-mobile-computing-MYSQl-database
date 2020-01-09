package com.ferdi.koperasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Sign extends AppCompatActivity {


    private Button btn_daftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign);


        btn_daftar = (Button) findViewById( R.id.daftar);


        btn_daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent idaftar = new Intent(Sign.this,TampilanLogin.class);
                startActivity(idaftar);}


        });

    }
}