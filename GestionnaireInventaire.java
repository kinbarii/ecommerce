public class GestionnaireInventaire {

     public static void main(String[] args) {

        Inventaire inventaire = new Inventaire();
        Alimentaire pomme = new Alimentaire(5,"kirkland", "5 novembre");
        Electronic laptop = new Electronic(600, "hp", "2 ans");
        Vetements chandail = new Vetements(34, "zara", "medium");
        Vetements pantalon = new Vetements(50, "hm", "large");
        
       

         System.out.println("L'alimentaire ajoutee:" + pomme);
          inventaire.AjouterProduit(pomme, 12);
         System.out.println("L'electronic ajoutee:" + laptop);
         inventaire.AjouterProduit(laptop, 1);
         System.out.println("Le vetement ajoutee:" + chandail);
         inventaire.AjouterProduit(chandail, 7);
         System.out.println("Le vetement ajoutee:" + pantalon);
          inventaire.AjouterProduit(pantalon, 4);


     }
}