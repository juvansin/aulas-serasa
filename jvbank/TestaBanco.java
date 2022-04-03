package jvbank;

public class TestaBanco {

	public static void main(String[] args) {
	
//	Pessoa pessoaNumero1 = new Pessoa(); //criar uma intancia = copia
//	pessoaNumero1.nome = "José das Couves";
//	pessoaNumero1.profissao = "Agricultor";
//	pessoaNumero1.cpf = "871.165.521-62";
//	
//	System.out.println("Nome:"+pessoaNumero1.nome);
//	System.out.println("Profissao:"+pessoaNumero1.profissao);
//	System.out.println("CPF:"+pessoaNumero1.cpf);
//	
//	Pessoa pessoaNumero2 = pessoaNumero1;
//	pessoaNumero2.nome = "João dos Tomates";
//	
//	System.out.println(" ================== ");
//	
//	System.out.println("Nome:"+pessoaNumero1.nome);
//	System.out.println("Nome:"+pessoaNumero2.nome);

	
		
//		Pessoa pessoaNova = new Pessoa(); //instaciar a classe pessoa
//		pessoaNova.setNome("Jose das Couves");
//		System.out.println("Nome:"+ pessoaNova.getNome());
//		
//		System.out.println(" = = = = = = = = = = = = = = ");
//		
//		Pessoa pessoaComConstrutor1 = new Pessoa("João dos Tomates","607.369.658-23","123.456-78");
//		
//		System.out.println("Nome"+pessoaComConstrutor1.getNome());
//		System.out.println("CPF:"+pessoaComConstrutor1.getcpf());
//		System.out.println("RG:"+pessoaComConstrutor1.getrg());

	Conta conta1 = new Conta();
	conta1.setAgencia(1234);
	conta1.setNumeroConta(7889);
//	conta1.setSaldo(1000000.50); >> não se deve alterar diretamente essa informação. Ela apenas pode ser exibida
	conta1.setTitular("Juliana Vansin");
	
	conta1.depositar(100.0);
	
	System.out.println("Agencia:"+conta1.getAgencia());
	System.out.println("Conta:"+conta1.getNumeroConta());
	System.out.println("Titular:"+conta1.getTitular());
	System.out.println("Salto Atual:"+conta1.getSaldo());
	
conta1.sacar(20.0);
System.out.println("Saldo Atual:"+conta1.getSaldo());

System.out.printf("Saldo Atual: R$ %.2f \n",conta1.getSaldo());// formatação de casas decimais

if (conta1.sacar(20.0)) {
	System.out.println("Saque efetuado com sucesso!");
}else {
	System.out.println("Verifique valor do saque!");
}
	

System.out.printf("Saldo Atual: R$ %.2f \n",conta1.getSaldo());


Conta conta2 = new Conta();
conta2.setAgencia(5588);
conta2.setNumeroConta(2234);

conta1.transferir(50.0, conta2);

System.out.printf("Saldo Juliana: R$ %.2f \n",conta1.getSaldo());
System.out.printf("Saldo Nadia: R$ %.2f \n",conta2.getSaldo());

}
}
