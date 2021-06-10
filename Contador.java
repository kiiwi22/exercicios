
public class Contador {
	
	public void trocaValores(int[] valores) {
	   int aux = valores[0];
           valores[0] = valores[valores.length-1];
           valores[valores.length-1] = aux;
	}
	
}
