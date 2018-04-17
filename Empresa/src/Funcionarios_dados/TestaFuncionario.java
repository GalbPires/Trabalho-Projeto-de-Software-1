package Funcionarios_dados;

public class TestaFuncionario {
			 
			public static void main(String[] args){
				
				Funcionario f1 = new Funcionario();
				
				f1.nome="Fabio";
				f1.departamento="Tesouraria";
				f1.rg = "11111111-0";
				f1.salario=5000.0;
				f1.dataEntradaBanco="18/01/2014";
				f1.ativoNaEmpresa=true;
				
//				f1.demite();
				
				f1.recebeAumento(1000);
				System.out.println("Rendimentos previstros em 2015: " +f1.calculaGanhoAnual());
				
	     System.out.println("O nome do funcionario:"+f1.nome);
	     System.out.println("Departamento:"+f1.departamento);
	     System.out.println("Salario :"+f1.salario);
	     System.out.println("Data da Entrada:"+f1.dataEntrada);
	     System.out.println("RG:"+f1.rg);
	     System.out.println("Bonificacao;"+f1.bonificacao);
	     System.out.println("Funcionário ativo:"+f1.ativoNaEmpresa);
	      
	  } 
	 }
