package loja.modelo.usuario;

public class Usuario {

	private String nome;
	private String sobrenome;
	private String numDocumento;

	public Usuario(String nome, String sobrenome, String numDocumento) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.numDocumento = numDocumento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getNumDocumento() {
		return numDocumento;
	}

	public void setNumDocumento(String numDocumento) {
		this.numDocumento = numDocumento;
	}

}
