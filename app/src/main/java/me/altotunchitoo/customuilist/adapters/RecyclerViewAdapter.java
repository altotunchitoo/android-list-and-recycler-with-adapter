package me.altotunchitoo.customuilist.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import me.altotunchitoo.customuilist.R;
import me.altotunchitoo.customuilist.models.SongModel;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private final ArrayList<SongModel> songModelArrayList;
    private final Context context;
    private static final String TAG = "RecyclerViewAdapter";
    private final ClickEvents clickEvents;

    public RecyclerViewAdapter(Context context, ArrayList<SongModel> songModels) {
        this.context = context;
        this.songModelArrayList = songModels;
        this.clickEvents = (ClickEvents) context;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =
                LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.view_list_item, parent, false);
        return new ViewHolder(view, clickEvents);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        SongModel songModel = songModelArrayList.get(position);
        holder.songImage.setImageResource(songModel.getSongImage());
        holder.songName.setText(songModel.getSongName());
        holder.songArtist.setText(songModel.getSongArtist());
        holder.songDuration.setText(songModel.getSongDuration());
        Log.d(TAG, "onBindViewHolder: " + position);
    }

    @Override
    public int getItemCount() {
        return songModelArrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView songImage;
        TextView songName, songArtist, songDuration;
        ClickEvents clickEvents;
        LinearLayout ll;

        ViewHolder(View view, ClickEvents clickEvents) {
            super(view);
            songImage = view.findViewById(R.id.song_image);
            songName = view.findViewById(R.id.song_name);
            songArtist = view.findViewById(R.id.song_artist);
            songDuration = view.findViewById(R.id.song_duration);
            ll = view.findViewById(R.id.ll);
            this.clickEvents = clickEvents;
            ll.setOnClickListener((v) -> {
                clickEvents.onClick(getAdapterPosition());
            });
        }
    }

    public interface ClickEvents {
        void onClick(int position);
    }

}
