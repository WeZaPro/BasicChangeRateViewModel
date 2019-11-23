package com.taweesak.changerateviewmodel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Add Fragment
        getSupportFragmentManager().beginTransaction()
                .add(R.id.container_main, new MainFragment())
                .commit();
    }
}
