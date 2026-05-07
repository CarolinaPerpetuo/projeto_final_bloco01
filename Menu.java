package haircolor_system;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		int opcao;
		while (true) {
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                SISTEMA COLOR HAIR                   ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastrar Tinta                      ");
			System.out.println("            2 - Listar Tintas                        ");
			System.out.println("            3 - Buscar Tinta por ID                  ");
			System.out.println("            4 - Atualizar Tinta                      ");
			System.out.println("            5 - Deletar Tinta                        ");
			System.out.println("            0 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Opção desejada:                                      ");
			System.out.println("                                                     ");
			opcao = leia.nextInt();
			if (opcao == 0) {
				System.out.println("\nSISTEMA COLOR HAIR - A cor que você busca está aqui!");
				sobre();
                leia.close();
				System.exit(0);
			}
			switch (opcao) {
				case 1:
					System.out.println("Cadastrar Tinta\n\n");
					break;
				case 2:
					System.out.println("Listar Tintas\n\n");
					break;
				case 3:
					System.out.println("Buscar Tinta por ID\n\n");
					break;
				case 4:
					System.out.println("Atualizar Tinta\n\n");
					break;
				case 5:
					System.out.println("Deletar Tinta\n\n");
					break;
				case 6:
					System.out.println("Sair\n\n");
					break;
				
				default:
					System.out.println("\nOpção Inválida!\n");
					break;
			}
		}
	}
  
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Generation Brasil - generation@generation.org");
		System.out.println("github.com/conteudoGeneration");
		System.out.println("*********************************************************");


	}

}
