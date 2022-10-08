package com.cofrinho;

public class Euro extends Moeda {

	public Euro(double valor) {
		super(valor);
	}

	@Override
	public void info() {

		System.out.println("Euro: " + String.format("%.2f", valor));

	}
	// Sobrescrevendo o método abstrato da classe mãe - considerando o Euro em € 5,07
	@Override
	public double converter() {
		return valor * 5.07;
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
