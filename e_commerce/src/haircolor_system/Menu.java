package haircolor_system;

import java.util.Scanner;
import controller.ProdutoController;
import model.Tinta;

public class Menu {
	private static final ProdutoController produtoController = new ProdutoController();

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

				System.out.println("\nDigite o nome da tinta: ");
				leia.skip("\\R?");
				String nome = leia.nextLine();

				System.out.println("Digite a marca: ");
				String marca = leia.nextLine();

				System.out.println("Digite o preço: ");
				float preco = leia.nextFloat();

				System.out.println("Digite a quantidade em estoque: ");
				int quantidade = leia.nextInt();

				System.out.println("Digite a cor: ");
				leia.skip("\\R?");
				String cor = leia.nextLine();

				System.out.println("Digite o tipo da tinta: ");
				String tipo = leia.nextLine();

				System.out.println("Digite o volume em ml: ");
				int ml = leia.nextInt();

				produtoController.cadastrar(
						new Tinta(produtoController.gerarId(), nome, marca, preco, quantidade, cor, tipo, ml));
				break;

			case 2:
				System.out.println("Listar Tintas\n\n");
				produtoController.listarTodos();
				leia.skip("\\R?");
				leia.nextLine();
				break;

			case 3:
				System.out.println("Buscar Tinta por ID\n\n");
				System.out.println("Digite o ID da Tinta: ");
				int id = leia.nextInt();
				produtoController.procurarPorId(id);
				break;

			case 4:
				System.out.println("Atualizar Tinta\n\n");
				System.out.println("Digite o ID da tinta: ");
				id = leia.nextInt();

				leia.skip("\\R?");

				System.out.println("Digite o nome da tinta: ");
				nome = leia.nextLine();

				System.out.println("Digite a marca: ");
				marca = leia.nextLine();

				System.out.println("Digite o preço: ");
				preco = leia.nextFloat();

				System.out.println("Digite a quantidade em estoque: ");
				quantidade = leia.nextInt();

				leia.skip("\\R?");

				System.out.println("Digite a cor: ");
				cor = leia.nextLine();

				System.out.println("Digite o tipo da tinta: ");
				tipo = leia.nextLine();

				System.out.println("Digite o volume em ml: ");
				ml = leia.nextInt();

				produtoController.atualizar(new Tinta(id, nome, marca, preco, quantidade, cor, tipo, ml));
				break;

			case 5:
				System.out.println("Deletar Tinta\n\n");
				System.out.println("Digite o ID da tinta: ");
				id = leia.nextInt();
				produtoController.deletar(id);
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
