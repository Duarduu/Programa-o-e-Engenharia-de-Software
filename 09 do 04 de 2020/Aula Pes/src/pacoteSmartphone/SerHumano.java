package pacoteSmartphone;

public class SerHumano {
	private double peso,altura;
	private String corOlhos;
	
	public String getCorOlhos() {
		return corOlhos;
	}
	
	public void setCorOlhos(String corOlhos) {
		this.corOlhos = corOlhos;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public String locomover_lento() {
		return "A pé";
	}
	
	public String locomover_rapido() {
		return "Não Possui";
	}


}
