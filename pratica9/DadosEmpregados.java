package Pratica9;

import java.util.ArrayList;

public class DadosEmpregados {
	
			private ArrayList<Empregado>vetFunc = new ArrayList<Empregado>();
			
			public void cadastrar(Empregado c) {
				this.vetFunc.add(c);
				System.out.println("Total de funcionarios: ");
				System.out.println(this.vetFunc.size());
			}
			
			public void buscarSal(double salario) {
				ArrayList<Empregado> sal = new ArrayList<Empregado>();
				Empregado c = null;
				for (Empregado objeto: this.vetFunc){
					if(objeto.getSalario()>salario) {
						c = objeto;
						sal.add(c);
					}
				}
				for(int i =0; i<sal.size();i++) {
					sal.get(i).mostraDados();
				}
			}
				
			public Empregado buscar(String cpf) {
				Empregado c = null;
				for (Empregado objeto: this.vetFunc){
					if(objeto.getCpf().equals(cpf)) {
						c = objeto;
					}
				}
				return c;
			}
			
			public boolean excluir(String cpf) {
				Empregado c = buscar(cpf);
				if(c != null) {
					this.vetFunc.remove(c);
					return true;
				}
				else {
					return false;
				}
				
			}
		



}
