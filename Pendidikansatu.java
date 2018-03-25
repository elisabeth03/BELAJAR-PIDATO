package com.seeteam.d3ifcool.seeteamku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Pendidikansatu extends AppCompatActivity {
    ListView listViewMencariIlmu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pendidikansatu);
        listViewMencariIlmu = (ListView) findViewById(R.id.pendidikansatu);
        String[] menu ={"KEUTAMAAN MENCARI ILMU\n" +
                "Assalamualaikum Wr. Wb.\n" +
                "\n" +
                "Hadirin yang saya hormati.\n" +
                "\n" +
                "Dalam kesempatan yang berbahagia ini marilah kita bersyukur kepada Allah SWT. Atas segala nikmat serta hidayah-Nya yang telah dicurahkan kepada kita semua sehingga pada kesempatan kali ini kita bisa hadir dalam acara peringatan hari pendidikan nasional.\n" +
                "Hadirin yang berbahagia.\n" +
                "Dalam mencari ilmu, Allah sendiri pernah menguji para Malaikat-malaikat-Nya. Bahwa ternyata tidak ada seseorangpun di dunia ini yang mempunyai ilmu pengetahuan, kecuali hanya Allah. Dan sebagian ilmu yang kita miliki ini adalah titipan Allah. Bahkan Malaikat pun tidak akan memiliki ilmu pengetahuan, selain apa yang telah diajarkan kepadanya. Oleh karena itu kita tidak boleh sombong dengan pengetahuan yang kita miliki. Bahkan dengan apapun yang kita miliki tidak boleh sombong.\n" +
                "Hadirin yang saya hormati.\n" +
                "\n" +
                "Sebagian dari keutamaan orang mencari ilmu adalah dimudahkan serta dibimbing melalui jalan menuju kebenaran. Betapa pentingnya orang yang menuntut ilmu, sehingga diberikan pengetahuan yang luar biasa. Peranan para tenaga pengajar juga sangatlah penting. Sehingga orang yang bersamanya dukuk untuk menimba ilmu pengetahuan darinya walaupun hanya satu jam saja itu lebih disukai oleh Allah dari pada pahalanya dalam beribadah seribu tahun.\n" +
                "\n" +
                "Sekian dan Terima kasih, hanya itu yang bisa saya sampaikan, mudah-mudahan ada manfaatnya serta diberikan ilmu yang bermanfaat dan di ridha’i Allah. Amiin\n" +
                "\n" +
                "Wassalamualaikum Wr. Wb.\n"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1, menu);
        listViewMencariIlmu.setAdapter(adapter);
    }
}
