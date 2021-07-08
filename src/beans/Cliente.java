package beans;

import java.time.LocalDate;

public class Cliente extends Usuario {

	private double peso;
	private double altura;
	
	public Cliente(String nome, String email, String senha, LocalDate dataNascimento, double peso,
			double altura) {
		super(nome,senha, email, dataNascimento);
		this.peso= peso;
		this.altura= altura;
		
	}
	

}
