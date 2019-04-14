package id.co.mediatamaweb.belajarlistvieweadapter.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import id.co.mediatamaweb.belajarlistvieweadapter.R;
import id.co.mediatamaweb.belajarlistvieweadapter.activity.BaseAdapterActivity;
import id.co.mediatamaweb.belajarlistvieweadapter.activity.ResultActivity;

public class CustomAdapter extends BaseAdapter {
    private Context context;

    public CustomAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return BaseAdapterActivity.data.size();
    }

    @Override
    public Object getItem(int position) {
        return BaseAdapterActivity.data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder holder ;
        if(convertView==null){
            holder=new ViewHolder();
            LayoutInflater inflater=(LayoutInflater)context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(R.layout.item_listview,null);
            holder.tvNama=convertView.findViewById(R.id.tvNama);
            holder.gambar=convertView.findViewById(R.id.ivGambar);
            holder.btnKirim=convertView.findViewById(R.id.btnKirim);
            convertView.setTag(holder);
        }else {
            holder=(ViewHolder)convertView.getTag();

        }
        holder.tvNama.setText(BaseAdapterActivity
                .data.get(position).getNama());
        holder.gambar.setImageResource(BaseAdapterActivity
                .data.get(position).getGambar());
        holder.btnKirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(), ResultActivity.class);
                intent.putExtra("key",BaseAdapterActivity
                        .data.get(position).getGambar());
                context.startActivity(intent);
            }
        });

        return convertView;
    }
    public class ViewHolder{
        TextView tvNama;
        Button btnKirim;
        ImageView gambar;

    }
}
