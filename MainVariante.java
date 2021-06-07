package main;

import contador.ContadorNumerosPares;

public class MainVariante {

	public static void main(String[] args) {
		ContadorNumerosPares c1 = new ContadorNumerosPares();
		int[][] matrizNumeros = new int[][]{{1,2,3,4,5},
                                                    {6,7,8,9,10}};
		int[] numeros = new int[]{1,2,3,4,5,6,7,8,9};
		c1.somaNumeros(numeros);
		c1.mediaNumeros(numeros);
	}

}


