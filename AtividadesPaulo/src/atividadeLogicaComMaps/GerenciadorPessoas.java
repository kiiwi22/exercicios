package atividadeLogicaComMaps;

import java.util.Map;
import java.util.TreeMap;

public class GerenciadorPessoas {

	private Leitor leitor = new Leitor();

	private Integer qtdPessoas() {

		Integer qtdPessoas = this.leitor.leInteiro("Quantas quer cadastrar ?");

		return qtdPessoas;

	}

	public void cadastraPessoas() {

		Map<String, Integer> mapPessoas = new TreeMap<String, Integer>();
		Integer contador = qtdPessoas();
		String nomeTemp;
		Integer contadorPessoas = 1;
		for (int i = 0; i < contador; i++) {
			nomeTemp = this.leitor.leString("Qual nome deseja cadastrar?");

			if (mapPessoas.containsKey(nomeTemp)) {
				mapPessoas.put(nomeTemp, mapPessoas.get(nomeTemp) + 1);
			} else {
				mapPessoas.put(nomeTemp, contadorPessoas);
			}

		}
		apresentaPessoasCadastradas(mapPessoas);
	}

	private void apresentaPessoasCadastradas(Map<String, Integer> pessoas) {
		for (String key : pessoas.keySet()) {
			System.out.println(key + " total: " + pessoas.get(key));
		}
	}

}
