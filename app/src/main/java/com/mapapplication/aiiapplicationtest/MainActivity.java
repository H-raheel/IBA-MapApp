package com.mapapplication.aiiapplicationtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    private Spinner startSpinner;
    private Spinner endSpinner;

    @Override
    //This code sets up a UI with two dropdown spinners (startSpinner and endSpinner) and a submit button
    //when Submit button is clicked, it creates a new intent to start the StartActivity and passes the selected values from the
    //startSpinner and endSpinner as string extras with the keys "startValue" and "endValue", respectively.
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_end_dropdowns);
        startSpinner = findViewById(R.id.start_spinner);
        endSpinner = findViewById(R.id.end_spinner);
        Button submitButton = findViewById(R.id.submit_button);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), StartActivity.class);
                intent.putExtra("startValue", startSpinner.getSelectedItem().toString());
                intent.putExtra("endValue", endSpinner.getSelectedItem().toString());
                startActivity(intent);


            }
        });


    }

}