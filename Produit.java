public abstract class Produit {

    private double prix;
    private String nom;
//constructeur
    public Produit(double prix,String nom){

        this.prix = prix;
        this.nom = nom;

    }
    //Methode
    public abstract void afficherDetails(); 

    //getters et setters

    public String getNom(){
        return nom;
    }

    public Double getPrix(){
    
        return prix;
    }

    public String toString(){

        return "Nom du produit: " + getNom() + "Prix du produit" + getPrix() ;  
    }

    

}

