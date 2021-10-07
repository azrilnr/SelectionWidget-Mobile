package com.example.selectionwidget;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {


    Button BtnListView, BtnSpinner, BtnAutoComplete, BtnRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        BtnListView = findViewById(R.id.BtnListView);
        BtnSpinner = findViewById(R.id.BtnSpinner);
        BtnAutoComplete = findViewById(R.id.BtnAutoComplete);
        BtnRecyclerView = findViewById(R.id.BtnRecyclerView);


        BtnListView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        BtnSpinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, SpinnerActivity.class);
                startActivity(intent);
            }
        });

        BtnAutoComplete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, AutoCompleteTextActivity.class);
                startActivity(intent);
            }
        });

        BtnRecyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, RecyclerViewActivity.class);
                startActivity(intent);
            }
        });
    }
}