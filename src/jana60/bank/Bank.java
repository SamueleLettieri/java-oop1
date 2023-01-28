package jana60.bank;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		
		Conto conti;
		
		String nomeDelProprietario, exit = "";
		double soldi;
		
		

		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Inserisci il tuo nome: ");
		nomeDelProprietario = s.nextLine();
		
		conti = new Conto(nomeDelProprietario);
		
		System.out.println("Nome: " + nomeDelProprietario);
		System.out.println("Numeroconto: " + conti.creazioneNumeroDiConto());
		System.out.println("Saldo: " + conti.saldo);
		
		while (!exit.equals("uscire")) {
			System.out.println("Vuole prelevare, versare o uscire dal conto?");
			exit = s.nextLine();
			
			if(exit.equals("versare")) {
				
				System.out.println("Quanto vuole versare: ");
				soldi = s.nextDouble();
				s.nextLine();
				conti.versaSomma(soldi);
				System.out.println("il suo conto è di: " + conti.saldo);
			 } else if(exit.equals("prelevare")) {
				
				System.out.println("Quanto vuole prelevare: ");
				soldi = s.nextDouble();
				s.nextLine();
				
				if (soldi >  conti.saldo) {
					System.out.println("Operazione fallita, il suo sando corrente non copre il suo prelievo.");
					System.out.println("Il suo saldo è di: " + conti.saldo);
				} else {
					conti.prelevaSomma(soldi);
					System.out.println("Il suo saldo eè di: " + conti.saldo );
				}
				
			 }
			
		  }
			
		  if(exit.equals("uscire")) {
		 	
			System.out.println("Arrivederci!");		
		
		  }
		  
		  s.close();
	}
	
}
