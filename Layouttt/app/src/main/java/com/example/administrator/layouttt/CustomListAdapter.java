package com.example.administrator.layouttt;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.util.Log;
import java.util.List;

/**
 * Created by Administrator on 09/03/2018.
 */

public class CustomListAdapter extends BaseAdapter{
    private List<bTitle> listData;
    private LayoutInflater layoutInflater;
    private Context context;

    public  CustomListAdapter(Context aContext, List<bTitle> listData){
        this.context=aContext;
        this.listData= listData;
        layoutInflater= LayoutInflater.from(aContext);
    }
    @Override
    public int getCount(){
        return listData.size();
    }

    @Override
    public Object getItem(int position) {
        return listData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView==null) {
            convertView = layoutInflater.inflate(R.layout.list_item, null);
            holder = new ViewHolder();
            holder.bJacketView = (ImageView) convertView.findViewById(R.id.bookjacket1);
            holder.bNameView = (TextView) convertView.findViewById(R.id.booktiltle1);
            holder.priceView = (TextView) convertView.findViewById(R.id.price1);
            holder.bvView = (TextView) convertView.findViewById(R.id.bookView1);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        bTitle bookTitle= this.listData.get(position);
        holder.bNameView.setText(bookTitle.getBookName());
        holder.priceView.setText(bookTitle.getPrice()+"đ");
        holder.bvView.setText(bookTitle.getViews()+" lượt xem.");
        int imageld= this.getMipmapResIdByName(bookTitle.getBookJacket());

        holder.bJacketView.setImageResource(imageld);

        return convertView;
      }
    public int getMipmapResIdByName(String resName){
        String pkgName= context.getPackageName();

        int resID= context.getResources().getIdentifier(resName,"mipmap", pkgName);
        Log.i("BookShopp", "Res Name: "+ resName+"==> Res ID= "+resID);
        return resID;
    }
    static class ViewHolder{
        ImageView bJacketView;
        TextView bNameView;
        TextView priceView;
        TextView bvView;
    }
}
