package models;

public class DetailPlat {
	private static int id_DetailPlat=0;
	private Aliment aliment;
	private float quantiteNecessaire;
	
	public DetailPlat(){}
	
	public DetailPlat(Aliment aliment,float q){
		id_DetailPlat++;
		this.aliment=aliment;
		this.quantiteNecessaire=q;
		}

	public static int getId_DetailPlat() {
		return id_DetailPlat;
	}

	public static void setId_DetailPlat(int id_DetailPlat) {
		DetailPlat.id_DetailPlat = id_DetailPlat;
	}

	public Aliment getAliment() {
		return aliment;
	}

	public void setAliment(Aliment aliment) {
		this.aliment = aliment;
	}

	public float getQuantiteNecessaire() {
		return quantiteNecessaire;
	}

	public void setQuantiteNecessaire(float quantiteNecessaire) {
		this.quantiteNecessaire = quantiteNecessaire;
	}

	@Override
	public String toString() {
		return "DetailPlat [aliment=" + aliment + ", quantiteNecessaire=" + quantiteNecessaire + "]";
	}

	
}