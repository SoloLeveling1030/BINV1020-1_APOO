import java.time.LocalDate;

public abstract class FormuleDeVacances {
    private LocalDate dateDeDepart;
    private double prix;
    private int duree;

    public FormuleDeVacances(LocalDate dateDeDepart, int duree) {
        this.dateDeDepart = dateDeDepart;
        this.duree = duree;
    }
    public abstract double trouverPrix();

    public LocalDate getDateDeDepart() {
        return dateDeDepart;
    }

    public int getDuree() {
        return duree;
    }

    @Override
    public String toString() {
        return "FormuleDeVacances{" +
                "dateDeDepart=" + dateDeDepart +
                ", duree=" + duree +
                '}';
    }
}
