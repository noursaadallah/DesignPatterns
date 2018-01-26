
import java.util.*;

/**
 * 
 */
public interface Observable {

    /**
     * @param O
     */
    public void AjouterObservateur(Observateur O);

    /**
     * @param O
     */
    public void SupprimerObservateur(Observateur O);

    /**
     * 
     */
    public void NotifierObservateurs();

}