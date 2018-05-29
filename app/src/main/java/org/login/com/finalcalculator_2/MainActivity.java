package org.login.com.finalcalculator_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText  mEdtValue;
    Button mBtnOne;
    Button mBtnTwo;
    Button mBtnThree;
    Button mBtnFour;
    Button mBtnFive;
    Button mBtnSix;
    Button mBtnSeven;
    Button mBtnEight;
    Button mBtnNine;
    Button mBtnZero;
    Button mBtnAdd;
    Button mBtnSub;
    Button mBtnMul;
    Button mBtnDiv;
    Button mBtnEqual;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEdtValue = findViewById(R.id.edt_value);
        mBtnOne = findViewById(R.id.btn_one);
        mBtnTwo = findViewById(R.id.btn_two);
        mBtnThree = findViewById(R.id.btn_three);
        mBtnFour = findViewById(R.id.btn_four);
        mBtnFive = findViewById(R.id.btn_five);
        mBtnSix = findViewById(R.id.btn_six);
        mBtnSeven = findViewById(R.id.btn_seven);
        mBtnEight = findViewById(R.id.btn_eight);
        mBtnNine = findViewById(R.id.btn_nine);
        mBtnZero = findViewById(R.id.btn_zero);
        mBtnAdd = findViewById(R.id.btn_add);
        mBtnSub = findViewById(R.id.btn_sub);
        mBtnMul = findViewById(R.id.btn_multiplication);
        mBtnDiv = findViewById(R.id.btn_division);
        mBtnEqual = findViewById(R.id.btn_equal);

        mBtnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setValueToEdt(mBtnOne.getText().toString());
            }
        });

        mBtnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setValueToEdt(mBtnTwo.getText().toString());
            }
        });

        mBtnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setValueToEdt(mBtnThree.getText().toString());
            }
        });

        mBtnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setValueToEdt(mBtnFour.getText().toString());
            }
        });
        mBtnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setValueToEdt(mBtnFive.getText().toString());
            }
        });
        mBtnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setValueToEdt(mBtnSix.getText().toString());
            }
        });
        mBtnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setValueToEdt(mBtnSeven.getText().toString());
            }
        });
        mBtnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setValueToEdt(mBtnEight.getText().toString());
            }
        });
        mBtnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setValueToEdt(mBtnNine.getText().toString());
            }
        });
        mBtnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setValueToEdt(mBtnZero.getText().toString());
            }
        });
    }

    public void setValueToEdt(String value)
    {
        mEdtValue.setText(mEdtValue.getText().toString()+value);
    }
}
