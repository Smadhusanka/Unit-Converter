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

public class weight extends AppCompatActivity {

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
        setContentView(R.layout.activity_weight);

        Intent intentBack = new Intent(this, home.class);
        imageButton = findViewById(R.id.imageButtonBackWeight);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentBack);
            }
        });

        //set array spinner
        String[] weightType1 = {"Kilogram","Gram","Milligram","MetricTon"};

        String[] weightType2 ={"Kilogram","Gram","Milligram","MetricTon"};

        ArrayAdapter<String> adapterWeight1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, weightType1);
        adapterWeight1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapterWeight2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, weightType2);
        adapterWeight2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Spinner spinnerWeight = findViewById(R.id.spinnerWeight);
        Spinner spinnerWeight2 = findViewById(R.id.spinnerWeight2);

        spinnerWeight.setAdapter(adapterWeight1);
        spinnerWeight2.setAdapter(adapterWeight2);

        //assign editTexts,Textview and button
        editText = findViewById(R.id.editTextTextInputWeight);
        textView = findViewById(R.id.textViewWeightOutput);
        button = findViewById(R.id.buttonWeightConvert);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //assign input value
                stringInputValue = editText.getText().toString();
                intInputValue = Integer.parseInt(stringInputValue);

                //assign spinner values
                inputType = spinnerWeight.getSelectedItem().toString();
                convertType = spinnerWeight2.getSelectedItem().toString();

                if(inputType.equals("Kilogram"))
                {
                    if(convertType.equals("Gram"))
                    {
                        i = (intInputValue*1000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("Milligram"))
                    {
                        i = (intInputValue*1000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("MetricTon"))
                    {
                        i = (intInputValue/1000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else
                    {
                        textView.setText(String.valueOf(intInputValue));
                    }

                }
                else if(inputType.equals("Gram"))
                {
                    if(convertType.equals("Kilogram"))
                    {
                        i = (intInputValue/1000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("Milligram"))
                    {
                        i = (intInputValue*1000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("MetricTon"))
                    {
                        i = (intInputValue/1000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else
                    {
                        textView.setText(String.valueOf(intInputValue));
                    }

                }
                else if(inputType.equals("Milligram"))
                {
                    if(convertType.equals("Kilogram"))
                    {
                        i = (intInputValue/1000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("Gram"))
                    {
                        i = (intInputValue/1000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("MetricTon"))
                    {
                        i = (intInputValue/10000000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else
                    {
                        textView.setText(String.valueOf(intInputValue));
                    }

                }
                else if(inputType.equals("MetricTon"))
                {
                    if(convertType.equals("Kilogram"))
                    {
                        i = (intInputValue*1000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("Gram"))
                    {
                        i = (intInputValue*1000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("Milligram"))
                    {
                        i = (intInputValue*1000000000.0);
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