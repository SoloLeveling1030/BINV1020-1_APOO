public abstract class ProduitAvecTitre extends Produit{
    private String titre;

    public ProduitAvecTitre(String reference, double prix, String titre) {
        super(reference, prix);
        this.titre = titre;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    @Override
    public String toString() {
        return "ProduitAvecTitre{" +
                "titre='" + titre + '\'' +
                '}';
    }
}
