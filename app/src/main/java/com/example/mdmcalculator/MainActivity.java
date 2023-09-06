package com.example.mdmcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editst ,editdays ;
        TextView txtMilk , txtSugar , txtRice ,  txtWheat;
        Button btnCalculate;

        editst =findViewById(R.id.editst);
        txtMilk =findViewById(R.id.txtMilk);
        txtSugar =findViewById(R.id.txtSugar);
        txtRice=findViewById(R.id.txtRice);
        txtWheat =findViewById(R.id.txtWheat);
        btnCalculate=findViewById(R.id.btnCalculate);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int st = Integer.parseInt(editst.getText().toString());

                double milkpowder1 = (st * 0.015);
                double milkpowder = Math.round(milkpowder1*10000)/10000.0;
                double sugar1 = (st * 0.0084);
                double sugar = Math.round(sugar1*10000)/10000.0;
                int rice = (st * 100)/1000;
                int ricegm = (st * 100)%1000;
                int wheat = (st * 100)/1000;
                int wheatgm = (st * 100)%1000;

                txtMilk.setText("Milk Powder :- " + milkpowder +"kg");
                txtSugar.setText("Sugar :- " + sugar+"kg");
                txtRice.setText("Rice :- " + rice+"."+ricegm +"kg");
                txtWheat.setText("Wheat:- " + wheat+"."+ricegm +"kg");
            }



        });


    }
    }
