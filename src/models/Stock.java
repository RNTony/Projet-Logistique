package models;
import java.util.ArrayList;

public class Stock {
		private int id_Stock;
		private ArrayList<Aliment>listeAliment;

	
public Stock () {}

public Stock(ArrayList<Aliment> listeAliment) {
		this.listeAliment = listeAliment;
	}


//getter setter
public ArrayList<Aliment> getListeAliment() {
	return listeAliment;
}

public void setListeAliment(ArrayList<Aliment> listeAliment) {
	this.listeAliment = listeAliment;
}	
}
