
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

			switch (opcaoMenu) {
			case 1:

				cadastraPet(pets);

				break;
			case 2:
				removePet(pets);

				break;
			case 3:
				listarPets(pets);

				break;
			case 4:
				System.out.println("Programa Finalizado!");
				break;
			default:
				System.out.println("Opção inválida. Programa Encerrado.");

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
		if(pets.containsKey(codigoPetExcluido)) {
			pets.remove(codigoPetExcluido);
		} else {
			System.out.println("Código não Existente.");
		}
	}

	private void listarPets(Map<Integer, String> pets) {
		
		System.out.println(new TreeSet<String>(pets.values()));
		
		/*
		Solução 1:
		Set<String> petsNomesOrdenados = new TreeSet<String>(pets.values());
		System.out.println(petsNomesOrdenados);
		----------------------------------------------------------------------
		Solução 2:
		Set<String> petsNomesOrdenados = new TreeSet<String>();
		String nomeTemp;

		for (Integer key : pets.keySet()) {
			nomeTemp = pets.get(key);

			petsNomesOrdenados.add(nomeTemp);
		}
		System.out.println(petsNomesOrdenados);*/
	}

}
