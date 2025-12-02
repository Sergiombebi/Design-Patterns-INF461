package products;

public abstract class Produit {
    protected String nom;

    public Produit(String nom) {
        this.nom = nom;
    }

    public abstract void afficher();

    public String getNom() {
        return nom;
    }
}