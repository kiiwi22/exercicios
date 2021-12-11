package atividadeOrdenacao;

public class Carro {

	private String marca;
	private Integer ano;
	private Double potenciaMotor;

	public Carro(String marca, int ano, Double potenciaMotor) {
		super();
		this.marca = marca;
		this.ano = ano;
		this.potenciaMotor = potenciaMotor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Double getPotenciaMotor() {
		return potenciaMotor;
	}

	public void setPotenciaMotor(Double potenciaMotor) {
		this.potenciaMotor = potenciaMotor;
	}

	@Override
	public String toString() {
		return "Carro [marca=" + marca + ", ano=" + ano + ", potenciaMotor=" + potenciaMotor + "]";
	}

}
