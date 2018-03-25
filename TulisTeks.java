package com.seeteam.d3ifcool.seeteamku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TulisTeks extends AppCompatActivity {
    private Button mIsiTeks;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tulis_teks);
        mIsiTeks = (Button) findViewById(R.id.next);

        mIsiTeks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent teks = new Intent(TulisTeks.this, KameraPidato.class);
                startActivity(teks);
            }
        });
    }
}
