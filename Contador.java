
public class Contador {
	
	public void trocaValores(int[]valor1) {
		
		int primeiraPosi��o = valor1[0];
		int ultimaPosi��o = valor1[valor1.length-1];
		int[]valor2 = {valor1.length-1};
		valor2 = valor1;
		System.out.println(valor2[0]+","+valor2[1]+","+valor2[2]+","+valor2[3]+","+valor2[4]);
		valor2[0] = ultimaPosi��o;
		valor2[valor2.length-1] = primeiraPosi��o;
		System.out.println(valor2[0]+","+valor2[1]+","+valor2[2]+","+valor2[3]+","+valor2[4]);
	}
	
}
