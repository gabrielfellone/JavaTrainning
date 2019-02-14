package br.com.trainning.oo;

public class Aula01Conta {
		
		String cliente;
		double saldo;

		void exibirSaldo() {
			System.out.println(
					cliente + " Seu Saldo Atual é: " + saldo);
		}
		
		void saca(double valor) {
			saldo -= valor;
			System.out.println(
					"Valor Sacado : " + valor);
			
		}
		
		void deposita(double valor) {
			saldo += valor;
			System.out.println(
					"Valor Depositado : " + valor);
		}
		
		void transferir(Aula01Conta conta, double valor) {
			this.saca(valor);
			conta.deposita(valor);
		}
}
