package com.seeteam.d3ifcool.seeteamku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListKesehatan extends AppCompatActivity {
    ListView listViewKesehatan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_kesehatan);
        listViewKesehatan = (ListView) findViewById(R.id.Kesehatan);
        String[] menu = {"Bahaya Narkoba","Menjaga Kesehatan"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1, menu);
        listViewKesehatan.setAdapter(adapter);
        listViewKesehatan.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        if (i == 0) {
                            Intent intent = new Intent(ListKesehatan.this, Kesehatansatu.class);
                            startActivity(intent);
                        } else if (i == 1) {
                            Intent intent = new Intent(ListKesehatan.this, Kesehatandua.class);
                            startActivity(intent);
                        }
                    }

                });
    }
}
