package exercicio9;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class GestaoAlunos {
	int indice = 0;
	Aluno alunos[] = new Aluno[50];
	
	void inicioAlunos() {
		for (int j = 0; j < 50; j++) {
			Aluno x = new Aluno(0, "", "", "");
			alunos[j] = x;
		}
	}
	
	void criar() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o ID do aluno:");
		long id =scan.nextLong();
		System.out.println("Informe a data de nascimento do aluno:");
		String nascimento = scan.next();
		System.out.println("Informe o RA do aluno:");
		String ra = scan.next();
		System.out.println("Informe o nome do aluno:");
		String nome = scan.next();
		Aluno aluno = new Aluno(id, nascimento, ra, nome);
		this.alunos[indice] = aluno;
		this.indice++;
		System.out.println("Aluno gravado com sucesso!");
		
	}
	
	public String atualizar() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o RA do aluno que queira atualizar os dados:");
		String x = scan.next();
		for (int i = 0; i < 50; i++) {
			if (alunos[i].ra.equals(x)) {
				System.out.println("Informe o 'novo nome' do aluno:");
				alunos[i].nome = scan.next();
				System.out.println("Informe a 'nova data de nascimento' do aluno:");
				alunos[i].nascimento = scan.next();
				return "Dados atualizados com sucesso!";
			}
		}
		return "RA de aluno não encontrado!";
	}
	
	public String exibir() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o RA do aluno que queira ver a info:");
		String x = scan.next();
		for (int i = 0; i < 50; i++) {
			if (alunos[i].ra.equals(x)) {
				return alunos[i].toString();
			}
		}	
		return "RA de aluno não encontrado!";
	}
	
	public String excluir() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o RA do aluno que queira excluir:");
		String x = scan.next();
		for (int i = 0; i < 50; i++) {
			if (alunos[i].ra.equals(x)) {
				Aluno aux = alunos[i];
				alunos[i] = null;
				return aux.toStringDel();
			}
		}
		return "RA de aluno não encontrado!";
	}
}
