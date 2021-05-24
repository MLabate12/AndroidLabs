package com.example.androidlabs;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_relative);

        Button btn = findViewById(R.id.button);
        btn.setOnClickListener( (click) -> Toast.makeText(MainActivity.this, btn.getResources().getString(R.string.toast_message), Toast.LENGTH_LONG).show());

        EditText theEdit = findViewById(R.id.theEdit2);
        CheckBox cb = findViewById(R.id.checkb);
        cb.setOnCheckedChangeListener( (compoundButton, b) -> {
            String message = "";

            if (b){
                message = cb.getResources().getString(R.string.check_true);
            } else { message = cb.getResources().getString(R.string.check_false);}

            Snackbar.make(theEdit, message, Snackbar.LENGTH_LONG)
                    .setAction(cb.getResources().getString(R.string.undo), click-> compoundButton.setChecked( !b ))
                    .show(); });

        Switch sw = findViewById(R.id.swtch);
        sw.setOnCheckedChangeListener( (compoundButton, b) -> {
            String message = "";

            if (b){
                message = sw.getResources().getString(R.string.sw_true);
            } else { message = sw.getResources().getString(R.string.sw_false);}

            Snackbar.make(theEdit, message, Snackbar.LENGTH_LONG)
                    .setAction(sw.getResources().getString(R.string.undo), click-> compoundButton.setChecked( !b ))
                    .show(); });
    }
}