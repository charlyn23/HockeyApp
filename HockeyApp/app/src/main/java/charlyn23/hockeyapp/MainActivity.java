package charlyn23.hockeyapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.List;

import charlyn23.hockeyapp.adapter.PlayerAdapter;
import charlyn23.hockeyapp.model.Player;
import charlyn23.hockeyapp.model.PlayerResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private static List<Player> playerList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.playerRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        APIInterface apiService = APIClient.getClient().create(APIInterface.class);
        Call<PlayerResponse> call = apiService.getRoster();
        call.enqueue(new Callback<PlayerResponse>() {
            @Override
            public void onResponse(Call<PlayerResponse> call, Response<PlayerResponse> response) {
                playerList = response.body().getRoster();
                recyclerView.setAdapter(new PlayerAdapter(playerList, R.layout.list_item_player, getApplicationContext()));
                //TODO: Why is adapter not attaching?
            }

            @Override
            public void onFailure(Call<PlayerResponse> call, Throwable t) {
                Log.e(TAG, t.toString());
            }
        });




    }


}
