package Funcionarios_dados;

class Funcionario{           
	String nome;
	String departamento;
	double salario;
	String rg;
	String dataEntradaBanco;
	boolean ativoNaEmpresa;  
	double bonificacao;
	String dataEntrada;
	
		
	boolean recebeAumento(double valor){
		if (ativoNaEmpresa == true){
			this.salario += valor;
			System.out.println("Salário reajustado, novo salario: " +this.salario);
					
			return true;
		}
		else{
			System.out.println("Funcionario demitido não recebe aumento!");
			return false;
		}
	}
	double calculaGanhoAnual(){
		return this.salario = this.salario * 12;
		
	}
	boolean demite(){
		if(ativoNaEmpresa == true){
			System.out.println("Funcionario demitido em 18/01/2015!");
			ativoNaEmpresa = false;
			return true;
		}
		else{
			System.out.println("O funcionario já foi demitido antes!");
			return false;
		}
			
	}
	void mostrar(){
		String status= "";
		if(ativoNaEmpresa == false){
			status="Ativo";
			
		}
		else{
			status="Inativo";
		}
			
		System.out.println("Nome: " +this.nome+
				"Rg: "+this.rg+
				"Data de Entrada: "+this.dataEntradaBanco+
				"Departamento: "+this.departamento+
				"Salario: " + this.salario+
				"Status: " + status);
	}
	
		
}