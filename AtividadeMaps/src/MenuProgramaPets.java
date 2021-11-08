
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class MenuProgramaPets {
	private Map<Integer, String> pets = new TreeMap<Integer, String>();
	private Leitor leitor = new Leitor();

	public void menuPets() {

		int opcaoMenu = 0;

		do {
			opcaoMenu = this.leitor.leInteiro("1 - Cadastrar / Alterar Pet " + "\n" + "2 - Exclusão de pet (por código)"
					+ "\n" + "3 - Listagem de pets (ordenado por nome) " + "\n" + "4 - Finalizar Programa.");

			switch (opcaoMenu) {
			case 1:

				cadastraPet();

				break;
			case 2:
				removePet(pets);

				break;
			case 3:
				listagemPets(pets);

				break;
			case 4:
				System.out.println("Programa Finalizado!");
				break;
			default:
				System.out.println("Opção inválida. Programa Encerrado.");

			}

		} while (opcaoMenu != 4);

	}

	private void cadastraPet() {
		String nomeTemp;
		Integer codigoTemp;
		Pet p = new Pet(this.leitor.leString("nome:"), this.leitor.leInteiro("Código"));
		nomeTemp = p.getNome();
		codigoTemp = p.getCodigo();
		pets.put(codigoTemp, nomeTemp);

	}

	private void removePet(Map<Integer, String> pets) {
		Integer codigoPetExcluido = this.leitor.leInteiro("Código que deseja excluir:");
		if (pets.get(codigoPetExcluido) == null) {
			System.out.println("Código não Existente.");
		} else {
			pets.remove(codigoPetExcluido);
		}
	}

	private void listagemPets(Map<Integer, String> pets) {
		Set<String> petsNomesOrdenados = new TreeSet<String>();
		String nomeTemp;

		for (Integer key : pets.keySet()) {
			nomeTemp = pets.get(key);

			petsNomesOrdenados.add(nomeTemp);
		}
		System.out.println(petsNomesOrdenados);
	}

}
