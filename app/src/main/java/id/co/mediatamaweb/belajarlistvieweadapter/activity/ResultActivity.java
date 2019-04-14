package id.co.mediatamaweb.belajarlistvieweadapter.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import id.co.mediatamaweb.belajarlistvieweadapter.R;

public class ResultActivity extends AppCompatActivity {
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        iv=findViewById(R.id.ivHasil);
        Intent intent=getIntent();
        int data=(Integer)intent.getSerializableExtra("key");
        iv.setImageResource(data);
    }
}
