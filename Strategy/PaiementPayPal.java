
import java.util.*;


public class PaiementPayPal implements PaiementStrategy {

    public String Mail;
    public String Password;

    public PaiementPayPal() {
    }
    

    public PaiementPayPal(String mail, String password) {
		Mail = mail;
		Password = password;
	}

	public void Payer(double m) {
    	System.out.println("Vous avez payé le montant " + m + " par PayPal");
    	System.out.println("Votre identifiant : " + Mail);
    	System.out.println("Votre password : " + Password);
    }

}