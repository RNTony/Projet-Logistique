package models;
import java.util.ArrayList;


public class LotPlatPrep {
		private int id_LotPlatPrep;
		private ArrayList<Plat>LotPlatPrep;

	
public LotPlatPrep () {}

public LotPlatPrep(ArrayList<Plat> LotPlatPrep) {
		this.LotPlatPrep = LotPlatPrep;
	}

public int getId_LotPlatPrep() {
	return id_LotPlatPrep;
}

public void setId_LotPlatPrep(int id_LotPlatPrep) {
	this.id_LotPlatPrep = id_LotPlatPrep;
}

public ArrayList<Plat> getLotPlatPrep() {
	return LotPlatPrep;
}

public void setLotPlatPrep(ArrayList<Plat> lotPlatPrep) {
	LotPlatPrep = lotPlatPrep;
}

}
