package products;

public class ProduitC extends Produit {

    public ProduitC() {
        super("Produit C");
    }

    @Override
    public void afficher() {
        System.out.println("Je suis le " + nom);
    }
}