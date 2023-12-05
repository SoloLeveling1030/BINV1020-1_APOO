public class TestePanier {
    public static void main(String[] args) throws PanierPleinException {
        Panier p = new Panier();
        Livre livre1 = new Livre("123", 12, "li", "Haary potter crée par J.K; Rowling", "J.K; Rowling", 1000);
        System.out.println("Livre   Harry Potter ajouté :" + p.ajouter(livre1));
        try {
            p.supprimer(livre1);
        } catch (ProduitNonPresentException | IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }
        try {
            p.retrouverProduit("123");
        } catch (ProduitNonPresentException | IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }
    }
    }
