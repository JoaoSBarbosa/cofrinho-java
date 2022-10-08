package com.cofrinho;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		// Locale para definir a separação de casas decimais no padrão US
		Locale.setDefault(Locale.US);

		// instanciações
		Scanner sc = new Scanner(System.in);
		Cofrinho cofrinho = new Cofrinho();
		Moeda moeda = null;

		// Menu e entrada de dados
		int opMenu;
		System.out.println("------------------------------------");
		System.out.println("Bem-Vindo ao cofrinho Midgard Banks");
		System.out.println("         By-João Barbosa           ");
		System.out.println("------------------------------------");
		System.out.println();
		try {

			System.out.println("");
			System.out.println("         MENU       ");
			System.out.println("");

			System.out.println("1 - Adicionar Moedas");
			System.out.println("2 - Remover Moedas");
			System.out.println("3 - Listar Moedas");
			System.out.println("4 - Total moeda convertida");
			System.out.println("0 - Sair");
			System.out.print(">> ");

			opMenu = sc.nextInt();

			// Switch case - Para capturar e tratar cada opção do menu
			while (opMenu != 0) { // Enquanto a opção for diferente de zero o loop vai repetir o menu na tela

				switch (opMenu) {

				// >>INSERIR MOEDAS<<
				case 1:
					int opMoeda = 0;
					do {

						System.out.println("----------------------");
						System.out.println("1 - ADICIONAR MOEDAS");
						System.out.println("----------------------");
						System.out.println("\nEscolha o tipo de moeda");
						System.out.println("1 - REAL");
						System.out.println("2 - EURO");
						System.out.println("3 - DOLAR");
						System.out.println("0 - SAIR");
						System.out.print(">> ");
						opMoeda = sc.nextInt();

						// Real
						if (opMoeda == 1) {
							System.out.println();
							System.out.println(">>>(R$ BRL)<<<");

							System.out.print("Valor da moeda R$: ");
							moeda = new Real(sc.nextDouble());
							cofrinho.adicionar(moeda);
							System.out.println();

							// Euro
						} else if (opMoeda == 2) {

							System.out.println();
							System.out.println(">>>(EUR)<<<");

							System.out.print("Valor da moeda: ");
							moeda = new Euro(sc.nextDouble());
							cofrinho.adicionar(moeda);
							// Dolar
						} else if (opMoeda == 3) {
							System.out.println();
							System.out.println(">>>($ USD)<<<");

							System.out.print("Valor da moeda $: ");
							moeda = new Dolar(sc.nextDouble());
							cofrinho.adicionar(moeda);
							// Opção de sair
						} else if (opMoeda == 0) {
							System.out.println("---------------------------");
							System.out.println("Voltando ao menu inicial...");
							System.out.println("---------------------------");
						}
					} while (opMoeda != 0);

					break;

				// >>REMOVER<<
				case 2:

					do {

						System.out.println("-----------------");
						System.out.println("2- REMOVER MOEDAS");
						System.out.println("-----------------");
						System.out.println("\nQue tipo de moeda você deseja excluir ?");
						System.out.println("1 - REAL");
						System.out.println("2 - EURO");
						System.out.println("3 - DOLAR");
						System.out.println("0 - CANCELAR");
						System.out.print(">> ");
						opMoeda = sc.nextInt();

						// Real
						if (opMoeda == 1) {
							System.out.print("Valor da moeda: ");
							moeda = new Real(sc.nextDouble()); // instanciando objeto do tipo Real
							cofrinho.remover(moeda); // chamando o método de remover através da classe Real
							System.out.println();

							// Euro
						} else if (opMoeda == 2) {
							System.out.print("Valor da moeda: ");
							moeda = new Euro(sc.nextDouble());
							cofrinho.remover(moeda);

							// Dolar
						} else if (opMoeda == 3) {

							System.out.print("Valor da moeda $: ");
							moeda = new Dolar(sc.nextDouble());
							cofrinho.remover(moeda);
							// Opção de cancelar a remoção
						} else if (opMoeda == 0) {
							System.out.println("---------------------------");
							System.out.println("Voltando ao menu inicial...");
							System.out.println("---------------------------");
						}
						System.out.println("Solicitação realizada com sucesso...");

					} while (opMoeda == 0);
					break;

				// >> EXIBIR LISTA DE MOEDAS <<
				case 3:
					System.out.println("-----------------------------------");
					System.out.println("(3) - LISTAGEM DE MOEDAS NO COFRINHO");
					System.out.println("-----------------------------------");
					cofrinho.listagemMoedas();
					break;

				// >> SOMAR TODAS AS MOEDAS E CONVERTE-LAS PARA BRL <<
				case 4:
					System.out.println("------------------------------------------");
					System.out.println("(4)- TOTAL DE MOEDA NO COFRINHO(R$)");
					System.out.println("------------------------------------------");

					cofrinho.totalConvertido();

					break;

				// >> CASO O USER DIGITE UM VALOR FORA DAS OPÇÕES
				default:
					System.out.println("Opção inválida");
				}
				System.out.println();
				System.out.println("");
				System.out.println("          MENU      ");
				System.out.println("");
				System.out.println("1 - Adicionar Moedas");
				System.out.println("2 - Remover Moedas");
				System.out.println("3 - Listar Moedas");
				System.out.println("4 - Calcular Total moeda (Conversão R$ BRL)");
				System.out.println("0 - Sair");
				System.out.println(">> ");
				opMenu = sc.nextInt();
			}

			sc.close(); // Fim do sc
			// >> TRATAMENTO DE EXECEÇÕES CAPTURADOS <<
		} catch (InputMismatchException e) {
			System.out.println("------------------------------------------");
			System.out.println("Por favor, insira apenas valores numéricos separados por '.' (ponto) "
					+ "\n               Exemplo: (0.25)" + "\n            Fechando o programa...");
			System.out.println("------------------------------------------");

		}

	}

}
