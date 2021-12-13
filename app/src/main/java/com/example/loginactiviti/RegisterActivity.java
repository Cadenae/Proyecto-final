package com.example.loginactiviti;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.text.BreakIterator;

public class
RegisterActivity extends AppCompatActivity {
    EditText username, password, email, country,dob;
    RadioGroup gender ;
    Button register, cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register1);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        email = findViewById(R.id.email);
        country = findViewById(R.id.country);
        dob = findViewById(R.id.dob);
        gender = findViewById(R.id.gender);
        register = findViewById(R.id.register);
        cancel = findViewById(R.id.cancel);


        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usernameValue = username.getText().toString();
                String passwordValue = password.getText().toString();
                String emailValue = email.getText().toString();
                String countryValue = country.getText().toString();
                String dobValue = dob.getText().toString();
                String genderValue;
                BreakIterator checkedBtn = null;
                View viewById = findViewById(gender.getCheckedRadioButtonId();
                        String"genderValue = checkedBtn.getText().toString();"
                RadioButton checkedBtn;
            }
        });






    }
}