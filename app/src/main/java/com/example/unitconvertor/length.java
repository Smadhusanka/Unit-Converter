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
import android.widget.Toast;

public class length extends AppCompatActivity {

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
        setContentView(R.layout.activity_length);

        Intent intentBack = new Intent(this, home.class);
        imageButton = findViewById(R.id.imageButtonBackLength);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {startActivity(intentBack);}
        });

        //set array spinner
        String[] lengthType1 = {"Meter","Kilometer","Centimeter","Millimeter",
        "Micrometer","Nanometer"};

        String[] lengthType2 = {"Meter","Kilometer","Centimeter","Millimeter",
                "Micrometer","Nanometer"};

        ArrayAdapter<String> adapterLength1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, lengthType1);
        adapterLength1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapterLength2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, lengthType1);
        adapterLength2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Spinner spinnerLength = findViewById(R.id.spinnerLength);
        Spinner spinnerLength2 = findViewById(R.id.spinnerLength2);

        spinnerLength.setAdapter(adapterLength1);
        spinnerLength2.setAdapter(adapterLength2);

        //assign editTexts,Textview and button
        editText = findViewById(R.id.editTextTextInputLength);
        textView = findViewById(R.id.textViewLengthOutput);
        button = findViewById(R.id.buttonLengthConvert);



         button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //assign input value
                stringInputValue = editText.getText().toString();
                intInputValue = Integer.parseInt(stringInputValue);

                //assign spinner values
                inputType = spinnerLength.getSelectedItem().toString();
                convertType = spinnerLength2.getSelectedItem().toString();

                if(inputType.equals("Meter"))
                {
                    if(convertType.equals("Kilometer"))
                    {
                        i = (intInputValue/1000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if (convertType.equals("Centimeter")) {
                        i = (intInputValue*100.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if (convertType.equals("Millimeter")) {
                        i = (intInputValue*1000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if (convertType.equals("Micrometer")) {
                        i = (intInputValue*1000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if (convertType.equals("Nanometer")) {
                        i = (intInputValue*1000000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else
                    {
                        textView.setText(String.valueOf(intInputValue));
                    }

                }
                else if (inputType.equals("Kilometer")) {
                    if(convertType.equals("Meter"))
                    {
                        i = (intInputValue*1000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if (convertType.equals("Centimeter")) {
                        i = (intInputValue*100000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if (convertType.equals("Millimeter")) {
                        i = (intInputValue*1000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if (convertType.equals("Micrometer")) {
                        i = (intInputValue*1000000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if (convertType.equals("Nanometer")) {
                        i = (intInputValue*1000000000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else
                    {
                        textView.setText(String.valueOf(intInputValue));
                    }
                }
                else if (inputType.equals("Centimeter")) {
                    if(convertType.equals("Meter"))
                    {
                        i = (intInputValue/100.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if (convertType.equals("Kilometer")) {
                        i = (intInputValue/100000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if (convertType.equals("Millimeter")) {
                        i = (intInputValue*10.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if (convertType.equals("Micrometer")) {
                        i = (intInputValue*10000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if (convertType.equals("Nanometer")) {
                        i = (intInputValue*10000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else
                    {
                        textView.setText(String.valueOf(intInputValue));
                    }
                }
                else if (inputType.equals("Millimeter")) {
                    if(convertType.equals("Meter"))
                    {
                        i = (intInputValue/1000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if (convertType.equals("Kilometer")) {
                        i = (intInputValue/1000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if (convertType.equals("Centimeter")) {
                        i = (intInputValue/10.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if (convertType.equals("Micrometer")) {
                        i = (intInputValue*1000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if (convertType.equals("Nanometer")) {
                        i = (intInputValue*1000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else
                    {
                        textView.setText(String.valueOf(intInputValue));
                    }
                }
                else if (inputType.equals("Micrometer")) {
                    if(convertType.equals("Meter"))
                    {
                        i = (intInputValue/1000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if (convertType.equals("Kilometer")) {
                        i = (intInputValue/1000000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if (convertType.equals("Centimeter")) {
                        i = (intInputValue/10000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if (convertType.equals("Millimeter")) {
                        i = (intInputValue/1000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if (convertType.equals("Nanometer")) {
                        i = (intInputValue*1000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else
                    {
                        textView.setText(String.valueOf(intInputValue));
                    }
                }
                else if (inputType.equals("Nanometer")) {
                    if(convertType.equals("Meter"))
                    {
                        i = (intInputValue/1000000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if (convertType.equals("Kilometer")) {
                        i = (intInputValue/1000000000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if (convertType.equals("Centimeter")) {
                        i = (intInputValue/10000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if (convertType.equals("Millimeter")) {
                        i = (intInputValue/1000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if (convertType.equals("Micrometer")) {
                        i = (intInputValue/1000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else
                    {
                        textView.setText(String.valueOf(intInputValue));
                    }
                }
                else {
                    textView.setText(String.valueOf(intInputValue));
                }

            }
        });


    }
}