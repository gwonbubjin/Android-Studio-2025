package com.example.tipcalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText amountInput;
    private RadioGroup tipOptions;
    private Button calculateButton;
    private TextView tipAmount;
    private TextView totalAmount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        amountInput = findViewById(R.id.amountInput);
        tipOptions = findViewById(R.id.tipOptions);
        calculateButton = findViewById(R.id.calculateButton);
        tipAmount = findViewById(R.id.tipAmount);
        totalAmount = findViewById(R.id.totalAmount);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateTip();
            }
        });
    }

    private void calculateTip() {
        String amountText = amountInput.getText().toString();
        if (amountText.isEmpty()) {
            amountInput.setError("금액을 입력하세요");
            return;
        }

        double amount = Double.parseDouble(amountText);
        double tipPercentage = 0.10; // 기본값

        int selectedTipId = tipOptions.getCheckedRadioButtonId();
        if (selectedTipId == R.id.tip10) {
            tipPercentage = 0.10;
        } else if (selectedTipId == R.id.tip15) {
            tipPercentage = 0.15;
        } else if (selectedTipId == R.id.tip20) {
            tipPercentage = 0.20;
        }

        double tip = amount * tipPercentage;
        double total = amount + tip;

        tipAmount.setText(String.format("팁 금액: $%.2f", tip));
        totalAmount.setText(String.format("총 금액: $%.2f", total));
    }
}
