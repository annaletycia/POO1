package pratica5;
import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;

public class TestaPedido {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bem vindo ao Restaurante!");
		
		ArrayList<Sanduiche> sanduiches = new ArrayList<Sanduiche>(1);
		
		Sanduiche sanduba = new Sanduiche(5.f, 15.0f, 30,"Australiano","Picanha",
				"Alface");
		
		sanduiches.add(sanduba);
		
		ArrayList<Pizza> pizzas = new ArrayList<Pizza>(1);
		
		Pizza pizza4Queijos = new Pizza(15.0f,30.0f, 50, 
				"Bolonhesa", "Queijo", "Tradicional");
		
		pizzas.add(pizza4Queijos);
		
		Date data = new Date();
		Pedido cliente1 = new Pedido("1", data);
		int op = 0;
		while(op != 4) {
			System.out.println("------MENU------");
			System.out.println("1 - Sanduiche - R$15,00");
			System.out.println("2 - Pizza - R$30,00");
			System.out.println("3 - Sair do MENU e concluir pedido");
			
			System.out.print("\nQual opção você deseja: ");
				op = scan.nextInt();
				if(op == 1) {
					cliente1.setPedidos(sanduba);
					System.out.println("Sanduba adicionado ao pedido!\n");
				}
				if(op == 2) {
					cliente1.setPedidos(pizza4Queijos);
					System.out.println("Pizza 4 Queijos adicionada ao pedido!\n");
				}

				if(op == 3) {
					System.out.println("Pedido encerrado!");
					break;
				}
		}
		
		System.out.println("RECIBO:");
		cliente1.totalPratos();
		System.out.println("Valor total dos pratos: R$" + cliente1.getValorPratos());
		cliente1.calculaTaxa();
		System.out.println("Taxa de serviço: R$" + cliente1.getValorTaxa());
		cliente1.pedidoTotal();
		System.out.println("Total: R$" + cliente1.getValorPedido());
		System.out.println("Obrigado e volte sempre!");
		scan.close();
	}
}
