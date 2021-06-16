
public class Salario {
	public double calculaSalario (double salario) {
		System.out.println("Salário inicial: " + salario);
		salario = salario + (salario * 0.15);
		System.out.println("Salário com 15% de aumento: " + salario);
		double salarioFinal=0;
		salarioFinal = (salario) - ((salario*8/100));
		System.out.println("Salário final com 8% de desconto: " + salarioFinal);
		
		return salarioFinal;
	}
}
