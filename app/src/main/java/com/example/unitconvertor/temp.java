package com.example.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;

public class temp extends AppCompatActivity {

    ImageButton imageButton;
    TextView textView;

    EditText editText;

    Button button;
    int intInputValue;
    String stringInputValue;
    double i;
    String inputType,convertType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp);

        Intent intentBack = new Intent(this, home.class);
        imageButton = findViewById(R.id.imageButtonBAckTemp);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentBack);
            }
        });

        //set array spinner
        String[] TempType1 = {"Celsius","Kelvin","Fahrenheit"};

        String[] TempType2 = {"Celsius","Kelvin","Fahrenheit"};

        ArrayAdapter<String> adapterTemp1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, TempType1);
        adapterTemp1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapterTemp2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, TempType2);
        adapterTemp2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Spinner spinnerTemp = findViewById(R.id.spinnerTemp);
        Spinner spinnerTemp2 = findViewById(R.id.spinnerTemp2);

        spinnerTemp.setAdapter(adapterTemp1);
        spinnerTemp2.setAdapter(adapterTemp2);

        //assign editTexts,Textview and button
        editText = findViewById(R.id.editTextTextInputTemp);
        textView = findViewById(R.id.textViewTempOutput);
        button = findViewById(R.id.buttonTempConvert);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //assign input value
                stringInputValue = editText.getText().toString();
                intInputValue = Integer.parseInt(stringInputValue);

                //assign spinner values
                inputType = spinnerTemp.getSelectedItem().toString();
                convertType = spinnerTemp2.getSelectedItem().toString();

                if(inputType.equals("Celsius"))
                {
                    if(convertType.equals("Kelvin"))
                    {
                        i = (intInputValue+273.15);
                        textView.setText(String.valueOf(i));
                    }
                    else if (convertType.equals("Fahrenheit"))
                    {
                        i = (intInputValue*1.8)+32;
                        textView.setText(String.valueOf(i));
                    }
                    else
                    {
                        textView.setText(String.valueOf(intInputValue));
                    }
                }
                else if(inputType.equals("Kelvin"))
                {
                    if(convertType.equals("Celsius"))
                    {
                        i = (intInputValue-273.15);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("Fahrenheit"))
                    {
                        i = ((intInputValue-273.15)*1.8)+32;
                        textView.setText(String.valueOf(i));
                    }
                    else
                    {
                        textView.setText(String.valueOf(intInputValue));
                    }
                }
                else if(inputType.equals("Fahrenheit"))
                {
                    if(convertType.equals("Celsius"))
                    {
                        i=(intInputValue-32)*1.8;
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("Kelvin"))
                    {
                        i = (((intInputValue-32)*1.8)+273.15);
                        textView.setText(String.valueOf(i));
                    }
                    else
                    {
                        textView.setText(String.valueOf(intInputValue));
                    }
                }
                else
                {
                    textView.setText(String.valueOf(intInputValue));
                }
            }
        });

    }
}