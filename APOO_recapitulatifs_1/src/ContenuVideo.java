import java.util.Arrays;
import java.util.Objects;

public abstract class ContenuVideo {
    private int id;
    private String titre;
    private String categorie;
    private final  int idsuivant = 1;
    private String [] CATEGORIES_POSSIBLE ={"action","science-fiction","drame","comédie","horreur","triller","documentaire","animation"};

    public ContenuVideo(int id, String titre, String categorie, String[] CATEGORIES_POSSIBLE) throws IllegalArgumentException{
        this.id = id;
        this.titre = titre;
        this.categorie = categorie;
        if (CATEGORIES_POSSIBLE != this.CATEGORIES_POSSIBLE) {
            this.CATEGORIES_POSSIBLE = CATEGORIES_POSSIBLE;

        }throw new IllegalArgumentException("catégorie inexistante");

    }

    public ContenuVideo(String titre, String categorie) {
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContenuVideo that = (ContenuVideo) o;
        return id == that.id && idsuivant == that.idsuivant && Objects.equals(titre, that.titre) && Objects.equals(categorie, that.categorie) && Arrays.equals(CATEGORIES_POSSIBLE, that.CATEGORIES_POSSIBLE);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, titre, categorie, idsuivant);
        result = 31 * result + Arrays.hashCode(CATEGORIES_POSSIBLE);
        return result;
    }

    public int getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    @Override
    public String toString() {
        return "ContenuVideo{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", categorie='" + categorie + '\'' +
                ", idsuivant=" + idsuivant +
                ", CATEGORIES_POSSIBLE=" + Arrays.toString(CATEGORIES_POSSIBLE) +
                '}';
    }
}
