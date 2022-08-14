package com.generation.ex;

public class ExAviao {
	private int NumeroBancos;
	private String tipoAsas;
	private int banheiro;
	private int saidasDeEmergencia;
	
	public ExAviao(int numeroBancos, String tipoAsas, int banheiro, int saidasDeEmergencia) {
		NumeroBancos = numeroBancos;
		this.tipoAsas = tipoAsas;
		this.banheiro = banheiro;
		this.saidasDeEmergencia = saidasDeEmergencia;
	}
	
	public void Ex02Aviao() {
		System.out.println("Numero de assentos: "+this.NumeroBancos);
		System.out.println("Qual tipo da asa eh: "+this.tipoAsas);
		System.out.println("Numero de banheiros: "+this.banheiro);
		System.out.println("O aviao tem "+this.saidasDeEmergencia+" saidas de emergencia!");
	}
}