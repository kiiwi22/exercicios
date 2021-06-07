package contador;

public class ContadorNumerosPares {
	int soma;
	
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
	
	public void somaNumeros(int[] numeros) {

		for(int i = 0; i < numeros.length; i++) {
			soma = numeros[i] + soma;
		}
		System.out.println(soma);
		mediaNumeros(numeros);
	}
	
	 public void mediaNumeros(int[] numeros) {
		 
		 soma = soma / numeros.length;
		 System.out.println(soma);
	 }
}
