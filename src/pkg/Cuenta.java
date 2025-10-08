package pkg;

import java.util.ArrayList;
import java.util.List;

import pkg.Movimiento.Signo;

public class Cuenta {
	
	String numero;
	String titular;
	Double saldo;
	List<Movimiento> movimientos;
	
	public Cuenta(Double i) {
		movimientos = new ArrayList<Movimiento>();
		this.saldo = i;
	}

	public void ingreso(Double i) {
		saldo += i;		
		movimientos.add(new Movimiento(i, false, "ingreso"));
	}

	public Double getSaldo() {
		// TODO Auto-generated method stub
		return saldo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public void reintegro(Double i) {
		if(saldo-i >= -500) {		
			saldo -= i;
			movimientos.add(new Movimiento(i, true, "reintegro"));
		}else {
			System.out.println("Fondos insuficientes");
		}
		
	}

}
