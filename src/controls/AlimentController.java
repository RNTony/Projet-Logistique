package controls;

import models.*;
import views.*;
import dao.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;






public class AlimentController {

/*	private Aliment aliment;
	private Ajouter ajouter;
    private ActionListener actionListener;
	
	
	public AlimentController(Aliment a, Ajouter aj){
		this.aliment=a;
		this.ajouter=aj;}
	
	private void initView(){
		ajouter.getTextField_1().setText(aliment.getNom());
	}*/
	
	public static void addalliment(String nom,float poid,AlimentModel model){
		Aliment alm = new Aliment();
		alm.setNom(nom);
		alm.setPoid(poid);
		model.addAliment(alm);
		
	}
}
	
	