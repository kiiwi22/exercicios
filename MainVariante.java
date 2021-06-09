package main;

import contador.ContadorNumerosPares;

public class MainVariante {

	public static void main(String[] args) {
		ContadorNumerosPares c1 = new ContadorNumerosPares();
		int[][] numeros2 = new int [4][6];
		numeros2[0][0] = 1;
		numeros2[0][1] = 1;
		numeros2[0][2] = 1;
		numeros2[0][3] = 1;
		numeros2[0][4] = 1;
		numeros2[0][5] = 1;
		numeros2[1][0] = 1;
		numeros2[1][1] = 1;
		numeros2[1][2] = 1;
		numeros2[1][3] = 1;
		numeros2[1][4] = 1;
		numeros2[1][5] = 1;
		numeros2[2][0] = 1;
		numeros2[2][1] = 1;
		numeros2[2][2] = 1;
		numeros2[2][3] = 1;
		numeros2[2][4] = 1;
		numeros2[2][5] = 1;
		numeros2[3][0] = 1;
		numeros2[3][1] = 1;
		numeros2[3][2] = 1;
		numeros2[3][3] = 1;
		numeros2[3][4] = 1;
		numeros2[3][5] = 2;
		
		
		System.out.println(c1.somaMatrizNumeros(numeros2));
		
	}

}


