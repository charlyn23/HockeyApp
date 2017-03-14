package charlyn23.hockeyapp;

import charlyn23.hockeyapp.model.PlayerResponse;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by charlynbuchanan on 3/13/17.
 */

public interface APIInterface {

    //To GET data, look at url, return a response object (here, a collection of Players)
    @GET("android_eval.json")
    Call<PlayerResponse> getRoster();

}
