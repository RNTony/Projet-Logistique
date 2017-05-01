package models;
import java.util.ArrayList;

public class Plat {
	private static int id_Plat=0;
	private float prix;
	private String nom;
	private ArrayList<DetailPlat>DetailPlat;
	
	public Plat () {}

	public Plat(float prix, String nom, ArrayList<DetailPlat>dp) {
		id_Plat++;
		this.prix = prix;
		this.nom = nom;
		this.setDetailPlat(new ArrayList<DetailPlat>(dp));
	}

	public int getId_Plat() {
		return id_Plat;
	}

	public void setId_Plat(int id_Plat) {
		Plat.id_Plat = id_Plat;
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

	public ArrayList<DetailPlat> getDetailPlat() {
		return DetailPlat;
	}

	public void setDetailPlat(ArrayList<DetailPlat> detailPlat) {
		DetailPlat = detailPlat;
	}
	
}
