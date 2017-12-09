package com.example.niharika.application22;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView grid=(GridView)findViewById(R.id.gridview);
        GalleryAdapter adapter = new GalleryAdapter(MainActivity.this);
        grid.setAdapter(adapter);
    }
}
