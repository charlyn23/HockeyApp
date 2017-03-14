package charlyn23.hockeyapp;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by charlynbuchanan on 3/13/17.
 * To send network requests to an API, we need to use the Retrofit Builder class and specify the
 * base URL for the service. So, create a class named ApiClient.java under rest package.
 * Here BASE_URL – it is basic URL of our API. We will use this URL for all requests later.
 */

public class APIClient {
    public static final String BASE_URL = "https://jc-xerxes.gpshopper.com";

    //Create Retrofit instance with a base url and gson converter.
    private static Retrofit retrofit = null;
    public static Retrofit getClient() {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
