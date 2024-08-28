package br.com.kaezansystem.biblioteca;



import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {
	
	private static Stage TelaPrincipal;


	
	@Override
	public void start(Stage primaryStage) throws Exception {
		TelaPrincipal = primaryStage;
		FXMLLoader root = new FXMLLoader(getClass().getResource("/views/TelaBiblioteca.fxml"));
		BorderPane telaPrincipal = root.load();
		Scene cenaPrincipal = new Scene(telaPrincipal);
		TelaPrincipal.setScene(cenaPrincipal);
		TelaPrincipal.setTitle("Sistema de Biblioteca Simples - SBS");
		TelaPrincipal.setMaximized(true);
		TelaPrincipal.show();
	}

	
	public static void main(String[] args) {
		launch(args);
		
	}

	
}
