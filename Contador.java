import java.util.Arrays;
import java.util.Scanner;

public class Contador {
		
	public int passaTamanhoArray() {
		
		Scanner valor = new Scanner (System.in);
		int tamanhoArray;
		System.out.println("Insira o tamanho do Array: ");
		tamanhoArray = valor.nextInt();
		
		return tamanhoArray;
	}
		
	public int mediaValoresArray() {
		
		Scanner valor = new Scanner (System.in);
		
		int[] array1 = new int [passaTamanhoArray()];
		
		for(int i = 0; i <= array1.length-1;i++) {
			System.out.print("Insira um valor para a posição " + i + " do Array.");
			array1[i] = valor.nextInt();
			
		} System.out.println(Arrays.toString(array1));
		
		int soma = 0;
		for( int i : array1) {
		    soma += i;
		} System.out.println("A soma dos valores do Array é: " + soma);
		int mediaArray = soma / array1.length;
		System.out.println("A media dos valores do Array é: " + mediaArray);
		return mediaArray;
		}
}


