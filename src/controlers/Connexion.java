package controlers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connexion {
	private static Statement st;
	private static Connection con;
	
	
	public static Connection Connect(){
		
		con=null;
		String  url="jdbc:mysql://localhost:3306/logistique";
		String user="root";
		String mdp="P1212121";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url, user, mdp);
			System.out.println("connexion reussie");
			
		} catch (ClassNotFoundException e1) {
		 System.out.println("Impossible de charger le driver "+e1.getMessage());
		 
		} catch (SQLException e2) {
			System.out.println("Impossible de se connecter "+e2.getMessage());
		}
		return con;
		
	}
public static void main(String[] args) {
	Connect();
}

public static ResultSet select(String sql){
	try {
		st = Connect().createStatement();
		return st.executeQuery(sql);
	} catch (Exception e) {
		// TODO: handle exception*
		return null;
	}
}
public static void action(String sql){
	try {
		st = Connect().createStatement();
		st.executeUpdate(sql);
	} catch (Exception e) {
		// TODO: handle exception
	}
}

public static int insert(String sql){
	try {
		st = Connect().createStatement();
		int id =st.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);
		ResultSet rs = st.getGeneratedKeys();
		rs.next();
		return rs.getInt(1);
	} catch (Exception e) {
		// TODO: handle exception
	}
	return 0;
}

}
