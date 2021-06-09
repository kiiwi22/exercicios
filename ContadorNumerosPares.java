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
	 
	 
	 public int somaMatrizNumeros(int[][] numeros2){
		 int soma = 0;
		 for(int [] i : numeros2) {
			 for(int j : i) {
				 soma += j;
			 }
		 }
		 
	    return soma;	 
	 }
	 
}


/*public class ContadorNumerosPares {
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
}*/
