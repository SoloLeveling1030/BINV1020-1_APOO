public class Film extends ContenuVideo {
    private int duree;
    private long recettes;

    public Film(String titre, String categorie, int duree, long recettes) throws IllegalArgumentException {
        super(titre, categorie);
        this.duree = duree;
        this.recettes = recettes;
    }

    public Film(String titre, String categorie,int duree) throws IllegalArgumentException {
        super(titre, categorie);
        this.duree = duree;
    }



    @Override
    public String toString() {
        return "Film{" +
                "duree=" + duree +
                ", recettes=" + recettes +
                '}';
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public void setRecettes(long recettes) {

        this.recettes = recettes;
    }

}
