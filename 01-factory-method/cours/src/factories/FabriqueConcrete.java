package factories;

import products.Produit;
import products.ProduitA;
import products.ProduitB;
import products.ProduitC;

public class FabriqueConcrete extends FabriqueAbstraite {

    @Override
    protected Produit creerProduit(String type) {
        Produit produit = null;

        if (type.equalsIgnoreCase("A")) {
            produit = new ProduitA();
        } else if (type.equalsIgnoreCase("B")) {
            produit = new ProduitB();
        } else if (type.equalsIgnoreCase("C")) {
            produit = new ProduitC();
        }

        return produit;
    }
}