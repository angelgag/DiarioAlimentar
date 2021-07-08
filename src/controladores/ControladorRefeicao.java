package controladores;

import java.util.List;

import beans.Refeicao;
import beans.Usuario;
import repositorios.ElementoJaExisteException;
import repositorios.ElementoNaoExisteException;
import repositorios.RepositorioRefeicao;

public class ControladorRefeicao {

	private RepositorioRefeicao repoRefeicao;

	public ControladorRefeicao(RepositorioRefeicao repoRefeicao) {
		super();
		this.repoRefeicao = repoRefeicao;
	}
	
	public void createUsuario(Refeicao refeicao) throws ElementoJaExisteException {
		this.repoRefeicao.create(refeicao);	
	}
	
	public void removeUsuario(Refeicao refeicao) throws ElementoNaoExisteException {
		this.repoRefeicao.delete(refeicao);
	}
	
	public void updateUsuario(Refeicao refeicao) throws ElementoNaoExisteException {
		this.repoRefeicao.update(refeicao);
	}
	public List<Refeicao> listarRefeicao(){
		return this.repoRefeicao.recover();
	}
}