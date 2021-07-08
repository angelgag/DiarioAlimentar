package gui;

import java.net.URL;
import java.util.ResourceBundle;

import beans.Alimento;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
//import controladores.ControladorRefeicao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/*import repositorios.RepositorioAlimento;
import repositorios.RepositorioUsuario;
import repositorios.RepositorioRefeicao;*/

public class DiarioAlimentarController implements Initializable {
	
	//instanciando repositorios
	
	//criando elementos da tela
	@FXML
	Button btnSalvar;
	@FXML
	Button btnVoltar;
	@FXML
	TableView<Alimento> tvCafeDaManha;
	@FXML
	TableColumn<Alimento, String> tcListaCafeDaManha;
	@FXML
	TableView<Alimento> tvAlmoco;
	@FXML
	TableColumn<Alimento, String> tcListaAlmoco;
	@FXML
	TableView<Alimento> tvJanta;
	@FXML
	TableColumn<Alimento, String> tcListaJanta;
	@FXML
	TableView<Alimento> tvLanche;
	@FXML
	TableColumn<Alimento, String> tcListaLanche;
	
	//metodo que salva as alteracoes do diario alimentar
	@FXML
	public void btnSalvarPressionado(ActionEvent event) {
		
	}
	
	@FXML
	public void btnVoltarPressionado(ActionEvent event) {
		
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		tcListaAlmoco.setCellValueFactory(new PropertyValueFactory<>("nome"));
		tcListaCafeDaManha.setCellValueFactory(new PropertyValueFactory<>("nome"));
		tcListaJanta.setCellValueFactory(new PropertyValueFactory<>("nome"));
		tcListaLanche.setCellValueFactory(new PropertyValueFactory<>("nome"));
		/*
		tvCafeDaManha.setItems(ListaDeAlimentos());
		tvAlmoco.setItems(ListaDeAlimentos());
		tvJanta.setItems(ListaDeAlimentos());
		tvLanche.setItems(ListaDeAlimentos());
		*/
	}
	/*
	private ObservableList<Alimento> ListaDeAlimentos(){
		return FXCollections.observableArrayList(
				new Alimento("feijão", 10, 20, 30, 40, 50, 70, 60),
				new Alimento("arroz", 10, 20, 30, 40, 50, 70, 60),
				new Alimento("macarrão", 10, 20, 30, 40, 50, 70, 60),
				new Alimento("maçã", 10, 20, 30, 40, 50, 70, 60),
				new Alimento("peixe", 10, 20, 30, 40, 50, 70, 60)
				);
	}*/
	
}
