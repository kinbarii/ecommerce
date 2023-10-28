public class GestionnaireInventaire {

     public static void main(String[] args) {

        Inventaire inventaire = new Inventaire();
        Alimentaire pomme = new Alimentaire(5,"kirkland", "5 novembre");
        Electronic laptop = new Electronic(600, "hp", "2 ans");
        Vetements chandail = new Vetements(34, "zara", "medium");
        Vetements pantalon = new Vetements(50, "hm", "large");
        
       

        
          inventaire.AjouterProduit(pomme, 12);
          System.out.println("L'alimentaire ajoutee: ");
         inventaire.AjouterProduit(laptop, 1);
         System.out.println("L'electronic ajoutee: ");
         inventaire.AjouterProduit(chandail, 7);
         System.out.println("Le vetement ajoutee: ");
          inventaire.AjouterProduit(pantalon, 4);
          System.out.println("Le vetement ajoutee: ");
          inventaire.AfficherInventaire();

     }
}