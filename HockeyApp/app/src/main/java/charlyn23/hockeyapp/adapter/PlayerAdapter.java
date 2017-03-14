package charlyn23.hockeyapp.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import charlyn23.hockeyapp.R;
import charlyn23.hockeyapp.model.Player;

/**
 * Created by charlynbuchanan on 3/13/17.
 */

public class PlayerAdapter extends RecyclerView.Adapter<PlayerAdapter.PlayerViewHolder> {

    private List<Player> players;
    private int rowLayout;
    private Context context;

    @Override
    public PlayerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new PlayerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PlayerViewHolder holder, int position) {


        holder.nameTextView.setText(players.get(position).getName());
        holder.positionTextView.setText(players.get(position).getPosition());
        //TODO: incorporate Picasso for image
        Picasso.with(context).setLoggingEnabled(true);
        Picasso.with(context).load(players.get(position).getImage_url()).into(holder.playerImageView);

    }

    @Override
    public int getItemCount() {
        return players.size();
    }


    public static class PlayerViewHolder extends RecyclerView.ViewHolder {
        LinearLayout playerLayout;
        TextView nameTextView;
        TextView positionTextView;
        ImageView playerImageView;


        public PlayerViewHolder(View v) {
            super(v);
            playerLayout = (LinearLayout)v.findViewById(R.id.playerLayout);
            nameTextView = (TextView)v.findViewById(R.id.name);
            positionTextView = (TextView)v.findViewById(R.id.postion);
            playerImageView = (ImageView)v.findViewById(R.id.playerImageView);
        }
    }

    public PlayerAdapter(List<Player> players, int rowLayout, Context context) {
        this.players = players;
        this.rowLayout = rowLayout;
        this.context = context;
    }
}
