package models;

public class Livraison {
	private float poid;
	private int id_Livraison;
	private float prix;
	
	public Livraison() {}

	public Livraison(float poid, int id_Livraison, float prix) {
		this.poid = poid;
		this.id_Livraison = id_Livraison;
		this.prix = prix;
	}

	 
	//Fonction à définir
	 
	
	
	//Accesseurs
	public float getPoid() {
		return poid;
	}

	public void setPoid(float poid) {
		this.poid = poid;
	}

	public int getId_Livraison() {
		return id_Livraison;
	}

	public void setId_Livraison(int id_Livraison) {
		this.id_Livraison = id_Livraison;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}
	
	
}
