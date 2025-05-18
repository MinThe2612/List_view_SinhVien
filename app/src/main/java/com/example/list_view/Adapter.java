package com.example.list_view;

import android.widget.ArrayAdapter;
import android.app.Activity;
import java.util.ArrayList;

public class Adapter extends ArrayAdapter<list_element> {
    Activity context;
    int layout;
    ArrayList<list_element> list;

    public Adapter(Activity context, int layout, list_element[] list) {
        super(context, layout, list);
        this.context = context;
        this.layout = layout;
    }
}
