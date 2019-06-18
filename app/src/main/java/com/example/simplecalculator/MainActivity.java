package com.example.simplecalculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    EditText num1,num2;
    Button add,subtract,division,multiply;
    TextView result;
    int r,f,g;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1=(EditText)findViewById(R.id.editText);
        num2=(EditText)findViewById(R.id.editText2);
        add=(Button)findViewById(R.id.button_add);
        subtract=(Button)findViewById(R.id.button_subtract);
        multiply=(Button)findViewById(R.id.button_multiply);
        division=(Button)findViewById(R.id.button_division);
        result=(TextView)findViewById(R.id.textView);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r=Integer.parseInt(num1.getText().toString());
                f=Integer.parseInt(num2.getText().toString());
                g=r+f;
                result.setText("Results="+g);
            }

        });

        subtract.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                r=Integer.parseInt(num1.getText().toString());
                f=Integer.parseInt(num2.getText().toString());
                g=r-f;
                result.setText("Results="+g);
            }

        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f=Integer.parseInt(num2.getText().toString());
                g=r*f;
                result.setText("Results="+g);
            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f=Integer.parseInt(num2.getText().toString());
                g=r/f;
                result.setText("Results="+g);
            }
        });

//        FloatingActionButton fab = findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });


    }
//    public void onButtonClick(View v) {
//        EditText e1 = (EditText)findViewById(R.id.editText);
//        EditText e2 = (EditText)findViewById(R.id.editText2);
//        TextView t1 = (TextView)findViewById(R.id.editText4);
//        int num1 = Integer.parseInt(e1.getText().toString());
//        int num2 = Integer.parseInt(e2.getText().toString());
//        int sum = num1 + num2;
//        t1.setText(Integer.toString(sum)); //converting integer to sum
//
//        int num3 = Integer.parseInt(e1.getText().toString());
//        int num4 = Integer.parseInt(e2.getText().toString());
//        int subtract = num3 - num4;
//        t1.setText(Integer.toString(subtract));
//
//        int num5 = Integer.parseInt(e1.getText().toString());
//        int num6 = Integer.parseInt(e2.getText().toString());
//        int multiply = num5 * num6;
//        t1.setText(Integer.toString(multiply));
//
//        int num7 = Integer.parseInt(e1.getText().toString());
//        int num8 = Integer.parseInt(e2.getText().toString());
//        int divide = num7 / num8;
//        t1.setText(Integer.toString(divide));
//    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
