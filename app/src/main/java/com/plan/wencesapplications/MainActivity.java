package com.plan.wencesapplications;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cursoradapter.widget.SimpleCursorAdapter;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.list);
        String[] values = new String[]{"My plans","Fibonacci and Square Number","Palindrome Number" ,"Multiply Three Numbers","Area of Circle","Divide two numbers","Subtruct two numbers","Area Rectangle","Area Square","Addition of three numbers",};

      ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, values);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    //Intent myIntent = new Intent(view.getContext(), FibanocciSquare.class);
                    //startActivityForResult(myIntent, 0);
                    Intent myIntent = new Intent(MainActivity.this, WencesTodo.class);
                    startActivity(myIntent);
                }
                if (position == 1) {
                    Intent myIntent = new Intent(MainActivity.this, FibanocciSquare.class);
                    //startActivityForResult(myIntent, 0);
                    startActivity(myIntent);
                }
                if (position == 2) {
                    Intent myIntent = new Intent(MainActivity.this, PalidromNumber.class);
                    //startActivityForResult(myIntent, 0);
                    startActivity(myIntent);
                }
                if (position == 3) {
                    Intent myIntent = new Intent(MainActivity.this, MultiplyThreeNumbers.class);
                    //startActivityForResult(myIntent, 0);
                    startActivity(myIntent);
                }
                if (position == 4) {
                    Intent myIntent = new Intent(MainActivity.this, Areaofcircle.class);
                    //startActivityForResult(myIntent, 0);
                    startActivity(myIntent);
                }
                if (position == 5) {
                    Intent myIntent = new Intent(MainActivity.this, Divition.class);
                    //startActivityForResult(myIntent, 0);
                    startActivity(myIntent);
                }
                if (position == 6) {
                    Intent myIntent = new Intent(MainActivity.this, subtruction.class);
                    //startActivityForResult(myIntent, 0);
                    startActivity(myIntent);
                }
                if (position == 7) {
                    Intent myIntent = new Intent(MainActivity.this, AreaRectangle.class);
                    //startActivityForResult(myIntent, 0);
                    startActivity(myIntent);
                }
                if (position == 8) {
                    Intent myIntent = new Intent(MainActivity.this, AreaofSquare.class);
                    //startActivityForResult(myIntent, 0);
                    startActivity(myIntent);
                }
                if (position == 9) {
                    Intent myIntent = new Intent(MainActivity.this, Addition.class);
                    //startActivityForResult(myIntent, 0);
                    startActivity(myIntent);
                }


            }
        });
    }
}