package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class SquareActivity extends AppCompatActivity {

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
                    double area = side * side;
                    double perimeter = 4 * side;

                    String result = "Pole: " + area + "\nObwód: " + perimeter;
                    resultSquare.setText(result);
                }
            }
        });
    }
}