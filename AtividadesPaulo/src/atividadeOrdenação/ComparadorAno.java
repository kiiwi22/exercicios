package atividadeOrdenação;

import java.util.Comparator;

public class ComparadorAno implements Comparator<Carro>{

	@Override
	public int compare(Carro o1, Carro o2) {
		
		return o1.getAno().compareTo(o2.getAno());
	}

}
