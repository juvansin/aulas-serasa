package jvbank;

public class PessoaHeranca {

	private String nome;
	private String email;
	private String telefone;
	
	public PessoaHeranca() {
		// metodo construtor defaul = preenchimento dos atributos é opciona
	}
	
	public PessoaHeranca(String nome,String email, String telefone) {
		super();
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}
	public String getNome() { //exibe os objetos
		return nome;
	}
	public void setNome(String nome) { //grava os objetos nos atributos
		this.nome = nome;
	}	
	public String getemail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
		
}