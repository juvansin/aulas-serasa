package jvbank;

public class ContaCorrente extends Conta {

	private double limite;
	private double SaldoComLimite;
	
	
	public ContaCorrente(){
		this.limite = 500.0;
		this.SaldoComLimite = super.saldo+limite;
	}
	
	@Override
	public boolean sacar(double valor){
		 if(valor > 0 && saldo >= valor){
			saldo -= valor;
			return true;
		}else if (valor <= (SaldoComLimite)){
			saldo -= valor;
			limite +=saldo;
			return true;
		}
	return false;
}
	
	@Override
	public boolean transferir(double valor, Conta destinatario){
		double saldoTotal = saldo + limite;
		if (valor>0 && saldoTotal >=valor) {
			saldoTotal -= valor;
			destinatario.depositar(valor);
			return true;
		}			
		return false;
	}
	
	
	
	public double getLimite(){
		return this.limite;
	}
	
	public double getSaldoComLimite() {
		this.SaldoComLimite = this.limite + super.saldo;
		return this.SaldoComLimite;
	}
	
}
