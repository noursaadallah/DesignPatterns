
public class TestSingleton {

	public static void main(String[] args) {
		ObjetSingleton o1 = ObjetSingleton.getOSingleton();
		ObjetSingleton o2 = ObjetSingleton.getOSingleton();
		o1.Afficher();
		o2.Afficher();
		o1 = null;
		o2 = null;
		ObjetSingleton o3 = ObjetSingleton.getOSingleton();
		o3.Afficher();
	}

}
