package exercicio9;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class GestaoAlunos {
	int indice;
	Aluno alunos [];
	
	void criar() {
		Aluno aluno = new Aluno();
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o ID do aluno:");
		aluno.id =scan.nextLong();
		System.out.println("Informe a data de nascimento do aluno:");
		aluno.nascimento = scan.next();
		System.out.println("Informe o RA do aluno:");
		aluno.ra = scan.next();
		System.out.println("Informe o nome do aluno:");
		aluno.nome = scan.next();
		alunos[indice] = aluno;
		JOptionPane.showInputDialog("Aluno gravado com sucesso!");
		indice++;
		scan.close();
	}
	
	void atualizar() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o RA do aluno que queira atualizar os dados:");
		String x = scan.next();
		for (int i = 0; i <= alunos.length; i++) {
			if (alunos[i].ra.contains(x)) {
				System.out.println("Informe o 'novo nome' do aluno:");
				alunos[i].nome = scan.next();
				System.out.println("Informe a 'nova data de nascimento' do aluno:");
				alunos[i].nascimento = scan.next();
				JOptionPane.showInputDialog("Dados atualizados com sucesso!");
			}else {
				System.out.println("RA de aluno não encontrado!");
			}
		}
		scan.close();
	}
	
	void exibir() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o RA do aluno que queira ver a info:");
		String x = scan.next();
		for (Aluno aluno : alunos) {
			if (aluno.ra.contains(x)) {
				aluno.toString();
			}else {
				System.out.println("RA de aluno não encontrado!");
			}

		}
		scan.close();
	}
	
	void excluir() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o RA do aluno que queira excluir:");
		String x = scan.next();
		for (int i = 0; i <= alunos.length; i++) {
			if (alunos[i].ra.contains(x)) {
				alunos[i] = null;
			}else {
				System.out.println("RA de aluno não encontrado!");
			}
		}
		scan.close();
	}
}
