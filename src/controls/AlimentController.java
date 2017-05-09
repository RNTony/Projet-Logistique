package controls;

import models.*;
import views.*;
import dao.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AlimentController {


	public static void addAliment(String nom,float poid,AlimentModel model){
		Aliment alm = new Aliment();
		alm.setNom(nom);
		alm.setPoid(poid);
		model.addAliment(alm);
		
	}
}
	
	