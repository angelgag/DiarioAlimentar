package repositorios;
import java.util.ArrayList;

import beans.Alimento;

public class RepositorioAlimento extends RepositorioGenerico<Alimento> {

	private static RepositorioAlimento instance;
	public RepositorioAlimento() {
		super();
	}
	
	public static RepositorioAlimento getInstance() {
		if(instance == null) {
			instance = new RepositorioAlimento();
		}
		return instance;
	}
}
