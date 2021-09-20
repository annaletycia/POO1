package pratica5;

public class Sanduiche extends Pratos{
	protected String pao;
	protected String carne;
	protected String salada;
	
	//Construtor
	public Sanduiche(float _precoCusto, float _precoVenda, int _tempo, 
			String _pao, String _carne, String _salada) {
		super(_precoCusto, _precoVenda, _tempo);
		setPao(_pao);
		setCarne(_carne);
		setSalada(_salada);
	}
	
	//setters e getters
	public String getPao() {
		return pao;
	}
	public void setPao(String pao) {
		this.pao = pao;
	}
	public String getCarne() {
		return carne;
	}
	public void setCarne(String carne) {
		this.carne = carne;
	}
	public String getSalada() {
		return salada;
	}
	public void setSalada(String salada) {
		this.salada = salada;
	}
}
