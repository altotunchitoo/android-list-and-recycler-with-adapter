package me.altotunchitoo.customuilist.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;

import me.altotunchitoo.customuilist.R;
import me.altotunchitoo.customuilist.adapters.RecyclerViewAdapter;
import me.altotunchitoo.customuilist.models.SongModel;

public class RecyclerViewActivity extends AppCompatActivity implements RecyclerViewAdapter.ClickEvents {
    private final ArrayList<SongModel> songModelArrayList = new ArrayList<>();
    private static final String TAG = "RecyclerViewActivity";

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
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
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(RecyclerViewActivity.this, songModelArrayList);
        recyclerView.setAdapter(recyclerViewAdapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(RecyclerViewActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        Log.d(TAG, "setupUI: " + songModelArrayList.size());
    }

    @Override
    public void onClick(int position) {
        Log.d(TAG, "onClick method from Recycler View Activity: position = " + position);
        Toast.makeText(RecyclerViewActivity.this, songModelArrayList.get(position).getSongName(), Toast.LENGTH_SHORT).show();
    }
}