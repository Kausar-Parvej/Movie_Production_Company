package my_util;


import java.io.Serializable;
import java.util.HashMap;

public class SendResources implements Serializable {
    private final HashMap<String, String> imageLinkMap;
    private final HashMap<String, String> trailerLinkMap;

    public SendResources(HashMap<String, String> map,HashMap<String, String> trailerMap){
        this.imageLinkMap = map;
        this.trailerLinkMap = trailerMap;
    }

    public HashMap<String, String> getImageLinkMap() {
        return imageLinkMap;
    }

    public HashMap<String, String> getTrailerLinkMap() {
        return trailerLinkMap;
    }
}
