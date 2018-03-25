package com.seeteam.d3ifcool.seeteamku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Umumsatu extends AppCompatActivity {
    ListView listViewMencariKebersihan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_umumsatu);
        listViewMencariKebersihan = (ListView) findViewById(R.id.umumsatu);
        String[] menu ={"KEBERSIHAN\n" +
                "Assalamu’alaikum Wr. Wb.\n" +
                "Pada kesempatan yang baik ini marilah kita panjatkan puji syukur kehadirat Allah SWT yang mana telah memberikan nikmat dan hidayahnya kepada kita sehingga bisa berkumpul dalam keadaan sehat pada hari ini.\n" +
                "Hadirin yang saya hormati,\n" +
                "Pidato yang akan saya sampaikan kali ini menerangkan menjaga kebersihan. Allah SWT sangat mencintai orang yang bersih dan suka membersihkan segala sesuatu yang ada padanya. Jadi marilah kita mulai menjaga kebersihan demi terciptanya keselamatan dan kebaikan untuk diri kita maupun orang lain.\n" +
                "Hadirin sekalian,\n" +
                "Jika kita menjaga kebersihan lalu ditiru oleh anak-anak kita dan orang-orang dekat kita maka kita pun akan mendapat manfaatnya, oleh karenanya mari ajarkan sedini mungkin terhadap anak-anak tentang pentingnya menjaga kebersihan agar kelak mereka menjadi anak yang sehat, cerdas dan suka berbuat kebaikan.\n" +
                "Dengan mengajarkan menjaga kebersihan kepada anak-anak, diharapkan mereka bisa mandiri dan terbiasa mengatasi hal-hal yang sulit untuk diselesaikan, seperti kita ketahui di masa sekarang masih banyak orang-orang yang tidak peduli dengan kebersihan lingkungan dan membiarkannya menjadi kotor.\n" +
                "Hadirin yang berbahagia,\n" +
                "Demikianlah pidato singkat yang bisa saya sampaikan, mudah-mudahan apa yang sudah saya sampaikan bermanfaat dan dapat dilaksanakan, akhir kata saya ucapkan terimakasih atas perhatiannya.\n" +
                "Wassalamu’alaikum Wr. Wb.\n"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1, menu);
        listViewMencariKebersihan.setAdapter(adapter);
    }
}
