package pkg;

public class Movimiento {
	
	public enum Signo{D,H}
	
	private Double importe;
	private Signo signo;
	private String detalle;
	public Double getImporte() {
		return importe;
	}
	public void setImporte(Double importe) {
		this.importe = importe;
	}
	public Signo getSigno() {
		return signo;
	}
	public void setSigno(Signo signo) {
		this.signo = signo;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	public Movimiento(Double importe, Boolean signo, String detalle) {
		super();
		this.importe = importe;
		if(signo) {
			this.signo = Signo.D; 
		}else {
			this.signo = Signo.H;
		}
		this.detalle = detalle;
	}	

}
