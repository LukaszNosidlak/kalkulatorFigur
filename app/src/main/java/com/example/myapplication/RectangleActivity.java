package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RectangleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangle);

        final EditText inputLength = findViewById(R.id.input_length);
        final EditText inputWidth = findViewById(R.id.input_width);
        Button btnCalculate = findViewById(R.id.btn_calculate_rectangle);
        final TextView resultRectangle = findViewById(R.id.result_rectangle);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String lengthStr = inputLength.getText().toString();
                String widthStr = inputWidth.getText().toString();
                if (!lengthStr.isEmpty() && !widthStr.isEmpty()) {
                    double length = Double.parseDouble(lengthStr);
                    double width = Double.parseDouble(widthStr);
                    double area = length * width;
                    double perimeter = 2 * (length + width);

                    String result = "Pole: " + area + "\nObwód: " + perimeter;
                    resultRectangle.setText(result);
                }
            }
        });
    }
}
