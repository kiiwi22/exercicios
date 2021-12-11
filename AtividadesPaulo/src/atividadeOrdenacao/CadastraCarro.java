package atividadeOrdenacao;

import java.util.ArrayList;

public class CadastraCarro {

	private Leitor leitor = new Leitor();

	public ArrayList<Carro> cadastraCarro() {

		ArrayList<Carro> arrayCarro = new ArrayList();
		int contador = this.leitor.leInteiro("Quantos carros deseja cadastrar?");

		for (int i = 0; i < contador; i++) {
			Carro carro = new Carro(this.leitor.leString("Qual a Marca?"), this.leitor.leInteiro("Qual o ano?"),
					this.leitor.leDouble("Qual a potencia do motor?"));
			arrayCarro.add(carro);
		}
		System.out.println(arrayCarro);
		return arrayCarro;
	}
}
