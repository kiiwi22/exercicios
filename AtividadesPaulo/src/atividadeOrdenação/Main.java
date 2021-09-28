package atividadeOrdenação;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		CadastraCarro c = new CadastraCarro();
		OrdenadorCarros o = new OrdenadorCarros();
		ArrayList<Carro> carro = c.cadastraCarro();
		o.ordenadorCarros(carro);

	}

}