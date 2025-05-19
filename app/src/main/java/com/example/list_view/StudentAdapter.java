package com.example.list_view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

import com.example.list_view.R;
import com.example.list_view.Student;


public class StudentAdapter extends BaseAdapter {
    private Context ctx;
    private List<Student> list;
    private LayoutInflater inflater;

    public StudentAdapter(Context ctx, List<Student> list) {
        this.ctx = ctx;
        this.list = list;
        this.inflater = LayoutInflater.from(ctx);
    }
    @Override public int getCount() { return list.size(); }
    @Override public Object getItem(int i) { return list.get(i); }
    @Override public long getItemId(int i) { return list.get(i).getId(); }
    @Override
    public View getView(int pos, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.item_student, parent, false);
        }
        Student s = list.get(pos);
        ImageView img = convertView.findViewById(R.id.imgPhoto);
        TextView tvName = convertView.findViewById(R.id.tvName);
        TextView tvMSSV = convertView.findViewById(R.id.tvMSSV);

        tvName.setText(s.getName());
        tvMSSV.setText(s.getMssv());

        int resId = ctx.getResources().getIdentifier(s.getPhotoUri(), "drawable", ctx.getPackageName());
        img.setImageResource(resId);
        return convertView;
    }
}