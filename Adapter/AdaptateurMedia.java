
import java.util.*;

public class AdaptateurMedia implements LecteurMedia {


    public String type;
    public LecteurMediaAvance lecteurMediaAvance = null;
    
    public AdaptateurMedia(String type) {
    	this.type = type;
    	if(type.equals("mp4")) lecteurMediaAvance = new LecteurMP4();
    	if(type.equals("avi")) lecteurMediaAvance = new LecteurAVI();
    }
    
    
    public void Lire(String type, String nomFichier) {
    	if (type.equals("mp4") || type.equals("avi") ) lecteurMediaAvance.Lire(nomFichier);
    	else {
    		System.err.println("Format non supporté par l'adaptateur!");
    	}
    }

}