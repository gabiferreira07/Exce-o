package Exceptions;

import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
		int a, b, c;
		Scanner leia = new Scanner(System.in);
		a = 10;
		System.out.println("Digite um número: ");
		b = leia.nextInt();
		try{
			c = a / b;
			System.out.println("Valr de C: " + c);
		}
		catch(RuntimeException erro) {
			System.out.println("Não existe divisão por zero");
		}

	}

}
