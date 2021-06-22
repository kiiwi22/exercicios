
public class AchaNumeros {

	public int encontraMenor(int[] numeros){
        int maior = 0;
        
        for (int numero : numeros) {
            if (numero > maior) {
                maior = numero;
            }
        }
        int menor = maior;
        for(int numeroArray : numeros) {
			if (numeroArray < menor) {
				menor = numeroArray;
			}
		}
        return menor;
    }
	/* 1 - m�todo recebe um par�metro de array
	 * 2 - cria uma variavel para receber o valor do retorno (maior = 0;), no caso do encontraMaior() � retornar o maior int do array
	 * 3 - inicia o foreach, numero : numeros (a variavel temporaria numero recebe os valores do array numeros)
	 * 4 - inicia um if, compara numero que cont�m o valor da posi��o atual x do array numeros com a variavel criada anteriormente.
	 * 	   Caso o valor da posi��o atual seja maior que o valor da vari�vel "maior" ent�o a variavel recebe o valor da posi��o x.
	 * 5 - no final do if a variavel "maior" ter� o mesmo valor que a posi��o x do array com o maior valor
	 * 6 - retorna a variavel "maior" com o maior valor do array*/
	
}
