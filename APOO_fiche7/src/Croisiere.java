import java.time.LocalDate;

public class Croisiere extends VoyageOrganise{
    private Bateau bateau;

    public Croisiere(LocalDate dateDeDepart, int duree, String nom, double prix, Bateau bateau) {
        super(dateDeDepart, duree, nom, prix);
        this.bateau = bateau;
    }

    public Bateau getBateau() {
        return bateau;
    }

    @Override
    public String toString() {
        return "Croisiere{" +super.toString()+
                "bateau=" + bateau +
                '}';
    }
}
