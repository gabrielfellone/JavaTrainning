package br.com.trainning.oo;

public abstract class Aula09InterfaceTV {

	private int tamanho;
	private int canal;
	private int volume;
	private boolean ligada;

	
	public Aula09InterfaceTV(int tamanho) {

		this.tamanho = tamanho;
		this.canal = 0;
		this.volume = 0;
		this.ligada = false;
	}


	//getters and setters	
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		this.canal = canal;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public boolean isLigada() {
		return ligada;
	}
	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}
		
}
