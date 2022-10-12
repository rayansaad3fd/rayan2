package com.example.rayan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class homeactivity extends AppCompatActivity {

    EditText editTextNumber, editTextNumber2;
    Button buttonPlus, buttonMinus;
    TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homeactivity2);

        editTextNumber = findViewById(R.id.editTextNumber);
        editTextNumber2 = findViewById(R.id.editTextNumber2);

        buttonPlus = findViewById(R.id.buttonPlus);
        buttonMinus = findViewById(R.id.buttonMinus);

        textViewResult = findViewById(R.id.textViewResult);

    }

    public void plus(View view) {
        double number1= Double.parseDouble(editTextNumber.getText().toString());
        double number2= Double.parseDouble(editTextNumber2.getText().toString());

        textViewResult.setText((number1+number2)+"");
    }

    public void minus(View view) {
        double number1= Double.parseDouble(editTextNumber.getText().toString());
        double number2= Double.parseDouble(editTextNumber.getText().toString());

        textViewResult.setText((number1+number2)+"");

    }
}