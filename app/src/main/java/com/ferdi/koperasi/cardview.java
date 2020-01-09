package com.ferdi.koperasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class cardview extends AppCompatActivity {
    private Button btncircle,btnRec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardview);
        btncircle   = (Button) findViewById(R.id.btncircle);
        btnRec = (Button) findViewById(R.id.btnRec);
        btncircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent icircle = new Intent(cardview.this, Circle_menu.class);
                startActivity(icircle);

            }
        });
        btnRec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iRec = new Intent(cardview.this, recycleview.class);
                startActivity(iRec);

            }
        });



    }
}
