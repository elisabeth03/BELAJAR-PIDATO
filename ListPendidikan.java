package com.seeteam.d3ifcool.seeteamku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListPendidikan extends AppCompatActivity {
    ListView listViewPendidikan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_pendidikan);
        listViewPendidikan = (ListView) findViewById(R.id.Pendidikan);
        String[] menu = {"KEUTAMAAN MENCARI ILMU","RENDAHNYA MINAT BELAJAR SISWA"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1, menu);
        listViewPendidikan.setAdapter(adapter);
        listViewPendidikan.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        if (i == 0) {
                            Intent intent = new Intent(ListPendidikan.this, Pendidikansatu.class);
                            startActivity(intent);
                        } else if (i == 1) {
                            Intent intent = new Intent(ListPendidikan.this, Pendidikandua.class);
                            startActivity(intent);
                        }
                    }

                });
    }
}
