package pratica6;

public class TestaVeiculos {
	
	public static void main(String[] args) {
		
		Veiculo vei = new Veiculo();
		Veiculo vei1 = new Veiculo("1233", 2006);
		Caminhao cam = new Caminhao("1234", 2002, 6);
		Onibus oni = new Onibus("1235", 2004, 30);
		
		vei.exibirDados();
		vei1.exibirDados();
		cam.exibirDados();
		oni.exibirDados();
		
	}
}
