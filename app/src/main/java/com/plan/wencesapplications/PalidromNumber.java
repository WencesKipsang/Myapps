package com.plan.wencesapplications;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;

public class PalidromNumber extends AppCompatActivity {
    class Numbers {
        int num;
        public  boolean isPalindrome() {
            int reversed = 0, remainder, original = num;
            while (num != 0) {
                remainder = num % 10;
                reversed = reversed * 10 + remainder;
                num /= 10;
            }
            return original == reversed;
        }

    }
    public void onButtonClick(View view) {
        EditText editText = findViewById(R.id.editTextTextPersonName);
        PalidromNumber.Numbers myNum = new PalidromNumber.Numbers();
        myNum.num = Integer.parseInt(editText.getText().toString());
        String message = editText.getText().toString();

        if(myNum.isPalindrome()) {
            message += " "+"is a palidrom anumber";
        }
        else {
            message += " "+"IS Not A Palidrom number";
        }

        Snackbar.make(view, message, Snackbar.LENGTH_LONG).show();
    }
        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palidrom_number);

    }
}