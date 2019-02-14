package br.com.trainning.oo;

public class Aula01UsaConta {

	public static void main(String[] args) {
		
		Aula01Conta conta1 = new Aula01Conta();
		conta1.cliente = "Leonardo";
		conta1.saldo = 100.00;
		conta1.exibirSaldo();
		conta1.saca(100);
		conta1.exibirSaldo();
		conta1.deposita(150);
		conta1.exibirSaldo();
		
		Aula01Conta conta2 = new Aula01Conta();
		conta2.cliente = "Trainning";
		conta2.saldo = 10000;
		conta2.exibirSaldo();
		conta2.transferir(conta1, 500);
		conta2.exibirSaldo();
		
		conta1.exibirSaldo();
	}

}
