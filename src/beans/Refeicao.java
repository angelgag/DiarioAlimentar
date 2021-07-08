package beans;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Refeicao {

	private ArrayList<Alimento> refeicao;
	private LocalDateTime hora;
	
	
	public Refeicao(ArrayList<Alimento> refeicao, LocalDateTime hora) {
		super();
		this.refeicao = refeicao;
		this.hora = hora;
	}
	public ArrayList<Alimento> getRefeicao() {
		return refeicao;
	}
	public void setRefeicao(ArrayList<Alimento> refeicao) {
		this.refeicao = refeicao;
	}
	public LocalDateTime getHora() {
		return hora;
	}
	public void setHora(LocalDateTime hora) {
		this.hora = hora;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hora == null) ? 0 : hora.hashCode());
		result = prime * result + ((refeicao == null) ? 0 : refeicao.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Refeicao other = (Refeicao) obj;
		if (hora == null) {
			if (other.hora != null)
				return false;
		} else if (!hora.equals(other.hora))
			return false;
		if (refeicao == null) {
			if (other.refeicao != null)
				return false;
		} else if (!refeicao.equals(other.refeicao))
			return false;
		return true;
	}
	

}
