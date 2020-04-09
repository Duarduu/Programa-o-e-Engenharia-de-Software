package pacoteSmartphone;

public class Bateria extends Smartphone{

	private int capacidade = 0;

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public Bateria(int capacidade) {
		this.capacidade = capacidade;
	}

}
