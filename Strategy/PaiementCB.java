
import java.util.*;


public class PaiementCB implements PaiementStrategy {
    
	public String NumeroCarte;
    public String DateExpiration;
    public String Cryptogramme;

    public PaiementCB() {
    }

    public PaiementCB(String numeroCarte, String dateExpiration, String cryptogramme) {
		NumeroCarte = numeroCarte;
		DateExpiration = dateExpiration;
		Cryptogramme = cryptogramme;
	}

    public void Payer(double m) {
    	System.out.println("Vous avez payé le montant " + m + " en carte bancaire");
    	System.out.println("Numero de la carte : " + NumeroCarte);
    	System.out.println("Date d'expiration : " + DateExpiration);
    	System.out.println("Cryptogramme : " + Cryptogramme);
    }

}