package controladores;
import java.util.ArrayList;
import java.util.List;

import beans.Usuario;
import repositorios.ElementoJaExisteException;
import repositorios.ElementoNaoExisteException;
import repositorios.RepositorioUsuario;



public class ControladorUsuario {

	private RepositorioUsuario repoUsuario;

	public ControladorUsuario(RepositorioUsuario repoUsuario) {
		super();
		this.repoUsuario = repoUsuario;
	}
	
	public void createUsuario(Usuario usuario) throws ElementoJaExisteException {
		this.repoUsuario.create(usuario);	
	}
	
	public void removeUsuario(Usuario usuario) throws ElementoNaoExisteException {
		this.repoUsuario.delete(usuario);
	}
	
	public void updateUsuario(Usuario usuario) throws ElementoNaoExisteException {
		this.repoUsuario.update(usuario);
	}
	public List<Usuario> listarUsuario(){
		return this.repoUsuario.recover();
	}
}
