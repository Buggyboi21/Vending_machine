package com.example.vending_machine;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class loginActivity extends AppCompatActivity {

    private EditText usernameEditText;
    private EditText passwordEditText;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Initialize UI components
        usernameEditText = findViewById(R.id.usernameEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        loginButton = findViewById(R.id.loginButton);

        // Set click listener for login button
        loginButton.setOnClickListener(view -> {
            String username = usernameEditText.getText().toString();
            String password = passwordEditText.getText().toString();

            // Perform login validation here
            // You can compare the entered username and password with the stored credentials
            // in your vending machine app and take appropriate action
            if (isValidUser(username, password)) {
                Toast.makeText(this, "Login successful!", Toast.LENGTH_SHORT).show();
                // Perform action after successful login, e.g., open main product page
                openMainProductPage();
            } else {
                Toast.makeText(this, "Invalid username or password.", Toast.LENGTH_SHORT).show();
            }
        });
    }

    // Example validation method, replace with your own validation logic
    private boolean isValidUser(String username, String password) {
        // Perform login validation here, e.g., check against stored credentials
        // in your vending machine app
        // Return true if the username and password are valid, otherwise false
        // Replace this method with your actual validation logic
        String storedUsername = "user";
        String storedPassword = "password";
        return username.equals(storedUsername) && password.equals(storedPassword);
    }

    // Example method to open main product page
    private void openMainProductPage() {
        // Implement your logic to open the main product page here
        // You can start a new activity or fragment to display the main product page
        // For example:
        // Intent intent = new Intent(this, MainProductActivity.class);
        // startActivity(intent);
        // finish();
        // Replace this method with your actual logic
        Toast.makeText(this, "Opening main product page...", Toast.LENGTH_SHORT).show();
    }
}
