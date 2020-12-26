package me.altotunchitoo.customuilist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import me.altotunchitoo.customuilist.activities.ListViewActivity;
import me.altotunchitoo.customuilist.activities.RecyclerViewActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View v) {
        Intent intent = (v.getId() == R.id.btn_list) ?
                new Intent(MainActivity.this, ListViewActivity.class) :
                new Intent(MainActivity.this, RecyclerViewActivity.class);
        startActivity(intent);
    }
}