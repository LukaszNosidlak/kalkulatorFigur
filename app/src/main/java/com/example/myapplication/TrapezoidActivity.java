package com.example.myapplication;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TrapezoidActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trapezoid);

        final EditText inputBase1 = findViewById(R.id.input_base1);
        final EditText inputBase2 = findViewById(R.id.input_base2);
        final EditText inputHeight = findViewById(R.id.input_height);
        final EditText inputSide1 = findViewById(R.id.input_side1);
        final EditText inputSide2 = findViewById(R.id.input_side2);
        Button btnCalculate = findViewById(R.id.btn_calculate_trapezoid);
        final TextView resultTrapezoid = findViewById(R.id.result_trapezoid);
        Button btnBack=findViewById(R.id.btn_back4);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TrapezoidActivity.this,MainActivity.class));
            }
        });
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String base1Str = inputBase1.getText().toString();
                String base2Str = inputBase2.getText().toString();
                String heightStr = inputHeight.getText().toString();
                String side1Str = inputSide1.getText().toString();
                String side2Str = inputSide2.getText().toString();
                if (!base1Str.isEmpty() && !base2Str.isEmpty() && !heightStr.isEmpty() && !side1Str.isEmpty() && !side2Str.isEmpty()) {
                    double base1 = Double.parseDouble(base1Str);
                    double base2 = Double.parseDouble(base2Str);
                    double height = Double.parseDouble(heightStr);
                    double side1 = Double.parseDouble(side1Str);
                    double side2 = Double.parseDouble(side2Str);
                    if (base1 > 0 && base2 > 0 && height > 0 && side1 > 0 && side2 > 0) {
                        double area = 0.5 * (base1 + base2) * height;
                        double perimeter = base1 + base2 + side1 + side2;

                        String result = "Pole: " + formatNumber(area) + "\nObwód: " + formatNumber(perimeter);
                        resultTrapezoid.setText(result);
                    } else {
                        Toast.makeText(TrapezoidActivity.this, "Wartości muszą być większe od zera", Toast.LENGTH_SHORT).show();
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