package models;
import views.*;

public class Aliment {
 
	private static int id_Aliment=0;
	private String nom;
	private Livraison livraison;
	private float poid;
	
 public Aliment () {}
 
 public Aliment (String nom, Livraison l){
	 id_Aliment++;
	 this.nom=nom;
	 this.livraison=l;
	 poid=+this.livraison.getPoid(); 
	 }

 
 //Fonction à définir

 
 //Accesseurs
 

 
@Override
public String toString() {
	return "Aliment [nom=" + nom + ", livraison=" + livraison + "]";
}

public Livraison getLivraison() {
	return livraison;
}

public void setLivraison(Livraison livraison) {
	this.livraison = livraison;
}

public static int getId_Aliment() {
	return id_Aliment;
}

public static void setId_Aliment(int id_Aliment) {
	Aliment.id_Aliment = id_Aliment;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public float getPoid() {
	return poid;
}

public void setPoid(float poid) {
	this.poid = poid;
}

 
}
