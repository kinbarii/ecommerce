import java.util.HashMap;
import java.util.Map;

public class Inventaire{

private Map<Produit,Integer> inventaire;

public Inventaire(){

	this.inventaire = new HashMap<>();
  }

  public void AjouterProduit(Produit produit, int quantite){

	inventaire.put(produit, quantite);
	System.out.println("Produit ajoutee avec succes" + produit.toString());


  }

  public void SupprimerProduit(){

	System.out.println("Produit supprime avec succes" );
  }

  public void AfficherInventaire(){
	System.err.println("********************************");
	System.out.println("Ceci est notre inventaire actuel");

  for(Map.entry<Produit, Integer> entry: inventaire.entrySet()){

    Produit produit = entry.getKey();
    int quantite = entry.getValue();
    produit.afficherDetails();
    System.out.println("La quantite en stocke" + quantite);
    System.out.println();
    System.out.println("***********************************");

     }
  }

  

}

