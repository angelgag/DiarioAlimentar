package beans;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Alimento {

	//usando o simpleproperty fica mais simples de passar as informações para a tabela
	private SimpleStringProperty nome;
	private SimpleIntegerProperty peso;
	private SimpleIntegerProperty carboidrato;
	private SimpleIntegerProperty proteina;
	private SimpleIntegerProperty gordura;
	private SimpleIntegerProperty calorias;
	//private Integer idref;
	private Integer idNutricionista;
	
	//para podermos tratar os dados direitinho, esses aux foram criados 
	protected int auxCarboidrato;
	protected int auxPeso;
	protected int auxProteina;
	protected int auxGordura;
	protected int auxCalorias;


	public Alimento(String nome, Integer peso, Integer carboidrato, Integer proteina,
			Integer gordura, Integer calorias, Integer idNutricionista) {
		super();
		this.nome = new SimpleStringProperty(nome);
		this.peso = new SimpleIntegerProperty(peso);
		this.carboidrato = new SimpleIntegerProperty(carboidrato);
		this.proteina = new SimpleIntegerProperty(proteina);
		this.gordura = new SimpleIntegerProperty(gordura);
		this.calorias = new SimpleIntegerProperty(calorias);
		//this.idref = idref;
		this.idNutricionista = idNutricionista;
		
		this.auxCarboidrato = carboidrato;
		this.auxPeso = peso;
		this.auxProteina = proteina;
		this.auxGordura = gordura;
		this.auxCalorias = calorias;
	}
	
	public Alimento() {
		
	}

	public String getNome() {
		return this.nome.get();
	}

	public void setNome(String nome) {
		this.nome = new SimpleStringProperty(nome);
	}
	
	public int getPeso() {
		return this.peso.get();
	}

	public void setPeso(Integer peso) {
		this.peso = new SimpleIntegerProperty(peso);
		this.auxPeso = peso;
	}
 

	public int getCarboidrato () {
		return this.auxCarboidrato / 100 * this.auxPeso;
	}
	public int getProteina () {
		return this.auxProteina / 100 * this.auxPeso;
	}
	public int getGordura () {
		return this.auxGordura / 100 * this.auxPeso;
	}
	public int getCalorias () {
		return this.auxCalorias/ 100 * this.auxPeso;
	}
}
