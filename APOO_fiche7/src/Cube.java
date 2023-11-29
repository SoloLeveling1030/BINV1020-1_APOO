import java.util.Objects;

public class Cube implements Solide  {
    private double cote;

    public Cube(double cote) {
        if (cote <=0) { throw new IllegalArgumentException("Le cote doit etre plus grand que 0");

        }
        this.cote = cote;
    }

    public double getCote() {
        return cote;
    }
    public double donnerVolume(){
        return  Math.pow(cote,3);
    }
    public double donnerSurface(){
        return Math.pow(cote,3)* 6;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cube cube = (Cube) o;
        return Double.compare(cube.cote, cote) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cote);
    }

    @Override
    public String toString() {
        return "Cube de coté " + cote;
    }
}
