package Pratica9;

public class Empregado implements Comparable<Empregado>{
protected String cpf;
protected int anoNascimento;
protected double salario;


public String getCpf() {
	return cpf;
}
public boolean setCpf(String cpf) {
	if(cpf.length()>0) {
	this.cpf = cpf;return true;}
	else {
		return false;
	}
}

public int getAnoNascimento() {
	return anoNascimento;
}
public boolean setAnoNascimento(int anoNascimento) {
	if(anoNascimento > 0) {
	this.anoNascimento = anoNascimento;return true;}
	else {
		return false;
	}
}
public double getSalario() {
	return salario;
}
public boolean setSalario(double salario) {
	if(salario> 0) {
	this.salario = salario;return true;}
	else {
		return false;
	}
}

public Empregado(String cpf, int anoNascimento, double salario) {
	super();
	this.cpf = cpf;
	this.anoNascimento = anoNascimento;
	this.salario = salario;
}

public Empregado() {
	super();
}

@Override
public int compareTo(Empregado o) {
	if(anoNascimento > o.anoNascimento) {
		return 0;
	}
	else
	return 1;
}

public void mostraDados() {
	System.out.println("=========================");
	System.out.println("CPF: "+getCpf());
	System.out.println("Ano de nascimento: "+getAnoNascimento());
	System.out.println("Salario: "+getSalario());
}
}
