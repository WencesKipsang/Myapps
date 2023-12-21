package com.plan.wencesapplications;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;

public class FibanocciSquare extends AppCompatActivity {


    class Numbers {
        int num;

        // Perfect Square
        public boolean isPerfectSquare()
        {
            double sqRoot = (int)Math.sqrt(num);
            return sqRoot * sqRoot == num;
        }

        // Print fibonacci series
        public boolean isFibonaaciNumber()
        {
            int a = 0, b = 1, c = 0;
            while (c < num) {
                c = a + b;
                a = b;
                b = c;
            }
            return c == num;
        }
    }


    public void onButtonClick(View view)
    {
        EditText editText = findViewById(R.id.editTextTextPersonName);
        Numbers myNum = new Numbers();
        myNum.num = Integer.parseInt(editText.getText().toString());
        String message = editText.getText().toString();

        if(myNum.isPerfectSquare() && myNum.isFibonaaciNumber()) {
            message += " is square and Fibonacci ";
        }
        else if (myNum.isPerfectSquare()) {
        //else if (myNum.isPerfectSquare() && !myNum.isFibonaaciNumber()) {

            message +=" "+ "is square but not Fibonacci";
        }
        else if (myNum.isFibonaaciNumber()) {
        //else if (myNum.isFibonaaciNumber() && !myNum.isPerfectSquare()){
                message += " "+"is Fibonacci but not square";
        }

        else {
            message += " "+"neither  Fibonacci  nor square";
        }

        Snackbar.make(view, message, Snackbar.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fibanocci_square);
    }
}