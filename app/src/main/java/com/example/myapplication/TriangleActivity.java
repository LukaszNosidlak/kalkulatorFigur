package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TriangleActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_triangle);

                final EditText inputBase = findViewById(R.id.input_base);
                Button btnCalculate = findViewById(R.id.btn_calculate_triangle);
                final TextView resultTriangle = findViewById(R.id.result_triangle);
                Button btnBack=findViewById(R.id.btn_back5);

                btnBack.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                                startActivity(new Intent(TriangleActivity.this,MainActivity.class));
                        }
                });
                btnCalculate.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                                String baseStr = inputBase.getText().toString();
                                if (!baseStr.isEmpty()) {
                                        double base = Double.parseDouble(baseStr);
                                        if (base > 0) {
                                                double area = (base * base * (Math.sqrt(3))) / 4;
                                                double perimeter = 3 * base;
                                                String result = "Pole: " + formatNumber(area) + "\nObwód: " + formatNumber(perimeter);
                                                resultTriangle.setText(result);
                                        } else {
                                                Toast.makeText(TriangleActivity.this, "Wartości muszą być większe od zera", Toast.LENGTH_SHORT).show();
                                        }
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