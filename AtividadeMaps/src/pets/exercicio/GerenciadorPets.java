package pets.exercicio;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class GerenciadorPets {

	private Leitor leitor = new Leitor();

	public void gerenciarPets() {
		Map<Integer, String> pets = new TreeMap<Integer, String>();
		int opcaoMenu = 0;

		do {
			opcaoMenu = this.leitor.leInteiro("1 - Cadastrar / Alterar Pet " + "\n" + "2 - Exclusão de pet (por código)"
					+ "\n" + "3 - Listagem de pets (ordenado por nome) " + "\n" + "4 - Finalizar Programa.");
			MenuEnum enumPets = MenuEnum.recuperaEnum(opcaoMenu);
			switch (enumPets) {
			case CADASTRAR_ALTERAR:

				cadastraPet(pets);

				break;
			case EXCLUSAO:
				removePet(pets);

				break;
			case LISTAGEM:
				listarPets(pets);

				break;
			case FINALIZAR_PROGRAMA:
				System.out.println("Programa Finalizado!");
				break;
			}

		} while (opcaoMenu != 4);

	}

	private void cadastraPet(Map<Integer, String> pets) {
		String nomeTemp;
		Integer codigoTemp;
		Pet p = new Pet(this.leitor.leString("nome:"), this.leitor.leInteiro("Código"));
		nomeTemp = p.getNome();
		codigoTemp = p.getCodigo();
		pets.put(codigoTemp, nomeTemp);

	}

	private void removePet(Map<Integer, String> pets) {
		Integer codigoPetExcluido = this.leitor.leInteiro("Código que deseja excluir:");
		if (pets.containsKey(codigoPetExcluido)) {
			pets.remove(codigoPetExcluido);
		} else {
			System.out.println("Código não Existente.");
		}
	}

	private void listarPets(Map<Integer, String> pets) {

		System.out.println(new TreeSet<String>(pets.values()));

		/*
		 * Solução 1: Set<String> petsNomesOrdenados = new
		 * TreeSet<String>(pets.values()); System.out.println(petsNomesOrdenados);
		 * ----------------------------------------------------------------------
		 * Solução 2: Set<String> petsNomesOrdenados = new TreeSet<String>(); String
		 * nomeTemp;
		 * 
		 * for (Integer key : pets.keySet()) { nomeTemp = pets.get(key);
		 * 
		 * petsNomesOrdenados.add(nomeTemp); } System.out.println(petsNomesOrdenados);
		 */
	}

}
