package com.plan.wencesapplications;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Areaofcircle extends AppCompatActivity {

    EditText etNum1;
    TextView etView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_areaofcircle);
    }
    public  void multiplyNumbers(View view){
        etNum1= findViewById(R.id.etNum1);
        etView= findViewById(R.id.etView);


        double num1 = Double.parseDouble(etNum1.getText().toString());
        double result =  Math.PI * Math.pow(num1, 2);;

        etView.setText(Double.toString(result));
    }
}