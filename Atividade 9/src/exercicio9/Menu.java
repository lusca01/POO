package exercicio9;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		GestaoAlunos sla = new GestaoAlunos();
		Scanner scan = new Scanner(System.in);
		sla.inicioAlunos();
		while(true) {
			System.out.println("(C)riar           (E)xibir             (R)emover               \r\n"
					+ "                (A)tualizar    (S)air\r\n"
					+ "");
			String textoMaiusculo = scan.nextLine().toUpperCase();
            char letra = textoMaiusculo.charAt(0);
            switch (letra) {
			case 67:
				sla.criar();
				break;
			case 69:
				System.out.println(sla.exibir());
				break;
			case 82:
				System.out.println(sla.excluir());;
				break;
			case 65:
				System.out.println(sla.atualizar());;
				break;
			case 83:
				System.out.println("Encerrando...");
				scan.close();
				System.exit(0);
				break;
			default:
				System.out.println("Opção digitada inválida! \n");
				break;
			}
		}
	}	
}