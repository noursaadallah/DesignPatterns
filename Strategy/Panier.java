
import java.util.*;

public class Panier {
	
	public List<Article> listArticles = new ArrayList<Article>();

    public Panier() {
    }

    public void Payer(PaiementStrategy ps) {
    	ps.Payer(this.PrixTotal());
    }

    public void AjouterArticle(Article a) {
        listArticles.add(a);
    }

    public void SupprimerArticle(Article a) {
        listArticles.remove(a);
    }

    public double PrixTotal() {
    	double pt =0.0d;
        for (Article article : listArticles) {
			pt+=article.prix;
		}
        return pt;
    }

}