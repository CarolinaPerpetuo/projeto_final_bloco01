package model;

public class Tinta extends Produto {

	private String cor;
	private String tipo;
	private int ml;

	public Tinta(int id, String nome, String marca, float preco, int quantidade, String cor, String tipo, int ml) {

		super(id, nome, marca, preco, quantidade);

		this.cor = cor;
		this.tipo = tipo;
		this.ml = ml;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getMl() {
		return ml;
	}

	public void setMl(int ml) {
		this.ml = ml;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Cor: " + this.cor);
		System.out.println("Tipo: " + this.tipo);
		System.out.println("Volume: " + this.ml + "ml");
	}
}
