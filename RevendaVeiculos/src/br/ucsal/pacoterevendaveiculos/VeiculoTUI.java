package br.ucsal.pacoterevendaveiculos;

import java.util.Scanner;

public class VeiculoTUI {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void cadastrarMoto() {
		
		System.out.println("----------CADASTRO DE MOTOS----------");
		
		System.out.println("Informe a placa da moto:");
		String placa = sc.nextLine();
		
		System.out.println("Informe o ano de fabricação da moto:");
		Integer anoDeFabricacao = sc.nextInt();
		
		System.out.println("Informe o valor da moto:");
		Double valor = sc.nextDouble();

		System.out.println("Informe a categoria da moto:");
		String categoria = sc.nextLine();

		System.out.println("Informe a cilindrada da moto:");
		Double cilindrada = sc.nextDouble();
		
		try {
			Moto moto = new Moto(placa, anoDeFabricacao, valor, categoria, cilindrada);
			VeiculoDAO.incluir(moto);
		} catch (NegocioException e) {
			System.out.println(e.getMessage());
		}


	}
	
	public static void cadastrarVeiculoPasseio() {
      
		System.out.println("----------CADASTRO DE VEICULOS PARA PASSEIO----------");
		
		System.out.println("Informe a placa do veículo para passeio:");
		String placa = sc.nextLine();
		
		System.out.println("Informe o ano de fabricação do veículo para passeio:");
		Integer anoDeFabricacao = sc.nextInt();
		
		System.out.println("Informe o valor do veículo para passeio:");
		Double valor = sc.nextDouble();

		System.out.println("Informe o máximo de passageiros do veículo para passeio:");
		Integer maximoDePassageiro = sc.nextInt();

		System.out.println("Informe a capacidade do porta-malas do veículo para passeio:");
		Double capacidadePortaMalas = sc.nextDouble();
		
		try {
			VeiculoDePasseio vdpasseio = new VeiculoDePasseio(placa, anoDeFabricacao, valor, maximoDePassageiro, capacidadePortaMalas);
			VeiculoDAO.incluir(vdpasseio);
		} catch (NegocioException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void cadastrarVeiculoCarga() {
		   
		    System.out.println("----------CADASTRO DE VEICULOS DE CARGA----------");
			
			System.out.println("Informe a placa do veículo de carga:");
			String placa = sc.nextLine();
			
			System.out.println("Informe o ano de fabricação do veículo de carga:");
			Integer anoDeFabricacao = sc.nextInt();
			
			System.out.println("Informe o valor do veículo de carga:");
			Double valor = sc.nextDouble();

			System.out.println("Informe a capacidade máxima de carga do veículo de carga:");
			Integer capacidadeMaximaCarga = sc.nextInt();

			System.out.println("Informe a capacidade do porta-malas do veículo de carga:");
			Double capacidadeCombustivel = sc.nextDouble();
			
			System.out.println("Informe a quantidade de eixos do veículo de carga:");
			Integer quantidadeEixos = sc.nextInt();
			
			try {
				VeiculoDeCarga vdcarga = new VeiculoDeCarga(placa, anoDeFabricacao, valor, capacidadeMaximaCarga, capacidadeCombustivel, quantidadeEixos);
				VeiculoDAO.incluir(vdcarga);
			} catch (NegocioException e) {
				System.out.println(e.getMessage());
			}
			
	}
	

	
	
	

}
