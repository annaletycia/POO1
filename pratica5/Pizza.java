package pratica5;

public class Pizza extends Pratos{
	protected String molho;
	protected String recheio;
	protected String borda;
	
	//Construtor
	public Pizza(float _precoCusto, float _precoVenda, int _tempo, 
			String _molho, String _recheio, String _borda) {
		super(_precoCusto, _precoVenda, _tempo);
		setMolho(_molho);
		setRecheio(_recheio);
		setBorda(_borda);
	}
	
	//setters e getters
	public String getMolho() {
		return molho;
	}
	public void setMolho(String molho) {
		this.molho = molho;
	}
	public String getRecheio() {
		return recheio;
	}
	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}
	public String getBorda() {
		return borda;
	}
	public void setBorda(String borda) {
		this.borda = borda;
	}
}
