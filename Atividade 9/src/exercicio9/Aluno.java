package exercicio9;

public class Aluno {
	long id;
	String nascimento;
	String ra;
	String nome;
	
	public Aluno(long ID, String Nascimento, String RA, String Nome) {
		this.id = ID;
		this.nascimento = Nascimento;
		this.ra = RA;
		this.nome = Nome;
	}
	
	public String toString() {
		String x = "ID do Aluno: " + this.id + " Data de Nascimento: " + this.nascimento + "\n"
				+ "RA: " + this.ra + " Nome: " + this.nome;
		return x;
	}
	
	public String toStringDel() {
		String x = "As informa��es do aluno removido s�o:\n"
				+ "ID do Aluno: " + this.id + " Data de Nascimento: " + this.nascimento + "\n"
				+ "RA: " + this.ra + " Nome: " + this.nome;
		return x;
	}
}