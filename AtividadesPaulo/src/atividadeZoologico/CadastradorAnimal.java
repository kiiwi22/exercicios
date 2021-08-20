package atividadeZoologico;

import java.util.ArrayList;
import java.util.List;

public class CadastradorAnimal {

	private Leitor leitor = new Leitor();

	private Integer obtemQuantidadeAnimaisParaCadastro() {
		String mensagem = "Quantos animais deseja cadastrar?";
		Integer quantidadeAnimais = this.leitor.leInteiro(mensagem);
		return quantidadeAnimais;
	}

	public ArrayList<Animal> cadastraAnimal() {

		ArrayList<Animal> animalIndividual = new ArrayList();
		int contador = obtemQuantidadeAnimaisParaCadastro();
		String mensagemNome = "Qual o nome?";
		String mensagemIdade = "Qual a idade?";
		String mensagemPeso = "Qual o peso?";
		String mensagemEspecie = "Qual a especie?";
		EspecieAnimal especie = null;
		Integer especieTemp;

		for (int i = 0; i < contador; i++) {

			especieTemp = this.leitor.leInteiro(mensagemEspecie);

			if (especieTemp == 1) {
				especie = especie.LEAO;
			} else if (especieTemp == 2) {
				especie = especie.ELEFANTE;
			} else if (especieTemp == 3) {
				especie = especie.MACACO;
			} else {
				System.out.println("Código inválido!");
			}

			Animal animal = new Animal(this.leitor.leString(mensagemNome), this.leitor.leDouble(mensagemPeso),
					this.leitor.leInteiro(mensagemIdade), especie);

			animalIndividual.add(animal);
		}
		System.out.println(animalIndividual);

		return animalIndividual;
	}

}