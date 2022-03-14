package br.aragy;

public class LogisticaMaritima extends Logistica {
	
	public Transporte createTransporte() {
		return new Navio();
	}

}
