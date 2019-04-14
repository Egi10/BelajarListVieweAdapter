package id.co.mediatamaweb.belajarlistvieweadapter.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

import id.co.mediatamaweb.belajarlistvieweadapter.R;
import id.co.mediatamaweb.belajarlistvieweadapter.model.AmbilData;

public class SimpleAdapterActivity extends AppCompatActivity {
    ListView lv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_adapter);
        lv=findViewById(R.id.lvSimpleAdapter);
        ArrayList<HashMap<String,String>> list=new ArrayList<>();
        for(int i=0;i< AmbilData.nama.length;i++){
            HashMap<String,String> map=new HashMap<>();
            map.put("nama",AmbilData.nama[i]);
            map.put("gambar",AmbilData.gambar[i]+"");
            list.add(map);
        }
        String[]from={"nama","gambar"};
        int[]to={R.id.tvspNama,R.id.ivspGambar};

        SimpleAdapter adapter=new SimpleAdapter(this,list,
                R.layout.items_layoutsimpleadapter,from,to);
        lv.setAdapter(adapter);

    }
}
