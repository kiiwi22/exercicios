import java.util.Scanner;

public class CadastrandoProdutos {

	public int procuraProduto () {
		Scanner scan = new Scanner(System.in);
		int codigoProduto;
		System.out.println("Digite o código do produto procurado: ");
		codigoProduto = scan.nextInt();
		scan.close();
		return codigoProduto;
	}
	
	public void classificaProduto () {
		
		switch(procuraProduto()) {
			
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("Alimento perecível");
			break;
		case 5:
		case 6:
			System.out.println("Vestuário");
			break;
		case 7:
			System.out.println("Higiene Pessoal");
			break;
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
		case 13:
		case 14:
		case 15:
			System.out.println("Limpeza e utensílios domésticos");
			break;
		default:
			System.out.println("Código inválido.");
		}
		
		
		
	}
	
}
