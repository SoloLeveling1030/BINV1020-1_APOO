import java.time.LocalDate;

public class Etape {
    private LocalDate date;
    private String ville;

    public Etape(LocalDate date, String ville) {
        this.date = date;
        this.ville = ville;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getVille() {
        return ville;
    }

    @Override
    public String toString() {
        return "Etape{" +
                "date=" + date +
                ", ville='" + ville + '\'' +
                '}';
    }
}
