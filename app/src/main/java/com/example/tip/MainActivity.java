package com.example.tip;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText totalBox;
    private EditText percentBox;
    private RadioButton splitButton;
    private EditText tipDisplay;
    private EditText totalDisplay;
    private EditText splitDisplay;
    private EditText splitBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        totalBox = findViewById(R.id.totalBox);
        percentBox = findViewById(R.id.percentBox);
        splitButton = findViewById(R.id.splitButton);
        tipDisplay = findViewById(R.id.tipDisplay);
        totalDisplay = findViewById(R.id.totalDisplay);
        splitDisplay = findViewById(R.id.splitDisplay);
        splitBox = findViewById(R.id.splitBox);
    }

    public void convert(View v) {
        if (splitButton.isChecked()) {
            String total = totalBox.getText().toString();
            double totalValue = Double.parseDouble(total);
            String percent = percentBox.getText().toString();
            double percentValue = Double.parseDouble(percent);
            double tipAMT = (totalValue * (percentValue / 100));
            tipDisplay.setText(String.format("%.1f", tipAMT));

            double totalAMT = (totalValue + tipAMT);
            totalDisplay.setText(String.format("%.1f", totalAMT));

            String split = splitBox.getText().toString();
            double splitValue = Double.parseDouble(split);
            double splitAMT = (totalAMT / splitValue);
            splitDisplay.setText(String.format("%.1f", splitAMT));
        } else {
            String total = totalBox.getText().toString();
            double totalValue = Double.parseDouble(total);
            String percent = percentBox.getText().toString();
            double percentValue = Double.parseDouble(percent);
            double tipAMT = (totalValue * (percentValue / 100));
            tipDisplay.setText(String.format("%.1f", tipAMT));

            double totalAMT = (totalValue + tipAMT);
            totalDisplay.setText(String.format("%.1f", totalAMT));

            splitDisplay.setText("");

        }

    }

}
