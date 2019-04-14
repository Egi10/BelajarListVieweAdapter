package id.co.mediatamaweb.belajarlistvieweadapter.model;

import java.util.ArrayList;

import id.co.mediatamaweb.belajarlistvieweadapter.R;

public class AmbilData {
    public static String[]nama={"Indonesia","Singapura","Malaysia","Vietnam","Brunai","Arab Saudi","Jerman"};
    public static int[]gambar={R.drawable.gambar1,R.drawable.gambar2,R.drawable.gambar3,
    R.drawable.gambar4,R.drawable.gambar5,R.drawable.gambar6,R.drawable.gambar7};

    public static ArrayList<Data> getData(){
        ArrayList<Data> list=new ArrayList<>();
        Data data=null;
        for(int i=0;i<nama.length;i++){
            data=new Data();
            data.setNama(nama[i]);
            data.setGambar(gambar[i]);
            list.add(data);
        }
        return list;
    }
}
