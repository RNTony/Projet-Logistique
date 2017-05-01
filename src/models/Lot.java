package models;

public class Lot {
	public Fournisseur fournisseur;
	public static int id_Lot=0;
	
	
	public Lot (){}
	
	
	public Lot (Fournisseur f) {
		id_Lot++;
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
		Lot.id_Lot = id_Lot;
	}


	@Override
	public String toString() {
		return "Lot "+ id_Lot + " [provenant du " + fournisseur + "]";
	}


	
	
}
