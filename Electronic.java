public class Electronic extends Produit {

    private String garantie;

public Electronic(double prix, String nom, String garantie){
    super(prix, nom);
    this.garantie = garantie;

}

public Double getPrix(){
    return super.getPrix();
}


@Override
public void afficherDetails(){

    System.out.println("Produit electronic" + super.getNom());
    System.out.println("Produit electronic" + super.getPrix());
    System.out.println("Produit electronic" + garantie);
    System.out.println("*************************************");

}


}