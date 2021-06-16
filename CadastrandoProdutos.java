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
			System.out.println("Alimento não perecível");
			break;
			
		case 2:
			System.out.println("Alimento perecível");
			break;
		case 3:
			System.out.println("Alimento perecível");
			break;
		case 4:
			System.out.println("Alimento perecível");
			break;
		case 5:
			System.out.println("Vestuário");
			break;
		case 6:
			System.out.println("Vestuário");
			break;
		case 7:
			System.out.println("Higiene Pessoal");
			break;
		case 8:
			System.out.println("Limpeza e utensílios domésticos");
			break;
		case 9:
			System.out.println("Limpeza e utensílios domésticos");
			break;
		case 10:
			System.out.println("Limpeza e utensílios domésticos");
			break;
		case 11:
			System.out.println("Limpeza e utensílios domésticos");
			break;
		case 12:
			System.out.println("Limpeza e utensílios domésticos");
			break;
		case 13:
			System.out.println("Limpeza e utensílios domésticos");
			break;
		case 14:
			System.out.println("Limpeza e utensílios domésticos");
			break;
		case 15:
			System.out.println("Limpeza e utensílios domésticos");
			break;
		default:
			System.out.println("Código inválido.");
			break;
			
		}
		
		
		
	}
	
}
