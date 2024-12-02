package com.example.exam;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class XeAdapter extends BaseAdapter{
    Context mycontext;
    int mylayout;
    List<ClassXe> mangxe;

    @Override
    public int getCount() {
        return mangxe.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


    public XeAdapter(Context mycontext, int mylayout, List<ClassXe> mangxe) {
        this.mycontext = mycontext;
        this.mylayout = mylayout;
        this.mangxe = mangxe;
    }

    public Context getMycontext() {
        return mycontext;
    }

    public void setMycontext(Context mycontext) {
        this.mycontext = mycontext;
    }

    public int getMylayout() {
        return mylayout;
    }

    public void setMylayout(int mylayout) {
        this.mylayout = mylayout;
    }

    public List<ClassXe> getMangxe() {
        return mangxe;
    }

    public void setMangxe(List<ClassXe> mangxe) {
        this.mangxe = mangxe;
    }

    private class ViewHolder
    {
        TextView txtvTenxe,txtvHangxe,txtvNamsx;
        ImageView imgHinh;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView==null){
            viewHolder=new ViewHolder();
            LayoutInflater inflater=(LayoutInflater)
                    mycontext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(mylayout,null);
            viewHolder.txtvTenxe=(TextView)convertView.findViewById(R.id.textViewTenxe);
            viewHolder.txtvHangxe=(TextView)convertView.findViewById(R.id.textViewHangxe);
            viewHolder.txtvNamsx=(TextView)convertView.findViewById(R.id.textViewNamsx);
            viewHolder.imgHinh=(ImageView) convertView.findViewById(R.id.imageViewHinh);
            convertView.setTag(viewHolder);
        }else { viewHolder=(ViewHolder) convertView.getTag(); }
        ClassXe xe=mangxe.get(position);
        viewHolder.txtvTenxe.setText(xe.getTenxe());
        viewHolder.txtvHangxe.setText(xe.getHangxe());
        viewHolder.txtvNamsx.setText(String.valueOf(xe.getNamsx()));

        Context context = viewHolder.imgHinh.getContext();
        int id = context.getResources().getIdentifier(xe.getHinh(), "drawable", context.getPackageName());
        viewHolder.imgHinh.setImageResource(id);

        return convertView;
    }

}
