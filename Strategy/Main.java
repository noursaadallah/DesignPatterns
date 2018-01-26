import java.io.*;

public class Main {
	
	public static PaiementCB readCB() {
		return new PaiementCB("qsqsdqs256456qsd65","25/12/2020","111");
	}
	
	public static PaiementPayPal readPayPal() {
		return new PaiementPayPal("abc@gmail.com","abcxyz123");
	}

	public static void main(String[] args) throws IOException{
		// Initialisation des articles
		Article a1 = new Article("1", "manteau" , 150);
		Article a2 = new Article("2", "pull" , 50);
		Article a3 = new Article("3", "pantalon" , 100);
		
		// Création du panier et ajout des articles
		Panier panier = new Panier();
		panier.AjouterArticle(a1);
		panier.AjouterArticle(a2);
		panier.AjouterArticle(a3);
		
		// choix de l'utilisateur
		System.out.println("Choisissez la méthode de paiement:");
		System.out.println("\t 1. Carte bancaire");
		System.out.println("\t 2. Paypal");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Veuillez saisir votre choix : ");

		String s = br.readLine();
		
		PaiementStrategy p = null;
		
		if(s.equals("1")) p = readCB();
		if(s.equals("2")) p = readPayPal();

		if(p != null) panier.Payer(p);	//paiement
		
	}

}
