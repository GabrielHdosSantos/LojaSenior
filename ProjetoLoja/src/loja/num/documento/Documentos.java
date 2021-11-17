package loja.num.documento;

public enum Documentos {

	CPF(1), CNPJ(2);
	
	private int valor;

	Documentos(int valor) {
		this.valor = valor;
	}

	public int getValor(int valor) {
		return valor;
	}

}
