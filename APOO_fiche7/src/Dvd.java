public class Dvd extends Produit{
    private String titre;
    private String realisateur;

    public Dvd(String reference, double prix, String realisateur) {
        super(reference, prix);
        this.realisateur = realisateur;
    }

    public String getTitre() {
        return titre;
    }

    public String getRealisateur() {
        return realisateur;
    }

    @Override
    public String toString() {
        return "Dvd{" +
                "titre='" + titre + '\'' +
                ", realisateur='" + realisateur + '\'' +
                '}';
    }

}
