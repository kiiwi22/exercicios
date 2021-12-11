package ordenadorPessoaEnum;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(new Pessoa("Abadia", 40));
		pessoas.add(new Pessoa("Beto", 30));
		pessoas.add(new Pessoa("Camila", 20));
		pessoas.add(new Pessoa("Donald", 10));
		System.out.println("Ordenando por Nome");
		OrdenadorPessoaEnum.ORDENADOR_POR_NOME.ordenar(pessoas);
		apresentaPessoa(pessoas);
		System.out.println("\n\nOrdenando por Idade");
		OrdenadorPessoaEnum.ORDENADOR_POR_IDADE.ordenar(pessoas);
		apresentaPessoa(pessoas);
	}

	private static final void apresentaPessoa(List<Pessoa> pessoas) {
		for (Pessoa ref : pessoas) {
			System.out.println("Nome: " + ref.getNome() + " Idade: " + ref.getIdade());
		}
	}
}
