package composicao_agregacao;

public class Main {

	public static void main(String[] args) {
		Disciplina disciplina1 = new Disciplina("POO",12345);
		Disciplina disciplina2 = new Disciplina("POG", 12567);
		Curso curso = new Curso("POG", disciplina1,disciplina2);
	}
}


