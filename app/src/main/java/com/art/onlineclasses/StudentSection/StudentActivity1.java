package com.art.onlineclasses.StudentSection;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import com.art.onlineclasses.R;
import com.art.onlineclasses.UI.NavDrawActivity;

public class StudentActivity1 extends NavDrawActivity  {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        btn = findViewById(R.id.buttons1);

        LayoutInflater inflater = (LayoutInflater) this
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(R.layout.activity_nav_draw, null, false);
        drawer.addView(contentView, 0);
    }
}
