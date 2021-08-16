package atividadeZoologico;

import java.util.ArrayList;
import java.util.Scanner;

public class BuscadorAnimal {

	public void buscaNomeAnimal(ArrayList<Animal> animal) {
		Scanner valor = new Scanner(System.in);
		String v = null;
		System.out.println("Qual sua pesquisa?");
		v = valor.next();

		for (Animal ref : animal) {
			if (ref.getNome().toLowerCase().contains(v.toLowerCase())) {
				System.out.println(ref);
			}
		}
	}

	public void pesquisaIdadeAnimal(ArrayList<Animal> animal) {
		int idadeTemp = 0;
		String nomeTemp = null;
		for (Animal ref : animal) {
			if (idadeTemp < ref.getIdade()) {
				idadeTemp = ref.getIdade();
				nomeTemp = ref.getNome();
			}
		}
		System.out.println("O animal mais velho é " + nomeTemp + " com " + idadeTemp + " anos de idade.");
	}

	public void pesquisaPesoAnimal(ArrayList<Animal> animal) {
		double pesoTemp = 0;
		String nomeTemp = null;
		for (Animal ref : animal) {
			if (pesoTemp < ref.getPeso()) {
				pesoTemp = ref.getPeso();
				nomeTemp = ref.getNome();
			}
		}
		System.out.println("O animal mais pesado é " + nomeTemp + " com " + pesoTemp + " Kilos.");
	}
}
