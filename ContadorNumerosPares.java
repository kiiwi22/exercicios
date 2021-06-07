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
	
}
