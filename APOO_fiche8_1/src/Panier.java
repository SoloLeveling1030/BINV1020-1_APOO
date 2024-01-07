import java.util.ArrayList;
import java.util.Iterator;

public class Panier implements Iterable<Produit> {
    private ArrayList<Produit> produits =new ArrayList<Produit>();

    public boolean ajouter(Produit produit) throws PanierPleinException, IllegalArgumentException{
        return produits.add(produit);
    }
    public boolean supprimer(Produit produit) throws ProduitNonPresentException{
        if (produits.isEmpty())
            throw new ProduitNonPresentException("Le produit n'est pas présent");
        if (produit == null) {
            throw new IllegalArgumentException("il n'ya pas de produit ");

        }
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
    public Produit retrouverProduit(String reference) throws ProduitNonPresentException{

        for (Produit produit : produits) {

            if (produit.getReference().equals(reference)) {
                return produit;
            }
            if (produit == null) {throw new ProduitNonPresentException("Le produit est null");

            }

        }
        throw new ProduitNonPresentException("produit non present");

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
