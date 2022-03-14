package br.aragy;

public class Main {
    public static Logistica logistica;

    public static void main(String[] args) {
    	
    	Logistica mar = new LogisticaMaritima();
    	Transporte navio = mar.planDelivery();
    	
    	Logistica terra = new LogisticaViaria();
    	Transporte caminhao = terra.planDelivery();
    	
    }
    }
