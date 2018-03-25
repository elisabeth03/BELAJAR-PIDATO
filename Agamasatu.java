package com.seeteam.d3ifcool.seeteamku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Agamasatu extends AppCompatActivity {
    ListView listViewShalat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agamasatu);
        listViewShalat = (ListView) findViewById(R.id.agamasatu);
        String[] menu ={"SHOLAT TIANG AGAMA\n" +
                "Assalamu’alaikum Wr. Wb.\n" +
                "Pada kesempatan yang baik ini marilah kita panjatkan puji syukur kehadirat Allah SWT yang mana telah memberikan nikmat dan hidayahnya kepada kita sehingga bisa berkumpul dalam keadaan sehat pada hari ini.Pidato yang akan saya sampaikan pada kesempatan kali ini berjudul “Sholat”\n" +
                "Hadirin yang saya hormati\n" +
                "Sholat itu diterangkan dalam hadits Nabi “Assolatuimaddunnia”, artinya Sholat itu tiang agama.\n" +
                "Teman-teman ku sekalian\n" +
                "Mari kita tingkatkan sholat.Mari kita tingkatkan ibadah kita agar kelak dikemudian hari kita jadi anak yang shaleh dan sholehah,menjadi anak yang berbakti kepada orang tua dan menjadi hamba Allah yang sebenar-benarnya.Amin,,Allahumma amin\n" +
                "Mungkin hanya ini yang dapat saya sampaikan,kurang lebihnya saya mohon maaf.\n" +
                "Wassalamualaikum wr.wb \n"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1, menu);
        listViewShalat.setAdapter(adapter);
    }
}
