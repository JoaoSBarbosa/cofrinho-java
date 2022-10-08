package com.cofrinho;

import java.util.ArrayList;

public class Cofrinho {
	// atributo
	private ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();
	
	// m�todo especial get
	public ArrayList<Moeda> getListaMoedas() {
		return listaMoedas;
	}

	// m�todo adicionar
	public void adicionar(Moeda valor) {
		listaMoedas.add(valor);
	}
	
	// m�todo remover
	public void remover(Moeda valor) {
		listaMoedas.remove(valor);
	}
	// m�todo para listar moedas
	public void listagemMoedas() {

		for (Moeda valor : listaMoedas) {
			valor.info();
		}

	}
	// m�todo para somar as moedas e convert�-las em real
	public void totalConvertido() {

		double total = 0;
		for (Moeda valor : listaMoedas) {
			total += valor.converter();
		}

		System.out.println("Valor total: R$ " +String.format("%.2f", total));
	}
}
