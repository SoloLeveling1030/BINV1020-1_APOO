public class Cd extends ProduitAvecTitre {
    private String titre;
    private String artiste;
    private int nombreMorceau;

    public Cd(String reference, double prix, String titre, String titre1, String artiste, int nombreMorceau) {
        super(reference, prix, titre);
        this.titre = titre1;
        this.artiste = artiste;
        this.nombreMorceau = nombreMorceau;
    }

    public String getTitre() {
        return titre;
    }

    public String getArtiste() {
        return artiste;
    }

    public int getNombreMorceau() {
        return nombreMorceau;
    }

    @Override
    public String toString() {
        return "cd{" +
                "titre='" + titre + '\'' +
                ", artiste='" + artiste + '\'' +
                ", nombreMorceau=" + nombreMorceau +
                '}';
    }

}
