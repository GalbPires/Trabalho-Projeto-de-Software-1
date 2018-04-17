package Funcionarios_dados;

public class Funcionario1 {
	private String primeiroNome;
	private String sobrenome;
	private String dpto_trabalha;
	private String data_entrada;
	private String rg;
	private String cpf;
	private float salario;

	public Funcionario1() {
	}

	public Funcionario1(String primeiroNome, String sobrenome, String dpto_trabalha, String data_entrada, String rg,
			String cpf, float salario) {

		this.primeiroNome = primeiroNome;
		this.sobrenome = sobrenome;
		this.dpto_trabalha = dpto_trabalha;
		this.data_entrada = data_entrada;
		this.rg = rg;
		this.cpf = cpf;
		if (salario < 0.0)
			this.salario = 0;
		this.salario = salario;
	}
	
	public void recebeAumento(float aumento){
		this.salario = salario + aumento;
	}
	
	public float calculaGanhoAnual(){
		return	salario * 13;
	}
	
	@Override
	public String toString() {
			return String.format("Nome: " + primeiroNome + ", Sobrenome: " + sobrenome + ", Departamento: " + dpto_trabalha + 
					", Data de Entrada: " + data_entrada + ", RG: " + rg + ", CPF: " + cpf + ", Salario: " + salario);
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getDpto_trabalha() {
		return dpto_trabalha;
	}

	public void setDpto_trabalha(String dpto_trabalha) {
		this.dpto_trabalha = dpto_trabalha;
	}

	public String getData_entrada() {
		return data_entrada;
	}

	public void setData_entrada(String data_entrada) {
		this.data_entrada = data_entrada;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

}