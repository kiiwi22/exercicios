
public class Polindromo {

	public void recebePalavra(String palavra) {
		String palavraInvertida = "";
		int tamanho = palavra.length();
		
		System.out.println(palavra);
		
		for(int i = tamanho-1; i >= 0;i--) {
			
			palavraInvertida += palavra.charAt(i);
			
		} 
		
		System.out.println(palavraInvertida);
		
		if(palavra.toLowerCase().equals(palavraInvertida.toLowerCase())) {
			System.out.println("� um pol�ndromo");
			System.out.println("-------------------------------------------");
		} else {
			System.out.println("N�o � um pol�ndromo");
			System.out.println("-------------------------------------------");
		}
	}
	
}
