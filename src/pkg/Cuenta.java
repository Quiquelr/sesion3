package pkg;

public class Cuenta {
	
	String numero;
	String titular;
	Double saldo;
	
	public Cuenta(Double i) {
		this.saldo = i;
	}

	public void ingreso(int i) {
		saldo += i;
		
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

	public void reintegro(int i) {
		saldo -= i;
		
	}

}
