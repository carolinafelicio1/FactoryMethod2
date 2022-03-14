package br.aragy;

public abstract class Logistica {
	
	public Transporte planDelivery() {
		Transporte t = createTransporte();
		t.entregar();
		return t;
	}
	
	public abstract Transporte createTransporte();

}
