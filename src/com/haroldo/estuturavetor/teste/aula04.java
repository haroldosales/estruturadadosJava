package com.haroldo.estuturavetor.teste;

import com.haroldo.estuturavetor.Vetor;

public class aula04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		Vetor	 vetor = new Vetor(10);
		vetor.adcionar("elementos 1");
		vetor.adcionar("elemento 2");
		vetor.adcionar("elementos 3");
		
		System.out.println(vetor.tamanho());
		
		System.out.println(vetor.toString());
		
	}
	

}
