package com.cofrinho;

public class Real extends Moeda {
	
	// CONSTRUTOR
	public Real(double valor) {
		super(valor);
	}

	@Override
	public void info() {
		System.out.println("Real: " + String.format("%.2f", valor));
	}

	@Override
	public double converter() {
		return valor;

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
