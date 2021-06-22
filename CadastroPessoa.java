import java.util.Arrays;
import java.util.Scanner;

public class CadastroPessoa {

	public Pessoa[] cadastraPessoa() {
       	Scanner valor = new Scanner(System.in);
        Integer tamanho;
        System.out.print("Quantas pessoas deseja cadastrar? ");
        tamanho = valor.nextInt();
        Pessoa[] pessoas = new Pessoa[tamanho];

        for(int i = 0; i < pessoas.length;i++) {
            pessoas[i] = new Pessoa();
            System.out.println("nome: ");
            pessoas[i].setNome(valor.next());
            System.out.println("idade: ");
            pessoas[i].setIdade(valor.nextInt());
        }
        System.out.println(Arrays.toString(pessoas));
        valor.close();
        return pessoas;
    }
}

/*vai criar uma classe Pessoa com os campos nome e idade
vai criar um array com alguns objetos Pessoa e vai fazer uma busca por parte do nome da pessoa
isso vai ser informado pelo usuário e vai apresentar todas as pessoas que entrarem no filtro
nome final apresentar a menor e a maior idade se tu quiser deixar dinâmico pode solicitar a quantidade
de registros pro usuário e informar o nome e a idade de cada pessoa e depois apresenta essas informações*/
