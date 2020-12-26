package me.altotunchitoo.customuilist.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

import me.altotunchitoo.customuilist.R;
import me.altotunchitoo.customuilist.models.SongModel;

public class ListViewAdapter extends ArrayAdapter<SongModel> {
    private final Context context;
    private final ArrayList<SongModel> songModels;
    private final int layoutResource;
    private static final String TAG = "ListViewAdapter";


    public ListViewAdapter(Context context, int layoutResource, ArrayList<SongModel> songModels) {
        super(context, layoutResource);
        this.context = context;
        this.layoutResource = layoutResource;
        this.songModels = songModels;
    }

    @Override
    public int getCount() {
        return songModels.size();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Log.d(TAG, "getView: position" + position);
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(layoutResource, null);
        ImageView songImage = view.findViewById(R.id.song_image);
        TextView songName = view.findViewById(R.id.song_name);
        TextView songArtist = view.findViewById(R.id.song_artist);
        TextView songDuration = view.findViewById(R.id.song_duration);
        final SongModel songModel = songModels.get(position);
        songImage.setImageResource(songModel.getSongImage());
        songName.setText(songModel.getSongName());
        songArtist.setText(songModel.getSongArtist());
        songDuration.setText(songModel.getSongDuration());
        return view;
    }

}


