package com.ferdi.koperasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TampilanLogin extends AppCompatActivity {
    EditText user,pass;
    private Button btn,btnregis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilan_login);


        user = (EditText) findViewById(R.id.username);
        pass = (EditText) findViewById(R.id.password);
        btn = (Button) findViewById(R.id.btnLogin);
        btnregis = (Button) findViewById( R.id.btnRegis);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if  (user.getText().toString().equals("admin") &&
                        pass.getText().toString().equals("admin"))
                {
                    Intent ilogin = new Intent(TampilanLogin.this,MainActivity.class);
                    startActivity(ilogin);}
                else Toast.makeText(TampilanLogin.this, "Login gagal", Toast.LENGTH_SHORT).show();
            }


        });
        btnregis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iregis = new Intent(TampilanLogin.this,Sign.class);
                startActivity(iregis);

            }
        });



    }
}
