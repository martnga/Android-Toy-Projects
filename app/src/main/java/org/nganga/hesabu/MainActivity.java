package org.nganga.hesabu;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {

    EditText operand1;
    EditText operand2;
    Button btnPlus;
    Button btnSubtract;
    Button btnDivide;
    Button btnMultiply;
    TextView result;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        operand1 = (EditText) findViewById(R.id.editOperand1);
        operand2 = (EditText) findViewById(R.id.editOperand2);

        btnDivide = (Button) findViewById(R.id.btnDivide);
        btnSubtract = (Button) findViewById(R.id.btnSubtract);
        btnMultiply = (Button) findViewById(R.id.btnMultipy);
        btnPlus = (Button) findViewById(R.id.btnPlus);
        result = (TextView) findViewById(R.id.textResult);

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float oper1 = Float.parseFloat(operand1.getText().toString());
                float oper2 = Float.parseFloat(operand2.getText().toString());

                float theResult = oper1 + oper2;
                result.setText(Float.toString(theResult));
            }
        });

        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float oper1 = Float.parseFloat(operand1.getText().toString());
                float oper2 = Float.parseFloat(operand2.getText().toString());

                float theResult = oper1 - oper2;
                result.setText(Float.toString(theResult));
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float oper1 = Float.parseFloat(operand1.getText().toString());
                float oper2 = Float.parseFloat(operand2.getText().toString());

                float theResult = oper1 / oper2;
                result.setText(Float.toString(theResult));
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float oper1 = Float.parseFloat(operand1.getText().toString());
                float oper2 = Float.parseFloat(operand2.getText().toString());

                float theResult = oper1 * oper2;
                result.setText(Float.toString(theResult));
            }
        });
    }

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
