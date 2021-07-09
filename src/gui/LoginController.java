package gui;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import beans.Cliente;
import beans.Nutricionista;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import repositorios.*;

public class LoginController {
	
    private Scene scene;
    private Stage stage;
    
    @FXML
    private Label lblLogin;

    @FXML
    private TextField txtEmail;

    @FXML
    private PasswordField txtSenha;

    @FXML
    private Button btnLogin;

    @FXML
    private Button btnCadastro;
    
    //private int autenticacao;
    private List<Cliente> clientes = RepositorioCliente.getInstance().recover();
    private List<Nutricionista> nutricionistas = RepositorioNutricionista.getInstance().recover();
    
    @FXML
    void cadastro(ActionEvent event) {

    }
    @FXML
    private void initialize() {
    	
    }
    @FXML
    public void btnCadastroClick (ActionEvent event) {
    	System.out.println("indo para cadastro");
    	try {
        	BorderPane cadastroPane = FXMLLoader.load(getClass()
        			.getResource("Cadastro.fxml"));
        	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        	this.scene = new Scene(cadastroPane);
        	stage.setScene(scene);
        	stage.show();
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
    }
    
    @FXML
    public void btnLoginClick (ActionEvent event) {
    	boolean verificar = false;
    	
    	if (verificar == false) {
    		for (Nutricionista n : RepositorioNutricionista.getInstance().recover()) {
    			String emailR = n.getEmail();
    			String senhaR = n.getSenha();
    			String emailI = txtEmail.getText();
    			String senhaI = txtSenha.getText();
    			System.out.println(emailR.length());
    			System.out.println(emailI.length());
    			System.out.println(senhaR.length());
    			System.out.println(senhaI.length());
    			if (emailR.equals(emailI) && senhaR.equals(senhaI)) {
    				System.out.println("erro ao tentar logar");
    	    		verificar = true;
    	        	
    	    		try {
    	            	Pane homeNutricionistaPane = FXMLLoader.load(getClass()
    	            			.getResource("HomeNutricionista.fxml"));
    	            	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    	            	this.scene = new Scene(homeNutricionistaPane);
    	            	stage.setScene(scene);
    	            	stage.show();
    	        	} catch (IOException e) {
    	        		e.printStackTrace();
    	        	}
    	    		break;
    	    	} 
    	    	}
    	}
    	if (verificar == false) {
        	Alert alert = new Alert(AlertType.CONFIRMATION);
        	alert.setTitle("Erro ao tentar logar");
        	alert.setContentText("Email e senha incorretos, digite novamente");
    	} else {
    		System.out.println("erro ao tentar logaaaaar");
    	}
    	/*
    	for (Cliente c : this.clientes) {
    	if (c.getEmail() == txtEmail.getText() && c.getSenha() == txtSenha.getText()) {
    		
    		verificar = true;
        	
    		try {
            	BorderPane diarioAlimentarPane = FXMLLoader.load(getClass()
            			.getResource("DiarioAlimentar.fxml"));
            	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            	this.scene = new Scene(diarioAlimentarPane);
            	stage.setScene(scene);
            	stage.show();
        	} catch (IOException e) {
        		e.printStackTrace();
        	}
    		break;
    	} 
    	}*/
    }
    
}