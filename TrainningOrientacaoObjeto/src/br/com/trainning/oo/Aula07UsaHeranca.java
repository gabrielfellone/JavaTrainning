package br.com.trainning.oo;

public class Aula07UsaHeranca {
	
	public static void main(String[] args) {
		Aula07HerancaPF pessoa1 = new Aula07HerancaPF ();
		pessoa1.setNome("Heitor");
		pessoa1.setEndereco("Av. Paulista");
		pessoa1.setTelefone("98798788");
		pessoa1.setCpf("342.876.114-72");

		Aula07HerancaCNPJ empresa1 = new Aula07HerancaCNPJ();
		empresa1.setNome("Mc Donalds");
		empresa1.setEndereco("Av. Rebouças"); 
		empresa1.setTelefone("98798788");
		empresa1.setCnpj("98.900.000/1113-05");
		
		Aula07HerancaFuncionario colaborador1 = new Aula07HerancaFuncionario();
		colaborador1.setNome("Ana");
		colaborador1.setEndereco("Av. Faria Lima");
		colaborador1.setTelefone("999876509");
		colaborador1.setCpf("111.876.982-00");
		colaborador1.setMatricula("8252786");
		
		pessoa1.mostrarDados();
		empresa1.mostrarDados();
		colaborador1.mostrarDados();
	}

}
