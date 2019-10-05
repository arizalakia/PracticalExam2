package com.example.practicalexam2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main2Activity extends AppCompatActivity {

    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("SUMMARY");
        setContentView(R.layout.activity_main2);
        FileInputStream eventC;
        try {
            eventC = openFileInput("myeEvents.txt");
            int token;
            String temp = "";
            while ((token = eventC.read()) != -1){
                temp = temp + ((char)token);
            }
            try {
                String[] list = temp.split("_");
                try {
                    ((TextView) (findViewById(R.id.tv1))).setText(list[0]);
                    ((TextView) (findViewById(R.id.textView5))).setText(list[1]);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                eventC.close();
            } catch (FileNotFoundException e) {
                Log.d("error", "File Not Found Exception :(");
            } catch (IOException e) {
                Log.d("error", "IO Exception :(");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showD(View view) {
        Toast.makeText(this, "Request Sent...", Toast.LENGTH_SHORT).show();
        setTitle("SUMMARY");
    }

    public void next(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}