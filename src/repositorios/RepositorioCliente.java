package repositorios;
import java.time.LocalDate;
import java.util.List;

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
	
	Cliente c = new Cliente("cli", "cli", "cli", LocalDate.now(), 10, 1);
	@Override
    public List<Cliente> recover() {
        //return Collections.unmodifiableList(this.elements);
		this.elements.add(c);		
    	return this.elements;
    }
	
}
