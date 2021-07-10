package gui;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class HomeClienteController {
    private Scene scene;
    private Stage stage;
	
    @FXML
    private Label lbHome;
    
	@FXML
    private Button btnDiarioAlimentar;

    @FXML
    private Button btnPlanoAlimentar;
    
    @FXML
    private Button btnDeslogar;

    @FXML
    void btnDiarioAlimentarClick(ActionEvent event) {
    	try {
        	Parent root = FXMLLoader.load(getClass()
        			.getResource("DiarioAlimentar.fxml"));
        	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        	this.scene = new Scene(root);
        	stage.setScene(scene);
        	stage.show();
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
    }

    @FXML
    void btnPlanoAlimentarClick(ActionEvent event) {
    	try {
        	Parent root = FXMLLoader.load(getClass()
        			.getResource("PlanoAlimentar.fxml"));
        	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        	this.scene = new Scene(root);
        	stage.setScene(scene);
        	stage.show();
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
    }
    
    @FXML
    void btnDeslogarClick(ActionEvent event) {
    	try {
        	Parent root = FXMLLoader.load(getClass()
        			.getResource("Login.fxml"));
        	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        	this.scene = new Scene(root);
        	stage.setScene(scene);
        	stage.show();
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
    }
}
