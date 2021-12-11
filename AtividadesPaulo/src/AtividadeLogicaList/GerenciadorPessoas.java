package AtividadeLogicaList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GerenciadorPessoas {
	Leitor leitor = new Leitor();

	public Integer qtdPessoas() {

		Integer qtdPessoasTemp = this.leitor.leInteiro("Entre 1 e 10 Pessoas, quantas quer cadastrar ?");
		Integer qtdPessoas = 0;
		if ((qtdPessoasTemp >= 1) && (qtdPessoasTemp <= 10)) {
			qtdPessoas = qtdPessoasTemp;
		} else {
			System.out.println("Numero de pessoas inválido.");
		}
		return qtdPessoas;

	}

	public ArrayList<String> cadastraNomes() {
		ArrayList<String> nomes = new ArrayList<String>();
		String nomeTemp;
		Integer contador = qtdPessoas();
		for (int i = 0; i < contador; i++) {
			nomeTemp = this.leitor.leString("Nome:");
			if ((nomeTemp.isEmpty()) || (nomeTemp == null)) {
				System.out.println("Entrada vazia");
			} else if (nomes.contains(nomeTemp)) {
				System.out.println("Nome já cadastrado");
			} else {
				nomes.add(nomeTemp);
			}

		}
		System.out.println(nomes);

		return nomes;

	}

	public void menuNomes(ArrayList<String> nomes) {
		Integer opcaoMenu;
		do {
			opcaoMenu = this.leitor.leInteiro("1 - Listar nomes ordenados de forma crescente" + "\n"
					+ "2 - Listar nomes ordenados de forma decrescente" + "\n" + "3 - Remover pessoa pelo nome" + "\n"
					+ "4 - Encerrar programa");

			switch (opcaoMenu) {
			case 1:
				ordenaNomes(nomes);
				break;

			case 2:
				ordenaNomesDecrescente(nomes);
				break;

			case 3:
				removeNome(nomes);
				break;

			case 4:
				System.out.println("Programa encerrado!");
				break;

			default:
				System.out.println("Comando inválido.");
			}

		} while (opcaoMenu != 4);
	}

	private void ordenaNomes(ArrayList<String> nomes) {
		Collections.sort(nomes);
		System.out.println(nomes);

		

	}

	private void ordenaNomesDecrescente(ArrayList<String> nomes) {
		ordenaNomes(nomes);
		Collections.reverse(nomes);

	}

	private List<String> removeNome(ArrayList<String> nomes) {
		String nomeTemp = this.leitor.leString("Qual nome deseja remover?");
		for (String ref : nomes) {
			if (ref.equalsIgnoreCase(nomeTemp)) {
				nomes.remove(ref);
			}
		}

		return nomes;

	}

}
