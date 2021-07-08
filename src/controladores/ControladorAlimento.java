package controladores;


import java.util.ArrayList;
import java.util.List;

import beans.Alimento;
import repositorios.ElementoJaExisteException;
import repositorios.ElementoNaoExisteException;
import repositorios.RepositorioAlimento;

public class ControladorAlimento {
	private RepositorioAlimento repoAlimento;

	public ControladorAlimento(RepositorioAlimento repoAlimento) {
		super();
		this.repoAlimento = repoAlimento;
	}
	
	public void createUsuario(Alimento alimento) throws ElementoJaExisteException {
		this.repoAlimento.create(alimento);	
	}
	
	public void removeUsuario(Alimento alimento) throws ElementoNaoExisteException {
		this.repoAlimento.delete(alimento);
	}
	
	public void updateUsuario(Alimento alimento) throws ElementoNaoExisteException {
		this.repoAlimento.update(alimento);
	}
	public List<Alimento> listarAlimento(){
		return this.repoAlimento.recover();
	}

}
