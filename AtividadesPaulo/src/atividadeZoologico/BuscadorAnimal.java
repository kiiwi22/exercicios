package atividadeZoologico;

import java.util.ArrayList;

public class BuscadorAnimal {

	private Leitor leitor = new Leitor();

	public Animal buscaNomeAnimal(ArrayList<Animal> animal) {

		String termoPesquisa = this.leitor.leString("Qual sua pesquisa?");
		Animal animalBuscado = null;

		for (Animal ref : animal) {
			if (ref.getNome().toLowerCase().contains(termoPesquisa.toLowerCase())) {
				animalBuscado = ref;
				System.out.println(animalBuscado);
			}
		}
		return animalBuscado;
	}

	public Animal pesquisaAnimalMaiorIdade(ArrayList<Animal> animal) {
		int idadeTemp = 0;
		Animal animalMaiorIdade = null;
		for (Animal ref : animal) {
			if (idadeTemp < ref.getIdade()) {
				animalMaiorIdade = ref;
				idadeTemp = ref.getIdade();
			}
		}
		System.out.println("O animal mais velho é " + animalMaiorIdade.getNome() + " com " + animalMaiorIdade.getIdade()
				+ " anos de idade.");
		return animalMaiorIdade;

	}

	public Animal pesquisaAnimalMaiorPeso(ArrayList<Animal> animal) {
		double pesoTemp = 0;
		Animal animalMaiorPeso = null;
		for (Animal ref : animal) {
			if (pesoTemp < ref.getPeso()) {
				pesoTemp = ref.getPeso();
				animalMaiorPeso = ref;
			}
		}
		System.out.println("O animal mais pesado é " + animalMaiorPeso.getNome() + " com " + animalMaiorPeso.getPeso()
				+ " Kilos.");
		return animalMaiorPeso;

	}
}
