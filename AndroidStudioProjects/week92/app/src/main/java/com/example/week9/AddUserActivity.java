package com.example.week9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.EditText;
import android.widget.RadioButton;



public class AddUserActivity extends AppCompatActivity{
    private EditText inputFirstName;
    private EditText inputLastName;
    private EditText inputEmail;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);
        inputFirstName = findViewById(R.id.editFirstName);
        inputLastName = findViewById(R.id.editLastName);
        inputEmail = findViewById(R.id.editEmail);
    }

    public void addUser(View view){
        String firstName = inputFirstName.getText().toString();
        String lastName = inputLastName.getText().toString();
        String email = inputEmail.getText().toString();
        RadioGroup degrees = findViewById(R.id.radioDegreeProgram);

        int checkedId = degrees.getCheckedRadioButtonId();

        RadioButton selectedRadioButton = findViewById(checkedId);

        if (checkedId == R.id.seRadioButton) {
            UserStorage.getInstance().addUser(new User(firstName, lastName, email, selectedRadioButton.getText().toString()));
        } else if (checkedId == R.id.imRadioButton) {
            UserStorage.getInstance().addUser(new User(firstName, lastName, email, selectedRadioButton.getText().toString()));
        } else if (checkedId == R.id.ceRadioButton) {
            UserStorage.getInstance().addUser(new User(firstName, lastName, email, selectedRadioButton.getText().toString()));
        } else if (checkedId == R.id.eeRadioButton) {
            UserStorage.getInstance().addUser(new User(firstName, lastName, email, selectedRadioButton.getText().toString()));
        }
    }
}

