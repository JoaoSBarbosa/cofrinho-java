package com.cofrinho;
public abstract class Moeda {
	// atributo
	double valor;

	// construtor
	public Moeda(double valor) {
		this.valor = valor;
	}

	// métodos abstratos
	public abstract void info();

	public abstract double converter();

	// equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moeda other = (Moeda) obj;
		return Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}

}
