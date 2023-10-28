import java.util.HashMap;
import java.util.Map;


public class Inventaire{

private Map<Produit,Integer> inventaire;

public Inventaire(){

	this.inventaire = new HashMap<>();
  }

  public void ajouterProduit(Produit produit, int quantite){

	inventaire.put(produit, quantite);
	//System.out.println("Produit ajoutee avec succes " + produit.toString());


  }

  public void supprimerProduit(Produit produit, int quantite){

    if(inventaire.containsKey(produit)){

      int quantiteActuel = inventaire.get(produit);
      if(quantiteActuel > quantite){
        inventaire.put(produit, quantiteActuel - quantite);
        System.out.println("la quantite a diminue" + quantiteActuel);

      }
      else if(quantiteActuel == quantite){
        inventaire.remove(produit);
        System.out.println("Produit supprime de linventaire");
      }
      else{

        System.out.println("Quantite superieur au stock actuel");
      }
    }
    else{
      System.out.println("Ce produit n'existe pas");
    }
    

  }

  public void afficherInventaire(){
	System.err.println("********************************");
	System.out.println("Ceci est notre inventaire actuel");

  for(Map.Entry<Produit, Integer> entry: inventaire.entrySet()){

    Produit produit = entry.getKey();
    int quantite = entry.getValue();
    produit.afficherDetails();
    System.out.println("La quantite en stocke" + quantite);
    System.out.println();
    System.out.println("***********************************");

     }
  }

  

}

