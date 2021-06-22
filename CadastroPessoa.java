import java.util.Arrays;
import java.util.Scanner;

public class CadastroPessoa {

	public Pessoa[] cadastraPessoa() {
		Scanner valor = new Scanner (System.in);
		String nome = "";
		Integer idade = 0; 
		Integer tamanho;
		System.out.print("Quantas pessoas deseja cadastrar? ");
		tamanho = valor.nextInt();
		Pessoa[] nomePessoas = new Pessoa [tamanho];
		
		for(int i = 0; i <= nomePessoas.length-1;i++) {
			nomePessoas[i] = new Pessoa(nome, idade);
			System.out.println("nome: ");
			nome = valor.next();
			nomePessoas[i].setNome(nome);
			System.out.println("idade: ");
			idade = valor.nextInt();
			nomePessoas[i].setIdade(idade);
		}System.out.println(Arrays.toString(nomePessoas));
		valor.close();
		return nomePessoas;
	}
}

/*vai criar uma classe Pessoa com os campos nome e idade
vai criar um array com alguns objetos Pessoa e vai fazer uma busca por parte do nome da pessoa
isso vai ser informado pelo usuário e vai apresentar todas as pessoas que entrarem no filtro
nome final apresentar a menor e a maior idade se tu quiser deixar dinâmico pode solicitar a quantidade
de registros pro usuário e informar o nome e a idade de cada pessoa e depois apresenta essas informações*/