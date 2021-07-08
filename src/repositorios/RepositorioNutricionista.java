package repositorios;
import java.util.ArrayList;

import beans.Nutricionista;

public class RepositorioNutricionista extends RepositorioGenerico<Nutricionista>{
	
	private static RepositorioNutricionista instance;
	public RepositorioNutricionista() {
		super();
	}
	
	public static RepositorioNutricionista getInstance() {
		if(instance == null) {
			instance = new RepositorioNutricionista();
		}
		return instance;
	}
}
