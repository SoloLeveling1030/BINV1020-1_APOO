public class Hotel {
    private String nomHotel;
    private int nombreDEtoiles;
    private double prixNuitee;

    public Hotel(String nomHotel, int nombreDEtoiles, double prixNuitee) {
        this.nomHotel = nomHotel;
        this.nombreDEtoiles = nombreDEtoiles;
        this.prixNuitee = prixNuitee;
    }

    public String getNomHotel() {
        return nomHotel;
    }

    public int getNombreDEtoiles() {
        return nombreDEtoiles;
    }

    public double getPrixNuitee() {
        return prixNuitee;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "nomHotel='" + nomHotel + '\'' +
                ", nombreDEtoiles=" + nombreDEtoiles +
                ", prixNuitee=" + prixNuitee +
                '}';
    }
}
