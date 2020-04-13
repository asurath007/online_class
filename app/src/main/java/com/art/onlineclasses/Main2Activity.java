package com.art.onlineclasses;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.art.onlineclasses.StudentSection.StudentActivity1;
import com.art.onlineclasses.TeacherSection.TeacherActivity1;

public class Main2Activity extends AppCompatActivity {

    Button btn_join;
    Button btn_create;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn_create = findViewById(R.id.btn_create);
        btn_join = findViewById(R.id.btn_join);

        btn_join.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Start student section
                startActivity(new Intent(Main2Activity.this, StudentActivity1.class));
            }
        });

        btn_create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //start teacher section
                startActivity(new Intent(Main2Activity.this, TeacherActivity1.class));
            }
        });

    }
}
