package models;

public class Plat {
	private int id_Plat=0;
	private float prix;
	private String nom;
	
	public Plat () {}

	public Plat(int id_Plat, float prix, String nom) {
		id_Plat++;
		this.prix = prix;
		this.nom = nom;
	}

	public int getId_Plat() {
		return id_Plat;
	}

	public void setId_Plat(int id_Plat) {
		this.id_Plat = id_Plat;
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

	@Override
	public String toString() {
		return "Plat [id_Plat=" + id_Plat + ", prix=" + prix + ", nom=" + nom + "]";
	}
	
}
