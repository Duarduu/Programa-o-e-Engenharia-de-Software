public class SerHumano {

    
    protected String cor_dos_olhos, locomove;
    protected double altura;
    protected double peso;


    public SerHumano( String cor_dos_olhos, double altura, double peso, String locomove) {
        this.cor_dos_olhos = cor_dos_olhos;
        this.altura = altura;
        this.peso = peso;
        if(locomove == "Rapido") {
        	this.locomove = "Automovel";
        }else{
        	this.locomove = "A pé";
        	}
    }
    
    public String getCor_dos_olhos() {
        return cor_dos_olhos;
    }

    public void setCor_dos_olhos(String cor_dos_olhos) {
        this.cor_dos_olhos = cor_dos_olhos;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    public String getLocomoção() {
    	return locomove;
    }
    	
}
