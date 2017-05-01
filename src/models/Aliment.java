package models;

public class Aliment {
 
	private float poid;
	private int id_Aliment;
	private float prix;
	private String nom;
 
	
 public Aliment () {}
 
 public Aliment (float p, int id,float prix, String nom){
	 this.poid=p;
	 this.id_Aliment=id;
	 this.prix=prix;
	 this.nom=nom;
	 }

 
 //Fonction à définir
 
 //Accesseurs
 

 
public float getPoid() {
	return poid;
}

public void setPoid(float poid) {
	this.poid = poid;
}

public int getId_Aliment() {
	return id_Aliment;
}

public void setId_Aliment(int id_Aliment) {
	this.id_Aliment = id_Aliment;
}

public float getPrix() {
	return prix;
}

public void setPrix(float prix) {
	this.prix = prix;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}
 
}
