package br.com.curso.application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


/**
 * Esta classe representa a tela de login. Ela é a primeira classe a ser utilizada
 * pelo JavaFX, pois ela herda de Application, e contém o "main" do programa.
 * 
 *
 * @author Marcelo
 *
 */
public class Login extends Application {


	
	/**
	 * Herda da classe application, e é chamada quando é executado o "launch".
	 * 
	 * Recebe como parâmetro o primaryStage, que é a primeira janela do programa.
	 * 
	 * @see javafx.application.Application#start(javafx.stage.Stage)
	 */
	@Override
	public void start(Stage primaryStage) {
		
		try {
			AnchorPane root = (AnchorPane) FXMLLoader.load(getClass().getResource("/br/com/curso/view/login.fxml"));
			Scene scene = new Scene(root, 310, 160);
			primaryStage.setScene(scene);
			primaryStage.show();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

}
