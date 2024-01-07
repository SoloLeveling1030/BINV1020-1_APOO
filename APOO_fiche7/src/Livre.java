public class Livre extends Produit {
    private String auteur;
    private int nombrePages;

    public Livre(String reference, double prix, String auteur, int nombrePages) {
        super(reference, prix);
        this.auteur = auteur;
        this.nombrePages = nombrePages;
    }

    public String getAuteur() {
        return auteur;
    }

    public int getNombrePage() {
        return nombrePages;
    }


    @Override
    public String toString() {
        return "Livre{" +
                ", auteur='" + auteur + '\'' +
                ", nombrePages='" + nombrePages + '\'' +
                '}';
    }
}
