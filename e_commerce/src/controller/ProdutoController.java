package controller;

import java.util.ArrayList;

import model.Produto;
import repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository {

	private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	private int id = 0;

	@Override
	public void listarTodos() {
		
		if (listaProdutos.isEmpty()) {
			System.out.println("\nNenhuma tinta cadastrada!");
			return;
		}

		for (var produto : listaProdutos) {
			produto.visualizar();
			
		}
	}

	@Override
	public void procurarPorId(int id) {

		for (var produto : listaProdutos) {

			if (produto.getId() == id) {
				produto.visualizar();
				return;
				
			}
		}
		System.out.println("\nO Produto não foi encontrado!");
		

	}

	@Override
	public void cadastrar(Produto produto) {

		listaProdutos.add(produto);
		System.out.println("\nProduto cadastrado com sucesso!");

	}

	@Override
	public void atualizar(Produto produto) {

		for (int i = 0; i < listaProdutos.size(); i++) {

			if (listaProdutos.get(i).getId() == produto.getId()) {
				listaProdutos.set(i, produto);

				System.out.println("\nProduto atualizado com sucesso!");
				return;

			}
		}

		System.out.println("\nO Produto não foi encontrado!");
	}

	@Override
	public void deletar(int id) {
		for (var produto : listaProdutos) {

			if (produto.getId() == id) {
				listaProdutos.remove(produto);

				System.out.println("\nProduto deletado com sucesso!");
				return;
			}
		}

	}

	public int gerarId() {
		return ++id;
	}
}
