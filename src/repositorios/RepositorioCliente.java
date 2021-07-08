package repositorios;
import java.util.ArrayList;

import beans.Cliente;

public class RepositorioCliente extends RepositorioGenerico<Cliente>{
	
	private static RepositorioCliente instance;
	public RepositorioCliente() {
		super();
	}
	
	public static RepositorioCliente getInstance() {
		if(instance == null) {
			instance = new RepositorioCliente();
		}
		return instance;
	}
}
