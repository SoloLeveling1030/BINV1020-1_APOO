import java.util.Objects;

public class Cylindre implements Solide{
    private double rayon,hauteur;

    public Cylindre(double rayon, double hateur) {
        this.rayon = rayon;
        this.hauteur = hateur;
    }
    public double donnerVolume(){
        return Math.PI * rayon * Math.pow(rayon,2)*hauteur;
    }
    public double donnerSurface(){
        return 2 * Math.PI+2 * Math.PI * rayon * hauteur;
    }

    public double getRayon() {
        return rayon;
    }

    public double getHateur() {
        return hauteur;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cylindre cylindre = (Cylindre) o;
        return Double.compare(cylindre.rayon, rayon) == 0 && Double.compare(cylindre.hauteur, hauteur) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rayon, hauteur);
    }

    @Override
    public String toString() {
        return "Cylindre de rayon " + rayon + " et de hauteur " + hauteur;
    }

}
