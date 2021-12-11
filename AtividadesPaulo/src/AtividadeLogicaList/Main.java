package AtividadeLogicaList;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		GerenciadorPessoas g = new GerenciadorPessoas();
		ArrayList<String> nomes = new ArrayList<String>();
		nomes = g.cadastraNomes();
		g.menuNomes(nomes);

	}

}
