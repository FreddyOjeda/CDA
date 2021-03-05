package co.edu.uptc.logica.modelo;

public class Carro extends Vehiculo{
	
	private String tipoDeCarro,cantidadDePuertas;
	
	

	//crear un clase tipo moto y ahcer la agregacion

	public Carro(String propietario, String placa, String marca, String color, String servicio, String tipoDeCarroceria,
			String combustible, String modelo, String cilindraje, String tipoDeCarro, String cantidadDePuertas) {
		
		super(propietario, placa, marca, color, servicio, tipoDeCarroceria, combustible, modelo, cilindraje);
		
		this.tipoDeCarro = tipoDeCarro;
		this.cantidadDePuertas = cantidadDePuertas;
	
	}

	public String getTipoDeCarro() {
		return tipoDeCarro;
	}

	public void setTipoDeCarro(String tipoDeCarro) {
		this.tipoDeCarro = tipoDeCarro;
	}

	public String getCantidadDePuertas() {
		return cantidadDePuertas;
	}

	public void setCantidadDePuertas(String cantidadDePuertas) {
		this.cantidadDePuertas = cantidadDePuertas;
	}

	@Override
	public String toString() {
		return getPropietario()+";"+getPlaca()+";"+getMarca()+";"+getColor()+";"+getServicio()+";"+getTipoDeCarroceria()+";"+getCombustible()+";"+getModelo()+";"+getCilindraje()+";"+getTipoDeCarro()+";"+getCantidadDePuertas();
	}
	
	
	
}
