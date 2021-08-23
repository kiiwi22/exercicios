package cadastro;

import animal.Animal;
import animal.EspecieAnimal;
import util.Leitor;

import java.util.ArrayList;
import java.util.List;

public class CadastradorAnimal {

	private Leitor leitor = new Leitor();

	private Integer obtemQuantidadeAnimaisParaCadastro() {
		return this.leitor.leInteiro("Quantos animais deseja cadastrar?");
	}

	public List<Animal> cadastraAnimais() {

		List<Animal> animais = new ArrayList<>();
		int total = obtemQuantidadeAnimaisParaCadastro();

		EspecieAnimal especie = null;
		Integer especieTemp;

		for (int i = 0; i < total; i++) {

			especieTemp = this.leitor.leInteiro("Qual a especie? (1 - LEÃO, 2 - ELEFANTE, 3 - MACACO)");

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

			animais.add(animal);
			leitor.limpaTela();
		}
		System.out.println(animais);

		return animais;
	}

}