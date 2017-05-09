package controls;
import java.util.ArrayList;
import java.util.List;


import dao.*;
import models.*;

public class AlimentModel {
		
		private List<Aliment> alms = new ArrayList<Aliment>();
		
		
		
		public  AlimentModel() {
			AlimentHome daoclt  = new AlimentHome();
		}
		
		
		
		 public void addAliment(Aliment alm){
			 AlimentHome daoclt = new AlimentHome();
			  daoclt.persist(alm);
			 
		 }
		 
		 

	}

