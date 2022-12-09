package Pratica9;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int opcao = 0;
		System.out.println("==================");
		System.out.println("Empregados");
		System.out.println("==================");
		System.out.println("Cadastrar 5 empregados");
		System.out.println("==================");
		ArrayList<Empregado> empregados = new ArrayList<Empregado>();
		DadosEmpregados dados = new DadosEmpregados();
		for (int i =0;i<5;i++) {
			Empregado e = new Empregado();
			System.out.println("Digite o CPF:");
			e.setCpf(input.next());
			System.out.println("Digite o ano de nascimento: ");
			e.setAnoNascimento(input.nextInt());
			System.out.println("Digite o salario: ");
			e.setSalario(input.nextDouble());
			empregados.add(e);
			dados.cadastrar(e);
		}
		System.out.println("==================");
		System.out.println("Comparar 2 empregados");
		System.out.println("==================");
		System.out.println("Digite a posicao do primeiro: ");
		int pos1 = input.nextInt();
		System.out.println("Digite a posicao do segundo: ");
		int pos2 = input.nextInt();
		if(empregados.get(pos1).compareTo(empregados.get(pos2)) == 0) {
			System.out.println("O(a) primeiro(a) é mais velho(a)");
		}
		else {
			System.out.println("O(a) segundo(a) é mais velho(a)");
		}

		System.out.println("==================");
		System.out.println("Buscar por cpf");
		System.out.println("==================");
		System.out.println("Digite o cpf: ");
		Empregado temp = new Empregado();
		temp = dados.buscar(input.next());
		System.out.println("==================");
		temp.mostraDados();

		System.out.println("==================");
		System.out.println("Buscar por salario maior que:");
		System.out.println("==================");
		System.out.println("Digite um salario: ");
		dados.buscarSal(input.nextDouble());
		System.out.println("==================");
		System.out.println("Deseja salvar os dados ?(Y/n)");
		char res;
		res = input.next().charAt(0);
		if(res == 'Y') {
			for (int i = 0; i < empregados.size() - 1; i++) {
				Persist.gravar(empregados.get(i), "Empregados.bin");
			}
		}
	}

}