package gui;


import java.io.IOException;

import beans.*;
import repositorios.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class CadastroController {
    @FXML
    private CheckBox cbCliente;

    @FXML
    private CheckBox cbNutricionista;

    @FXML
    private TextField txtEmailC;

    @FXML
    private TextField txtNomeC;

    @FXML
    private TextField txtNomeN;

    @FXML
    private TextField txtEmailN;

    @FXML
    private PasswordField txtSenhaN;

    @FXML
    private PasswordField txtSenhaC;

    @FXML
    private Button btnConcluirC;
    
    @FXML
    private Button btnConcluirN;

    @FXML
    private Label lbCadastro;

    @FXML
    private DatePicker dataNascimentoC;

    @FXML
    private DatePicker dataNascimentoN;
    
    @FXML
    private TextField txtPesoC;

    @FXML
    private TextField txtAlturaC;
    
    @FXML
    private TextField txtCRN;
    
    private Scene scene;
    private Stage stage;
    
    @FXML
    void initialize() {
    	
    }

    @FXML
    public void btnConcluirCClick (ActionEvent event) throws ElementoJaExisteException {
    	//verificacao de campos
    	if(txtNomeC.getText().trim().isEmpty() || txtSenhaC.getText().trim()
    			.isEmpty() || txtEmailC.getText().trim().isEmpty() || txtPesoC
    			.getText().trim().isEmpty() || txtAlturaC.getText().trim()
    			.isEmpty() ||  dataNascimentoC.getValue() == null) {
    		Alert alert = new Alert(AlertType.CONFIRMATION);
        	alert.setTitle("Erro ao cadastrar");
        	alert.setContentText("Preencha todos os campos antes de concluir.");
        	alert.show();
    	} else {
        	Cliente c = new Cliente(this.txtNomeC.getText(),
        			this.txtEmailC.getText(), this.txtSenhaC.getText(),
        			this.dataNascimentoC.getValue(), 
        			Double.parseDouble(this.txtPesoC.getText()),
        			Double.parseDouble(this.txtAlturaC.getText()));
        	RepositorioCliente.getInstance().create(c);
        	try {
            	BorderPane cadastroPane = FXMLLoader.load(getClass()
            			.getResource("Login.fxml"));
            	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            	this.scene = new Scene(cadastroPane);
            	stage.setScene(scene);
            	stage.show();
        	} catch (IOException e) {
        		e.printStackTrace();
        	}
    	}
    }
    
    @FXML
    public void btnConcluirNClick (ActionEvent event) throws ElementoJaExisteException {
    	//verificação de campos
    	if(txtNomeN.getText().trim().isEmpty() || txtSenhaN.getText().trim()
    			.isEmpty() || txtEmailN.getText().trim().isEmpty() || txtCRN
    			.getText().trim().isEmpty() ||  dataNascimentoN.getValue() == null) {
    		Alert alert = new Alert(AlertType.CONFIRMATION);
        	alert.setTitle("Erro ao cadastrar");
        	alert.setContentText("Preencha todos os campos antes de concluir.");
        	alert.show();
    	} else {
        	Nutricionista n = new Nutricionista(this.txtNomeN.getText(),
        			this.txtEmailN.getText(), this.txtSenhaN.getText(),
        			this.dataNascimentoN.getValue(), Integer.parseInt(this.txtCRN.getText()));
        	RepositorioNutricionista.getInstance().create(n);
        	try {
            	BorderPane cadastroPane = FXMLLoader.load(getClass()
            			.getResource("Login.fxml"));
            	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            	this.scene = new Scene(cadastroPane);
            	stage.setScene(scene);
            	stage.show();
        	} catch (IOException e) {
        		e.printStackTrace();
        	}
    	}
    }
    
    @FXML
    public void cbClienteClick (ActionEvent e) {
    	if (cbCliente.isSelected()) {
        	cbNutricionista.setSelected(false);
    		txtNomeC.setDisable(false);
        	txtEmailC.setDisable(false);
        	txtSenhaC.setDisable(false);
        	dataNascimentoC.setDisable(false);
        	txtPesoC.setDisable(false);
        	txtAlturaC.setDisable(false);
        	btnConcluirC.setDisable(false);
        	
        	btnConcluirN.setDisable(true);
        	txtNomeN.setDisable(true);
        	txtEmailN.setDisable(true);
        	txtSenhaN.setDisable(true);
        	dataNascimentoN.setDisable(true);
        	txtCRN.setDisable(true);
        	
    	} else {
        	cbNutricionista.setSelected(true);
    		txtNomeC.setDisable(true);
        	txtEmailC.setDisable(true);
        	txtSenhaC.setDisable(true);
        	dataNascimentoC.setDisable(true);
        	txtPesoC.setDisable(true);
        	txtAlturaC.setDisable(true);
        	btnConcluirC.setDisable(true);
    	}
    }
    @FXML
    public void cbNutricionistaClick (ActionEvent e) {
    	if (cbNutricionista.isSelected()) {
        	cbCliente.setSelected(true);
    		txtNomeC.setDisable(true);
        	txtEmailC.setDisable(true);
        	txtSenhaC.setDisable(true);
        	dataNascimentoC.setDisable(true);
        	txtPesoC.setDisable(true);
        	txtAlturaC.setDisable(true);
        	btnConcluirC.setDisable(true);
        	
        	btnConcluirN.setDisable(false);
        	txtNomeN.setDisable(false);
        	txtEmailN.setDisable(false);
        	txtSenhaN.setDisable(false);
        	dataNascimentoN.setDisable(false);
        	txtCRN.setDisable(false);
        	
    	} else {
        	cbCliente.setSelected(true);
    		txtNomeC.setDisable(false);
        	txtEmailC.setDisable(false);
        	txtSenhaC.setDisable(false);
        	dataNascimentoC.setDisable(false);
        	txtPesoC.setDisable(false);
        	txtAlturaC.setDisable(false);
        	btnConcluirC.setDisable(false);
    	}
    }

}
