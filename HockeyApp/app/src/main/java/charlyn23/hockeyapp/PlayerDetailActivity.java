package charlyn23.hockeyapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class PlayerDetailActivity extends AppCompatActivity {

    private String playerName;
    private String playerImageURL;
    private String playerPosition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView nameTextView = (TextView)findViewById(R.id.nameTextView);
        TextView positionTextView = (TextView)findViewById(R.id.positionTextView);
        ImageView playerImageView = (ImageView)findViewById(R.id.playerImageView);

        Intent intent = getIntent();
        intent.getFlags();
        Bundle playerDetails = intent.getExtras();
        if (playerDetails != null) {
            playerName = String.valueOf(playerDetails.get("name"));
            playerImageURL = String.valueOf(playerDetails.get("image_url"));
            playerPosition = String.valueOf(playerDetails.get("position"));

            nameTextView.setText(playerName);
            positionTextView.setText(playerPosition);
            Picasso.with(this).load(playerImageURL).into(playerImageView);
        }


    }

}
