
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
			System.out.println("É um políndromo");
			System.out.println("-------------------------------------------");
		} else {
			System.out.println("Não é um políndromo");
			System.out.println("-------------------------------------------");
		}
	}
	
}
