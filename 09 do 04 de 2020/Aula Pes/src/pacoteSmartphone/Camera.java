package pacoteSmartphone;

public class Camera extends Smartphone{
	
	private String resolucao;

	public String getResolucao() {
		return resolucao;
	}

	public void setResolucao(String resolucao) {
		this.resolucao = resolucao;
	}
	
	public Camera(String resolucao) {
		this.resolucao = resolucao;
	}

}
