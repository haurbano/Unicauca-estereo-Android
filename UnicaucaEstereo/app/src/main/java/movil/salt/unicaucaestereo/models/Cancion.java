package movil.salt.unicaucaestereo.models;

/**
 * Created by pc on 25/05/2015.
 */
public class Cancion {
    public String id;
    public String title;
    public String artist;
    public String uri;

    public Cancion(){}

    public Cancion(String id, String title, String artist, String uri) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.uri = uri;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
}
