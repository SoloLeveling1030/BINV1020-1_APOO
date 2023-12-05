public class Livre extends ProduitAvecTitre {
    private String titre;
    private String auteur;
    private int nombrePages;

    public Livre(String titre, String titre1, String auteur, int nombrePages) {
        super(titre);
        this.titre = titre1;
        this.auteur = auteur;
        this.nombrePages = nombrePages;
    }

    public String getTitre() {
        return titre;
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
                "titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", nombrePages='" + nombrePages + '\'' +
                '}';
    }
}
