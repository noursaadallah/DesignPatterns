
import java.util.*;

/**
 * 
 */
public class Localisation implements Observable {

    public int precision;
    public String position;
    public Set<Observateur> observateurs = new HashSet<Observateur>();
    
    public Localisation() {
    }

    public Localisation(String pos , int prec) {
    	precision = prec;
    	position = pos;
    }
    
    public int getPrecision() {
        return this.precision;
    }

    public void setPrecision(int precision) {
    	this.precision = precision;
    	this.NotifierObservateurs();
    }

    public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
		this.NotifierObservateurs();
	}

    public void AjouterObservateur(Observateur O) {
    	this.observateurs.add(O);
    }

    public void SupprimerObservateur(Observateur O) {
        this.observateurs.remove(O);
    }

    public void NotifierObservateurs() {
        for (Observateur o : observateurs) {
			o.actualiser(this);
		}
    }

}