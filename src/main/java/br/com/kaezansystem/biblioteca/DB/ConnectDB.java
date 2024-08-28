package br.com.kaezansystem.biblioteca.DB;



import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import br.com.kaezansystem.biblioteca.config.ConfiguracaoProperties;

public class ConnectDB {
	
	
	public Connection getConnection() {
		Connection conn = null;
		try {
			ConfiguracaoProperties config = new ConfiguracaoProperties();
			Properties props = config.getProperties();
			
			String DB_URL = props.getProperty("DB_URL");
			String DB_DRIVER = props.getProperty("DB_DRIVER");
			String DB_USER = props.getProperty("DB_USER");
			String DB_PASSWORD = props.getProperty("DB_PASSWORD");	
			
			Class.forName(DB_DRIVER);
			conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			return conn;
		}catch (Exception e) {
			System.out.println("Erro de conexão com o banco de dados");
			System.out.println(e);
		}
		return conn;
	}
}
