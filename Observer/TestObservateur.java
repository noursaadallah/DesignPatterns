
public class TestObservateur {

	public static void main(String[] args) {
		Localisation l = new Localisation("abcd" , 5);
		
		l.AjouterObservateur(new AffichageSimple());
		l.AjouterObservateur(new AffichageSimple());
		l.AjouterObservateur(new AffichageComplet());
		
		l.NotifierObservateurs();
		
		l.setPosition("azerty");
		l.setPrecision(18);
	}

}
