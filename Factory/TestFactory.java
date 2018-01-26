
public class TestFactory {

	public static void main(String[] args) {
		FormeFactory ff = new FormeFactory();
		
		Forme carré = ff.GetForme("carré");
		Forme cercle = ff.GetForme("cercle");
		Forme rectangle = ff.GetForme("rectangle");
		
		carré.Dessiner();
		cercle.Dessiner();
		rectangle.Dessiner();
	}

}
