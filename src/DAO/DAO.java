package dao;

import java.util.List;
import java.sql.Connection;
import controlers.Connexion;
public abstract class DAO<T> {
	
	
	public abstract T find(int id);
	
	
	public abstract List<T> all();
	
	
	public abstract int create(T obj);
	
	
	public abstract void update(T obj);
	
	
	public abstract void delete(T obj);
}

