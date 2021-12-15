package arquivos;

public class Aluno {

	String nome;
	Integer idade;
	String turma;

	Aluno() {
	}

	Aluno(String nome, int idade, String turma) {
		this.nome = nome;
		this.idade = idade;
		this.turma = turma;
	}

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

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", turma=" + turma + "]";
	}

}
