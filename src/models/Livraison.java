package models;

public class Livraison {
	private float poid;
	private static int id_Livraison=0;
	private float prix;
	private Lot lot;
	
	//Constructeur
	public Livraison() {}

	public Livraison(float poid, float prix,Lot lot) {
		this.poid = poid;
		id_Livraison++;
		this.prix = prix;
		this.lot=lot;
	}

	 
	//Fonction à définir
	 
	//Accesseurs

	
	public Lot getLot() {
		return lot;
	}

	public void setLot(Lot lot) {
		this.lot = lot;
	}

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
		Livraison.id_Livraison = id_Livraison;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "Livraison [poid=" + poid + ", id_Livraison=" + id_Livraison + ", prix=" + prix + ", lot=" + lot + "]";
	}
	
	
}
