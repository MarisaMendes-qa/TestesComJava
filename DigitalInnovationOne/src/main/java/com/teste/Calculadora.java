package com.teste;

public class Calculadora {
	
	public int somar(String expressao) {
	int soma = 0;
	for (String valor$omar : expressao.split("\\+"))
		soma += Integer.valueOf(valor$omar);
	
		System.out.println(soma);
		return soma;
	
	}

}

