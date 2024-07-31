package Exceptions;

import java.util.ArrayList;

public class Nomes {

	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<>();
		try{
		nomes.add("Alice");
		nomes.add("Bob");
		nomes.add("Charlie");
		
		System.out.println("Nome: " + nomes.get(5));
		}
		catch(Exception erro) {
			System.out.println("Informe um valor adequado");
		}
	}

}