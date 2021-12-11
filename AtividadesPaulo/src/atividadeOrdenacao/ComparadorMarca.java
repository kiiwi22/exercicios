package atividadeOrdenacao;

import java.util.Comparator;

public class ComparadorMarca implements Comparator<Carro> {

	@Override
	public int compare(Carro o1, Carro o2) {

		return o1.getMarca().compareTo(o2.getMarca());
	}

}
