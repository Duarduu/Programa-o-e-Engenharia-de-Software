package exerciciosPes;

public class Processador extends Smartphone{

	private String marca, modelo, velocidade;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(String velocidade) {
		this.velocidade = velocidade;
	}

	public Processador(String marca, String modelo, String velocidade) {
		this.marca = marca;
		this.modelo = modelo;
		this.velocidade = velocidade;
	}

}
