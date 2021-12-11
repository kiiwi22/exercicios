package ordenadorPessoaEnum;

import java.util.List;

public enum OrdenadorPessoaEnum {
	ORDENADOR_POR_NOME(new OrdenadorPessoaPorNome()),
	ORDENADOR_POR_IDADE(new OrdenadorPessoaPorIdade());
	
	private OrdenadorPessoa ordenador;
	
	OrdenadorPessoaEnum(OrdenadorPessoa ordenador){
		this.ordenador = ordenador;
	}
	
	public void ordenar (List<Pessoa>pessoas) {
		this.ordenador.ordenaPessoas(pessoas);
	}
	
}
