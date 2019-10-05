package com.example.practicalexam2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View.OnKeyListener;
import android.view.View;
import android.view.KeyEvent;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("SUBJECT REQUEST");


    }
    public void saveD(View view) throws IOException {
        String events = "myeEvents.txt";
        FileOutputStream fosWriter;
        fosWriter = openFileOutput(events, Context.MODE_PRIVATE);
        if(((CheckBox)(findViewById(R.id.checkBox))).isChecked()){
            fosWriter.write((((CheckBox)findViewById(R.id.checkBox)).getText().toString() + "\n").getBytes());
        }
        if(((CheckBox)(findViewById(R.id.checkBox2))).isChecked()){
            fosWriter.write((((CheckBox)findViewById(R.id.checkBox2)).getText().toString() + "\n").getBytes());
        }
        if(((CheckBox)(findViewById(R.id.checkBox3))).isChecked()){
            fosWriter.write((((CheckBox)findViewById(R.id.checkBox)).getText().toString() + "\n").getBytes());
        }
        if(((CheckBox)(findViewById(R.id.checkBox4))).isChecked()){
            fosWriter.write((((CheckBox)findViewById(R.id.checkBox4)).getText().toString() + "\n").getBytes());
        }
        if(((CheckBox)(findViewById(R.id.checkBox5))).isChecked()){
            fosWriter.write((((CheckBox)findViewById(R.id.checkBox5)).getText().toString() + "\n").getBytes());
        }
        if(((CheckBox)(findViewById(R.id.checkBox6))).isChecked()){
            fosWriter.write((((CheckBox)findViewById(R.id.checkBox6)).getText().toString() + "\n").getBytes());
        }
        if(((CheckBox)(findViewById(R.id.checkBox7))).isChecked()){
            fosWriter.write((((CheckBox)findViewById(R.id.checkBox7)).getText().toString() + "\n").getBytes());
        }
        if(((CheckBox)(findViewById(R.id.checkBox8))).isChecked()){
            fosWriter.write((((CheckBox)findViewById(R.id.checkBox8)).getText().toString()).getBytes());
        }
        fosWriter.write(("_" + ((EditText)(findViewById(R.id.editText3))).getText().toString()).getBytes());
        Toast.makeText(this,"data saved...", Toast.LENGTH_LONG).show();
    }

    public void next(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
}


