package pratica7;

public class Teste {

	public static void main(String[] args) {
		Funcionario vetor[] = new Funcionario[5];
		
		vetor[0] = new Gerente("Alice","1",150.0);
		vetor[1] = new Assistente("Paulo","2", 50.0);
		vetor[2] = new Vendedor("Marcos", "3", 100.0, 10);
		vetor[3] = new Vendedor("Pietra", "4", 100.0,10);
		vetor[4] = new Assistente("Érica","5",50.0);
		
		System.out.println("Folha salarial: \n");
		for(int i=0; i<5; i++) {
			vetor[i].mostrarDados();
			System.out.println("------------------");
		}
		System.out.print("\nValor total: ");
		double soma = 0;
		for(int i=0; i<5; i++) {
			soma = soma + vetor[i].calculaSalario();
		}
		System.out.println("R$"+soma);
	}

}
