package com.seeteam.d3ifcool.seeteamku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ListTeks extends AppCompatActivity {
    ListView listMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_teks);
        listMenu = (ListView)findViewById(R.id.listmenus);
        ArrayList<ItemPidato> arrayPidato = new ArrayList<>();

        arrayPidato.add(new ItemPidato(R.drawable.mosque,"KEAGAAMAAN"));
        arrayPidato.add(new ItemPidato(R.drawable.web_hi_,"KESEHATAN"));
        arrayPidato.add(new ItemPidato(R.drawable.web_hi_res_,"PENDIDIKAN"));
        arrayPidato.add(new ItemPidato(R.drawable.web_hi_res_512,"UMUM"));

        ItemPidatoAdapter adapterPidato = new ItemPidatoAdapter(this, arrayPidato);
        listMenu.setAdapter(adapterPidato);
        listMenu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0){
                    Intent intent = new Intent(ListTeks.this, ListKeagamaan.class);
                    startActivity(intent);
                } else if(i==1) {
                    Intent intent = new Intent(ListTeks.this, ListKesehatan.class);
                    startActivity(intent);
                }
                else if(i==2) {
                    Intent intent = new Intent(ListTeks.this, ListPendidikan.class);
                    startActivity(intent);
                }
                else if(i==3) {
                    Intent intent = new Intent(ListTeks.this, ListUmum.class);
                    startActivity(intent);
                }
            }
        });
    }
}
