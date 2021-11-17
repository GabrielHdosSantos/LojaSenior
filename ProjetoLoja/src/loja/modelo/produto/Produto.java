package loja.modelo.produto;

import java.util.UUID;

import loja.num.documento.Categoria;

public class Produto {

	private String nome;

	private String descricao;
	private double preco;
	private int codigo;
	private Categoria categorias;

	public Produto(String nome, String descricao, double preco, int codigo, Categoria categorias) {
		super();
		this.nome = nome;

		this.descricao = descricao;
		this.preco = preco;
		this.codigo = codigo;
		this.categorias = categorias;
	}
	
	public Produto(int codigo) {
		super();
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Categoria getCategorias() {
		return categorias;
	}

	public void setCategorias(Categoria categorias) {
		this.categorias = categorias;
	}

	@Override
	public String toString() {
		return "\nProduto \nNome=" + getNome() + " \nDescricao=" + getDescricao() + " \nPreco=" + getPreco() + "\nCodigo=" + codigo
				+ " \nCategorias=" + getCategorias() + "";
	}

}
