package com.cofrinho;

import java.util.ArrayList;

public class Cofrinho {
	// atributo
	private ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();
	
	// método especial get
	public ArrayList<Moeda> getListaMoedas() {
		return listaMoedas;
	}

	// método adicionar
	public void adicionar(Moeda valor) {
		listaMoedas.add(valor);
	}
	
	// método remover
	public void remover(Moeda valor) {
		listaMoedas.remove(valor);
	}
	// método para listar moedas
	public void listagemMoedas() {

		for (Moeda valor : listaMoedas) {
			valor.info();
		}

	}
	// método para somar as moedas e converté-las em real
	public void totalConvertido() {

		double total = 0;
		for (Moeda valor : listaMoedas) {
			total += valor.converter();
		}

		System.out.println("Valor total: R$ " +String.format("%.2f", total));
	}
}
