public abstract class ProduitAvecTitre {
    private String titre;

    public ProduitAvecTitre(String titre) {
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
