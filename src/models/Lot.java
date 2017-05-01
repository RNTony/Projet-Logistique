package models;

public class Lot {
	public Fournisseur fournisseur;
	public int id_Lot;
	
	
	public Lot (){}
	
	
	public Lot (int id,Fournisseur f) {
		this.id_Lot=id;
		this.fournisseur=f;
	}


	public Fournisseur getFournisseur() {
		return fournisseur;
	}


	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}


	public int getId_Lot() {
		return id_Lot;
	}


	public void setId_Lot(int id_Lot) {
		this.id_Lot = id_Lot;
	}
	
}
