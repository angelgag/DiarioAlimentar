package gui;
import java.io.IOException;
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
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CadastroAlimentoController {
    
    private Scene scene;
    private Stage stage;
	
	@FXML
    private TextField txtNome;

    @FXML
    private TextField txtCalorias;

    @FXML
    private TextField txtPeso;

    @FXML
    private TextField txtCarboidrato;
    
    @FXML
    private TextField txtGordura;

    @FXML
    private TextField txtProteina;

    @FXML
    private Button btnSalvar;
    
    @FXML
    private Button btnVoltar;
    
    @FXML
    private Button btnDeslogar;
    
    @FXML
    private Label lblIdNutricionista;
    
    @FXML
    void initialize() {
    	
    }
    
    @FXML
    public void btnSalvarClick() {
    	//fazer configurações de salvar alimento
    	Alimento p = new Alimento(this.txtNome.getText(), Integer.parseInt(this.txtPeso.getText()),
    			Integer.parseInt(this.txtCarboidrato.getText()), Integer.parseInt(this.txtProteina.getText()),
    			Integer.parseInt(this.txtGordura.getText()), Integer.parseInt(this.txtCalorias.getText()),
    			Integer.parseInt(this.lblIdNutricionista.getText()));
        try {
        	RepositorioAlimento.getInstance().create(p);
        	
        	
        } catch (Exception e) {
        	Alert alert = new Alert(AlertType.CONFIRMATION);
        	alert.setTitle("Erro ao tentar adicionar alimento");
        	alert.setContentText("Por favor, adicione um alimento que não tenha sido adicionado antes");
        }        

    }
    
    @FXML
    public void btnVoltarClick(ActionEvent event) {
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
