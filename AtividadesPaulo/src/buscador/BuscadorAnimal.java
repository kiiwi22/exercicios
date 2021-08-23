package buscador;

import animal.Animal;

import java.util.ArrayList;
import java.util.List;

class BuscadorAnimal {

	List<Animal> buscaNomeAnimal(List<Animal> animais, String nomeAnimal) {
		final List<Animal> animaisEncontrados = new ArrayList<Animal>();

		for (Animal animal : animais) {
			if (animal.getNome().toLowerCase().contains(nomeAnimal.toLowerCase())) {
				animaisEncontrados.add(animal);
			}
		}
		return animaisEncontrados;
	}

	Animal pesquisaAnimalMaiorIdade(List<Animal> animais) {
		int idadeTemp = 0;
		Animal animalMaiorIdade = null;
		for (Animal ref : animais) {
			if (idadeTemp < ref.getIdade()) {
				animalMaiorIdade = ref;
				idadeTemp = ref.getIdade();
			}
		}
		System.out.println("O animal mais velho é " + animalMaiorIdade.getNome() + " com " + animalMaiorIdade.getIdade()
				+ " anos de idade.");
		return animalMaiorIdade;

	}

	Animal pesquisaAnimalMaiorPeso(List<Animal> animais) {
		double pesoTemp = 0;
		Animal animalMaiorPeso = null;
		for (Animal ref : animais) {
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
