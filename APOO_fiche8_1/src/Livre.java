public class Livre extends ProduitAvecTitre {

    private String auteur;

    private int nombrePages;


    public Livre(String reference, double prix, String titre, String auteur, int nombrePages) {
        super(reference, prix, titre);
        this.auteur = auteur;
        this.nombrePages = nombrePages;
    }

    public String getAuteur() {
        return auteur;
    }

    public int getNombrePages() {
        return nombrePages;
    }

    @Override
    public String toString() {
        return "Livre{auteur='" + auteur + '\'' +
                ", nombrePages='" + nombrePages + '\'' +
                '}';
    }
}
