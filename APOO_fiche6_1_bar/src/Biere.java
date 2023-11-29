public class Biere extends BoissonAlcoolisee {
    private boolean pression;

    public Biere(String nom, double prix, int contenance, double degreDalcool, boolean pression) {
        super(nom, prix, contenance, degreDalcool);
        this.pression = pression;

    }

    public boolean isPression() {
        return pression;
    }

    @Override
    public String toString() {
        if(!pression)
            return "Biere en bouteille : " +super.toString();
          return "Bière en pression : "+super.toString();
    }
}
