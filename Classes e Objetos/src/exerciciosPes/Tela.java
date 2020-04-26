package exerciciosPes;

public class Tela extends Smartphone{

	private String tamanho, resolucao;

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getResolucao() {
		return resolucao;
	}

	public void setResolucao(String resolucao) {
		this.resolucao = resolucao;
	}

	public Tela(String tamanho, String resolucao) {
		this.tamanho = tamanho;
		this.resolucao = resolucao;
	}

}
