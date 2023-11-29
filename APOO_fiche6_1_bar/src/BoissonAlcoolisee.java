public class BoissonAlcoolisee extends Boisson{
    private double degreDalcool;


    public BoissonAlcoolisee(String nom, double prix, int contenance, double degreDalcool) {
        super(nom, prix, contenance);
        this.degreDalcool = degreDalcool;
    }

    public double getDegreDalcool() {
        return degreDalcool;
    }

    @Override
    public String toString() {
        return super.toString()+" (degré d'alcool : "+degreDalcool+"∞)" ;
    }
}
