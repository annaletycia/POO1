package pratica5;

public class Pratos {
	protected float precoCusto, precoVenda;
	protected int tempo; //em minutos
	
	//Construtor
	public Pratos(float _precoCusto, float _precoVenda, int _tempo) {
		if(setPrecoCusto(_precoCusto) == -1) {
			System.out.println("Valor(preco de custo) inválido");
		}
		if(setPrecoVenda(_precoVenda) == -1) {
			System.out.println("Valor(preco de venda) inválido");
		}
		if(setTempo(_tempo) == -1) {
			System.out.println("Valor(tempo) inválido");
		}
	}
	
	//setters e getters
	public float getPrecoCusto() {
		return precoCusto;
	}
	
	public int setPrecoCusto(float precoCusto) {
		if(precoCusto < 0) {
			return -1;
		} else {
			this.precoCusto = precoCusto;
			return 0;
		}
	}
	
	public float getPrecoVenda() {
		return precoVenda;
	}
	
	public int setPrecoVenda(float precoVenda) {
		if(precoVenda < this.getPrecoCusto()) {
			return -1;
		} else {
			this.precoVenda = precoVenda;
			return 0;
		}
	}
	
	public int getTempo() {
		return tempo;
	}
	
	public int setTempo(int tempo) {
		if(tempo < 0) {
			return -1;
		} else {
			this.tempo = tempo;
			return 0;
		}
	}

}
