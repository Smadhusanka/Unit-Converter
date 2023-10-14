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

public class volume extends AppCompatActivity {

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
        setContentView(R.layout.activity_volume);

        Intent intentBack = new Intent(this, home.class);
        imageButton = findViewById(R.id.imageButtonBackVolume);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentBack);
            }
        });

        //set array spinner
        String[] VolumeType1 = {"CubicMeter","CubicKilometer","CubicCentimetre","CubicMillimeter","Liter","Milliliter"};

        String[] VolumeType2 = {"CubicMeter","CubicKilometer","CubicCentimetre","CubicMillimeter","Liter","Milliliter"};

        ArrayAdapter<String> adapterVolume1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, VolumeType1);
        adapterVolume1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapterVolume2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, VolumeType2);
        adapterVolume2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Spinner spinnerVolume = findViewById(R.id.spinnerVolume);
        Spinner spinnerVolume2 = findViewById(R.id.spinnerVolume2);

        spinnerVolume.setAdapter(adapterVolume1);
        spinnerVolume2.setAdapter(adapterVolume2);

        //assign editTexts,Textview and button
        editText = findViewById(R.id.editTextTextInputVolume);
        textView = findViewById(R.id.textViewVolumeOutput);
        button = findViewById(R.id.buttonVolumeConvert);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //assign input value
                stringInputValue = editText.getText().toString();
                intInputValue = Integer.parseInt(stringInputValue);

                //assign spinner values
                inputType = spinnerVolume.getSelectedItem().toString();
                convertType = spinnerVolume2.getSelectedItem().toString();

                if(inputType.equals("CubicMeter"))
                {
                    if (convertType.equals("CubicKilometer"))
                    {
                        i = (intInputValue/1000000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("CubicCentimetre"))
                    {
                        i = (intInputValue*1000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("CubicMillimeter"))
                    {
                        i = (intInputValue*1000000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("Liter"))
                    {
                        i = (intInputValue*1000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("Milliliter"))
                    {
                        i = (intInputValue*1000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else
                    {
                        textView.setText(String.valueOf(intInputValue));
                    }
                }
                else if(inputType.equals("CubicKilometer"))
                {
                    if (convertType.equals("CubicMeter"))
                    {
                        i = (intInputValue*1000000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("CubicCentimetre"))
                    {
                        i = (intInputValue*1000000000000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("CubicMillimeter"))
                    {
                        i = (intInputValue*1000000000000000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("Liter"))
                    {
                        i = (intInputValue*1000000000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("Milliliter"))
                    {
                        i = (intInputValue*1000000000000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else
                    {
                        textView.setText(String.valueOf(intInputValue));
                    }
                }
                else if(inputType.equals("CubicCentimetre"))
                {
                    if (convertType.equals("CubicKilometer"))
                    {
                        i = (intInputValue/10000000000000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("CubicMeter"))
                    {
                        i = (intInputValue/1000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("CubicMillimeter"))
                    {
                        i = (intInputValue*1000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("Liter"))
                    {
                        i = (intInputValue/1000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("Milliliter"))
                    {
                        i = (intInputValue*1.0);
                        textView.setText(String.valueOf(i));
                    }
                    else
                    {
                        textView.setText(String.valueOf(intInputValue));
                    }
                }
                else if(inputType.equals("CubicMillimeter"))
                {
                    if (convertType.equals("CubicKilometer"))
                    {
                        i = (intInputValue/1000000000000000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("CubicCentimetre"))
                    {
                        i = (intInputValue/1000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("CubicMeter"))
                    {
                        i = (intInputValue/1000000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("Liter"))
                    {
                        i = (intInputValue/1000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("Milliliter"))
                    {
                        i = (intInputValue/1000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else
                    {
                        textView.setText(String.valueOf(intInputValue));
                    }
                }
                else if(inputType.equals("Liter"))
                {
                    if (convertType.equals("CubicKilometer"))
                    {
                        i = (intInputValue/1000000000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("CubicCentimetre"))
                    {
                        i = (intInputValue*1000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("CubicMillimeter"))
                    {
                        i = (intInputValue*1000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("CubicMeter"))
                    {
                        i = (intInputValue/1000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("Milliliter"))
                    {
                        i = (intInputValue*1000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else
                    {
                        textView.setText(String.valueOf(intInputValue));
                    }
                }
                else if(inputType.equals("Milliliter"))
                {
                    if (convertType.equals("CubicKilometer"))
                    {
                        i = (intInputValue/10000000000000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("CubicCentimetre"))
                    {
                        i = (intInputValue*1.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("CubicMillimeter"))
                    {
                        i = (intInputValue*1000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("CubicMeter"))
                    {
                        i = (intInputValue/1000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("Liter"))
                    {
                        i = (intInputValue/1000.0);
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