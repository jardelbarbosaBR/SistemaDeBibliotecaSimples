package br.com.kaezansystem.biblioteca.config;

import java.io.InputStream;
import java.util.Properties;

public class ConfiguracaoProperties {

	public Properties getProperties() {
		Properties properties = null;
		try{
			Properties proper = new Properties();
			InputStream input = getClass().getClassLoader().getResourceAsStream("config.properties");
			proper.load(input);
			
			return proper;
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		return properties;
	}
	
}
