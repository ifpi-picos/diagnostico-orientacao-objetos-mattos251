package composicao_agregacao;

public class Disciplina {
	
	private String nome;
	private int ch;
	Professor professor = new Professor("genivaldo");
	
	public Disciplina(String nome, int ch) {
		this.nome = nome;
		this.ch = ch;
		System.out.println("Disciplina: " + this.nome  );
		System.out.println("ch: " + this.ch  );
		System.out.println("Professor: " + this.professor );
	}
	
}