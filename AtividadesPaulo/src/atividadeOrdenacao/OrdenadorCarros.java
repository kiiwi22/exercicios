package atividadeOrdenacao;

import java.util.ArrayList;
import java.util.Collections;

public class OrdenadorCarros {

	Leitor leitor = new Leitor();

	public int escolheOrdenador(ArrayList<Carro> carro) {

		int ordenadorEscolhido = 0;
		int confirmadorOrdenacao = this.leitor.leInteiro(
				"Se deseja Ordenar por Ano digite '1'. Se deseja Ordenar por Marca digite '2'. Se deseja Ordenar por Potencia digite '3'.");
		switch (confirmadorOrdenacao) {
		case 1:
			ordenadorEscolhido = 1;
			break;
		case 2:
			ordenadorEscolhido = 2;
			break;
		case 3:
			ordenadorEscolhido = 3;
		default:
			System.out.println("Código inválido.");
		}

		return ordenadorEscolhido;
	}

	public ArrayList<Carro> ordenadorCarros(ArrayList<Carro> carro) {

		switch (escolheOrdenador(carro)) {
		case 1:
			Collections.sort(carro, new ComparadorAno());
			break;
		case 2:
			Collections.sort(carro, new ComparadorMarca());
			break;
		case 3:
			Collections.sort(carro, new ComparadorPotenciaMotor());
			break;
		default:
			System.out.println("Código inválido.");
		}

		System.out.println(carro);
		return carro;
	}

}
