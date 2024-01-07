import java.time.LocalDate;

public class Sejour extends FormuleSimple {
    private Hotel hotelReserve;

    public Sejour(LocalDate dateDeDepart, int duree, Vol volAller, Vol volRetour, Hotel hotelReserve) {
        super(dateDeDepart, duree, volAller, volRetour);
        this.hotelReserve = hotelReserve;
    }

    @Override
    public double trouverPrix() {
        return super.trouverPrix() + hotelReserve.getPrixNuitee();
    }

    public Hotel getHotelReserve() {
        return hotelReserve;
    }

    @Override
    public String toString() {
        return "Sejour{" +
                "hotelReserve=" + hotelReserve +
                '}';
    }
}
