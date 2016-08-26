package br.com.fainor.model;

public class Professor extends Pessoa {
	//private Long id;
	// private String nome;
	// private String cpf;
	// private String email;
	private String matricula;
	//private List<Aula> aulas = new ArrayList<>();
	//private String senha;

	
	
	public String getMatricula() {
		return matricula;
	}

	public Professor(Long id, String nome, String cpf, String matricula) {
		super(id, nome, cpf);
		this.matricula = matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}



}
