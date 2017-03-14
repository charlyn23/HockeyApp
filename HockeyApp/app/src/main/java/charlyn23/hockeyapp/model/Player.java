package charlyn23.hockeyapp.model;

/**
 * Created by charlynbuchanan on 3/10/17.
 */

public class Player {

    String name;
    String image_url;
    String position;

    public Player () {
    }

    public Player (String name,  String imageURL, String position) {
        this.name = name;
        this.image_url = imageURL;
        this.position = position;

    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
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
