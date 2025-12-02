package products;

public class ProduitA extends Produit {

    public ProduitA() {
        super("Produit A");
    }

    @Override
    public void afficher() {
        System.out.println("Je suis le " + nom);
    }
}