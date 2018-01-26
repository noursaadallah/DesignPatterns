
public class AffichageComplet implements Observateur{

    public AffichageComplet() {
    }

    public void actualiser(Observable O) {
    	if( O instanceof Localisation) {
    		Localisation l = (Localisation) O;
    		System.out.println(l.getPosition() + " ; " + l.getPrecision());	
    	}
    }
}
