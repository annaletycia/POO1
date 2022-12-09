package pratica4;

public class Conta {
	protected int cpf, nro_conta;
	protected float saldo;
	
	public Conta(int cpf, int num_conta, float saldo) {
		this.setCpf(cpf);
		this.setNro_conta(num_conta);
		this.setSaldo(saldo);
	}
	
	public String sacar(float val) {
		if(val>this.saldo) {
			return "saldo insuficiente";
		}else {
			this.saldo = this.saldo - val;
			return "valor sacado";
		}
	}
	public void depositar(float val) {
		this.saldo = this.saldo + val;
	}
	
	
	//getters e setters:
	public int getNro_conta() {
		return nro_conta;
	}

	public void setNro_conta(int nro_conta) {
		this.nro_conta = nro_conta;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
}
