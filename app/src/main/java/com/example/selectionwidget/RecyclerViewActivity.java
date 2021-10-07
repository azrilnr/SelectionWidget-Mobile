package com.example.selectionwidget;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class RecyclerViewActivity extends AppCompatActivity {

    RecyclerView RecyclerView;

    String s1[], s2[];
    int images[] = {R.drawable.beat,R.drawable.beatstreet,R.drawable.scoppy,R.drawable.vario,R.drawable.adv,R.drawable.pcx,R.drawable.forza};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        RecyclerView = findViewById(R.id.RecyclerView);

        s1 = getResources().getStringArray(R.array.motor);
        s2 = getResources().getStringArray(R.array.Deskripsi);

        MyAdapter myAdapter = new MyAdapter(this, s1, s2, images);
        RecyclerView.setAdapter(myAdapter);
        RecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}