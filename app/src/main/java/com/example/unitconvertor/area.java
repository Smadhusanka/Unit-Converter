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

public class area extends AppCompatActivity {

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
        setContentView(R.layout.activity_area);

        Intent intentBack = new Intent(this, home.class);
        imageButton = findViewById(R.id.imageButtonBAckArea);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentBack);
            }
        });

        //set array spinner
        String[] areaType1 = {"SquareMeter","SquareKilometer","SquareCentimeter","SquareMillimeter","SquareMicrometer"};

        String[] areaType2 = {"SquareMeter","SquareKilometer","SquareCentimeter","SquareMillimeter","SquareMicrometer"};

        ArrayAdapter<String> adapterArea1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, areaType1);
        adapterArea1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapterArea2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, areaType2);
        adapterArea2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Spinner spinnerArea = findViewById(R.id.spinnerArea);
        Spinner spinnerArea2 = findViewById(R.id.spinnerArea2);

        spinnerArea.setAdapter(adapterArea1);
        spinnerArea2.setAdapter(adapterArea2);


        //assign editTexts,Textview and button
        editText = findViewById(R.id.editTextTextInputArea);
        textView = findViewById(R.id.textViewAreaOutput);
        button = findViewById(R.id.buttonAreaConvert);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //assign input value
                stringInputValue = editText.getText().toString();
                intInputValue = Integer.parseInt(stringInputValue);

                //assign spinner values
                inputType = spinnerArea.getSelectedItem().toString();
                convertType = spinnerArea2.getSelectedItem().toString();

                if(inputType.equals("SquareMeter"))
                {
                    if(convertType.equals("SquareKilometer"))
                    {
                        i = (intInputValue/1000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("SquareCentimeter"))
                    {
                        i = (intInputValue*10000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("SquareMillimeter"))
                    {
                        i = (intInputValue*1000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("SquareMicrometer"))
                    {
                        i = (intInputValue*1000000000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else
                    {
                        textView.setText(String.valueOf(intInputValue));
                    }
                }
                else if(inputType.equals("SquareKilometer"))
                {
                    if(convertType.equals("SquareMeter"))
                    {
                        i = (intInputValue*1000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("SquareCentimeter"))
                    {
                        i = (intInputValue*10000000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("SquareMillimeter"))
                    {
                        i = (intInputValue*1000000000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("SquareMicrometer"))
                    {
                        i = (intInputValue*1000000000000000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else
                    {
                        textView.setText(String.valueOf(intInputValue));
                    }
                }
                else if(inputType.equals("SquareCentimeter"))
                {
                    if(convertType.equals("SquareMeter"))
                    {
                        i = (intInputValue/10000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("SquareKilometer"))
                    {
                        i = (intInputValue/10000000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("SquareMillimeter"))
                    {
                        i = (intInputValue*100.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("SquareMicrometer"))
                    {
                        i = (intInputValue*100000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else
                    {
                        textView.setText(String.valueOf(intInputValue));
                    }
                }
                else if(inputType.equals("SquareMillimeter"))
                {
                    if(convertType.equals("SquareMeter"))
                    {
                        i = (intInputValue/1000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("SquareCentimeter"))
                    {
                        i = (intInputValue/100.0);
                        textView.setText(String.valueOf(i));

                    }
                    else if(convertType.equals("SquareKilometer"))
                    {
                        i = (intInputValue/1000000000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("SquareMicrometer"))
                    {
                        i = (intInputValue*1000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else
                    {
                        textView.setText(String.valueOf(intInputValue));
                    }
                }
                else if(inputType.equals("SquareMicrometer"))
                {
                    if(convertType.equals("SquareMeter"))
                    {
                        i = (intInputValue/1000000000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("SquareCentimeter"))
                    {
                        i = (intInputValue/10000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("SquareMillimeter"))
                    {
                        i = (intInputValue/1000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("SquareKilometer"))
                    {
                        i = (intInputValue/1000000000000000000.0);
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