package pratica4;

public class PoupançaConta extends Conta{
	
	private float taxa_rendimento = 0.6f;
	
	public PoupançaConta(int cpf, int nro_conta, float saldo) {
		super(cpf,nro_conta,saldo);
	}
	public float calcularNovoSaldo() {
		return this.saldo+(this.saldo*this.taxa_rendimento);
	}
}
