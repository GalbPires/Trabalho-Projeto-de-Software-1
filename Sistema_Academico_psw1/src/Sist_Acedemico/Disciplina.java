package Sist_Acedemico;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
	private String nome;
	private int cargaHoraria;
	private int creditos;
	
	
	List <Aluno> turma = new ArrayList<Aluno>();
	
	public List<Aluno> getAlunos(){
		return turma;
	}
	public void addAluno(Aluno aluno){
		turma.add(aluno);
	}
	
	public String getNome() {
		return nome;
	}
	
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public int getCreditos() {
		return creditos;
	}
	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}
	public void setNome(String nome) {
		this.nome = nome;
		
	}
	
}
