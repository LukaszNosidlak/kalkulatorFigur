package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SquareActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square);

        final EditText inputSide = findViewById(R.id.input_side);
        Button btnCalculate = findViewById(R.id.btn_calculate_square);
        final TextView resultSquare = findViewById(R.id.result_square);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sideStr = inputSide.getText().toString();
                if (!sideStr.isEmpty()) {
                    double side = Double.parseDouble(sideStr);
                    if (side > 0) {
                        double area = side * side;
                        double perimeter = 4 * side;

                        String result = "Pole: " + formatNumber(area) + "\nObwód: " + formatNumber(perimeter);
                        resultSquare.setText(result);
                    } else {
                        Toast.makeText(SquareActivity.this, "Wartość musi być większa od zera", Toast.LENGTH_SHORT).show();
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