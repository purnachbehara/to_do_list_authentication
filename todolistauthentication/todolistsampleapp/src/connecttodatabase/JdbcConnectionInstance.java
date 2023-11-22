package connecttodatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnectionInstance {

    public static Connection getConnectionInstance() throws SQLException,ClassNotFoundException {
		
    	//Getting mysql database info
    	final String url="jdbc:mysql://localhost:3306/todolistdemo";
    	final String username="root";
    	final String password="baburu@123";
    	
    	//loading and registering Driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,username,password);
		
		//returning Connection object 
		return con;
	}
    public static void closeConnectionInstance(Connection con) {
    	try{
    		con.close();
    	}
    	catch(SQLException e) {
    		e.printStackTrace();
    	}
    }
}
