package gui;
import java.io.IOException;
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
    			if (emailR.equals(emailI) && senhaR.equals(senhaI)) {
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
    		for (Cliente c : RepositorioCliente.getInstance().recover()) {
    			String emailR = c.getEmail();
    			String senhaR = c.getSenha();
    			String emailI = txtEmail.getText();
    			String senhaI = txtSenha.getText();
    			if (emailR.equals(emailI) && senhaR.equals(senhaI)) {
    	    		verificar = true;
    	        	
    	    		try {
    	            	BorderPane homeClientePane = FXMLLoader.load(getClass()
    	            			.getResource("HomeCliente.fxml"));
    	            	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    	            	this.scene = new Scene(homeClientePane);
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
        	alert.show();
    	} else {
    		System.out.println("login efetuado com sucesso");
    	}

    }
    
}