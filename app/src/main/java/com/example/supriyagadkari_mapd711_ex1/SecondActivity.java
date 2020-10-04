package com.example.supriyagadkari_mapd711_ex1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    // declaring reference objects
    TextView txtFullName;
    TextView txtQualification;
    TextView txtProfession;
    TextView txtHobby;
    TextView txtDreamJob;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        // initialising reference objects
        txtFullName = (TextView) findViewById(R.id.textViewFullNameValue);
        txtQualification = (TextView) findViewById(R.id.textViewQuallificationValue);
        txtProfession = (TextView) findViewById(R.id.textViewProfessionValue);
        txtHobby = (TextView) findViewById(R.id.textViewHobbyValue);
        txtDreamJob = (TextView) findViewById(R.id.textViewDreamJobValue);
        // initialising intent object
        Intent intent = getIntent();
        // extracting data from intent and assigning to text views
        txtFullName.setText(intent.getStringExtra("fullName"));
        txtQualification.setText(intent.getStringExtra("qualification"));
        txtProfession.setText(intent.getStringExtra("profession"));
        txtHobby.setText(intent.getStringExtra("hobby"));
        txtDreamJob.setText(intent.getStringExtra("job"));
    }
}