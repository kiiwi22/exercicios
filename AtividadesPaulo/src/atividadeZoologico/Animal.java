package atividadeZoologico;

public class Animal {

	private String nome;
	private Double peso;
	private Integer idade;
	private EspecieAnimal especieAnimal;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public EspecieAnimal getEspecieAnimal() {
		return especieAnimal;
	}
	public void setEspecieAnimal(EspecieAnimal especieAnimal) {
		this.especieAnimal = especieAnimal;
	}
	@Override
	public String toString() {
		return "Animal [nome=" + nome + ", peso=" + peso + ", idade=" + idade + ", especieAnimal=" + especieAnimal
				+ "]";
	}
	
}
