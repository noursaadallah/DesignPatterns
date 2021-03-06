
import java.util.*;

/**
 * 
 */
public class LecteurMP3 implements LecteurMedia {


	public AdaptateurMedia adaptateurMedia;
	
    public LecteurMP3() {
    }

    public void Lire(String type, String nomFichier) {
    	if(type.equals("mp3")) Lire(nomFichier);
    	else if(type.equals("mp4") || type.equals("avi")) {
    		adaptateurMedia = new AdaptateurMedia(type);
    		adaptateurMedia.Lire(type, nomFichier);
    	}
    	else {
    		System.err.println("Format non supporté !");
    	}
    }
    
    
    private void Lire(String nomFichier) {
    	System.out.println("Lecture du fichier : " + nomFichier + " par le lecteur MP3");
    }

}