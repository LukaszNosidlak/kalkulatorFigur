package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ParallelogramActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parallelogram);

        final EditText inputBase = findViewById(R.id.input_base);
        final EditText inputSide = findViewById(R.id.input_side);
        final EditText inputHeight = findViewById(R.id.input_height);
        Button btnCalculate = findViewById(R.id.btn_calculate_parallelogram);
        final TextView resultParallelogram = findViewById(R.id.result_parallelogram);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String baseStr = inputBase.getText().toString();
                String sideStr = inputSide.getText().toString();
                String heightStr = inputHeight.getText().toString();
                if (!baseStr.isEmpty() && !sideStr.isEmpty() && !heightStr.isEmpty()) {
                    double base = Double.parseDouble(baseStr);
                    double side = Double.parseDouble(sideStr);
                    double height = Double.parseDouble(heightStr);
                    double area = base * height;
                    double perimeter = 2 * (base + side);

                    String result = "Pole: " + formatNumber(area) + "\nObwód: " + formatNumber(perimeter);
                    resultParallelogram.setText(result);
                }
            }
        });
    }

    private String formatNumber(double number) {
        if (number == (long) number) {
            return String.format("%d", (long) number);
        } else {
            return String.format("%.2f", number);
        }
    }
}