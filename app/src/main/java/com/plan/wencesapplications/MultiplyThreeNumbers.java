package com.plan.wencesapplications;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MultiplyThreeNumbers extends AppCompatActivity {

    EditText etNum1,etNum2,etNum4;
    TextView etView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiply_three_numbers);
    }
    public  void multiplyNumbers(View view){
            etNum1= findViewById(R.id.etNum1);
            etNum2= findViewById(R.id.etNum2);
            etNum4= findViewById(R.id.etNum4);
            etView= findViewById(R.id.etView);


            double num1 = Double.parseDouble(etNum1.getText().toString());
            double num2 = Double.parseDouble(etNum2.getText().toString());
            double num4 = Double.parseDouble(etNum4.getText().toString());
            double result =  num1 * num2 * num4;

            etView.setText(Double.toString(result));
    }
}