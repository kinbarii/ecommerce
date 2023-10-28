public class Alimentaire extends Produit{

    private String dateExpiration;
    
    public Alimentaire(double prix, String nom, String dateExpiration){
        super(prix, nom);
        this.dateExpiration = dateExpiration;
    }

    @Override
    public void afficherDetails() {
        System.out.println("Produit alimentaire: " + super.getNom());
        System.out.println("Produit alimentaire: " + super.getPrix());
        System.out.println("Produit alimentaire: " + dateExpiration());
    }
}

