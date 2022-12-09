package pratica4;
import java.util.*;

public class TestaConta {

	public static void main(String[] args) {
		EspecialConta[] vetContasEsp = new EspecialConta[5];
		PoupançaConta[] vetContasPoup = new PoupançaConta[5];
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira 5 contas poupanças: ");
		for(int i=0; i<5; i++) {
			int cpf = scan.nextInt();
			int nro_conta = scan.nextInt();
			float saldo = scan.nextFloat();
			
		vetContasPoup[i] = new PoupançaConta(cpf,nro_conta,saldo);
		}
		
		System.out.println("Insira 5 contas especiais: ");
		for(int i=0; i<5; i++) {
			int cpf = scan.nextInt();
			int nro_conta = scan.nextInt();
			float saldo = scan.nextFloat();
			float limite = scan.nextFloat();
			
		vetContasEsp[i] = new EspecialConta(cpf,nro_conta,saldo,limite);
		}
	
	// realizando um depósito de 500 reais
	System.out.println("Saldo antes do depósito: " + vetContasPoup[0].saldo);
	vetContasPoup[0].depositar(500);
	System.out.println("Saldo depois do depósito: " + vetContasPoup[0].saldo);
	
	// realizando um saque de 10 reais
		System.out.println("Saldo antes do depósito: " + vetContasPoup[3].saldo);
		System.out.println("" + vetContasPoup[3].sacar(10));
		System.out.println("Saldo depois do depósito: " + vetContasPoup[3].saldo);
	
	// realizando um saque especial no valor de 100 reais
	System.out.println("Saque especial: " + vetContasEsp[0].NovoSaque(100));
	
	}
}
