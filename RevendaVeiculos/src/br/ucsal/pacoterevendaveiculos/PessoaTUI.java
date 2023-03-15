package br.ucsal.pacoterevendaveiculos;

import java.util.Scanner;

public class PessoaTUI {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void cadastrarPessoa() {
		 
		   System.out.println("----------CADASTRO DE PESSOA----------");
			
			System.out.println("Informe o seu cpf:");
			Integer cpf = sc.nextInt();
			
			System.out.println("Informe o seu nome:");
			String nome = sc.nextLine();
			
			System.out.println("Informe o seu endereço:");
			String endereco = sc.nextLine();

			System.out.println("Informe o seu cep:");
			Integer cep = sc.nextInt();

			System.out.println("Informe o seu logradouro:");
			String logradouro = sc.nextLine();
			
			System.out.println("Informe o número da sua casa:");
			Integer numero = sc.nextInt();
			
			System.out.println("Informe o seu bairro:");
			String bairro = sc.nextLine();
			
			System.out.println("Informe o seu telefone:");
			Integer telefone = sc.nextInt();
			
			Comprador comprador = new Comprador(cpf, nome, endereco, cep, logradouro, numero, bairro, telefone);
			PessoaDAO.incluir(comprador);
			
			
	}

}
