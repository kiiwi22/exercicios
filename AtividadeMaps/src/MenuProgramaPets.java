
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class MenuProgramaPets {
	Map<Integer, String> pets = new TreeMap<Integer, String>();
	Leitor leitor = new Leitor();

	public void menuPets() {

		int opcaoMenu = 0;

		do {
			opcaoMenu = this.leitor.leInteiro("1 - Cadastrar / Alterar Pet " + "\n" + "2 - Exclus�o de pet (por c�digo)"
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
				System.out.println("Op��o inv�lida. Programa Encerrado.");

			}

		} while (opcaoMenu != 4);

	}

	private Map<Integer, String> cadastraPet() {
		String nomeTemp;
		Integer codigoTemp;
		Pet p = new Pet(this.leitor.leString("nome:"), this.leitor.leInteiro("C�digo"));
		nomeTemp = p.getNome();
		codigoTemp = p.getCodigo();
		pets.put(codigoTemp, nomeTemp);
		return pets;
	}

	private void removePet(Map<Integer, String> pets) {
		Integer codigoPetExcluido = this.leitor.leInteiro("C�digo que deseja excluir:");
		if (pets.get(codigoPetExcluido) == null) {
			System.out.println("C�digo n�o Existente.");
		} else {
			pets.remove(codigoPetExcluido);
		}
	}

	private void listagemPets(Map<Integer, String> pets) {
		Set<Pet> petsNomesOrdenados = new TreeSet<Pet>();
		String nomeTemp;
		Integer codigoTemp;
		for (Integer key : pets.keySet()) {
			nomeTemp = pets.get(key);
			codigoTemp = key;
			Pet p = new Pet(nomeTemp, codigoTemp);
			petsNomesOrdenados.add(p);
		}
		System.out.println(petsNomesOrdenados);
	}

}
