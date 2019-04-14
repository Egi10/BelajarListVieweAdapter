package id.co.mediatamaweb.belajarlistvieweadapter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import id.co.mediatamaweb.belajarlistvieweadapter.activity.ArrayAdapterActivity;
import id.co.mediatamaweb.belajarlistvieweadapter.activity.BaseAdapterActivity;
import id.co.mediatamaweb.belajarlistvieweadapter.activity.SimpleAdapterActivity;

public class MainActivity extends AppCompatActivity implements
        View.OnClickListener {
    Button btnAr,btnBA,btnSa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAr=findViewById(R.id.btnArrayAdapter);
        btnBA=findViewById(R.id.btnBaseAdapter);
        btnSa=findViewById(R.id.btnSimpleAdapter);
        btnAr.setOnClickListener(this);
        btnBA.setOnClickListener(this);
        btnSa.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnArrayAdapter:
                Intent intent=new Intent(MainActivity.this,
                        ArrayAdapterActivity.class);
                startActivity(intent);
                break;
            case R.id.btnBaseAdapter:
                Intent intent1=new Intent(MainActivity.this,
                        BaseAdapterActivity.class);
                startActivity(intent1);
                break;
            case R.id.btnSimpleAdapter:
                Intent intent2=new Intent(MainActivity.this,
                        SimpleAdapterActivity.class);
                startActivity(intent2);
                break;
        }

    }
}
