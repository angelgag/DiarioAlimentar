package gui;
	
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	
	
	@Override
	public void start(Stage primaryStage) throws IOException {
			Parent loginPane = FXMLLoader.load(getClass().getResource("Login.fxml"));
			Scene scene = new Scene(loginPane);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("Diário Alimentar");
			
			primaryStage.show();

	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
