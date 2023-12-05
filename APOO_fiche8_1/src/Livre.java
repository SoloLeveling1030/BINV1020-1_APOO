public class Livre extends ProduitAvecTitre {
    private String titrLivre;
    private String auteur;

    private int nombrePages;


    public String getTitrLivre() {
        return titrLivre;
    }

    public Livre(String reference, double prix, String titre, String titrLivre, String auteur, int nombrePages) {
        super(reference, prix, titre);
        this.titrLivre = titrLivre;
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
        return "Livre{" +
                "titre='" + titrLivre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", nombrePages='" + nombrePages + '\'' +
                '}';
    }
}
