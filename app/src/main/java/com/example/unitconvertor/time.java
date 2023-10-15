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

public class time extends AppCompatActivity {

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
        setContentView(R.layout.activity_time);

        Intent intentBack = new Intent(this, home.class);
        imageButton = findViewById(R.id.imageButtonBAckTime);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentBack);
            }
        });

        //set array spinner
        String[] timeType1 = {"Second","Millisecond","Microsecond","Nanosecond","PicoSecond","Minute","Hour"};

        String[] timeType2 ={"Second","Millisecond","Microsecond","Nanosecond","PicoSecond","Minute","Hour"};

        ArrayAdapter<String> adapterTime1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, timeType1);
        adapterTime1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        ArrayAdapter<String> adapterTime2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, timeType2);
        adapterTime2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Spinner spinnerTime = findViewById(R.id.spinnerTime);
        Spinner spinnerTime2 = findViewById(R.id.spinnerTime2);

        spinnerTime.setAdapter(adapterTime1);
        spinnerTime2.setAdapter(adapterTime2);

        //assign editTexts,Textview and button
        editText = findViewById(R.id.editTextTextInputTime);
        textView = findViewById(R.id.textViewTimeOutput);
        button = findViewById(R.id.buttonTimeConvert);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //assign input value
                stringInputValue = editText.getText().toString();
                if(stringInputValue.isEmpty()) {
                    Toast.makeText(time.this, "Please Enter Value", Toast.LENGTH_SHORT).show();
                    return;
                }
                //convert into integer
                intInputValue = Integer.parseInt(stringInputValue);

                //assign spinner values
                inputType = spinnerTime.getSelectedItem().toString();
                convertType = spinnerTime2.getSelectedItem().toString();

                if(inputType.equals("Second"))
                {
                    if(convertType.equals("Millisecond"))
                    {
                        i = (intInputValue*1000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("Microsecond"))
                    {
                        i = (intInputValue*1000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("Nanosecond"))
                    {
                        i = (intInputValue*1000000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("PicoSecond"))
                    {
                        i = (intInputValue*1000000000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("Minute"))
                    {
                        i = (intInputValue/60.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("Hour"))
                    {
                        i = (intInputValue/3600.0);
                        textView.setText(String.valueOf(i));
                    }
                    else
                    {
                        textView.setText(String.valueOf(intInputValue));
                    }
                }
                else if(inputType.equals("Millisecond"))
                {
                    if(convertType.equals("Second"))
                    {
                        i = (intInputValue/1000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("Microsecond"))
                    {
                        i = (intInputValue*1000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("Nanosecond"))
                    {
                        i = (intInputValue/1000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("PicoSecond"))
                    {
                        i = (intInputValue/1000000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("Minute"))
                    {
                        i = (intInputValue/60000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("Hour"))
                    {
                        i = (intInputValue/3600000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else
                    {
                        textView.setText(String.valueOf(intInputValue));
                    }
                }
                else if(inputType.equals("Microsecond"))
                {
                    if(convertType.equals("Millisecond"))
                    {
                        i = (intInputValue/1000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("Second"))
                    {
                        i = (intInputValue/1000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("Nanosecond"))
                    {
                        i = (intInputValue*1000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("PicoSecond"))
                    {
                        i = (intInputValue*1000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("Minute"))
                    {
                        i = (intInputValue/60000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("Hour"))
                    {
                        i = (intInputValue/3600000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else
                    {
                        textView.setText(String.valueOf(intInputValue));
                    }
                }
                else if(inputType.equals("Nanosecond"))
                {
                    if(convertType.equals("Millisecond"))
                    {
                        i = (intInputValue/1000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("Microsecond"))
                    {
                        i = (intInputValue/1000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("Second"))
                    {
                        i = (intInputValue/1000000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("PicoSecond"))
                    {
                        i = (intInputValue*1000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("Minute"))
                    {
                        i = (intInputValue/60000000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("Hour"))
                    {
                        i = (intInputValue/3600000000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else
                    {
                        textView.setText(String.valueOf(intInputValue));
                    }
                }
                else if(inputType.equals("PicoSecond"))
                {
                    if(convertType.equals("Millisecond"))
                    {
                        i = (intInputValue/1000000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("Microsecond"))
                    {
                        i = (intInputValue/1000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("Nanosecond"))
                    {
                        i = (intInputValue/1000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("Second"))
                    {
                        i = (intInputValue/1000000000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("Minute"))
                    {
                        i = (intInputValue/60000000000000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("Hour"))
                    {
                        i = (intInputValue/3600000000000000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else
                    {
                        textView.setText(String.valueOf(intInputValue));
                    }
                }
                else if(inputType.equals("Minute"))
                {
                    if(convertType.equals("Millisecond"))
                    {
                        i = (intInputValue*60000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("Microsecond"))
                    {
                        i = (intInputValue*60000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("Nanosecond"))
                    {
                        i = (intInputValue*60000000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("PicoSecond"))
                    {
                        i = (intInputValue*60000000000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("Second"))
                    {
                        i = (intInputValue*60.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("Hour"))
                    {
                        i = (intInputValue/60.0);
                        textView.setText(String.valueOf(i));
                    }
                    else
                    {
                        textView.setText(String.valueOf(intInputValue));
                    }
                }
                else if(inputType.equals("Hour"))
                {
                    if(convertType.equals("Millisecond"))
                    {
                        i = (intInputValue*3600000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("Microsecond"))
                    {
                        i = (intInputValue*3600000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("Nanosecond"))
                    {
                        i = (intInputValue*3600000000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("PicoSecond"))
                    {
                        i = (intInputValue*3600000000000000.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("Minute"))
                    {
                        i = (intInputValue*60.0);
                        textView.setText(String.valueOf(i));
                    }
                    else if(convertType.equals("Second"))
                    {
                        i = (intInputValue*3600.0);
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