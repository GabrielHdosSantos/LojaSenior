package loja.modelo.cliente;

import loja.modelo.endereco.Endereco;
import loja.modelo.usuario.Usuario;

public class Cliente extends Usuario {

	private Endereco endereco;

	public Cliente(String nome, String sobrenome, String numDocumento, String estado, String cidade, String bairro,
			String rua, int numero, String descricao, Endereco endereco) {
		super(nome, sobrenome, numDocumento);
		this.endereco = endereco;

	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "\nCliente:\nNome: " + getNome() + " " + getSobrenome() + "\nDocumento de identificação: "
				+ getNumDocumento() + "\nEstado: " + endereco.getEstado() + "\nCidade:" + endereco.getCidade()
				+ "\nBairro:" + endereco.getBairro() + "\nRua:" + endereco.getRua() + "\nNúmero:"
				+ endereco.getNumero();
	}

}
