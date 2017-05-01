package models;

public class Utilisateur {
	private int id_Utilisateur;
	private String identifiant;
	private String mdp;
	
	public Utilisateur() {}
	
	public Utilisateur(int id_Utilisateur, String identifiant, String mdp) {
		this.id_Utilisateur = id_Utilisateur;
		this.identifiant = identifiant;
		this.mdp = mdp;
	}
	

	 //Fonction à définir
	 
	
	
	
	 //Accesseurs
	public int getId_Utilisateur() {
		return id_Utilisateur;
	}
	public void setId_Utilisateur(int id_Utilisateur) {
		this.id_Utilisateur = id_Utilisateur;
	}
	public String getIdentifiant() {
		return identifiant;
	}
	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	
}
