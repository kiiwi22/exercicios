package contador;

public class ContadorNumerosPares {
	
	public int contaNumerosPares(int[] numeros) {
		int totNumPar = 0;
		for(int i = 0; i < numeros.length; i++) {
			boolean isPar = numeros[i]%2==0;
			if(isPar) {
				totNumPar++;
			} 
		} 
		return totNumPar;	
	}
	
	public int somaNumeros(int[] numeros) {
		int soma = 0;
		for(int i = 0; i < numeros.length; i++) {
			soma += numeros[i];
		}
		System.out.println(soma);
		return soma;
	}
	
	 public float mediaNumeros(int[] numeros) {
		float media; 
		media = (float) somaNumeros(numeros) / numeros.length;
		return media; 
	 }
}
