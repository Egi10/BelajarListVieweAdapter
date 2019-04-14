package id.co.mediatamaweb.belajarlistvieweadapter.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Date;

import id.co.mediatamaweb.belajarlistvieweadapter.R;
import id.co.mediatamaweb.belajarlistvieweadapter.adapter.CustomAdapter;
import id.co.mediatamaweb.belajarlistvieweadapter.model.AmbilData;
import id.co.mediatamaweb.belajarlistvieweadapter.model.Data;

public class BaseAdapterActivity extends AppCompatActivity {
    ListView lv;
    public static ArrayList<Data> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_adapter);
        lv=findViewById(R.id.lvBaseAdapter);
        data=new ArrayList<>();
        data.addAll(AmbilData.getData());
        CustomAdapter adapter=new CustomAdapter(this);
        lv.setAdapter(adapter);
    }
}
