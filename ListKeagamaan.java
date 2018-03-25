package com.seeteam.d3ifcool.seeteamku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListKeagamaan extends AppCompatActivity {
    ListView listViewKeagamaan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_keagamaan);
        listViewKeagamaan = (ListView) findViewById(R.id.Keagamaan);

        String[] menu = {"SHOLAT TIANG AGAMA", "MENGHORMATI ORANG TUA"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1, menu);
        listViewKeagamaan.setAdapter(adapter);
        listViewKeagamaan.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        if (i == 0) {
                            Intent intent = new Intent(ListKeagamaan.this, Agamasatu.class);
                            startActivity(intent);
                        } else if (i == 1) {
                            Intent intent = new Intent(ListKeagamaan.this, Agamadua.class);
                            startActivity(intent);
                        }
                    }

                });
    }
}
