package id.co.mediatamaweb.belajarlistvieweadapter.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import id.co.mediatamaweb.belajarlistvieweadapter.R;
import id.co.mediatamaweb.belajarlistvieweadapter.model.AmbilData;

public class ArrayAdapterActivity extends AppCompatActivity {
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array_adapter);
        lv=findViewById(R.id.lvHasil);
        ArrayAdapter adapter=new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, AmbilData.nama);
        lv.setAdapter(adapter);
    }
}
