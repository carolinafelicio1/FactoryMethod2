package br.aragy;

public class LogisticaViaria extends Logistica {
	
	public Transporte createTransporte() {
		return new Caminhao();
	}

}
