package jvbank;

import java.time.LocalDate;

public abstract class Funcionario {

	private final double INDICE = 0.05;//constante
	
	private String nome;
	private String cpf;
	private String ctps;
	private double salario;
	private LocalDate dataDeAdmissao;
	
	
	public Funcionario() {
		
	}

	public Funcionario(String nome, String cpf, String ctps, double salario, LocalDate dataDeAdmissao) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.ctps = ctps;
		this.salario = salario;
		this.dataDeAdmissao = dataDeAdmissao;
	}

	/**
	 * Calculo de bonus para todos os funcionarios
	 * 
	 * @version 1.0
	 * @author LENOVO
	 * @since 01/04/2022
	 * @author LENOVO
	 * @return valor calculado da bonifica��o
	 * 
	 */
	
	public double getBonus() {
		return this.salario*INDICE;
	}
	
		
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCtps() {
		return ctps;
	}

	public void setCtps(String ctps) {
		this.ctps = ctps;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public LocalDate getDataDeAdmissao() {
		return dataDeAdmissao;
	}

	public void setDataDeAdmissao(LocalDate dataDeAdmissao) {
		this.dataDeAdmissao = dataDeAdmissao;
	}
	
	@Override
	public String toString() {
		
		return "Nome"+getNome()+"\n CPF:"+getCpf()+"\n CTPS:"+getCtps()+"\n Data Admissao:"+getDataDeAdmissao()+"\n Salario:"+getSalario();
	}
	
	// return "Nome: %s "\n CTPS: %s"\n Data Admissao: %s"\n Salario: %2.f ", getNome(), getSalario();
	
	
	//return "Nome"+getNome()+"\n CPF:"+getCpf()+"\n CTPS:"+getCtps()+"\n Data Admissao:"+getDataDeAdmissao()+"\n Salario:"+getSalario()+"\n Bonus:"+getBonus();
}
