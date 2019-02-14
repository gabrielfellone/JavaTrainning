package br.com.trainning.oo;

public final class Aula07HerancaFuncionario extends Aula07HerancaPF {

		private String matricula;

		
		public Aula07HerancaFuncionario() {
			super();
		}

		public Aula07HerancaFuncionario(String matricula) {
			super();
			this.matricula = matricula;
		}

		public String getMatricula() {
			return matricula;
		}

		public void setMatricula(String matricula) {
			this.matricula = matricula;
		}
		
		protected void mostrarDados() {

			System.out.println("Funcionário: " 
			+ getNome() + " " + getCpf() 
			+ " " + getEndereco() + " " + getTelefone()
			+ " " + getMatricula());
		}
}
