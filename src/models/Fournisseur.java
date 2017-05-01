package models;

public class Fournisseur {
	private int id_Fournisseur;
	private String nomSociete;
	
public Fournisseur(){}

public Fournisseur (int id, String nom){
	this.id_Fournisseur=id;
	this.nomSociete=nom;
	}

//Fonction à définir

//Accesseurs

public int getId_Fournisseur() {
	return id_Fournisseur;
}

public void setId_Fournisseur(int id_Fournisseur) {
	this.id_Fournisseur = id_Fournisseur;
}

public String getNomSociete() {
	return nomSociete;
}

public void setNomSociete(String nomSociete) {
	this.nomSociete = nomSociete;
}


}
