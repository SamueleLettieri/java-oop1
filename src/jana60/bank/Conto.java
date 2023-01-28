package jana60.bank;

import java.util.Random;

public class Conto {

	String nomeDelProprietario;
	int numeroDiConto;
	double saldo;


	
	public Conto(String nomeDelProprietario) {
		super();
		this.nomeDelProprietario = nomeDelProprietario;
		saldo = 0;
	}


	int creazioneNumeroDiConto() {
		Random r = new Random();
		return numeroDiConto = r.nextInt(1000);
	}

	
	void versaSomma(double soldi) {
		saldo = (saldo + soldi);
		
	}
	
	boolean  prelevaSomma(double soldi) {
		
		if (saldo < soldi) {
			return false;
		} else {
			saldo = (saldo - soldi);
			return true;
		}
	}
	
	
	
}

