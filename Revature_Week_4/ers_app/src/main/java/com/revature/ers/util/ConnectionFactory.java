package com.revature.ers.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

// Register a connection
public class ConnectionFactory {
	
	private static ConnectionFactory cf = null;
	private static Boolean build = true;
	
	private ConnectionFactory() {
		build = false;
	}
	
	public static synchronized ConnectionFactory getInstance() {

		return (build) ? cf = new ConnectionFactory() : cf;
	}
	
	public Connection getConnection() {
		Connection conn = null;
		Properties prop = new Properties();
		
		try {
				prop.load(new FileReader("C:\\Users\\gamin\\my_git_repos\\"
						+ "1803-MAR26-Java\\Antonio_Marrero_Code\\Revature_Week_4\\"
						+ "ers_app\\src\\main\\resources\\application.properties"));
				
				Class.forName(prop.getProperty("driver"));
				
				conn = DriverManager.getConnection(
						prop.getProperty("url"),
						prop.getProperty("usr"),
						prop.getProperty("pwd"));
			

		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
		
		return conn;
		
	}

}
