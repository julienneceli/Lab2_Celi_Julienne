package com.example.lab2_celi_julienne;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText eCourse1, eCourse2, eCourse3, eCourse4, eCourse5, eCourse6, eCourse7, eCourse8
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eCourse1 = findViewById(R.id.edCourse1);
        eCourse2 = findViewById(R.id.edCourse2);
        eCourse3 = findViewById(R.id.edCourse3);
        eCourse4 = findViewById(R.id.edCourse4);
        eCourse5 = findViewById(R.id.edCourse5);
        eCourse1 = findViewById(R.id.edCourse6);
        eCourse7 = findViewById(R.id.edCourse7);
        eCourse8 = findViewById(R.id.edCourse8);

    }

    public void saveData (View v) {
        SharedPreferences sp = getSharedPreferences("myData", MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        String crs1 = eCourse1.getText().toString();
        String crs2 = eCourse2.getText().toString();
        String crs3 = eCourse3.getText().toString();
        String crs4 = eCourse4.getText().toString();
        String crs5 = eCourse5.getText().toString();
        String crs6 = eCourse6.getText().toString();
        String crs7 = eCourse7.getText().toString();
        String crs8 = eCourse8.getText().toString();

        editor.putString("course1", crs1);
        editor.putString("course2", crs2);
        editor.putString("course3", crs3);
        editor.putString("course4", crs4);
        editor.putString("course5", crs5);
        editor.putString("course6", crs6);
        editor.putString("course7", crs7);
        editor.putString("course8", crs8);

        editor.commit();
        editor.apply();
        Toast.makeText(this, "data was saved...", Toast.LENGTH_LONG).show();
    }



    public void next (View v) {
        Intent i = new Intent(this, SecondActivity.class)
    }


}
