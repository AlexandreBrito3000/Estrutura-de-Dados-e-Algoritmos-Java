package com.alexandre.estruturadados.vetor.teste;

import com.alexandre.estruturadados.vetor.Vetor;

public class Aula05 {

	public static void main(String[] args) {
		
		
		Vetor vetor = new Vetor(3);

		vetor.adiciona("elemento 1"); //0
		vetor.adiciona("elemento 2"); //1
		vetor.adiciona("elemento 3"); //2
		
		//posições válidas até o tamanho do vetor.
		System.out.println(vetor.busca(0));
		System.out.println(vetor.busca(1));
		System.out.println(vetor.busca(2));
		//posição inválida.
		System.out.println(vetor.busca(15));

	}

}
