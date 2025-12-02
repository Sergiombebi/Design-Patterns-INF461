package factories;

import products.Produit;

public abstract class FabriqueAbstraite {

    // Méthode fabrique abstraite
    protected abstract Produit creerProduit(String type);

    // Méthode qui utilise la fabrique
    public Produit getProduit(String type) {
        Produit produit = creerProduit(type);

        if (produit != null) {
            System.out.println("Produit créé : " + produit.getNom());
        } else {
            System.out.println("Type de produit inconnu : " + type);
        }

        return produit;
    }
}