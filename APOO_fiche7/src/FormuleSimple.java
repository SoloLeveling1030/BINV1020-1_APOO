import java.time.LocalDate;

public class FormuleSimple extends FormuleDeVacances {
    private  Vol volAller;
    private  Vol volRetour;

    public FormuleSimple(LocalDate dateDeDepart, int duree, Vol volAller, Vol volRetour) {
        super(dateDeDepart, duree);
        this.volAller = volAller;
        this.volRetour = volRetour;
    }

    @Override
    public double trouverPrix() {


        return volAller.getPrix() + volRetour.getPrix();
    }

    public Vol getVolAller() {
        return volAller;
    }

    public Vol getVolRetour() {
        return volRetour;
    }

    @Override
    public String toString() {
        return "FormuleSimple{" +
                "volAller=" + volAller +
                ", volRetour=" + volRetour +
                '}';
    }
}
