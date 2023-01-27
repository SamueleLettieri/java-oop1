package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

	int codice;
	String nome;
	String descrizione;
	int prezzo;
	int iva;
	int max = 99999999;
	

	
	public Prodotto(String nome, int prezzo) {
		super();
		this.nome = nome;
		this.prezzo = prezzo;
		
	}

	
	int formaCodice() {
		Random r = new Random();
		
		return codice = r.nextInt(max);
	}

	float calcolaPrezzoIva() {
		float totalPrice = (prezzo + prezzo * 22 / 100);
		return totalPrice;
	}
}
	
	

	

