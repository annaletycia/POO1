package pratica4;

public class EspecialConta extends Conta {
	
	private float limite;
	
	public EspecialConta(int cpf, int num_conta, float saldo,float limite) {
		super(cpf, num_conta, saldo);
		this.setLimite(limite);
	}
	
	public String NovoSaque(float valor) {
		if(valor>this.limite) {
			return "limite excedido";
		}else {
			this.saldo = this.saldo - valor;
			return "valor sacado";
		}
	}
	
	//setters e getters
	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

}
