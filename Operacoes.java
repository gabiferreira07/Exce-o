package Exceptions;

import java.util.Scanner;

public class Operacoes {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a=0, b=0;
		try {
			System.out.print("Informe o primeiro valor: ");
			a = ler.nextInt();

			System.out.print("Informe o segundo valor: ");
			b = ler.nextInt();

			System.out.println("Resultados");
			System.out.println("Soma: " + (a+b));
			System.out.println("Subtração: " + (a-b));
			System.out.println("Multiplicação: " + (a*b));
			System.out.println("Divisão inteiro: " + (a%b));
			System.out.println("Divisão exata: " + ((double)a/b));

		}
		catch(Exception erro) {
			System.out.println("Informe um valor do tipo inteiro");
		}
		ler.close();

	}

}
