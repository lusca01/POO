package exercicio9;

public class Aluno {
	long id;
	String nascimento;
	String ra;
	String nome;
	
	public String toString() {
		String x = "ID do Aluno: " + id + " Data de Nascimento: " + nascimento + "\n"
				+ "RA: " + ra + " Nome: " + nome;
		return x;
	}
	
}
