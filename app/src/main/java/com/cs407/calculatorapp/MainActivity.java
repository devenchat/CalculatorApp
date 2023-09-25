package com.cs407.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void addFunction(View view)
    {
        EditText numberOne=(EditText)findViewById(R.id.numberOne);
        int numOne = Integer.parseInt(numberOne.getText().toString());

        EditText numberTwo=(EditText)findViewById(R.id.numberTwo);
        int numTwo = Integer.parseInt(numberTwo.getText().toString());

        int res = numOne + numTwo;
        String result = String.valueOf(res);

        Intent intent = new Intent(this, DisplayResult.class);
        intent.putExtra("result", result);
        startActivity(intent);
    }

    public void subFunction(View view)
    {
        EditText numberOne=(EditText)findViewById(R.id.numberOne);
        int numOne = Integer.parseInt(numberOne.getText().toString());

        EditText numberTwo=(EditText)findViewById(R.id.numberTwo);
        int numTwo = Integer.parseInt(numberTwo.getText().toString());

        int res = numOne - numTwo;
        String result = String.valueOf(res);

        Intent intent = new Intent(this, DisplayResult.class);
        intent.putExtra("result", result);
        startActivity(intent);
    }

    public void multFunction(View view)
    {
        EditText numberOne=(EditText)findViewById(R.id.numberOne);
        int numOne = Integer.parseInt(numberOne.getText().toString());

        EditText numberTwo=(EditText)findViewById(R.id.numberTwo);
        int numTwo = Integer.parseInt(numberTwo.getText().toString());

        int res = numOne * numTwo;
        String result = String.valueOf(res);

        Intent intent = new Intent(this, DisplayResult.class);
        intent.putExtra("result", result);
        startActivity(intent);
    }

    public void divFunction(View view)
    {
        EditText numberOne=(EditText)findViewById(R.id.numberOne);
        int numOne = Integer.parseInt(numberOne.getText().toString());

        EditText numberTwo=(EditText)findViewById(R.id.numberTwo);
        int numTwo = Integer.parseInt(numberTwo.getText().toString());

        String result = "";
        if(numTwo == 0)
        {
            result = "Invalid Input";
        }
        else
        {
            int res = numOne / numTwo;
            result = String.valueOf(res);
        }

        Intent intent = new Intent(this, DisplayResult.class);
        intent.putExtra("result", result);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}