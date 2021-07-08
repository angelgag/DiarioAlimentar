package repositorios;
import java.util.ArrayList;

import beans.Usuario;

public class RepositorioUsuario extends RepositorioGenerico<Usuario>{
	
	private static RepositorioUsuario instance;
	public RepositorioUsuario() {
		super();
	}
	
	public static RepositorioUsuario getInstance() {
		if(instance == null) {
			instance = new RepositorioUsuario();
		}
		return instance;
	}
}
