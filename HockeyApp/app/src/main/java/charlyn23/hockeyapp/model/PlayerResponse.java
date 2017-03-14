package charlyn23.hockeyapp.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by charlynbuchanan on 3/13/17.
 */

public class PlayerResponse {
    //Class handles response and touches API

    //Looks for list at "roster" and POJOs it
    @SerializedName("roster")
    List<Player> roster;

    public List<Player> getRoster() {
        return roster;
    }

    public void setRoster(List<Player> roster) {
        this.roster = roster;
    }

}
