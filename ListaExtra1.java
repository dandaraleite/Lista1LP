package lp20200402;

import java.util.Scanner;

public class ListaExtra1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitor = new Scanner(System.in);
	/*	
		//QUESTÃO 01, 07 DA LISTA1
		//ACERTEI SÓ FALTOU 1 DETALHE
				
				
				
				/*	
				int x, a , b;
				
				System.out.println("Digite o valor a ser testado: ");
				x = leitor.nextInt();
				System.out.println("Digite o valor de a: ");
				a = leitor.nextInt();
				System.out.println("Digite o valor de b: ");
				b = leitor.nextInt();
				
				if(a >= b) {
					System.out.println("Dados inválidos! O valor de A deve ser menor que o valor de B!");
				}
				else {
				
					if(x >= a && x <= b) {
						System.out.println("O valor de x que é: " + x + " está dentro do intervalo: [" + a + "," + b + "]");
					}else {
						System.out.println("O valor de x que é: " + x + " NÃO está dentro do intervalo: [" + a + "," + b + "]");
					}
				
				}
			
			
				
				
		//QUESTAO 02, QUESTAO 09 DA LISTA1
		//2) Dados três valores A, B e C, construa um programa que imprima os valores 
			//de forma ascendente (do menor para o maior). 
		//ACERTEI DO MEU JEITO
		// DO JEITO DO PROF: (acho que até ele errou)
				
				int a, b, c, aux;
		
				System.out.println("Digite um valor inteiro:");
				a = leitor.nextInt();
				System.out.println("Digite outro valor inteiro:");
				b = leitor.nextInt();
				System.out.println("Digite mais um valor inteiro:");
				c = leitor.nextInt();
				
				
				//Ordenação simples
				//a b c
				//5 3 1
				//3 5 1 (trocou a com b)
				//3 1 5 (trocou b com c)
				//1 3 5 (trocou a com b)
				
				
				if (a > b) {
					aux = b;
					b = a;
					a = aux;
				}
				if (b > c) {
					aux = c;
					c = b;
					b = aux;
				}
				if (a > b) {
					aux = b;
					b = a;
					a = aux;
				}
				
				System.out.println("Os valores em ordem ficam  a: " + a + ", b: " + b + ", c:" + c);
				
				
		//QUESTÃO 03
		//Uma loja está levantando o valor total de todas as mercadorias em estoque. Escreva
		//um algoritmo que permita a entrada das seguintes informações: 
		//a) o número total de mercadorias no estoque; 
		//b) o valor de cada mercadoria. 
		//Ao final imprimir o valor total em estoque e a média de valor das mercadorias.
				
				int qtdEstoque;
				float valorItem = 0, valorTotal=0, media;
				
				System.out.println("Digite a quantidade de produtos no estoque:");
				qtdEstoque = leitor.nextInt();
				
				for(int i=1; i<=qtdEstoque; i++) {
					System.out.println("Digite o valor do item/mercadoria:");
					valorItem = leitor.nextFloat();
					valorTotal = valorTotal + valorItem; //a ordem das iterações importa muito!!! tipo questao 11 da lista1
					
					
				}
				
				
				media = valorTotal/qtdEstoque;
				
				System.out.println("Valor total em estoque: " + valorTotal);
				System.out.println("Média de valor das mercadorias: " + media);
				
				
		//QUESTÃO 04, ATIVIDADE DEPOIS, IF E ELSE SIMPLES
				
				
				
				
		//QUESTÃO 05
		//5) A lotérica do seu estado precisa disponibilizar números para apostas, onde o
		//apostador irá selecionar um número inteiro entre 1 e 10. Considerando que o sistema
		//disponibiliza 10 possibilidades de apostas, então serão 10 possibilidades de selecionar
		//um número entre 1 e 10. Exemplo de cartela:
		//(1, 1 2 3 4 5 6 7 8 9 10)
		//(2, 1 2 3 4 5 6 7 8 9 10)
		//(3, 1 2 3 4 5 6 7 8 9 10)
		//(4, 1 2 3 4 5 6 7 8 9 10)
		//(5, 1 2 3 4 5 6 7 8 9 10)
		//(6, 1 2 3 4 5 6 7 8 9 10)
		//(7, 1 2 3 4 5 6 7 8 9 10)
		//(8, 1 2 3 4 5 6 7 8 9 10)
		//(9, 1 2 3 4 5 6 7 8 9 10)
		//(10, 1 2 3 4 5 6 7 8 9 10)
		//Escreva um algoritmo que imprima na tela as seguintes sequências de números
		//conforme o modelo acima, até que o primeiro número (antes da vírgula, que identifica
		//o número da aposta), também chegue a 10.
				
						
				for(int i = 1; i <= 10; i++) {
					System.out.print("(" + i + ",");
							
						for(int j = 1; j <= 10; j++) {
							System.out.print(" " + j + " ");
							}
							
					System.out.println(")");
							
						}
			
				
		//QUESTAO 06
		//6) O sistema de programação de eventos de um empresa necessita que o usuário
		//selecione um valor de Hora e Minutos para inserir uma programação. Dentro desse
		//contexto, o sistema deve permitir a exibição de uma lista de horas e minutos (em
		//formato brasileiro, ou seja, de 00:00 até 23:59), com a possibilidade de definir o
		//intervalo de minutos de 10 em 10 minutos, de 15 em 15 minutos ou de 30 em 30
		//minutos entre cada hora a ser exibida. Além dessa configuração por intervalor de
		//minutos, o seu sistema deve permitir também a definição de hora inicial e hora final.
				
				//Escreva um algoritmo que leia do usuário o tipo de intervalo desejado (10, 15 ou 30), a
				//hora inicial e a hora final da disponibilidade da agenda e imprima na tela toda a
				//sequência de horas e minutos possíveis de um relógio para essa configuração.
						
						
				
					int horaInicial, horaFinal, intervaloMin;
					
					System.out.println("Digite a hora inicial de abertura da agenda: ");
					horaInicial = leitor.nextInt(); //testar se está entre 0 e 23
							
					System.out.println("Digite a hora final da agenda: ");
					horaFinal = leitor.nextInt(); //testar se está entre 0 e 23
					
					System.out.println("Informe o intervalo de minutos para a genda (10, 15 ou 30):");
					intervaloMin = leitor.nextInt();
					
					if (intervaloMin == 10 || intervaloMin == 15 || intervaloMin == 30) {
					
						if (horaInicial >= horaFinal) {
							System.out.println("Hora inicial e final inválidas!");
						}else {
							
							for (int h = horaInicial; h<horaFinal; h++) {
								
								for(int m = 0; m <= 59; m = m + intervaloMin) {
									System.out.println(String.format("%02d", h) + ":" + String.format("%02d", m));
								}
								
							}
							
						}
						
					}else {
						System.out.println("Intervalo não permitido!");
					}
					
					
				*/

	
	
	
	}

}
