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
		return "\nFuncionário:\nNome: " + getNome() + " " + getSobrenome() + "\nFunção: " + getFuncao()
				+ "\nDocumento de identificação: " + getNumDocumento() + "\nSalário: " + getSalario() + "\n";
	}

}
