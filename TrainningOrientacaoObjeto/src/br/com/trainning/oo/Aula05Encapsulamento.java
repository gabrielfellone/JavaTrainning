package br.com.trainning.oo;

public class Aula05Encapsulamento {
	
	private String tipoMaterial;
	private int capacidade;
	
	public void mostrarConteudo() {
		System.out.println(
				"Material: " + this.tipoMaterial + "\nCapacidade: "
				+ getCapacidade() + " mL");
	}
	
	public String getTipoMaterial() {
		return tipoMaterial;
	}
	public void setTipoMaterial(String tipoMaterial) {
		this.tipoMaterial = tipoMaterial;
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapcidade(int capcidade) {
		this.capacidade = capcidade;
	}
	
	
}
