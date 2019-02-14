package br.com.trainning.generics;

public class Cartas {
	
	public enum Naipe{
		PAUS, COPAS, ESPADAS, OUROS
	}
	
	public enum Valor{
				AS, DOIS, TRES, QUATRO, CINCO, SEIS, SETE, OITO, NOVE, DEZ,
				VALETE, DAMA, REI
	}
	
	private Naipe naipe;
	private Valor valor;
	
	public Cartas(Naipe naipe, Valor valor) {
		this.naipe = naipe;
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return valor+ " de "+ naipe; 
	}
	
	public Naipe getNaipe() {
		return naipe;
	}
	public void setNaipe(Naipe naipe) {
		this.naipe = naipe;
	}
	public Valor getValor() {
		return valor;
	}
	public void setValor(Valor valor) {
		this.valor = valor;
	}
	
	

}
