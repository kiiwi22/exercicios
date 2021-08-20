package atividadeZoologico;

import java.util.ArrayList;
import java.util.List;

public class CadastradorAnimal {

	private Leitor leitor = new Leitor();

	private Integer obtemQuantidadeAnimaisParaCadastro() {
		Integer quantidadeAnimais = this.leitor.leInteiro("Quantos animais deseja cadastrar?");
		return quantidadeAnimais;
	}

	public ArrayList<Animal> cadastraAnimal() {

		ArrayList<Animal> animalIndividual = new ArrayList();
		int contador = obtemQuantidadeAnimaisParaCadastro();
		EspecieAnimal especie = null;
		Integer especieTemp;

		for (int i = 0; i < contador; i++) {

			especieTemp = this.leitor.leInteiro("Qual a especie?");

			if (especieTemp == 1) {
				especie = especie.LEAO;
			} else if (especieTemp == 2) {
				especie = especie.ELEFANTE;
			} else if (especieTemp == 3) {
				especie = especie.MACACO;
			} else {
				System.out.println("Código inválido!");
			}

			Animal animal = new Animal(this.leitor.leString("Qual o nome?"), this.leitor.leDouble("Qual o peso?"),
					this.leitor.leInteiro("Qual a idade?"), especie);

			animalIndividual.add(animal);
		}
		System.out.println(animalIndividual);

		return animalIndividual;
	}

}