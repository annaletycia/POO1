package pratica7;

public abstract class Funcionario {
	private String nome, matricula;
	private double salario_base;
	
	public Funcionario(String nome, String mat, double salBase){
		setNome(nome);
		setMatricula(mat);
		setSalario_base(salBase);
	}
	
	public abstract double calculaSalario();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public double getSalario_base() {
		return salario_base;
	}

	public void setSalario_base(double salario_base) {
		this.salario_base = salario_base;
	}

	protected abstract String mostrarDados();

}

