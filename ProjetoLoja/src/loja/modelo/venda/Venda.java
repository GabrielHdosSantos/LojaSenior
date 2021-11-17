package loja.modelo.venda;

import java.time.LocalDate;

import loja.modelo.produto.Produto;
import loja.modelo.usuario.Usuario;
import loja.num.documento.FormaPgto;

public class Venda {

	private int produto;
	private Usuario usuario;
	private String numCartao;
	private String nomeCartao;
	private int cvv;
	private LocalDate dataValidade;
	private FormaPgto FormaPgto;

	public Venda(int produto, Usuario usuario, String numCartao, String nomeCartao, int cvv, LocalDate data,
			FormaPgto FormaPgto) {
		super();
		this.produto = produto;
		this.usuario = usuario;
		this.numCartao = numCartao;
		this.nomeCartao = nomeCartao;
		this.cvv = cvv;
		this.dataValidade = data;
		this.FormaPgto = FormaPgto;
	}

	public int getProduto() {
		return produto;
	}

	public void setProduto(int produto) {
		this.produto = produto;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getNumCartao() {
		return numCartao;
	}

	public void setNumCartao(String numCartao) {
		this.numCartao = numCartao;
	}

	public String getNomeCartao() {
		return nomeCartao;
	}

	public void setNomeCartao(String nomeCartao) {
		this.nomeCartao = nomeCartao;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public LocalDate getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(LocalDate data) {
		this.dataValidade = data;
	}

	public FormaPgto getFormaPgto() {
		return FormaPgto;
	}

	public void setFormaPgto(FormaPgto formaPgto) {
		FormaPgto = formaPgto;
	}

}
