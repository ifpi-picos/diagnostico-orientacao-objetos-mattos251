package composicao_agregacao;

import java.util.ArrayList;
import java.util.List;


public class Curso {
	
	private String nome;
	private List<Disciplina> disciplinas;
	
	
	public Curso(String nome) {
		// TODO Auto-generated constructor stub
		this.nome = nome;
		this.disciplinas = new ArrayList<Disciplina>();
		System.out.println(this.disciplinas + this.nome);
		
	}
	
	public void adcionaDisciplina(Disciplina disciplina) {
		this.disciplinas.add(disciplina);
		
	}
	
	public void removeDisciplina(Disciplina disciplina){
		this.disciplinas.remove(disciplina);
	}

}
