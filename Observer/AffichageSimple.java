
import java.util.*;

/**
 * 
 */
public class AffichageSimple implements Observateur {
	
	
    public AffichageSimple() {
    }

    public void actualiser(Observable O) {
    	if( O instanceof Localisation) {
    		Localisation l = (Localisation) O;
    		System.out.println(l.getPosition());	
    	}
    }

}