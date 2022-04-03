package jvbank;

public class Pessoa {

	private String nome;
	private String cpf;
	private String rg;
	private String profissao;
	private String email;
	private String telefone;
	
	public Pessoa() {
		// metodo construtor defaul = preenchimento dos atributos é opciona
	}
	
	public Pessoa(String nome,String cpf,String rg){
	this.nome = nome;
	this.cpf = cpf;
	this.rg = rg;
	}
	
	public Pessoa(String nome, String cpf, String rg, String profissao, String email, String telefone) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.profissao = profissao;
		this.email = email;
		this.telefone = telefone;
	}
	

	public String getNome() { //exibe os objetos
		return nome;
	}
	public void setNome(String nome) { //grava os objetos nos atributos
		this.nome = nome;
	}
	public String getcpf() {
		return cpf;
	}
	public void setcpf(String cpf) {
		this.cpf = cpf;
	}
	public String getrg() {
		return rg;
	}
	public void setrg(String rg) {
		this.rg = rg;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
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