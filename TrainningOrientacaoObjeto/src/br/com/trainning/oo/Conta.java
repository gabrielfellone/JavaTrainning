package br.com.trainning.oo;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Conta {

	private static double saldo;
	private static String nome;
	private static double conta;
	private static double agencia;
	private static int tipo;
	private static int opt;
	private static double opt1;

	public static void Menu() {

		System.out.println("-------------------MENU-----------------------");
		System.out.println("1. Adicionar Conta");
		System.out.println("2. Visualizar Cantas");
		System.out.println("3. Realizar transferencia");
		System.out.println("-----------------------------------------------");

		Scanner scan = new Scanner(System.in);
		opt = scan.nextInt();

		switch (opt) {

		case 1:
			Scanner scan1 = new Scanner(System.in);
			opt = scan1.nextInt();
			System.out.println("1. Conta Corrente");
			System.out.println("2. Conta Poupança");
			if (opt == 1) {
				ContaCorrente();

			} else {
				// ContaPoupança();
				System.out.println("Número inválido");
			}

		}

	}

//-------------------------------------------------
	public static void ContaCorrente() {

		try {
			System.out.println("Insira a conta:");
			Scanner scan = new Scanner(System.in);
			opt1 = scan.nextDouble();
			if (opt1 > 0) {
				double valor = opt1;
				valor = setConta(valor);
				Agencia();
			} else {
				System.out.println("Não pode inserir Conta negativa");
			}
		} catch (InputMismatchException e) {
			System.err.println("Não é permitido inserir letras, informe apenas números!");

		}

	}

	public static void Agencia() {

		try {
			System.out.println("Insira a agencia:");
			Scanner scan = new Scanner(System.in);
			opt = scan.nextInt();
			if (opt > 0) {
				int valor = opt;
				valor = setAgencia(valor);
				Cliente();
			} else {
				System.out.println("Não pode inserir Agencia negativa");
			}
		} catch (InputMismatchException e) {
			System.err.println("Não é permitido inserir letras, informe apenas números!");

		}

	}

	public static void Cliente() {

		try {
			System.out.println("Insira o nome:");
			Scanner scan = new Scanner(System.in);
			nome = scan.nextLine();
			String valor = nome;
			valor = setNome(valor);
			Salario();
		} catch (InputMismatchException e) {
			System.err.println("Não é permitido inserir números, informe apenas letras!");

		}

	}

	public static void Salario() {

		try {
			System.out.println("Insira o salario:");
			Scanner scan = new Scanner(System.in);
			saldo = scan.nextDouble();

			if (saldo > 0) {
				double valor = saldo;
				valor = setSaldo(valor);
				Lista();
			} else
				System.out.println("Não pode inserir salaário negativo");
			{

			}
		} catch (InputMismatchException e) {
			System.err.println("Não é permitido inserir letras, informe apenas números!");

		}

	}

	public static void Lista() {

		List<Double> list = new ArrayList<>();
		list.add(getConta(conta));
		// list.add(getAgencia(agencia));
		// list.add(getNome(nome));
		// list.add(getSaldo(saldo));

		System.out.print(list);

	}

	public static String SubString() {
		String nome = "Daniel";
		nome = nome.substring(0, nome.length() / 2);
		System.out.println(nome);
		return nome;

	}

	public static String Split() {
		String string = "Dan-iel";
		String[] parts = string.split("-");
		String part1 = parts[0]; // Dan
		String part2 = parts[1]; // iel
		System.out.println(part1);
		return string;

	}

	public static void CharEach() {
		String str = "Daniel";
		for (int i = 0; i < str.length() / 2; i++) {
			char nome = str.charAt(i);
			System.out.print(nome);

		}

	}

	public static boolean Compara() {
		String str = "Gabriel";
		String str2 = "Gabriel";
		return str == str2;

	}

//ADICIONAR SALDO

	public static void Saldo(double valor) {
		double saldo = valor;
		saldo = setSaldo(saldo);
		System.out.println("Seu Saldo é: " + saldo);

	}

//Set do saldo
	public static double setSaldo(double saldo) {
		Conta.saldo = saldo;
		return saldo;
	}

//Get do saldo
	public static double getSaldo(double saldo) {
		return setSaldo(saldo);
	}

	// -----------------------------

//Set do nome
	public static String setNome(String nome) {
		Conta.nome = nome;
		return nome;
	}

//Get do nome
	public static String getNome(String nome) {
		return setNome(nome);
	}

	// -----------------------

//Set do agencia
	public static int setAgencia(int agencia) {
		Conta.agencia = agencia;
		return agencia;
	}

//Get do agencia
	public static int getAgencia(int agencia) {
		return setAgencia(agencia);
	}

	// -------------------

//Set do conta
	public static double setConta(double conta) {
		Conta.conta = conta;
		return conta;
	}

//Get do conta
	public static double getConta(double conta) {
		return setConta(conta);
	}

// Set do tipo
	public static int setTipo(int tipo) {
		Conta.tipo = tipo;
		return tipo;
	}

// Get do tipo
	public static int getTipo(int tipo) {
		return setTipo(tipo);
	}

	// ----------------------

	public static void main(String[] args) {

		// Split();
		// SubString();
		// CharEach();
		// Compara();
		Menu();
		// Lista();

	}

}
