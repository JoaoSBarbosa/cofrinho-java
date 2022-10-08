package com.cofrinho;

public class Dolar extends Moeda {
	
	// construtor
	public Dolar(double valor) {
		super(valor);
		
	}
	
	@Override // sobrescrevendo o método da classe mãe(Polimorfismo)
	public void info() {
		System.out.println("Dolar: " + String.format("%.2f", valor));
	}

	@Override
	public double converter() {
		return valor * 5.20;
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}

}
