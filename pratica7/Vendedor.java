package pratica7;

public class Vendedor extends Funcionario implements Imprimivel {
	private double comissao;
	
	public Vendedor(String nome, String mat, double salBase, double comissao) {
		super(nome, mat, salBase);
		setComissao(comissao);
	}

	@Override
	public double calculaSalario() {
		return this.getSalario_base() + this.getComissao();
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	@Override
	public String mostrarDados() {
		System.out.println("Nome: "+this.getNome());
		System.out.println("Matr�cula: "+this.getMatricula());
		System.out.println("Sal�rio base: R$"+this.getSalario_base());
		System.out.println("Comiss�o: R$"+this.getComissao());
		System.out.println("Sal�rio: R$"+this.calculaSalario());
		return null;
	}
	
	
}
