package models;

public class DetailPlat {
	private static int id_DetailPlat=0;
	private String nom;
	private int quantite;
	
	public DetailPlat(){}
	
	public DetailPlat(String nom, int quantite){
		id_DetailPlat++;
		this.nom=nom;
		this.quantite=quantite;
		}

	public static int getId_DetailPlat() {
		return id_DetailPlat;
	}

	public static void setId_DetailPlat(int id_DetailPlat) {
		DetailPlat.id_DetailPlat = id_DetailPlat;
	}

	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	
	@Override
	public String toString() {
		return "DetailPlat [nom=" + nom + ", quantite=" + quantite + "]";
	}
	
}
