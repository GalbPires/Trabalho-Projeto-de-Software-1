package Funcionarios_dados;

public class TestaFuncionario1 {

	public static void main(String[] args) {

		Funcionario1 funcionario2 = new Funcionario1("Graziele", "Pires", "Computação","12-01-2010", "0123456789", "012345678910", 2000);
		Funcionario1 funcionario3 = new Funcionario1("Matheus", "Robert", "Computação","12-01-2010", "0651060650", "65415165165165", 1000);
		
		System.out.println(funcionario2);
		System.out.println(funcionario3);
				
		System.out.println(funcionario2.calculaGanhoAnual());
		System.out.println(funcionario3.calculaGanhoAnual());
		
		
		funcionario2.recebeAumento(200);
		funcionario3.recebeAumento(100);
	
		System.out.println(funcionario2.calculaGanhoAnual());
		System.out.println(funcionario3.calculaGanhoAnual());
		
	}

}