package pratica6;

public class Veiculo {
	private String placa;
	private int ano;
	
	public Veiculo() {
		System.out.println("Veículo criado.");
	}
	
	public Veiculo(String placa, int ano) {
		setPlaca(placa);
		setAno(ano);
	}

	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public void SetAno(String ano) {
		this.ano = Integer.parseInt(ano);
	}
	public void exibirDados() {
		System.out.println("Placa do veículo: " + 
	this.getPlaca() + " e ano: " + this.getAno());
	}
}
