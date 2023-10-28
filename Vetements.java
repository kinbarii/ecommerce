public class Vetements extends Produit {

    private String taille;

    public Vetements(double prix, String nom, String taille){

        super(prix,nom);
        this.taille = taille;
    }

    @Override
    public void afficherDetails(){

        System.out.println("Produit vetement" + super.getNom());
        System.out.println("Produit vetement" + super.getPrix());
        System.out.println("Produit vetement" + taille);
        System.out.println("*************************************");



    }



    
}