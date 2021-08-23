package util;

import java.util.Scanner;

public class Leitor {
	
	private static final Scanner scanner = new Scanner(System.in);
    private static final int QTD_LINHAS = 30;

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

    public void limpaTela(){
        for(int i = 0;i < QTD_LINHAS; i++){
            System.out.println();
        }
    }
}
