package com.example.supriyagadkari_mapd711_ex1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    // declaring reference objects
    EditText fullNameEditText;
    EditText qualificationEditText;
    EditText professionEditText;
    EditText hobbyEditText;
    EditText dreamJobEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // initialising reference objects
        fullNameEditText = (EditText) findViewById(R.id.editTextFullName);
        qualificationEditText = (EditText) findViewById(R.id.editTextQualification);
        professionEditText = (EditText) findViewById(R.id.editTextProfession);
        hobbyEditText = (EditText) findViewById(R.id.editTextHobby);
        dreamJobEditText = (EditText) findViewById(R.id.editTextDreamJob);
    }

    // handle sendbutton click
    public void onClickSendButton(View v) {
        // initialising intent object
        Intent intent = new Intent(MainActivity.this,SecondActivity.class);
        // passing data through intent object
        intent.putExtra("fullName", fullNameEditText.getText().toString());
        intent.putExtra("qualification", qualificationEditText.getText().toString());
        intent.putExtra("profession", professionEditText.getText().toString());
        intent.putExtra("hobby", hobbyEditText.getText().toString());
        intent.putExtra("job", dreamJobEditText.getText().toString());
        // starting second activity
        startActivity(intent);
    }
}