package model;

public abstract class Produto {
	
	private int id;
	private String nome;
	private String marca;
	private float preco;
	private int quantidade;

	public Produto(int id, String nome, String marca,float preco, int quantidade) {
		this.id = id;
		this.nome = nome;
		this.marca = marca;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public void visualizar() {
		System.out.println("\n\n*****************************************************");
		System.out.println("Dados do Produto:");
		System.out.println("*****************************************************");
		System.out.println("ID: " + this.id);
		System.out.println("Nome: " + this.nome);
		System.out.println("Marca: " + this.marca);
		System.out.println("Preço: R$ " + this.preco);
		System.out.println("Quantidade em estoque: " + this.quantidade);
	}
	
}
