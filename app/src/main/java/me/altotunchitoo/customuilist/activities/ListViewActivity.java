package me.altotunchitoo.customuilist.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import me.altotunchitoo.customuilist.R;
import me.altotunchitoo.customuilist.adapters.ListViewAdapter;
import me.altotunchitoo.customuilist.models.SongModel;

public class ListViewActivity extends AppCompatActivity {
    private final ArrayList<SongModel> songModelArrayList = new ArrayList<>();
    private static final String TAG = "ListViewActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        insertData();
        setupUI();
    }

    private void insertData() {
        songModelArrayList.add(
                new SongModel("Happy X'mas (War is over)", "Celine Dion", R.drawable.a, "4:27"));
        songModelArrayList.add(
                new SongModel("Heal the World", "Michael Jackson", R.drawable.b, "4:34"));
        songModelArrayList.add(
                new SongModel("I Do", "911", R.drawable.c, "3:28"));
        songModelArrayList.add(
                new SongModel("Love Story", "Taylor Swift", R.drawable.d, "3:55"));
        songModelArrayList.add(
                new SongModel("Remember the name", "Fort Minor", R.drawable.e, "3:50"));
        songModelArrayList.add(
                new SongModel("Starry Starry Night", "Vincent", R.drawable.f, "1:58"));
        songModelArrayList.add(
                new SongModel("A thousand year", "Christina Perri", R.drawable.g, "4:45"));
        songModelArrayList.add(
                new SongModel("Trouble is a friend", "Lenka", R.drawable.h, "3:35"));
        songModelArrayList.add(
                new SongModel("Black or White", "Michael Jackson", R.drawable.i, "3:23"));
        songModelArrayList.add(
                new SongModel("Despacito", "Luis Fonsi", R.drawable.j, "4:41"));
    }

    private void setupUI() {
        ListView listView = findViewById(R.id.list_view);
        ListViewAdapter listViewAdapter = new ListViewAdapter(ListViewActivity.this, R.layout.view_list_item, songModelArrayList);
        listView.setAdapter(listViewAdapter);
        Log.d(TAG, "setupUI: " + songModelArrayList.size());
    }
    
}