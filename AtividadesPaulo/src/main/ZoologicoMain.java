package main;
import animal.Animal;
import buscador.GerenciadorPesquisaAnimal;
import cadastro.CadastradorAnimal;

import java.util.List;

import static util.Impressora.imprime;

public class ZoologicoMain {

	public static void main(String[] args) {

		final CadastradorAnimal cadastradorAnimal = new CadastradorAnimal();
		final GerenciadorPesquisaAnimal gerenciadorPesquisaAnimal = new GerenciadorPesquisaAnimal();

		List<Animal> animais = cadastradorAnimal.cadastraAnimais();

		List<Animal> animaisEncontradosPorNome = gerenciadorPesquisaAnimal.buscaAnimalPorNome(animais);
		Animal animalMaisVelho = gerenciadorPesquisaAnimal.pesquisaAnimalMaiorIdade(animais);
		Animal animalMaisPesado = gerenciadorPesquisaAnimal.pesquisaAnimalMaiorPeso(animais);

		imprime(animaisEncontradosPorNome);
		imprime("Animal mais pesado: ",animalMaisPesado);
		imprime("Animal mais velho: ", animalMaisVelho);
	}

}
