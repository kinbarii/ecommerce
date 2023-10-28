import java.util.HashMap;
import java.util.Map;

public class GestionnaireInventaire {

     public static void main(String[] args) {

        Inventaire inventaire = new Inventaire();
        Alimentaire pomme = new Alimentaire(5,"kirkland", "5 novembre");
        Electronic laptop = new Electronic(600, "hp", "2 ans");
        Vetements chandail = new Vetements(34, "zara", "medium");
        Vetements pantalon = new Vetements(50, "hm", "large");
        

        
          inventaire.ajouterProduit(pomme, 12);
          System.out.println("L'alimentaire ajoutee: ");
         inventaire.ajouterProduit(laptop, 1);
         System.out.println("L'electronic ajoutee: ");
         inventaire.ajouterProduit(chandail, 7);
         System.out.println("Le vetement ajoutee: ");
          inventaire.ajouterProduit(pantalon, 4);
          System.out.println("Le vetement ajoutee: ");
          
       //   String resultat = inventaire.AfficherInventaire();
       //   System.out.println(resultat);
       inventaire.afficherInventaire();
     }
}