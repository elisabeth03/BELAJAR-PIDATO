package com.seeteam.d3ifcool.seeteamku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Kesehatansatu extends AppCompatActivity {
    ListView listViewMenghormati;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kesehatansatu);
        listViewMenghormati = (ListView) findViewById(R.id.kesehatansatu);
        String[] menu ={"Assalamualaikum wr wb\n" +
                "\n" +
                "Bapak/Ibu Guru, yang saya hormati,  dewan juri, yang saya hormati,\n" +
                "Serta teman-teman sekalian yang saya cintai,\n" +
                "Marilah kita bersama-sama memanjatkan puji dan syukur kita ke hadirat Allah SWT karena berkah dan karunianya kita semua dapat berkumpul dalam keadaan sehat wal’afiat pada hari yang cerah ini.\n" +
                "\n" +
                "Teman-teman yang saya banggakan,\n" +
                "pada kesempatan kali ini ijinkanlah saya menyampaikan sebuah pidato singkat saya dengan tema “ Kejujuran adalah segalanya “\n" +
                "            jujur artinya tidak curang, tidak berbohong. Jadi jujur adalah tidak bohong baik dalam ucapan maupun perbuatan. Dengan kejujuran kita dipercaya dan dihormati orang lain. Sekali sja kita membohongi orang lain, maka kepercayaan orang lain terhadap kita akan berkurang, atau bahkan kepercayaan orang lain akan hilang. Orang yang mempunyai sifat jujur sangat bermanfaat sekali untuk dirinya dan juga untuk orang lain.\n" +
                "Manfaat jujur untuk dirinya sendiri antara lain:\n" +
                "1.      semakin percaya diri\n" +
                "2.      merasa optimis\n" +
                "3.      banyak teman\n" +
                "4.      merasa tenang\n" +
                "5.      menambah semangat belajar\n" +
                "Teman-teman yang Berbahagia,\n" +
                "Sebagai penutup, Kejujuran adalah tiang agama, sendi akhlak, dan pokok rasa kemanusiaan manusia. Tanpa kejujuran, agama tidak lengkap, akhlak tidak sempurna, dan seorang manusia tidak sempurna menjadi manusia. Di sinilah pentingnya kejujuran bagi kehidupan.\n" +
                "Mungkin hanya itu yang bisa saya sampaikan, kurang lebihnya saya mohon maaf. Terima kasih.\n" +
                "\n" +
                "Wassalamu’alaikum Wr.Wb."};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1, menu);
        listViewMenghormati.setAdapter(adapter);
    }
}
