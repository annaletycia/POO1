package pratica7;

public class Gerente extends Funcionario implements Imprimivel {

	public Gerente(String nome, String mat, double salBase) {
		super(nome, mat, salBase);
	}

	@Override
	public double calculaSalario() {
		return this.getSalario_base() * 2;
	}

	@Override
	public String mostrarDados() {
		System.out.println("Nome: "+this.getNome());
		System.out.println("Matrícula: "+this.getMatricula());
		System.out.println("Salário base: R$"+this.getSalario_base());
		System.out.println("Salário: R$"+this.calculaSalario());
		return null;
	}
	

}
