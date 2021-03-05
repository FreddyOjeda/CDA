package co.edu.uptc.logica.modelo;

public class Vehiculo {
	
	private String propietario;
	private String placa;
	private String marca;
	private String color;
	private String servicio;
	private String tipoDeCarroceria;
	private String combustible;
	private String modelo;
	private String cilindraje;
	
	
	
	public Vehiculo(String propietario, String placa, String marca, String color, String servicio,
			String tipoDeCarroceria, String combustible, String modelo, String cilindraje) {
		
		this.propietario = propietario;
		this.placa = placa;
		this.marca = marca;
		this.color = color;
		this.servicio = servicio;
		this.tipoDeCarroceria = tipoDeCarroceria;
		this.combustible = combustible;
		this.modelo = modelo;
		this.cilindraje = cilindraje;
	}
	public String getPropietario() {
		return propietario;
	}
	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getServicio() {
		return servicio;
	}
	public void setServicio(String servicio) {
		this.servicio = servicio;
	}
	public String getTipoDeCarroceria() {
		return tipoDeCarroceria;
	}
	public void setTipoDeCarroceria(String tipoDeCarroceria) {
		this.tipoDeCarroceria = tipoDeCarroceria;
	}
	public String getCombustible() {
		return combustible;
	}
	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCilindraje() {
		return cilindraje;
	}
	public void setCilindraje(String cilindraje) {
		this.cilindraje = cilindraje;
	}

	
	

}
