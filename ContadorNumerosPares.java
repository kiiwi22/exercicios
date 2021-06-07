package contador;


public class ContadorNumerosPares {
	
	public int contaNumerosPares(int[] numeros) {
		int totNumPar = 0;
		int i = 0;
		while( i < numeros.length) {
			boolean isPar = numeros[i]%2==0;
			if(isPar) {
				totNumPar++;
				i++;
			}
			
		}
		return totNumPar;	
	}
	
	public int somaNumeros(int[] numeros) {
		int soma = 0;
		int i = 0;
		while( i < numeros.length) {
			soma += numeros[i];
			i++;	
		} System.out.println(soma);
		
		return soma;
	}
	
	 public float mediaNumeros(int[] numeros) {
		float media; 
		media = (float) somaNumeros(numeros) / numeros.length;
		return media; 
	 }
	
	 public int somaMatrizNumeros(int[][] numeros){
	    return 0;	 
	 }
}
