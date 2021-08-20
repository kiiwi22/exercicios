package atividadeZoologico;

import java.util.Scanner;

public class Leitor {
	
	private static final Scanner scanner = new Scanner(System.in);

    public Integer leInteiro(String mensagem){
        System.out.println(mensagem);
        return scanner.nextInt();
    }

    public String leString(String mensagem){
        System.out.println(mensagem);
        return scanner.next();
    }

    public Double leDouble(String mensagem){
        System.out.println(mensagem);
        return scanner.nextDouble();
    }
}
