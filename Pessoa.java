
public class Pessoa {
	private String nome;
	private int idade;
	
<<<<<<< HEAD
=======
	public Pessoa(){}
	
	Pessoa(String nome, int idade){
		this.nome = nome;
		this.idade = idade;
	}
	
>>>>>>> 062586919dd7eda5a527b9d490327af890b76758
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
	}
	
	
}
