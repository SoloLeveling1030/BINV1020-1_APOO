public class Dvd extends ProduitAvecTitre{
    private String titre;
    private String realisateur;

    public Dvd(String reference, double prix, String titre, String titre1, String realisateur) {
        super(reference, prix, titre);
        this.titre = titre1;
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
