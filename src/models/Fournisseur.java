package models;

public class Fournisseur {
	private static int id_Fournisseur=0;
	private String nomSociete;
	
public Fournisseur(){}

public Fournisseur (String nom){
	id_Fournisseur++;
	this.nomSociete=nom;
	}

//Fonction à définir

//Accesseurs


public int getId_Fournisseur() {
	return id_Fournisseur;
}

public void setId_Fournisseur(int id_Fournisseur) {
	Fournisseur.id_Fournisseur = id_Fournisseur;
}

public String getNomSociete() {
	return nomSociete;
}

public void setNomSociete(String nomSociete) {
	this.nomSociete = nomSociete;
}

@Override
public String toString() {
	return "Fournisseur [nom = " + nomSociete + "]";
}


}
