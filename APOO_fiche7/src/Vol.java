import java.time.LocalDate;

public class Vol {
    private LocalDate dateHeureVol;
    private double prix ;
    private String numero, aeroprtDeDepart, aeroportDArrivee;

    public Vol(LocalDate dateHeureVol, double prix, String numero, String aeroprtDeDepart, String aeroportDArrivee) {
        this.dateHeureVol = dateHeureVol;
        this.prix = prix;
        this.numero = numero;
        this.aeroprtDeDepart = aeroprtDeDepart;
        this.aeroportDArrivee = aeroportDArrivee;
    }

    public LocalDate getDateHeureVol() {
        return dateHeureVol;
    }

    public double getPrix() {
        return prix;
    }

    public String getNumero() {
        return numero;
    }

    public String getAeroprtDeDepart() {
        return aeroprtDeDepart;
    }

    public String getAeroportDArrivee() {
        return aeroportDArrivee;
    }

    @Override
    public String toString() {
        return "Vol{" +
                "dateHeureVol=" + dateHeureVol +
                ", prix=" + prix +
                ", numero='" + numero + '\'' +
                ", aeroprtDeDepart='" + aeroprtDeDepart + '\'' +
                ", aeroportDArrivee='" + aeroportDArrivee + '\'' +
                '}';
    }

}
