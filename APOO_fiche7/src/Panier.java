import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;

public class Panier implements Iterable<Produit> {
    private ArrayList<Produit> produits =new ArrayList<Produit>();

    public boolean ajouter(Produit produit){

        return produits.add(produit);
    }
    public boolean supprimer(Produit produit){
        return produits.remove(produit);
    }
    public int nombreDeproduits(){
        return produits.size();
    }
    public double caculerPrixTottal(){
        double prixTotal = 0;
        for (Produit produit : produits) {
             prixTotal += produit.getPrix();

        }

        return  prixTotal;
    }
    public Iterator<Produit> iterator(){
        return produits.iterator();
    }

    @Override
    public String toString() {
        return "Panier{" +
                "produits=" + produits +
                '}';
    }

}
