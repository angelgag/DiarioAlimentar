package beans;

import java.time.LocalDate;

public class Nutricionista extends Usuario {
	
	private int CRN;

	public Nutricionista(String nome, String email, String senha, LocalDate dataNascimento, int CRN) {
		super(nome, email, senha, dataNascimento);
		this.CRN = CRN;
	}
	
	public Nutricionista() {
		
	}

	public int getCRN() {
		return CRN;
	}

	public void setCRN(int cRN) {
		CRN = cRN;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + CRN;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Nutricionista other = (Nutricionista) obj;
		if (CRN != other.CRN)
			return false;
		return true;
	}

}
