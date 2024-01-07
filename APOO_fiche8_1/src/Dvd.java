public class Dvd extends ProduitAvecTitre{
    private String realisateur;

    public Dvd(String reference, double prix, String titre, String realisateur) {
        super(reference, prix, titre);
        this.realisateur = realisateur;
    }

    public String getRealisateur() {
        return realisateur;
    }

    @Override
    public String toString() {
        return "Dvd{ realisateur='" + realisateur + '\'' +
                '}';
    }

}
