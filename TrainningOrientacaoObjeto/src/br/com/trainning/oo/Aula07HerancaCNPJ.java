package br.com.trainning.oo;

public final class Aula07HerancaCNPJ extends Aula07HerancaPessoa{
	
	private String cnpj;

		
	public Aula07HerancaCNPJ() {
		super();
	}

	public Aula07HerancaCNPJ(String cnpj) {
		super();
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	protected void mostrarDados() {

		System.out.println("Empresa: " 
		+ getNome() + " " + getCnpj() 
		+ " " + getEndereco() 
		+ " " + getTelefone());
		
	}
	
	
}
