package loja.controle.main;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import loja.modelo.cliente.Cliente;
import loja.modelo.endereco.Endereco;
import loja.modelo.funcionario.Funcionario;
import loja.modelo.produto.Produto;
import loja.modelo.venda.Venda;
import loja.num.documento.Categoria;
import loja.num.documento.Documentos;
import loja.num.documento.FormaPgto;

public class Main {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		Random ran = new Random();
		ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		ArrayList<Venda> vendas = new ArrayList<Venda>();
		ArrayList<Integer> codigos = new ArrayList<Integer>();

		System.out.println("Bem vindo ao sistema da E-Senior");

		int opcao;

		do {

			System.out.println(
					"Selecione uma opção para começar: \n1 - Cadastrar Funcionário \n2 - Cadastrar Cliente \n3 - Cadastrar Produto\n4 - Fazer Pedido");
			opcao = leitor.nextInt();

			switch (opcao) {
			case 1:
				Funcionario funcionario = new Funcionario(null, null, null, 0, null);

				System.out.println("Informe o nome do funcionário: ");
				String nome = leitor.next();
				funcionario.setNome(nome);

				System.out.println("Informe o sobrenome do funcionário: ");
				String sobrenome = leitor.next();
				funcionario.setSobrenome(sobrenome);

				System.out
						.println("Selecione o tipo de documento: \n1 - " + Documentos.CPF + "\n2 - " + Documentos.CNPJ);
				int opcaoDocumento = leitor.nextInt();

				int opcaoInvalida = 0;
				while (opcaoInvalida == 0) {
					if (opcaoDocumento == 1) {
						System.out.println("Informe o CPF");
						String numDocumento = leitor.next();
						funcionario.setNumDocumento(numDocumento);
						opcaoInvalida = 1;

					} else if (opcaoDocumento == 2) {
						System.out.println("Informe o CNPJ");
						String numDocumento = leitor.next();
						funcionario.setNumDocumento(numDocumento);
						opcaoInvalida = 1;
					} else {
						System.out.println("Opção inválida!");
						opcaoInvalida = 0;
					}

				}

				System.out.println("Informe o salário do funcionário(a): " + nome);
				double salario = leitor.nextDouble();
				funcionario.setSalario(salario);

				System.out.println("Informe a função do funcionário(a): " + nome);
				String funcao = leitor.next();
				funcionario.setFuncao(funcao);

				funcionarios.add(funcionario);

				break;

			case 2:

				Cliente cliente = new Cliente(null, null, null, null, null, null, null, 0, null, null);

				System.out.println("Informe o seu nome: ");
				nome = leitor.next();
				cliente.setNome(nome);

				System.out.println("Informe o seu sobrenome: ");
				sobrenome = leitor.next();
				cliente.setSobrenome(sobrenome);

				System.out
						.println("Selecione o tipo de documento: \n1 - " + Documentos.CPF + "\n2 - " + Documentos.CNPJ);
				opcaoDocumento = leitor.nextInt();

				opcaoInvalida = 0;
				while (opcaoInvalida == 0) {
					if (opcaoDocumento == 1) {
						System.out.println("Informe o CPF");
						String numDocumento = leitor.next();
						cliente.setNumDocumento(numDocumento);
						opcaoInvalida = 1;

					} else if (opcaoDocumento == 2) {
						System.out.println("Informe o CNPJ");
						String numDocumento = leitor.next();
						cliente.setNumDocumento(numDocumento);
						opcaoInvalida = 1;
					} else {
						System.out.println("Opção inválida!");
						opcaoInvalida = 0;
					}

				}

				System.out.println("Digite o seu estado: ");
				String estado = leitor.next();
				System.out.println("Digite o nome da sua cidade: ");
				String cidade = leitor.next();
				System.out.println("Digite o nome do seu bairro: ");
				String bairro = leitor.next();
				System.out.println("Digite o nome da sua rua: ");
				String rua = leitor.next();
				System.out.println("Digite seu número: ");
				int numero = leitor.nextInt();
				System.out.println("Complemento: ");
				String complemento = leitor.nextLine();

				Endereco endereco = new Endereco(bairro, rua, numero, cidade, estado, complemento);
				cliente.setEndereco(endereco);

				clientes.add(cliente);

				break;

			case 3:
				Produto produto = new Produto(null, null, 0, 0, null);

				System.out.println("Informe o nome do produto: ");
				nome = leitor.next();
				produto.setNome(nome);

				System.out.println("Informe a descrição do produto: ");
				String descricao = leitor.next();
				produto.setDescricao(descricao);

				System.out.println("Informe o preço do produto ");
				double preco = leitor.nextDouble();
				produto.setPreco(preco);
			
				int codigo = (char) (65 + (Math.random() * 90));
				produto.setCodigo(codigo);
				codigos.add(codigo);

				System.out.println("Selecione o tipo de categoria: \n1 - " + Categoria.ACESSORIOS + "\n2 - "
						+ Categoria.ELETRONICO);
				int opcaoCategorias = leitor.nextInt();

				if (opcaoCategorias == 1) {
					produto.setCategorias(Categoria.ACESSORIOS);

				} else if (opcaoCategorias == 2) {
					produto.setCategorias(Categoria.ELETRONICO);
				}
				produtos.add(produto);
				break;

			case 4:

				Venda venda = new Venda(0, null, null, null, 0, null, null);

				int escolha = 0;

				do {

					for (Produto produtosVendas : produtos)
						System.err.println(produtosVendas.toString());

					System.out.println("Selecione o código do produto desejado ou digite 0 para sair: ");
					int produtoEscolhido = leitor.nextInt();

					if (codigos.contains(produtoEscolhido)) {
						venda.setProduto(produtoEscolhido);
					} else {
						System.out.println(venda.toString());
						System.out.println("Produto inexistente!");
					}

				} while (escolha != 0);

				System.out.println("Informe seu CPF: ");
				String cpfCliente = leitor.next();

				System.out.println(
						"Informe o tipo de pagamento: \n1 - Cartão de débito \n2 - Cartão de crédito \n3 - Boleto Bancário");
				int FormasPgto = leitor.nextInt();

				if (FormasPgto == 1) {
					venda.setFormaPgto(FormaPgto.CARTAODEBITO);
				} else if (FormasPgto == 2) {
					venda.setFormaPgto(FormaPgto.CARTAOCREDITO);
				} else if (FormasPgto == 3) {
					venda.setFormaPgto(FormaPgto.BOLETO);
				} else {
					System.out.println("Forma inválida de pagamento!");
				}

			}

		} while (opcao != 0);

		for (Funcionario funcionario : funcionarios) {
			System.err.println(funcionario);
		}

		for (Cliente cliente : clientes) {
			System.err.println(cliente.toString());
		}
		for (Produto produto : produtos) {
			System.err.println(produto.toString());
		}

		leitor.close();
	}

}
