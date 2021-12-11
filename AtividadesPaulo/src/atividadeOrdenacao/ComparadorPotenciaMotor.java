package atividadeOrdenacao;

import java.util.Comparator;

public class ComparadorPotenciaMotor implements Comparator<Carro> {

	@Override
	public int compare(Carro o1, Carro o2) {

		return o1.getPotenciaMotor().compareTo(o2.getPotenciaMotor());
	}

}
