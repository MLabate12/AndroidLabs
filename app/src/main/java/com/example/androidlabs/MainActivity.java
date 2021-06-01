package com.example.androidlabs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.content.SharedPreferences;
import android.content.Intent;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    SharedPreferences prefs = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        prefs = getSharedPreferences("Email", Context.MODE_PRIVATE);
        String savedString = prefs.getString("Email", "");
        EditText typeField = findViewById(R.id.theEdit2);
        typeField.setText(savedString);

        Button saveButton = findViewById(R.id.button);
        saveButton.setOnClickListener( bt -> saveSharedPrefs( typeField.getText().toString()) );
        saveButton.setOnClickListener( (click) -> setContentView(R.layout.activity_profile2) );
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    private void saveSharedPrefs(String stringToSave)
    {
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString("email", stringToSave);
        editor.commit();
    }

}