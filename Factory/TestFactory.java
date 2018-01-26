
public class TestFactory {

	public static void main(String[] args) {
		FormeFactory ff = new FormeFactory();
		
		Forme carr� = ff.GetForme("carr�");
		Forme cercle = ff.GetForme("cercle");
		Forme rectangle = ff.GetForme("rectangle");
		
		carr�.Dessiner();
		cercle.Dessiner();
		rectangle.Dessiner();
	}

}
