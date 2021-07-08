package composicao_agregacao;

public class Disciplina {
	
	String nome;
	int ch;
	Professor professor1;
	
	public Disciplina(String nome, int ch) {
		this.nome = nome;
		this.ch = ch;
		this.professor1 = new Professor();
	}
	
}