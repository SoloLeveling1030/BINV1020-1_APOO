public class TestePanier {
    public static void main(String[] args) throws PanierPleinException {
        Panier p = new Panier();
        Livre livre1 = new Livre("123", 12, "li", "Haary potter crée par J.K; Rowling",  1000);
        Livre livre2 = new Livre("123",10,"One Piece","luffy",100000);
        Cd cd1 = new Cd("cd1",9,"Sasuke","sasukeee",10);
        System.out.println("Livre   Harry Potter ajouté :" + p.ajouter(livre1));
        try {
            p.supprimer(livre1);
        } catch (ProduitNonPresentException | IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }
        try {
            p.supprimer(null);
        }catch (ProduitNonPresentException | IllegalArgumentException | PanierPleinException)
        try {
            p.retrouverProduit("123");
        } catch (ProduitNonPresentException | IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }
    }
    }
