package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import beans.Alimento;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
//import controladores.ControladorRefeicao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.control.cell.PropertyValueFactory;
//import javafx.scene.control.cell.PropertyValueFactory;
import repositorios.RepositorioAlimento;

//import repositorios.RepositorioAlimento;
//import repositorios.RepositorioUsuario;
//import repositorios.RepositorioRefeicao;

public class DiarioAlimentarController implements Initializable {
	
	//instanciando repositorios

    private Scene scene;
    private Stage stage;
	
	//criando elementos da tela
	@FXML
	Button btnSalvar, btnVoltar, btnAdicionarCafeDaManha, btnAdicionarAlmoco, btnAdicionarJanta, btnAdicionarLanche,
	btnExcluiCafeDaManha, btnExcluiAlmoco, btnExcluiJanta, btnExcluiLanche;
	
	@FXML
	TableView<Alimento> tvCafeDaManha;
	@FXML
	TableColumn<Alimento, String> tcCafeDaManha;
	@FXML
	TableColumn<Alimento, String> tcCDMCalorias;
	@FXML
	TableColumn<Alimento, String> tcCDMCarboidrato;
	@FXML
	TableColumn<Alimento, String> tcCDMProteina;
	@FXML
	TableColumn<Alimento, String> tcCDMGordura;
	@FXML
	TableColumn<Alimento, String> tcCDMPorcao;
	
	@FXML
	TableView<Alimento> tvAlmoco;
	@FXML
	TableColumn<Alimento, String> tcAlmoco;
	@FXML
	TableColumn<Alimento, String> tcACalorias;
	@FXML
	TableColumn<Alimento, String> tcACarboidrato;
	@FXML
	TableColumn<Alimento, String> tcAProteina;
	@FXML
	TableColumn<Alimento, String> tcAGordura;
	@FXML
	TableColumn<Alimento, String> tcAPorcao;
	
	@FXML
	TableView<Alimento> tvJanta;
	@FXML
	TableColumn<Alimento, String> tcJanta;
	@FXML
	TableColumn<Alimento, String> tcJCalorias;
	@FXML
	TableColumn<Alimento, String> tcJCarboidrato;
	@FXML
	TableColumn<Alimento, String> tcJProteina;
	@FXML
	TableColumn<Alimento, String> tcJGordura;
	@FXML
	TableColumn<Alimento, String> tcJPorcao;
	
	@FXML
	TableView<Alimento> tvLanche;
	@FXML
	TableColumn<Alimento, String> tcLanche;
	@FXML
	TableColumn<Alimento, String> tcLCalorias;
	@FXML
	TableColumn<Alimento, String> tcLCarboidrato;
	@FXML
	TableColumn<Alimento, String> tcLProteina;
	@FXML
	TableColumn<Alimento, String> tcLGordura;
	@FXML
	TableColumn<Alimento, String> tcLPorcao;
	
//----------------------------------------------------------------------
	@FXML
	TableView<Alimento> tvListaAlimentos;
	@FXML
	TableColumn<Alimento, String> tcListaAlimentos;	
	
	//metodo que salva as alteracoes do diario alimentar
	@FXML
	public void btnSalvarPressionado(ActionEvent event) {
		
	}
	
	@FXML
	public void btnVoltarPressionado(ActionEvent event) throws IOException {
    	BorderPane homeClientePane = FXMLLoader.load(getClass()
    			.getResource("HomeCliente.fxml"));
    	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    	this.scene = new Scene(homeClientePane);
    	stage.setScene(scene);
    	stage.show();		
	}
	
	@FXML
	public void btnExcluiCafeDaManhaClick(ActionEvent event) {
		
	}
	
	@FXML
	public void btnAdicionarLancheClick(ActionEvent event) {
		
	}
	
	@FXML
	public void btnAdicionarJantaClick(ActionEvent event) {
		
	}
	
	@FXML
	public void btnAdicionarAlmocoClick(ActionEvent event) {
		
	}
	
	@FXML
	public void btnExcluiLancheClick(ActionEvent event) {
		
	}
	
	@FXML
	public void btnExcluiAlmocoClick(ActionEvent event) {
		
	}
	
	@FXML
	public void btnExcluiJantaClick(ActionEvent event) {
		
	}
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		tvListaAlimentos.setItems(getAlimentos());
		//tcListaAlimentos.get
		//tvListaAlimentos.getColumns().add(tcListaAimentos);
		
	}
	
	@FXML
	public void btnAdicionarCafeDaManhaClick(ActionEvent event) {
		ObservableList<Alimento> alimentoSelecionado;//, todosAlimentos;
		//todosAlimentos = tvListaAlimentos.getItems();
		alimentoSelecionado = tvListaAlimentos.getSelectionModel().getSelectedItems(); //pega item selecionado
		//alimentoSelecionado.forEach(null);
		tvCafeDaManha.setItems(alimentoSelecionado);
		
		//Alimento alimento = new Alimento();
		//
	}
	
	private ObservableList<Alimento> getAlimentos(){
		ObservableList<Alimento> alimentos = FXCollections.observableArrayList();
		//double totalCarboidrato, total;
		alimentos.addAll(RepositorioAlimento.getInstance().recover());
		return alimentos;
		 
	}
	
}

		/*return FXCollections.observableArrayList(
				new Alimento("feij?o", 10, 20, 30, 40, 50, 70, 60),
				new Alimento("arroz", 10, 20, 30, 40, 50, 70, 60),
				new Alimento("macarr?o", 10, 20, 30, 40, 50, 70, 60),
				new Alimento("ma??", 10, 20, 30, 40, 50, 70, 60),
				new Alimento("peixe", 10, 20, 30, 40, 50, 70, 60)
				);*/