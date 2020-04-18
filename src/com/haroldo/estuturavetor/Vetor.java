package com.haroldo.estuturavetor;

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
}
