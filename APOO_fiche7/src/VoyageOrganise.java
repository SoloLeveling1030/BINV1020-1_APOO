import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class VoyageOrganise extends FormuleDeVacances implements Iterable<Etape> {
    private String nom;
    private double prix;
    private ArrayList<Etape> etapes;

    public VoyageOrganise(LocalDate dateDeDepart, int duree, String nom, double prix) {
        super(dateDeDepart, duree);
        this.nom = nom;
        this.prix = prix;
    }
    public boolean ajouter(Etape etape){
        if (etapes.contains(etape))
            return false;
        return true;
    }
    public boolean retirer (Etape etape){
        etapes.clear();
        return false;
    }
    public Iterator<Etape> iterator(){
       return etapes.iterator();
    }

    public String getNom() {
        return nom;
    }

    @Override
    public double trouverPrix() {
        return prix;
    }
}
