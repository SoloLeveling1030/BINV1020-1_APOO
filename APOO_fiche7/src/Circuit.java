import java.time.LocalDate;

public class Circuit extends VoyageOrganise {
    private String description;

    public Circuit(LocalDate dateDeDepart, int duree, String nom, double prix, String description) {
        super(dateDeDepart, duree, nom, prix);
        this.description = description;
    }


    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Circuit{" +super.toString()+
                "description='" + description + '\'' +
                '}';
    }
}
