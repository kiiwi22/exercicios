import java.util.Arrays;
import java.util.Scanner;

public class CadastroPessoa {

	public Pessoa[] cadastraPessoa() {
		Scanner valor = new Scanner(System.in);
		Integer tamanho;
		System.out.print("Quantas pessoas deseja cadastrar? ");
		tamanho = valor.nextInt();
		Pessoa[] cadastraPessoas = new Pessoa[tamanho];

		for (int i = 0; i < cadastraPessoas.length; i++) {
			cadastraPessoas[i] = new Pessoa();
			System.out.println("nome: ");
			cadastraPessoas[i].setNome(valor.next());
			System.out.println("idade: ");
			cadastraPessoas[i].setIdade(valor.nextInt());
		}
		System.out.println(Arrays.toString(cadastraPessoas));
		valor.close();
		return cadastraPessoas;
	}

	public String[] buscaPessoa(Pessoa[] cadastraPessoas) {
		String busca;
		String[] resultadoBusca = new String[cadastraPessoas.length];
		Scanner valorBusca = new Scanner(System.in);
		System.out.println("Qual pesquisa deseja fazer: ");
		busca = valorBusca.next();
		for (int i = 0; i < cadastraPessoas.length; i++) {
			if (cadastraPessoas[i].getNome().contains(busca)) {
				System.out.println(cadastraPessoas[i].getNome());
			}
		}
		System.out.println(Arrays.toString(resultadoBusca));
		valorBusca.close();
		return resultadoBusca;
	}
}

/*
 * vai criar uma classe Pessoa com os campos nome e idade vai criar um array com
 * alguns objetos Pessoa e vai fazer uma busca por parte do nome da pessoa isso
 * vai ser informado pelo usuário e vai apresentar todas as pessoas que entrarem
 * no filtro nome final apresentar a menor e a maior idade se tu quiser deixar
 * dinâmico pode solicitar a quantidade de registros pro usuário e informar o
 * nome e a idade de cada pessoa e depois apresenta essas informações
 */