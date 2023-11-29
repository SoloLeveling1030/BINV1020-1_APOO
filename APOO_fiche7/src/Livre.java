public class Livre extends Produit {
    private String titre;
    private String auteur;
    private String nombrePages;

    public Livre(String reference, double prix, String titre, String auteur, String nombrePages) {
        super(reference, prix);
        this.titre = titre;
        this.auteur = auteur;
        this.nombrePages = nombrePages;
    }

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public String getNombrePages() {
        return nombrePages;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", nombrePages='" + nombrePages + '\'' +
                '}';
    }
}
