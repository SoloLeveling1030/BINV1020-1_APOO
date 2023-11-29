import java.util.Objects;

public class Boisson {
    private String nom;
    private double prix;
    private int contenance;

    public Boisson(String nom, double prix, int contenance) {
        this.nom = nom;
        this.prix = prix;
        this.contenance = contenance;
    }

    public String getNom() {
        return nom;
    }

    public double getPrix() {
        return prix;
    }

    public int getContenance() {
        return contenance;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Boisson boisson = (Boisson) o;
        return Double.compare(boisson.prix, prix) == 0 && Double.compare(boisson.contenance, contenance) == 0 && nom.equals(boisson.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, prix, contenance);
    }

    @Override
    public String toString() {
        return  nom  +
                " ("+ contenance+" cl)" +
                " à " + prix +" euros"
                ;
    }
}
