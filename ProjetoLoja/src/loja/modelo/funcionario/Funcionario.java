package loja.modelo.funcionario;

import loja.modelo.usuario.Usuario;

public class Funcionario extends Usuario {

	private double salario;
	private String funcao;

	public Funcionario(String nome, String sobrenome, String numDocumento, double salario, String funcao) {
		super(nome, sobrenome, numDocumento);
		this.salario = salario;
		this.funcao = funcao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	@Override
	public String toString() {
		return "\nFuncion�rio:\nNome: " + getNome() + " " + getSobrenome() + "\nFun��o: " + getFuncao()
				+ "\nDocumento de identifica��o: " + getNumDocumento() + "\nSal�rio: " + getSalario() + "\n";
	}

}
