import java.util.Scanner;

public class ProgressaoAritmetica {

	public int fazProgressaoAritmetica () {
		
		Scanner valor = new Scanner (System.in);
		int tamanhoProgressao;
		int constanteProgressao;
		System.out.println("Digite o tamanho da progressão: ");
		tamanhoProgressao = valor.nextInt();
		System.out.println("Digite a constante da progressão: ");
		constanteProgressao = valor.nextInt();
		valor.close();
		int constanteTemp = 0;
		int constantePermanente = constanteProgressao;
		for (int i = 0; i < tamanhoProgressao; i++) {	
			constanteProgressao += constanteTemp;
			constanteTemp = constantePermanente;
			System.out.println(constanteProgressao);
		}
		return constanteProgressao;
	}
	
}
