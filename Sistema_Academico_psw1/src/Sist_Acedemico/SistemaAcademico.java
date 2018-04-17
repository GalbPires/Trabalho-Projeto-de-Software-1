package Sist_Acedemico;

import java.util.ArrayList;
import java.util.List;

public class SistemaAcademico {
	private String entidade;
	private String cidade;
	List<Professor> professores = new ArrayList<>();
	List<Aluno> alunos = new ArrayList<Aluno>();

	public String getEntidade() {
		return entidade;
	}

	public void setEntidade(String entidade) {
		this.entidade = entidade;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public void addProfessor(Professor professor) {
		professores.add(professor);

	}

	public void addAluno(Aluno aluno) {
		alunos.add(aluno);
	}
	
	public List<Professor> getProfessores(){
		return professores;
	}

}