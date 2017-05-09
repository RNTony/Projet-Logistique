package controls;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;



import dao.*;
import models.*;

		 public class AlimentModel extends AbstractTableModel{
		 	
		 	private List<Aliment> alms = new ArrayList<Aliment>();
		 	
		 	private final String[] entetes = {"id","nom","poid"};
		 	
		 	public  AlimentModel() {
		 		// TODO Auto-generated constructor stub
		 		AlimentDao almdao  = new AlimentDao();
		 		alms = almdao.all();
		 	}
		 	
		 	@Override
		 	public int getColumnCount() {
		 		// TODO Auto-generated method stub
		 		return entetes.length;
		 	}

		 	@Override
		 	public int getRowCount() {
		 		// TODO Auto-generated method stub
		 		return alms.size();
		 	}
		 	
		 	 public String getColumnName(int columnIndex) {
		 	        return entetes[columnIndex];
		 	    }

		 	@Override
		 	public Object getValueAt(int rowIndex, int columnIndex) {
		 		// TODO Auto-generated method stub
		 		switch (columnIndex) {
		 		case 0:
		 			return alms.get(rowIndex).getId_Aliment();
		 		case 1:
		 			return alms.get(rowIndex).getNom();
		 		case 2:
		 			return alms.get(rowIndex).getPoid();
		 		default:
		 			return null;
		 		}
		 		
		 	}
		 	
		 	
		 	
		 	 public void addAliment(Aliment a){
		 		 AlimentDao almdao = new AlimentDao();
		 		 int id = almdao.create(a);
		 		 System.out.println(id);
		 		 a = almdao.find(id);
		 		 alms.add(a);
		 		 fireTableRowsInserted(alms.size()-1, alms.size()-1);
		 	 }
		 	 


	}

