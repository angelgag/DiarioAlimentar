package repositorios;
import java.time.LocalDate;
import java.util.List;

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
	Nutricionista n = new Nutricionista("nut", "nut", "nut", LocalDate.now(), 123);
	
	@Override
    public List<Nutricionista> recover() {
        //return Collections.unmodifiableList(this.elements);
		this.elements.add(n);		
    	return this.elements;
    }
}
