package com.example.administrator.layouttt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<bTitle> image_details= getListData();
        final ListView listView= (ListView) findViewById(R.id.listView);
        listView.setAdapter(new CustomListAdapter(this,image_details));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View v, int position, long id) {
                Object o= listView.getItemAtPosition(position);
                bTitle bookTilte=(bTitle) o;
                Toast.makeText(MainActivity.this,"Selected: " +bookTilte, Toast.LENGTH_LONG).show();
            }
        });
    }
    private  List<bTitle> getListData(){
        List<bTitle> list= new ArrayList<bTitle>();
        bTitle colorful= new bTitle("Colorful","s1", 64000,729);
        bTitle dvcblbc= new bTitle("Đời về Cơ Bản Là Buồn","s2",40000,1202);
        bTitle namcms= new bTitle("5cm trên giây","s3",40000,2410);
        bTitle yeusao= new bTitle("Yêu sao để không đau","s4",62000,2132);
        bTitle thattinh= new bTitle("Hôm Nay Tôi Thất Tình","s6",58000,1992);
        bTitle urname= new bTitle("Your Name", "s12", 62000,3021);
        bTitle onepiece= new bTitle("One Piece - 70","s14",19500,1212);

        list.add(colorful);
        list.add(dvcblbc);
        list.add(namcms);
        list.add(yeusao);
        list.add(thattinh);
        list.add(urname);
        list.add(onepiece);
        return list;
    }
}
