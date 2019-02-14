package br.com.trainning.oo;

public class Aula09InterfaceTVTubo extends Aula09InterfaceTV implements Aula09InterfaceControle{ 

	public Aula09InterfaceTVTubo(int tamanho) {
		super(tamanho);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mudarCanal(int canal) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void aumentaVolume(int taxa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void diminuirVolume(int taxa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean ligar() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean desligar() {
		// TODO Auto-generated method stub
		return false;
	}

}
