package com.seeteam.d3ifcool.seeteamku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Umumdua extends AppCompatActivity {
    ListView listViewPerkembanganT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_umumdua);
        listViewPerkembanganT = (ListView) findViewById(R.id.umumdua);

        String[] menu ={"MENJAGA KESEHATAN\n" +
                "Assalamu’alaikum Wr. Wb.\n" +
                "Puji syukur kita panjatkan ke hadirat tuhan yang maha esa, karena berkatnya kita dapat berjumpa pada pagi hari ini. yang saya hormati guru B.Indonesia, dan teman-teman yang saya banggakan. Dalam kesempatan ini saya akan berpidato tentang kesehatan.\n" +
                "Saat ini banyak sekali warga yang terserang penyakit, maka dari itu kita harus menjaga kesehatan karena saat ini banyak sekali penyakit yang menular seperti flu burung, penyakit mata, hepatitis, dan lain lain. Faktor-faktor yang memudahkan manusia terserang penyakit adalah. Pertama lingkungan yang kotor, agar lingkungan kita terbebas dari wabah penyakit, kita harus menjaga kebersihan yaitu dengan membuang sampah pada tempatnya, mengubur barang-barang bekas, serta menguras bak mandi agar tidak menjadi sarang nyamuk. Penyakit yang bisanya di sebabkan oleh lingkungan yang kotor adalah gatal-gatal, penyakit kulit, dan lain lain.\n" +
                "Yang kedua adalah pencemaran udara, pencemaran udara di akibatkan oleh asap yang berasal dari pabrik dan kendaraan bermotor, serta saat ini juga banyak terjadi penggundulan hutan. Sehingga udara menjadi tidak segar dan sangat kotor. Maka dari itu mari kita lakukan penghijauan dengan menanam pohon dan hentikan penggundulan hutan. serta kurangilah penggunaan kendaraan bermotor. Dan yang ketiga adalah kurangnya istirahat, banyak masyarakat yang lebih mementingkan pekerjaannya dari pada istirahatnya.\n" +
                "Sehingga badan terasa lemas dan lelah. maka dari itu sesibuk apapun pekerjaan kita, sempatkanlah untuk beristirahat. dan tidur dengan cukup yaitu 8 jam. terutama anak-anak kelas 9 yang akan melaksanakan ujian nasional. istirahatlah yang cukup agar kita dapat beraktivitas dengan lancar dan semangat.\n" +
                "Hal-hal yang dapat dilakukan untuk menjaga kesehatan adalah dengan berolah raga, yaitu seperti senam, lari pagi dan lain lain. Makan makanan yang sehat dan bebas dari kuman, istirahat yang cukup dan tidur yang teratur. Maka dari itu jagalah kesehatan, tinggalkan pola hidup yang malas dan jorok. terapkan pola hidup yang bersih dan disiplin.\n" +
                "Sekian pidato dari saya, mohon maaf jika ada salah kata, karena saya hanyalah manusia yang tak luput dari kesalahan.\n" +
                "Wassalamu’alaikum Wr. Wb.\n"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1, menu);
        listViewPerkembanganT.setAdapter(adapter);
    }
}
