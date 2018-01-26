
import java.util.*;

/**
 * 
 */
public class FacadeForme {

    private Forme rectangle;
    private Forme cercle;
    private Forme carre;
    
    
    public FacadeForme() {
    	rectangle = new Rectangle();
    	carre = new Carre();
    	cercle = new Cercle();
    }

    public void dessinerRectangle() {
        rectangle.dessiner();
    }

    public void dessinerCarre() {
        carre.dessiner();
    }

    public void dessinerCercle() {
        cercle.dessiner();
    }

}