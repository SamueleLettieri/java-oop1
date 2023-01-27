package org.lessons.java.shop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Prodotto prodotti;
		
		String nome;
		int prezzo;
		
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Inserisci Il nome Del prodotto: ");
		nome = s.nextLine();
		
		System.out.print("Inserisci Il prezzo del prodotto: ");
		prezzo = s.nextInt();
		
		prodotti = new Prodotto(nome, prezzo);
		
		System.out.println("Il prezzo del prodotto + iva è: " + prodotti.calcolaPrezzoIva() + "€");
		System.out.println("Il nome del prodotto + codice è: " + prodotti.nome + "-" + prodotti.formaCodice());
	}
	
}
