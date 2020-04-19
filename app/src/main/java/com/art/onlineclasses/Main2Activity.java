package com.art.onlineclasses;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.art.onlineclasses.StudentSection.StudentActivity1;
import com.art.onlineclasses.TeacherSection.TeacherActivity1;
import com.art.onlineclasses.UI.NavDrawActivity;
import com.art.onlineclasses.UI.ui.menu1.Menu1;
import com.art.onlineclasses.UI.ui.menu2.Menu2;
import com.art.onlineclasses.UI.ui.menu3.Menu3;
import com.google.android.material.navigation.NavigationView;

import java.util.zip.Inflater;

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