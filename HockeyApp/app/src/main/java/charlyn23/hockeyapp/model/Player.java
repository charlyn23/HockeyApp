package charlyn23.hockeyapp.model;

/**
 * Created by charlynbuchanan on 3/10/17.
 */

public class Player {

    String name;
    String imageURL;
    String position;

    public Player () {
    }

    public Player (String name,  String imageURL, String position) {
        this.name = name;
        this.imageURL = imageURL;
        this.position = position;

    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


}
