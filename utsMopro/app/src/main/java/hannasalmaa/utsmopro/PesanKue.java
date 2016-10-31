package hannasalmaa.utsmopro;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by acer on 10/28/2016.
 */

public class PesanKue extends AppCompatActivity{
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesan);
    }
    /*Intent tangkap;
    TextView txtNamakue;
    @BindView(R.id.txtNamaKue) TextView _txtNamaKue;
    @BindView(R.id.txtKategori) TextView _txtKategori;
    @BindView(R.id.txtEditPesan) TextView _txtEditPesan;

    @BindView(R.id.txtNamaPengirim)
    EditText _editNamaPengiirim;
    @BindView(R.id.btnSubmit) Button _btnSubmit;
    String cake,pesan,to,pengirim,item;
    @Override
    protected void onCreat(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesan);
        ButterKnife.bind(this);
        tangkap = getIntent();
        String paramHasil = tangkap.getStringExtra("param");
        txtNamakue = (TextView) findViewById(R.id.txtNamakue);
        txtNamakue.setText(paramHasil);
        Spinner spinnerKatalog = (Spinner) findViewById(R.id.spinnerKategori);
        spinnerKatalog.setOnItemSelectedListener(this);
        final List<String> kategori = new ArrayList<String>();
        kategori.add("Friend");
        kategori.add("Family");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.Layout.simple_spinner_dropdown_item);
        dataAdapter.setDropDownViewResource(android.R.Layout.simple_spinner_dropdown_item);
        spinnerKatalog.setAdapter(dataAdapter);

    }*/

}
