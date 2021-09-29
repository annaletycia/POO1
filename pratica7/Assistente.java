package pratica7;

public class Assistente extends Funcionario implements Imprimivel {

	public Assistente(String nome, String mat, double salBase) {
		super(nome, mat, salBase);
	}

	@Override
	public double calculaSalario() {
		return this.getSalario_base();
	}

	@Override
	public String mostrarDados() {
		System.out.println("Nome: "+this.getNome());
		System.out.println("Matr�cula: "+this.getMatricula());
		System.out.println("Sal�rio base: R$"+this.getSalario_base());
		System.out.println("Sal�rio: R$"+this.calculaSalario());
		return null;
	}
	
	

}
