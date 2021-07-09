package gui;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import beans.*;
import repositorios.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class HomeNutricionistaController {
    private Scene scene;
    private Stage stage;
	
	@FXML
	Button btnAdicionarAlimento;

	@FXML
	Button btnAdicionarRefeicao;

	@FXML
	Button btnAcompanharClientes;

	@FXML
	Button btnCriarRefeicao;
	
    @FXML
    private Button btnDeslogar;
	
	@FXML
	public void btnAdicionarAlimentoCick(ActionEvent event) {
    	try {
        	Parent root = FXMLLoader.load(getClass()
        			.getResource("CadastrarAlimento.fxml"));
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
	/*
	@FXML
	public void btnAdicionarRefeicaoCick() {
		//direcionar para tela de adicionar alimentos
	}

	@FXML
	public void btnAcompanharClientesCick() {
		//direcionar para tela de adicionar alimentos
	}

	@FXML
	public void btnCriarRefeicaoCick() {
		//direcionar para tela de adicionar alimentos
	}
	*/
}
