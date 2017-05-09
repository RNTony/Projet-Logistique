package dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import controlers.*;
import models.Aliment;


public class AlimentDao extends DAO<Aliment> {
	public int create(Aliment obj) {
		// TODO Auto-generated method stub
		String req = "INSERT INTO `logistique`.`Aliment` (`nom`,`poid`) values ( "
				+ "'" + obj.getNom() + "' ,'"+ obj.getPoid() + "')";
		return Connexion.insert(req);
	}

	@Override
	public Aliment find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Aliment> all() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Aliment obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Aliment obj) {
		// TODO Auto-generated method stub
		
	}
}
