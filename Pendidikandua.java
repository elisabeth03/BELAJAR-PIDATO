package com.seeteam.d3ifcool.seeteamku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Pendidikandua extends AppCompatActivity {
    ListView listViewMinatB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pendidikandua);
        listViewMinatB = (ListView) findViewById(R.id.pendidikandua);
        String[] menu ={"RENDAHNYA MINAT BELAJAR SISWA\n" +
                "Assalamualaikum Wr.Wb. salam sejahtera untuk kita semua yang ada di tempat ini.\n" +
                "Pertama-tama marilah kita panjatkan puji syukur kehadirat Allah Swt, karena atas karunia dan nikmat-Nyalah kita bisa berkumpul lagi dalam kondisi yang sehat walafiat. Tidak lupa shalawat dan salam selalu tercurahkan pada junjungan Nabi Besar Muhammad SAW yang sudah memperjuangkan agama dan nilai-nilai teladan hingga sampai pada kita semua.\n" +
                "Hadirin yang saya hormati\n" +
                "Dalam pidato kali ini ijinkan saya menyampaikan sebuah pidato tentang rendahnya minat belajar siswa yang semakin hari semakin surut. Banyak hal yang membuat ini terjadi mulai dari faktor lingkungan, keluarga, teman bermain sampai dengan cara guru mengajar yang kurang menarik dan menyenangkan.\n" +
                "Siswa seharusnya di jadikan sebagai obyek dalam sebuah pembelajaran yang efektif, jangan sampai guru masuk langsung memberikan tugas apalagi cuman mencatat tanpa memahami sebuah esensi dari materi yang disampikan, terkadang inilah yang membuat pendidikan kita kalah jauh dari negara lain, kemampuan dalam hal memahami jarang di perdulikan, kebanykan hanya sebatas hafalan belaka.\n" +
                "Generasi muda, pelajar adalah tombak utama dalam kemajuan sebuah bangsa, jadi kalau mau maju hal yang harus diperhatikan adalah mutu pendidikanya. Lulusan terbaik bukan hanya di ukur dari IPK yang tinggi, juara kelas terus menerus melainkan adalah sebuah nilai apakah berguna bagi diri kita sendiri, keluarga dan bangsa ini. Oleh karena itu terakhir saya tekankan ayooo tanamkan sejak dini pentingnya pembelajaran yang efektif sehingga menghadirkan generasi emas yang kreatif dan bermanfaat..Mungkin hanya ini yang bisa sampaikan kurang lebihnya saya mohon maaf.\n" +
                "Wassalamualaikum wr wb\n"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1, menu);
        listViewMinatB.setAdapter(adapter);
    }
}
