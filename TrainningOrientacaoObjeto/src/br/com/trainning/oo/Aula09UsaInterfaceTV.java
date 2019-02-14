package br.com.trainning.oo;

public class Aula09UsaInterfaceTV {

	public static void main(String[] args) {
		
		Aula09InterfaceTVLCD tvNew = new Aula09InterfaceTVLCD(42);
		tvNew.ligar();
		tvNew.aumentaVolume(5);
		tvNew.diminuirVolume(2);
		tvNew.mudarCanal(3);
		tvNew.desligar();

/*		
		Aula09InterfaceTVTubo tvOld = new Aula09InterfaceTVTubo(21);
		tvOld.ligar();
		tvOld.mudarCanal(15);
		tvOld.aumentaVolume(3);
		tvOld.diminuirVolume(2);
		tvOld.desligar();
*/		
	}

}
