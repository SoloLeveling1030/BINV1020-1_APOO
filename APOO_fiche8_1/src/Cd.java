public class Cd extends ProduitAvecTitre {
    private String artiste;
    private int nombreMorceau;

    public Cd(String reference, double prix, String titre, String artiste, int nombreMorceau) {
        super(reference, prix, titre);
        this.artiste = artiste;
        this.nombreMorceau = nombreMorceau;
    }

    public String getArtiste() {
        return artiste;
    }

    public int getNombreMorceau() {
        return nombreMorceau;
    }

    @Override
    public String toString() {
        return "cd{ artiste='" + artiste + '\'' +
                ", nombreMorceau=" + nombreMorceau +
                '}';
    }

}
