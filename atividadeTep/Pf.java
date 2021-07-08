package atividadeTep;

public class Pf extends Funcionario{
	private String cpf;
	Funcionario funcionario;
	
	public Pf() {
		
	}

	public Pf(String cpf, String name, float salario) {
		this.cpf = cpf;
		funcionario = new Funcionario(name, salario);
		
		this.setBeneficios();
		
	}
	
	public void setBeneficios() {
		funcionario.setBeneficios("Saúde");
		funcionario.setBeneficios("VR");
		funcionario.setBeneficios("Férias");
	}
}
