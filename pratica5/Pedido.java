package pratica5;

import java.util.ArrayList;
import java.util.Date;


public class Pedido {
	private String cpf;
	private Date dataPedido;
	private float valorTaxa, valorPratos, valorPedido;
	private ArrayList<Pratos> pedidos = new ArrayList<Pratos>(); 
	
	//Construtor
	public Pedido(String _cpf, Date _dataPedido, float _valorTaxa, float _valorPratos, float _valorPedido) {
		setCpf(_cpf);
		setDataPedido(_dataPedido);
		setValorTaxa(_valorTaxa);
		setValorPratos(_valorPratos);
		setValorPedido(_valorPedido);
	}
	
	//Construtor inicializando com cpf e data do pedido
	public Pedido(String _cpf, Date _dataPedido) {
		setCpf(_cpf);
		setDataPedido(_dataPedido);
	}

	//getters e setters
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public Date getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}
	
	public float getValorTaxa() {
		return valorTaxa;
	}

	public void setValorTaxa(float valorTaxa) {
		if(valorTaxa < 0) {
			this.valorTaxa = 0f;
		}else {
			this.valorTaxa = valorTaxa;
		}
	}

	public float getValorPratos() {
		return valorPratos;
	}

	public void setValorPratos(float valorPratos) {
		if(valorPratos < 0) {
			this.valorPratos = 0f;
		}else {
			this.valorPratos = valorPratos;
		}
	}

	public float getValorPedido() {
		return valorPedido;
	}

	public void setValorPedido(float valorPedido) {
		if(valorPedido < 0) {
			this.valorPedido = 0f;
		}else {
			this.valorPedido = valorPedido;
		}
	}
	
	public ArrayList<Pratos> getPedidos() {
		return pedidos;
	}
	
	public void setPedidos(Pratos pedido) {
		this.pedidos.add(pedido);
	}
	
	//método que calcula o valor total dos pratos
	public void totalPratos() {
		float sum = 0;
		
		for(int i=0; i<this.pedidos.size(); i++) {
			sum += this.pedidos.get(i).getPrecoVenda();
		}
		this.setValorPratos(sum);
	}
	
	//método que calcula a taxa de serviço
	public void calculaTaxa() {
		float t = 0.1f * this.getValorPratos();
		this.setValorTaxa(t);
	}
	
	//método que calcula o valor total do pedido
	public void pedidoTotal() {
		float pT = (this.getValorTaxa()+this.getValorPratos());
		this.setValorPedido(pT);
 	}
}
