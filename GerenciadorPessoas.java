import java.util.Arrays;
import java.util.Scanner;

public class GerenciadorPessoas {

	public Pessoa[] cadastraPessoa() {
		Scanner valor = new Scanner(System.in);
		Integer tamanho;
		System.out.print("Quantas pessoas deseja cadastrar? ");
		tamanho = valor.nextInt();
		Pessoa[] cadastraPessoas = new Pessoa[tamanho];

		for (int i = 0; i < cadastraPessoas.length; i++) {
			cadastraPessoas[i] = new Pessoa();
			System.out.println("nome: ");
			cadastraPessoas[i].setNome(valor.next());
			System.out.println("idade: ");
			cadastraPessoas[i].setIdade(valor.nextInt());
		}
		/*System.out.println(Arrays.toString(cadastraPessoas));*/

		return cadastraPessoas;
	}

	public String[] buscaPessoa(Pessoa[] cadastraPessoas) {
		String busca;
		String[] resultadoBusca = new String[cadastraPessoas.length];
		Scanner valorBusca = new Scanner(System.in);
		System.out.println("Qual pesquisa deseja fazer: ");
		busca = valorBusca.next();
		for (int i = 0; i < cadastraPessoas.length; i++) {
			if (cadastraPessoas[i].getNome().toLowerCase().contains(busca.toLowerCase())) {
				System.out.println(cadastraPessoas[i].getNome());
				resultadoBusca[i] = cadastraPessoas[i].getNome();
			}
		}
		System.out.println(Arrays.toString(resultadoBusca));

		return resultadoBusca;
	}

	public int achaMaiorIdade(Pessoa[] cadastraPessoas) {

		int maiorIdade = 0;

		for (int i = 0; i < cadastraPessoas.length; i++) {
			if (cadastraPessoas[i].getIdade() > maiorIdade) {
				maiorIdade = cadastraPessoas[i].getIdade();
			}
		}
		/* System.out.println("A maior idade é: "+maiorIdade); */
		return maiorIdade;
	}

	public int achaMenorIdade(Pessoa[] cadastraPessoas) {
		int menorIdade = 10000;

		for (int i = 0; i < cadastraPessoas.length; i++) {
			if (cadastraPessoas[i].getIdade() < menorIdade) {
				menorIdade = cadastraPessoas[i].getIdade();
			}
		}
		/* System.out.println("A menor idade é: " + menorIdade); */
		return menorIdade;
	}

	public String achaNomeRelacionadoMaiorIdade(Pessoa[] cadastraPessoas) {
		String nomeRelacionadoMaiorIdade = "";

		for (Pessoa array : cadastraPessoas) {
			if (array.getIdade() == achaMaiorIdade(cadastraPessoas)) {
				nomeRelacionadoMaiorIdade = array.getNome();
			}
		}
		System.out.println("O usuário mais velho cadastrado é: " + nomeRelacionadoMaiorIdade + " e a idade dele é: "
				+ achaMaiorIdade(cadastraPessoas) + " anos.");
		return nomeRelacionadoMaiorIdade;
	}

	public String achaNomeRelacionadoMenorIdade(Pessoa[] cadastraPessoas) {
		String nomeRelacionadoMenorIdade = "";

		for (Pessoa array : cadastraPessoas) {
			if (array.getIdade() == achaMenorIdade(cadastraPessoas)) {
				nomeRelacionadoMenorIdade = array.getNome();
			}
		}
		System.out.println("O usuário mais novo cadastrado é: " + nomeRelacionadoMenorIdade + " e a idade dele é: "
				+ achaMenorIdade(cadastraPessoas) + " anos.");
		return nomeRelacionadoMenorIdade;
	}

	public Pessoa pessoaMaiorIdade(Pessoa[] cadastraPessoas) {
		Pessoa maiorIdade = new Pessoa(achaNomeRelacionadoMaiorIdade(cadastraPessoas), achaMaiorIdade(cadastraPessoas));
		return maiorIdade;
	}

	public Pessoa pessoaMenorIdade(Pessoa[] cadastraPessoas) {
		Pessoa menorIdade = new Pessoa(achaNomeRelacionadoMenorIdade(cadastraPessoas), achaMenorIdade(cadastraPessoas));
		return menorIdade;
	}
	/*
	 * public Pessoa[] achaMaiorNomeIdade (Pessoa[] cadastraPessoas) {
	 * 
	 * int tamanho = 0;
	 * 
	 * for(Pessoa array : cadastraPessoas) { if(array.getIdade() ==
	 * achaMaiorIdade(cadastraPessoas)) { tamanho++; }if(array.getIdade() ==
	 * achaMenorIdade(cadastraPessoas)) { tamanho++; } } Pessoa[]
	 * arrayAchaMaiorNomeIdade = new Pessoa[tamanho]; for(int i = 0; i <
	 * cadastraPessoas.length; i++) { if(cadastraPessoas[i].getIdade() ==
	 * achaMaiorIdade(cadastraPessoas)) {
	 * arrayAchaMaiorNomeIdade[i].setIdade(achaMaiorIdade(cadastraPessoas));
	 * arrayAchaMaiorNomeIdade[i].setNome(achaNomeMaiorIdade(cadastraPessoas));
	 * }if(cadastraPessoas[i].getIdade() == achaMenorIdade(cadastraPessoas)) {
	 * arrayAchaMaiorNomeIdade[i].setIdade(achaMenorIdade(cadastraPessoas));
	 * arrayAchaMaiorNomeIdade[i].setNome(achaNomeMenorIdade(cadastraPessoas)); } }
	 * System.out.println("Resultado Final: " +
	 * Arrays.toString(arrayAchaMaiorNomeIdade)); return arrayAchaMaiorNomeIdade; }
	 */
}
