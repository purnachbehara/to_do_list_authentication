package user;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import connecttodatabase.JdbcConnectionInstance;
import loginpannel.Authentication;

public class GetUserDetails {
	
	public UserPasswordContainer getUserDetails() {
		
	UserPasswordContainer pvalue=new UserPasswordContainer();
	try {
		
		//Getting the connection instance
		Connection con=JdbcConnectionInstance.getConnectionInstance();
		
		//check for connection
		//if(!con.isClosed())System.out.println("database connection established");
		
	String querystring="select * from todolistdemo where email=?";
	PreparedStatement statement = con.prepareStatement(querystring) ;
	statement.setString(1,Authentication.getUserMailFromLoginPannel());
	
	ResultSet results=statement.executeQuery();
	
	while(results.next()) {
	//System.out.println(results.getString(1));
		pvalue.setPassvalue(results.getString(2));
	}
	
	JdbcConnectionInstance.closeConnectionInstance(con);
	//if(con.isClosed())System.out.println("database connection closed");
	
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	return pvalue;
	}
}
