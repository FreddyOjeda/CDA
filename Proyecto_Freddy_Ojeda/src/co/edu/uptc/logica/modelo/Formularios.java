package co.edu.uptc.logica.modelo;

public class Formularios {
	//datos de foto... whatsapp
	private String fechaActual,fechaSiguiente,placa;

	public Formularios(String actual, String placa, String siguiente) {
		this.fechaActual=actual;
		this.fechaSiguiente=siguiente;
		this.placa=placa;
	}
	
	public String getFechaActual() {
		return fechaActual;
	}

	public String getFechaSiguiente() {
		return fechaSiguiente;
	}

	public void setFechaActual(String fechaActual) {
		this.fechaActual = fechaActual;
	}

	public void setFechaSiguiente(String fechaSiguiente) {
		this.fechaSiguiente = fechaSiguiente;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	@Override
	public String toString() {
		return getFechaActual()+";"+getPlaca()+";"+getFechaSiguiente();
	}
	
	

}
