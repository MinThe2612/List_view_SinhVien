package com.example.list_view;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class StudentDetailActivity extends AppCompatActivity {
    ImageView imageView;
    TextView nameText, mssvText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_detail);

        imageView = findViewById(R.id.detailImage);
        nameText = findViewById(R.id.detailName);
        mssvText = findViewById(R.id.detailMssv);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String mssv = intent.getStringExtra("mssv");
        int imageResId = intent.getIntExtra("imageResId", R.drawable.ic_launcher_foreground);

        nameText.setText(name);
        mssvText.setText(mssv);
        imageView.setImageResource(imageResId);
    }
}
