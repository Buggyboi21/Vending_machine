package com.example.vending_machine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BalanceActivity extends AppCompatActivity {

    private TextView textViewBalance;
    private Button buttonAddBalance;
    private Button buttonRemoveBalance;

    private int balance = 0; // Initial balance

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balance);

        // Initialize views
        textViewBalance = findViewById(R.id.textViewBalance);
        buttonAddBalance = findViewById(R.id.buttonAddBalance);
        buttonRemoveBalance = findViewById(R.id.buttonRemoveBalance);

        // Display initial balance
        updateBalance();

        // Set click listener for Add Balance button
        buttonAddBalance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Add 1 to balance
                balance++;
                updateBalance();
            }
        });

        // Set click listener for Remove Balance button
        buttonRemoveBalance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Subtract 1 from balance if it's greater than 0
                if (balance > 0) {
                    balance--;
                    updateBalance();
                }
            }
        });
    }

    // Update the balance text view with current balance
    private void updateBalance() {
        textViewBalance.setText("Balance: $" + balance);
    }
}
