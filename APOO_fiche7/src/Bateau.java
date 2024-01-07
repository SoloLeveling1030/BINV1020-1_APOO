import java.util.ArrayList;

public class Bateau {
    private String nom;
    private int nombreDeCabines;
    private ArrayList<String> activites ;

    public Bateau(String nom, int nombreDeCabines, ArrayList<String> activites) {
        this.nom = nom;
        this.nombreDeCabines = nombreDeCabines;
        this.activites = activites;
    }
    private boolean ajouter(String activite){
        return activites.add(activite);
    }
    private boolean supprimer(String activite){
        return activites.remove(activite);
    }

    public String getNom() {
        return nom;
    }

    public int getNombreDeCabines() {
        return nombreDeCabines;
    }

    public ArrayList<String> getActivites() {
        return activites;
    }

    @Override
    public String toString() {
        return "Bateau{" +
                "nom='" + nom + '\'' +
                ", nombreDeCabines=" + nombreDeCabines +
                ", activites=" + activites +
                '}';
    }
}
