package hannasalmaa.utsmopro;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int[] gambar={
            R.drawable.bforest,
            R.drawable.tiramisu,
            R.drawable.velvet,
            R.drawable.brownies,
    };

    ListView list;

    String[] judul ={
            "Black Forest",
            "Tiramisu",
            "Red Velvet",
            "Brownies",

    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inisialisasi CustomAdapter dengan Array yang telah dibuat
        CustomAdapter adapter = new CustomAdapter(this, gambar, judul);

        // Inisialisasi ListView
        list = (ListView) findViewById(R.id.ListGambar);

        // set Adapter ke dalam ListView
        list.setAdapter(adapter);

        // action ketika ListView di klik
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub

                // String untuk mengambil judul pada Listview
                String Slecteditem = judul[position];

                // menampilkan judul dengan Toast
                //Toast.makeText(getApplicationContext(), Slecteditem, Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getApplicationContext(),
                        PesanKue.class);
                startActivity(i);
                finish();
            }
        });
    }
}
