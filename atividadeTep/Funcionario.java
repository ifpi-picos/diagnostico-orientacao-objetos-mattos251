package atividadeTep;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {
	//ATRIBUTOS
	private String nome;
	private float salario;
	private List<String> beneficios = new ArrayList<>();
	
	//CONSTRUTOR
	public Funcionario() {
		
	}
	
	public Funcionario(String nome, float salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	
	//MÉTODOS 
	public float getSalarioLiquido() {
		return this.salario;
	}
	
	public void setSalarioLiquido(float salario) {
		this.salario = salario;
	}
	
	public void getBeneficios() {
		System.out.println("Benefícios!");
	}
	
	public void setBeneficios(String beneficios ) {
		this.beneficios.add(beneficios);
	}
}
