	package com.haroldo.estuturavetor;

import java.util.Arrays;

public class Vetor {

	private String[] elementos;
	private int tamanho;

	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho= 0;

	}

	/*public void adcionar(String elemento) {

		for (int i = 0; i < elementos.length; i++) {
			if(this.elementos[i]==null) {
				this.elementos[i] = elemento;
				break;
			}
		}
	}*/

	/*public void adcionar(String elemento) throws Exception{
		if(this.tamanho < this.elementos.length) {
		this.elementos[this.tamanho]= elemento;
		this.tamanho++;
		}else {

			throw new Exception("Vetor está cheio, nao é ppssivel adcionar");
		}
	}*/

	public boolean adcionar(String elemento) {
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho]= elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}
	
	public  String buscar(int posicao) {
		
		if(!(posicao >=0 && posicao < tamanho)) {
			
				throw new IllegalArgumentException("posicao inválida");
			
		}
		
			return this.elementos[posicao];
	}
	
	/*public int buscas(String elemento) {
			
				for(int i = 0; i <this.tamanho; i++) {
					
					
						if(this.elementos[i].equals(elemento)) {
							
								return i;
						}
						return -1;
				}
		
	}*/
	
	
	public int tamanho() {
			
		return this.tamanho;
		
	}
	


	@Override
	public String toString() {
		
		StringBuilder s = new StringBuilder();
		
		
		 s.append("[");
		
		for(int i=0;i < this.tamanho-1; i++) {
				s.append( this.elementos[i]);
				s.append(",");
						
		}
		if(this.tamanho>0) {
			
			s.append(this.elementos[this.tamanho-1]);
		}
				
		s.append("]");
		
		return s.toString();
		
		
		//return Arrays.toString(elementos) ;
	}
	
	
}
