package com.scc.sdd.art.mycalculator2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements CalculatorListener {

    TextView txtResult;
    EditText edtOp1;
    EditText edtOp2;
    MainController mainController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtResult = (TextView) findViewById(R.id.txt_result);
        edtOp1    = (EditText) findViewById(R.id.text_op1);
        edtOp2    = (EditText) findViewById(R.id.text_op2);

        mainController = new MainController();
        mainController.setCalculatorListener( this );
    }

    private void showResult(String res) {
        txtResult.setText( res );
    }

    public void onAdd(View view) {
        double op1 = Double.parseDouble( edtOp1.getText().toString() );
        double op2 = Double.parseDouble( edtOp2.getText().toString() );
        mainController.add( op1, op2 );
    }

    public void onSub(View view) {
        double op1 = Double.parseDouble( edtOp1.getText().toString() );
        double op2 = Double.parseDouble( edtOp2.getText().toString() );
        mainController.sub(op1,op2);
    }

    public void onMul(View view) {
        double op1 = Double.parseDouble( edtOp1.getText().toString() );
        double op2 = Double.parseDouble( edtOp2.getText().toString() );
    }

    public void onDiv(View view) {
        double op1 = Double.parseDouble( edtOp1.getText().toString() );
        double op2 = Double.parseDouble( edtOp2.getText().toString() );


    }

    @Override
    public void onSuccess(String result) {
        showResult(result);
    }
}
