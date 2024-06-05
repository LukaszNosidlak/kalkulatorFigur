package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSquare = findViewById(R.id.btn_square);
        Button btnRectangle = findViewById(R.id.btn_rectangle);
        Button btnTriangle = findViewById(R.id.btn_triangle);
        Button btnTrapezoid = findViewById(R.id.btn_trapezoid);
        Button btnParallelogram = findViewById(R.id.btn_parallelogram);

        btnSquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SquareActivity.class));
            }
        });

        btnRectangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, RectangleActivity.class));
            }
        });

        btnTriangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TriangleActivity.class));
            }
        });

        btnTrapezoid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TrapezoidActivity.class));
            }
        });

        btnParallelogram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ParallelogramActivity.class));
            }
        });
    }
}