import factories.FabriqueAbstraite;
import factories.FabriqueConcrete;
import products.Produit;

public class Main {
    
    public static void main(String[] args) {
        // Crer la fabrique concrète
        FabriqueAbstraite fabrique = new FabriqueConcrete();
        
        System.out.println("Pattern Factory Method\n");
        
        // Crer et afficher Produit A
        Produit produitA = fabrique.getProduit("A");
        if (produitA != null) {
            produitA.afficher();
        }
        
        System.out.println();
        
        // Crer et afficher Produit B
        Produit produitB = fabrique.getProduit("B");
        if (produitB != null) {
            produitB.afficher();
        }
        
        System.out.println();
        
        // Crer et afficher Produit C
        Produit produitC = fabrique.getProduit("C");
        if (produitC != null) {
            produitC.afficher();
        }
        
        System.out.println();
        
        //  avec un type inconnu
        Produit produitX = fabrique.getProduit("X");
        if (produitX != null) {
            produitX.afficher();
        }
    }
}