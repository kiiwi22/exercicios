package atividadeZoologico;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastradorAnimal extends Animal{

	public int quantidadeAnimaisCadastrados() {
		
		Scanner valor = new Scanner (System.in);
		int quantidadeAnimais = 0;
		System.out.println("Quantos animais deseja cadastrar?");
		quantidadeAnimais = valor.nextInt();
		
		
		return quantidadeAnimais;
	}
	
	public ArrayList<Animal> cadastrandoAnimais(){
		
		ArrayList<Animal> animais = new ArrayList<Animal>(quantidadeAnimaisCadastrados());
		Scanner valor = new Scanner (System.in);
		
		Animal[] animal = new Animal[quantidadeAnimaisCadastrados()];
		int especie;
		String nome;
		Integer idade;
		Double peso;
		for(int i = 0; i <= quantidadeAnimaisCadastrados(); i++) {
			animal[i] = new Animal();
			System.out.println("Qual o nome do animal?");	
			nome = valor.next();
			animal[i].setNome(nome);
			System.out.println("Qual a idade do animal?");
			idade = valor.nextInt();
			animal[i].setIdade(idade);
			System.out.println("Qual o peso do animal?");
			peso = valor.nextDouble();
			animal[i].setPeso(peso);
			System.out.println("Qual a espécie do animal? Digite 1 - Leão, 2 - Elefante, ou 3 - Macaco");
			especie = valor.nextInt();
				switch(especie) {
				case 1:animal[i].setEspecieAnimal(getEspecieAnimal().Leão);
				case 2:animal[i].setEspecieAnimal(getEspecieAnimal().Elefante);
				case 3:animal[i].setEspecieAnimal(getEspecieAnimal().Macaco);
				default:
					System.out.println("Código inválido.");
				}
			animais.add(animal[i]);
		}	
		return animais;
	}
}
