
import java.util.*;

/**
 * 
 */
public class FormeFactory {

    /**
     * Default constructor
     */
    public FormeFactory() {
    }

    /**
     * @param type
     */
    public Forme GetForme(String type) {
    	Forme forme = null;
    	switch(type) {
    	case "carré":
    		forme = new Carre();
    		break;
    	case "rectangle":
    		forme = new Rectangle();
    		break;
    	case "cercle":
    		forme = new Cercle();
    		break;
        }
    	return forme;
    }

}