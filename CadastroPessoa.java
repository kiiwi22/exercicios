import java.util.Arrays;
import java.util.Scanner;

public class CadastroPessoa {

<<<<<<< HEAD
	public PessoaA[] cadastraPessoa() {
=======
	public Pessoa[] cadastraPessoa() {

>>>>>>> 062586919dd7eda5a527b9d490327af890b76758
		Scanner valor = new Scanner(System.in);
		Integer tamanho;
		System.out.print("Quantas pessoas deseja cadastrar? ");
		tamanho = valor.nextInt();
		PessoaA[] cadastraPessoas = new PessoaA[tamanho];

		for (int i = 0; i < cadastraPessoas.length; i++) {
			cadastraPessoas[i] = new PessoaA();
			System.out.println("nome: ");
			cadastraPessoas[i].setNome(valor.next());
			System.out.println("idade: ");
			cadastraPessoas[i].setIdade(valor.nextInt());
		}
		System.out.println(Arrays.toString(cadastraPessoas));

		return cadastraPessoas;
	}

	public String[] buscaPessoa(PessoaA[] cadastraPessoas) {
		String busca;
		String[] resultadoBusca = new String[cadastraPessoas.length];
		Scanner valorBusca = new Scanner(System.in);
		System.out.println("Qual pesquisa deseja fazer: ");
		busca = valorBusca.next();
		for (int i = 0; i < cadastraPessoas.length; i++) {
			if (cadastraPessoas[i].getNome().toLowerCase().contains(busca.toLowerCase())) {
				System.out.println(cadastraPessoas[i].getNome());
				resultadoBusca[i] = cadastraPessoas[i].getNome();
			}
		}
		System.out.println(Arrays.toString(resultadoBusca));

		return resultadoBusca;
	}
}

class PessoaA {
	private String nome;
	private int idade;

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

/*
 * MAIN PARA RODAR O MÉTODO DE CADASTRO SEPARADO DO MÉTODO DE BUSCA 
 * 
 * public class Main {
 * public static void main(String[] args) {
 * CadastroPessoa c1 = new CadastroPessoa(); 
 * Pessoa[] arrayPessoas = c1.cadastraPessoa();
 * c1.buscaPessoa(arrayPessoas); 
 * 		}
 *	}
 */

/*
 * vai criar uma classe Pessoa com os campos nome e idade vai criar um array com
 * alguns objetos Pessoa e vai fazer uma busca por parte do nome da pessoa isso
 * vai ser informado pelo usuÃ¡rio e vai apresentar todas as pessoas que entrarem
 * no filtro nome final apresentar a menor e a maior idade se tu quiser deixar
<<<<<<< HEAD
 * dinâmico pode solicitar a quantidade de registros pro usuário e informar o
 * nome e a idade de cada pessoa e depois apresenta essas informações
 */
=======
 * dinÃ¢mico pode solicitar a quantidade de registros pro usuÃ¡rio e informar o
 * nome e a idade de cada pessoa e depois apresenta essas informaÃ§Ãµes
 */
>>>>>>> 062586919dd7eda5a527b9d490327af890b76758
