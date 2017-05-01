package models;
import java.util.ArrayList;

public class Stock {
		private int id_Stock = 1;
		private ArrayList<Aliment>listeAliment;

	


public Stock () {}

public Stock(ArrayList<Aliment> listeAliment) {
		this.listeAliment = listeAliment;
	}


//getter setter
public int getId_Stock() {
	return id_Stock;
}

public void setId_Stock(int id_Stock) {
	this.id_Stock = id_Stock;
}

public ArrayList<Aliment> getListeAliment() {
	return listeAliment;
}

public void setListeAliment(ArrayList<Aliment> listeAliment) {
	this.listeAliment = listeAliment;
}

@Override
public String toString() {
	return "Stock [id_Stock=" + id_Stock + ", listeAliment=" + listeAliment + "]";
}

}
