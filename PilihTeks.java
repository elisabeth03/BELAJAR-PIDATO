package com.seeteam.d3ifcool.seeteamku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PilihTeks extends AppCompatActivity {
    private Button listmenu;
    private Button iisiteks;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilih_teks);
        listmenu =(Button) findViewById(R.id.listmenu);
        iisiteks = (Button) findViewById(R.id.iisiteks);

        listmenu.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                Intent teks = new Intent(PilihTeks.this, ListTeks.class);
                startActivity(teks);
            }
        });
        iisiteks.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                Intent teks = new Intent(PilihTeks.this, TulisTeks.class);
                startActivity(teks);
            }
        });
    }
}
