package br.com.trainning.oo;

public class Aula09InterfaceTVLCD extends Aula09InterfaceTV implements Aula09InterfaceControle {

	public Aula09InterfaceTVLCD(int tamanho) {
		super(tamanho);
	}

	@Override
	public void mudarCanal(int canal) { 
		setCanal(canal);
		System.out.println("Canal: "  + canal);
		
	}

	@Override
	public void aumentaVolume(int taxa) {
		int volFinal = getVolume() + taxa;
		setVolume(volFinal);
		System.out.println("Volume: (Min) 0 ||| " + volFinal + " ||| 100 (Max)" );
	}
	
	@Override
	public void diminuirVolume(int taxa) {
		int volFinal = getVolume() - taxa;
		setVolume(volFinal);
		System.out.println("Volume: (Min) 0 ||| " + volFinal + " ||| 100 (Max)" );
		
	}

	@Override
	public boolean ligar() {
		boolean ligar = false;
		if (!isLigada()) {
			ligar = true;
			setLigada(true);
			System.out.println("Tv Ligada!");
		}
		return ligar;
	}

	@Override
	public boolean desligar() {
		return false;
	}

	
}
