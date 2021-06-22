
public class AchaNumeros {

	public int encontraMenor(int[] numeros) {
		int maior = 0;

		for (int numero : numeros) {
			if (numero > maior) {
				maior = numero;
			}
		}
		int menor = maior;

		for (int numeroArray : numeros) {
			if (numeroArray < menor) {
				menor = numeroArray;
			}
		}
		return menor;
	}
}
/*
 * 1 - método recebe um parámetro de array 2 - cria uma variavel para receber o
 * valor do retorno (maior = 0;), no caso do encontraMaior() é retornar o maior
 * int do array 3 - inicia o foreach, numero : numeros (a variavel temporaria
 * numero recebe os valores do array numeros) 4 - inicia um if, compara numero
 * que contém o valor da posição atual x do array numeros com a variavel criada
 * anteriormente. Caso o valor da posição atual seja maior que o valor da
 * variável "maior" então a variavel recebe o valor da posição x. 5 - no final
 * do if a variavel "maior" terá o mesmo valor que a posição x do array com o
 * maior valor 6 - retorna a variavel "maior" com o maior valor do array
 */