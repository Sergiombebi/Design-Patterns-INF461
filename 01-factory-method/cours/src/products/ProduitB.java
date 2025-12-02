package products;

public class ProduitB extends Produit {

    public ProduitB() {
        super("Produit B");
    }

    @Override
    public void afficher() {
        System.out.println("Je suis le " + nom);
    }
}