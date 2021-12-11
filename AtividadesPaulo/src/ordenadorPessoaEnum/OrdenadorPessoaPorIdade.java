package ordenadorPessoaEnum;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenadorPessoaPorIdade implements OrdenadorPessoa{

	@Override
	public void ordenaPessoas(List<Pessoa> pessoas) {
		Comparator<Pessoa> comparador = new Comparator<Pessoa>() {

			@Override
			public int compare(Pessoa o1, Pessoa o2) {
				// TODO Auto-generated method stub
				return o1.getIdade().compareTo(o2.getIdade());
			}
	
		};
		
		Collections.sort(pessoas, comparador);
	}

}
