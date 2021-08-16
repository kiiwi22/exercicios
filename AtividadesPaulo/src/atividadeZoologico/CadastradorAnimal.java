package atividadeZoologico;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastradorAnimal {

	public int quantidadeAnimaisCadastrados() {

		Scanner valor = new Scanner(System.in);
		int quantidadeAnimais = 0;
		System.out.println("Quantos animais deseja cadastrar?");
		quantidadeAnimais = valor.nextInt();
		return quantidadeAnimais;
	}

	public ArrayList<Animal> cadastraAnimal() {

		Scanner valor = new Scanner(System.in);
		ArrayList<Animal> animalIndividual = new ArrayList();
		int contador = quantidadeAnimaisCadastrados();
		String nome;
		Integer idade;
		Double peso;
		EspecieAnimal especie = null;
		Integer especieTemp;

		for (int i = 0; i < contador; i++) {

			System.out.println("Qual o nome?");
			nome = valor.next();
			System.out.println("Qual a idade?");
			idade = valor.nextInt();
			System.out.println("Qual o peso?");
			peso = valor.nextDouble();
			System.out.println("Qual a especie?");
			especieTemp = valor.nextInt();

			if (especieTemp == 1) {
				especie = especie.LEAO;
			} else if (especieTemp == 2) {
				especie = especie.ELEFANTE;
			} else if (especieTemp == 3) {
				especie = especie.MACACO;
			} else {
				System.out.println("Código inválido!");
			}

			Animal animal = new Animal(nome, peso, idade, especie);

			animalIndividual.add(animal);
		}
		System.out.println(animalIndividual);

		return animalIndividual;
	}

}