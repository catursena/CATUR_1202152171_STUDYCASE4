package com.example.android.catursena_1202152171_studycase4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void lstnama(View view) {
        Intent intent = new Intent(MainActivity.this, ListNamaMahasiswa.class);
        startActivity(intent);
    }

    public void pencarigbr(View view) {
        Intent intent = new Intent(MainActivity.this, PencariGambar.class);
        startActivity(intent);
    }
}
