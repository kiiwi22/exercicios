package atividadeOrdenação;

import java.util.ArrayList;
import java.util.Collections;

public class OrdenadorCarros {

	Leitor leitor = new Leitor();

	public String escolheOrdenador(ArrayList<Carro> carro) {

		String ordenadorEscolhido = null;
		int confirmadorOrdenacao = this.leitor.leInteiro(
				"Se deseja Ordenar por Ano digite '1'. Se deseja Ordenar por Marca digite '2'. Se deseja Ordenar por Potencia digite '3'.");
		switch (confirmadorOrdenacao) {
		case 1:
			ordenadorEscolhido = "Ano";
			break;
		case 2:
			ordenadorEscolhido = "Marca";
			break;
		case 3:
			ordenadorEscolhido = "Potencia";
		default:
			System.out.println("Código inválido.");
		}

		return ordenadorEscolhido;
	}

	public ArrayList<Carro> ordenadorCarros(ArrayList<Carro> carro) {
		
		if (escolheOrdenador(carro) == "Ano") {
			Collections.sort(carro, new ComparadorAno());
		}else if (escolheOrdenador(carro) == "Marca") {
			Collections.sort(carro, new ComparadorMarca());
		}else if (escolheOrdenador(carro) == "Potencia") {
			Collections.sort(carro, new ComparadorPotenciaMotor());
		}else
			System.out.println("faloow");
		System.out.println(carro);
		return carro;
	}

}
