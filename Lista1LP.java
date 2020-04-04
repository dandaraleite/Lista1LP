package lp20200404;

import java.util.Scanner;

public class Lista1LP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
	
		
		/*
		//1) Fazer um programa para ler dois números inteiros e mostrar a soma dos mesmos.
		
		int x, y, soma;
		
		System.out.println("Digite um número inteiro: ");
		x = ler.nextInt();
		
		System.out.println("Digite outro número inteiro: ");
		y = ler.nextInt();
		
		soma = x + y;
		
		System.out.println("A soma dos números é: " + soma);

		
		//2) Fazer um programa para ler duas medidas de um retângulo. O programa deve mostrar
		//o perímetro e a área do retângulo a partir das medidas recebidas.
		
		
		float altura, largura, perimetro, area;
		
		System.out.println("Digite a altura do retângulo: ");
		altura = ler.nextFloat();
		
		System.out.println("Digite a largura: "); 
		largura = ler.nextFloat();
		
		area = altura * largura;
		perimetro = (2 * altura) + (2 * largura);
		
		System.out.println("A área do retângulo é: " + area + "cm");
		System.out.println("O perímetro do retângulo é: " + perimetro + "cm");
		
		
		
		//3) Fazer um programa para ler os valores de quatro números N1, N2, N3 e N4. Calcule e
		//imprima o valor da média aritmética dos mesmos.
		
		float N1, N2, N3, N4, mediaArit;
		
		System.out.println("Digite o valor de N1: ");
		N1 = ler.nextFloat();
		
		System.out.println("Digite o valor de N2: ");
		N2 = ler.nextFloat();
		
		System.out.println("Digite o valor de N3: ");
		N3 = ler.nextFloat();
		
		System.out.println("Digite o valor de N4: ");
		N4 = ler.nextFloat();
		
		mediaArit = (N1 + N2 + N3 + N4) / 4;
		
		System.out.println("A média aritmética dos quatro números é: " + mediaArit);
		
		
		
		//4) Fazer um programa para ler os valores de quatro números N1, N2, N3 e N4. Calcule e
		//imprima o valor da média aritmética dos mesmos. Imprimir também uma mensagem
		//de "aprovado" ou "reprovado" no caso da média ser maior ou igual a seis, ou menor,
		//respectivamente.
		
		float N1, N2, N3, N4, mediaArit;
		
		System.out.println("Digite o valor de N1: ");
		N1 = ler.nextFloat();
		
		System.out.println("Digite o valor de N2: ");
		N2 = ler.nextFloat();
		
		System.out.println("Digite o valor de N3: ");
		N3 = ler.nextFloat();
		
		System.out.println("Digite o valor de N4: ");
		N4 = ler.nextFloat();
		
		mediaArit = (N1 + N2 + N3 + N4) / 4;
		
		System.out.println("A média aritmética dos quatro números é: " + mediaArit);
		
		if(mediaArit >= 6) {
			System.out.println("Aprovado!");
			
		} 
		else {
			System.out.println("Reprovado!");
		}
		
		
		
		//5) Fazer um programa para ler um número inteiro e dizer se o mesmo é par ou ímpar.
		
		int x;
		
		System.out.println("Digite o valor de um número inteiro: ");
		x = ler.nextInt();
		
		if(x%2 == 0) {
			System.out.println("O número é par!");
		}
		else {
			System.out.println("O número é ímpar!");
		}
		
		
		
		//6) Fazer um programa para ler dois números reais e depois imprimi-los em ordem
		//crescente na tela.
		
		float numero1, numero2;
		
		System.out.println("Digite um número real: ");
		numero1 = ler.nextFloat();
		System.out.println("Digite um segundo número real: ");
		numero2 = ler.nextFloat();
		
		if(numero1 < numero2) {
			System.out.println("Sua sequência está em ordem crescente: " + numero1 + ", " + numero2);
		} 
		else {
			System.out.println("Sua sequência está em ordem decrescente: " + numero1 + ", " + numero2);
		}
		
		
		
		//7) Fazer um programa para ler um valor numérico qualquer x e dois valores a e b tais que
		//a < b, teste se x está no intervalo fechado [a,b].
		
		float x, a ,b;
		
		System.out.println("Digite o valor de x: ");
		x = ler.nextFloat();
		System.out.println("Digite o valor de a: ");
		a = ler.nextInt();
		System.out.println("Digite o valor de b: ");
		b = ler.nextInt();
				
		if (a >= b) {
			System.out.println("Os dados estão inválidos! O valor de A deve ser menor que o valor de B!");
		}
		else {
			
			if (a <= x && x <= b) {
				System.out.println("O valor de x que é: " + x + " está dentro do intervalo: [" + a + ", " + b + "]");
			}
			else {
				System.out.println("O valor de x que é: " + x + " NÃO está dentro do intervalo: [" + a + ", " + b + "]");
			}
		}
		
		
		
		
		//8) Fazer um programa que imprima qual o menor e qual o maior valor de dois números 
		//A e B, lidos através do teclado.
		
		float A, B;
		
		System.out.println("Diga o valor de A: ");
		A = ler.nextFloat();
		
		System.out.println("Diga o valor de B: ");
		B = ler.nextFloat();
		
		if(A > B) {
			System.out.println("O valor de A que é: " + A + " é maior que o valor de B!");
			
		}
		else {
			System.out.println("O valor de B que é: " + B + " é maior que o valor de A!");
		}
		
		
		
		//9) Dados três valores A, B e C, construa um programa que imprima os valores de forma
		//ascendente (do menor para o maior).
		
		float A, B, C;
		
		System.out.println("Digite o valor de A: ");
		A = ler.nextFloat();
		
		System.out.println("Digite o valor de B: ");
		B = ler.nextFloat();
		
		System.out.println("Digite o valor de C: ");
		C = ler.nextFloat();
		
		if(A <= B && B <= C) {
			System.out.println("Os valores estão em ordem ascendente: " + A + ", " + B + ", " + C );
		}
		if(C <= B && B <= A) {
			System.out.println("Os valores estão em ordem ascendente: " + C + ", " + B + ", " + A );
			}
		
		if(A <= C && C <= B) {
			System.out.println("Os valores estão em ordem ascendente: " + A + ", " + C + ", " + B );
		}
		
		if(B <= C && C <= A) {
			System.out.println("Os valores estão em ordem ascendente: " + B + ", " + C + ", " + A );
			}
		
		if(B <= A && A <= C) {
			System.out.println("Os valores estão em ordem ascendente: " + B + ", " + A + ", " + C );	
		}
		
		if(C <= A && A <= B) {
			System.out.println("Os valores estão em ordem ascendente: " + C + ", " + A + ", " + B );
			}
	
		
		
		//10) Faça um programa que, dada a idade de uma pessoa, determine sua classificação de
		//idade: “maior de idade”, “menor de idade”, ou “pessoa idosa” (idade superior ou igual
		//a 65 anos).
		
		int idade;
		
		System.out.println("Qual é a idade de Heloisa?");
		idade = ler.nextInt();
		
		if (idade < 18) {
			System.out.println("Heloisa é menor de idade.");
		}
		if (18 <= idade && idade < 65) {
			System.out.println("Heloisa é maior de idade.");
		}	
		if (idade >= 65)
			System.out.println("Heloisa é uma pessoa idosa.");
	
		
		
		
		//11) Faça um algoritmo para ler: a quantidade adquirida e o preço unitário. Calcular e
		//escrever o total (total = quantidade adquirida * preço unitário), o desconto e o total a
		//pagar (total a pagar = total - desconto), sabendo-se que:
		//- Se quantidade <= 5 o desconto será de 2%
		//- Se quantidade > 5 e quantidade <=10 o desconto será de 3%
		//- Se quantidade > 10 o desconto será de 5%
		
		
		int qtd;
		double preco, totalInic, desc1, desc2, desc3, totalPagar;
		
		do {
			System.out.println("Digite a quantidade adquirida: ");
			qtd = ler.nextInt();
		}while(qtd == 0);
		
		System.out.println("Digite o preço unitário: ");
		preco = ler.nextDouble();
		
		
		totalInic = (qtd * preco);
		
		System.out.println("O valor total inicial é de: R$ " + totalInic);
		
		desc1 = totalInic * 0.02;
		
		desc2 = totalInic * 0.03;
		
		desc3 = totalInic * 0.05;
		
		
		if (qtd <= 5) {
			System.out.println("Seu desconto é de 2%");
			totalPagar = totalInic - desc1;
			System.out.println("Seu valor total final é de: R$ " + totalPagar);
			
		}
		if (5 < qtd && qtd <= 10) {
			System.out.println("Seu desconto é de 3%");
			totalPagar = totalInic - desc2;
			System.out.println("Seu valor total final é de: R$ " + totalPagar);
		}
		if (qtd > 10) {
			System.out.println("Seu desconto é de 5%");
			totalPagar = totalInic - desc3;
			System.out.println("Seu valor total final é de: R$ " + totalPagar);
		}
		
			*/	
		
		//12) Escreva um algoritmo para ler 2 valores e se o segundo valor informado for ZERO, deve
				//ser lido um novo valor, ou seja, para o segundo valor não pode ser aceito o valor zero
				//e imprimir o resultado da divisão do primeiro valor lido pelo segundo valor lido.
				
				
				
				//13) Escreva um algoritmo para imprimir os números de 1 (inclusive) a 10 (inclusive) em
				//ordem crescente.
				
				
				
				//14) Escreva um algoritmo para imprimir os números de 1 (inclusive) a 10 (inclusive) em
				//ordem decrescente.
				
				
				//15) Ler um valor N e imprimir todos os valores inteiros entre 1 (inclusive) e N (inclusive).
				//Considere que o N será sempre maior que ZERO.
				
				
				//16) Escreva um algoritmo que calcule e imprima a tabuada do 8 (1 a 10).
				
				
				//17) Ler um valor inteiro (aceitar somente valores entre 1 e 10) e escrever a tabuada de 1 a
				//10 do valor lido.
				
				//18) Escreva um algoritmo que imprima a tabuada (de 1 a 10) para os números de 1 a 10.
				
				
				//19) Faça um algoritmo para ler o código e o preço de 15 produtos, calcular e escrever:
					//- o maior preço lido
					//- a média aritmética dos preços dos produtos

	}

}
