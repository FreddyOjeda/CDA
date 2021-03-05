package co.edu.uptc.logica.modelo;

public class Moto extends Vehiculo{
	
	private String tipoDeMoto;

	
	public Moto(String propietario, String placa, String marca, String color, String servicio, String tipoDeCarroceria,
			String combustible, String modelo, String cilindraje, String tipoDeMoto) {
		super(propietario, placa, marca, color, servicio, tipoDeCarroceria, combustible, modelo, cilindraje);
		this.tipoDeMoto = tipoDeMoto;
	}

	//crear un clase tipo moto y ahcer la agregacion
	
	public String getTipoDeMoto() {
		return tipoDeMoto;
	}

	public void setTipoDeMoto(String tipoDeMoto) {
		this.tipoDeMoto = tipoDeMoto;
	}

	@Override
	public String toString() {
		return getPropietario()+";"+getPlaca()+";"+getMarca()+";"+getColor()+";"+getServicio()+";"+getTipoDeCarroceria()+";"+getCombustible()+";"+getModelo()+";"+getCilindraje()+";"+getTipoDeMoto()+";";
	}
	
}
