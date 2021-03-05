package co.edu.uptc.logica.control;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import co.edu.uptc.logica.modelo.Carro;
import co.edu.uptc.logica.modelo.Formularios;
import co.edu.uptc.logica.modelo.Moto;
import co.edu.uptc.persistencia.utilidades.Archivo;

public class CDA {
	
	private ArrayList<Carro> listaCarros;
	private ArrayList<Moto> listaMotos ;
	private ArrayList<Formularios> listaFormularios ;
	
	private Archivo a;
	private Carro nuevoCarro;
	private Moto nuevaMoto;
	private Formularios formulario;
	
	private final static String RUTACARRO="Recursos/Carro.txt";
	private final static String RUTAMOTO="Recursos/Moto.txt";
	private final static String RUTAFORMULARIO="Recursos/Formulario.txt";
	
	public CDA() {
		listaCarros = new ArrayList<Carro>();
		listaMotos = new ArrayList<Moto>();
		listaFormularios = new ArrayList<Formularios>();
		a = new Archivo();
	}
	
	public void registrarFormulario(String placa) {
		int aumento=0;
		for (int i = 0; i < listaFormularios.size(); i++) {
			if (placa.equals(listaFormularios.get(i).getPlaca())) {
				aumento++;
			}
		}
		GregorianCalendar fecha = new GregorianCalendar(); 
		String actual = fecha.get(Calendar.DATE)+"/"+fecha.get(Calendar.MONTH)+"/"+(fecha.get(Calendar.YEAR)+(aumento));
		String siguiente= fecha.get(Calendar.DATE) + "/" +fecha.get(Calendar.MONTH)+"/"+ (fecha.get(Calendar.YEAR)+(aumento+1));
		
		formulario = new Formularios(actual, placa, siguiente);
		listaFormularios.add(formulario);
	}
	
	public void registrarCarro(String propietario,String  placa,String  marca,String  color, String servicio, String tipoDeCarroceria, String combustible, String modelo, String cilindraje, String tipoDeCarro, String cantidadDePuertas) {
		nuevoCarro = new Carro(propietario, placa, marca, color, servicio, tipoDeCarroceria, combustible, modelo, cilindraje, tipoDeCarro, cantidadDePuertas);
		
		registrarFormulario(placa);
		
		listaCarros.add(nuevoCarro);
	}
	
	public void registrarMoto(String propietario,String  placa,String  marca,String  color, String servicio, String tipoDeCarroceria, String combustible, String modelo, String cilindraje, String tipoDeMoto) {
		nuevaMoto = new Moto(propietario, placa, marca, color, servicio, tipoDeCarroceria, combustible, modelo, cilindraje, tipoDeMoto);

		registrarFormulario(placa);
		
		listaMotos.add(nuevaMoto);
	}
	
	public boolean confirmarPlacaVehiculo(String placa) {
		boolean repetido=false;
		for (int i = 0; i < listaMotos.size(); i++) {
			if (placa.equals(listaMotos.get(i).getPlaca())) {
				repetido=true;
			}
		}
		for (int i = 0; i < listaCarros.size(); i++) {
			if (placa.equals(listaCarros.get(i).getPlaca())) {
				repetido=true;
			}
		}
		return repetido;
	}
	
	public boolean confirmarDatosMoto(String propietario,String  placa,String  marca,String  color, String servicio, String tipoDeCarroceria, String combustible, String modelo, String cilindraje, String tipoDeMoto) {
		boolean repetido=false;
		for (int i = 0; i < listaMotos.size(); i++) {
			if (propietario.equals(listaMotos.get(i).getPropietario()) 
					&& placa.equals(listaMotos.get(i).getPlaca())
					&& marca.equals(listaMotos.get(i).getMarca())
					&& color.equals(listaMotos.get(i).getColor())
					&& servicio.equals(listaMotos.get(i).getServicio())
					&& tipoDeCarroceria.equals(listaMotos.get(i).getTipoDeCarroceria())
					&& combustible.equals(listaMotos.get(i).getCombustible())
					&& modelo.equals(listaMotos.get(i).getModelo())
					&& cilindraje.equals(listaMotos.get(i).getCilindraje())
					&& tipoDeMoto.equals(listaMotos.get(i).getTipoDeMoto())) {
				repetido=true;
			}
		}
		return repetido;
	}
	
	public boolean confirmarDatosCarro(String propietario,String  placa,String  marca,String  color, String servicio, String tipoDeCarroceria, String combustible, String modelo, String cilindraje, String tipoDeCarro, String cantidadDePuertas) {
		boolean repetido=false;
		for (int i = 0; i < listaCarros.size(); i++) {
			if (propietario.equals(listaCarros.get(i).getPropietario()) 
					&& placa.equals(listaCarros.get(i).getPlaca())
					&& marca.equals(listaCarros.get(i).getMarca())
					&& color.equals(listaCarros.get(i).getColor())
					&& servicio.equals(listaCarros.get(i).getServicio())
					&& tipoDeCarroceria.equals(listaCarros.get(i).getTipoDeCarroceria())
					&& combustible.equals(listaCarros.get(i).getCombustible())
					&& modelo.equals(listaCarros.get(i).getModelo())
					&& cilindraje.equals(listaCarros.get(i).getCilindraje())
					&& tipoDeCarro.equals(listaCarros.get(i).getTipoDeCarro())
					&& cantidadDePuertas.equals(listaCarros.get(i).getCantidadDePuertas())) {
				repetido=true;
			}
		}
		return repetido;
	}
	
	public String[][] mostrarCarros() {
		String [][] datosCarro = new String[listaCarros.size()][11];
		
		for (int i = 0; i < listaCarros.size(); i++) {
			datosCarro[i][0] = listaCarros.get(i).getPropietario();
			datosCarro[i][1] = listaCarros.get(i).getPlaca();
			datosCarro[i][2] = listaCarros.get(i).getMarca();
			datosCarro[i][3] = listaCarros.get(i).getModelo();
			datosCarro[i][4] = listaCarros.get(i).getCilindraje();
			datosCarro[i][5] = listaCarros.get(i).getServicio();
			datosCarro[i][6] = listaCarros.get(i).getColor();
			datosCarro[i][7] = listaCarros.get(i).getTipoDeCarroceria();
			datosCarro[i][8] = listaCarros.get(i).getCombustible();
			datosCarro[i][9] = listaCarros.get(i).getTipoDeCarro();
			datosCarro[i][10] = listaCarros.get(i).getCantidadDePuertas();
		}
		
		return datosCarro;
	}
	
	public String[][] mostrarMotos() {
		String [][] datosMoto = new String[listaMotos.size()][10];
		
		for (int i = 0; i < listaMotos.size(); i++) {
			datosMoto[i][0] = listaMotos.get(i).getPropietario();
			datosMoto[i][1] = listaMotos.get(i).getPlaca();
			datosMoto[i][2] = listaMotos.get(i).getMarca();
			datosMoto[i][3] = listaMotos.get(i).getModelo();
			datosMoto[i][4] = listaMotos.get(i).getCilindraje();
			datosMoto[i][5] = listaMotos.get(i).getServicio();
			datosMoto[i][6] = listaMotos.get(i).getColor();
			datosMoto[i][7] = listaMotos.get(i).getTipoDeCarroceria();
			datosMoto[i][8] = listaMotos.get(i).getCombustible();
			datosMoto[i][9] = listaMotos.get(i).getTipoDeMoto();
		}
		
		return datosMoto;
	}
	
	public String[] buscarCarro(String placa) {
		String [] carro = new String[11];
		for (int i = 0; i < listaCarros.size(); i++) {
			if (placa.equals(listaCarros.get(i).getPlaca())) {
				carro[0] = listaCarros.get(i).getPropietario();
				carro[1] = listaCarros.get(i).getPlaca();
				carro[2] = listaCarros.get(i).getMarca();
				carro[3] = listaCarros.get(i).getModelo();
				carro[4] = listaCarros.get(i).getCilindraje();
				carro[5] = listaCarros.get(i).getServicio();
				carro[6] = listaCarros.get(i).getColor();
				carro[7] = listaCarros.get(i).getTipoDeCarroceria();
				carro[8] = listaCarros.get(i).getCombustible();
				carro[9] = listaCarros.get(i).getTipoDeCarro();
				carro[10] = listaCarros.get(i).getCantidadDePuertas();
			}
		}
		return carro;
	}
	
	public String[] buscarMoto(String placa) {
		String [] moto = new String[10];
		for (int i = 0; i < listaMotos.size(); i++) {
			if (placa.equals(listaMotos.get(i).getPlaca())) {
				moto[0] = listaMotos.get(i).getPropietario();
				moto[1] = listaMotos.get(i).getPlaca();
				moto[2] = listaMotos.get(i).getMarca();
				moto[3] = listaMotos.get(i).getModelo();
				moto[4] = listaMotos.get(i).getCilindraje();
				moto[5] = listaMotos.get(i).getServicio();
				moto[6] = listaMotos.get(i).getColor();
				moto[7] = listaMotos.get(i).getTipoDeCarroceria();
				moto[8] = listaMotos.get(i).getCombustible();
				moto[9] = listaMotos.get(i).getTipoDeMoto();
			}
		}
		return moto;
	}
	
	public String[][] buscarFormulario(String placa){
		int contador=0;
		for (int i = 0; i < listaFormularios.size(); i++) {
			if (placa.equals(listaFormularios.get(i).getPlaca())) {
				contador++;
			}
		}
		
		String [][] formulario = new String [contador][3];
		
		int j=0;
		for (int i = 0; i < listaFormularios.size(); i++) {
			if (placa.equals(listaFormularios.get(i).getPlaca())) {
				formulario[j][0] = listaFormularios.get(i).getFechaActual();
				formulario[j][1] = listaFormularios.get(i).getPlaca();
				formulario[j][2] = listaFormularios.get(i).getFechaSiguiente();
				j++;
			}
		}
		
		cargartxtFormulario();
		
		return formulario;
	}
	
	public void eliminarCarro(String placa) {
		for (int i = 0; i < listaCarros.size(); i++) {
			if (placa.equals(listaCarros.get(i).getPlaca())) {
				listaCarros.remove(i);
			}
		}
	}
	
	public void eliminarMoto(String placa) {
		for (int i = 0; i < listaMotos.size(); i++) {
			if (placa.equals(listaMotos.get(i).getPlaca())) {
				listaMotos.remove(i);
			}
		}
	}
	
	public void eliminarFormulario(String placa) {
		for (int i = 0; i < listaFormularios.size(); i++) {
			if (placa.equals(listaFormularios.get(i).getPlaca())) {
				listaFormularios.remove(i);
			}
		}
		for (int i = 0; i < listaFormularios.size(); i++) {
			if (placa.equals(listaFormularios.get(i).getPlaca())) {
				listaFormularios.remove(i);
			}
		}
		cargartxtFormulario();
	}
	
	//CARGA EL ARCHIVO PLANO CON LA LISTA DE CARROS
	public void cargartxtCarro() {
		String carros="";
		for (int i = 0; i < listaCarros.size(); i++) {
			carros+=listaCarros.get(i).toString()+"\n";
		}
		a.SobreescribirInformacion(RUTACARRO, carros);
	}
	
	//CARGA EL ARCHIVO PLANO CON LA LISTA DE MOTOS
	public void cargartxtMoto() {
		String motos="";
		for (int i = 0; i < listaMotos.size(); i++) {
			motos+=listaMotos.get(i).toString()+"\n";
		}
		a.SobreescribirInformacion(RUTAMOTO, motos);
	}
	
	public void cargartxtFormulario() {
		String formularios="";
		for (int i = 0; i < listaFormularios.size(); i++) {
			formularios+=listaFormularios.get(i).toString()+"\n";
		}
		a.SobreescribirInformacion(RUTAFORMULARIO, formularios);
	}
	
	//CARGA LA LISTA DE CARROS CON LOS DATOS DE SU ARCHIVO PLANO
	public void cargarArrayListCarros() {
		for (int i = 0; i < a.ContenidoArchivo(RUTACARRO).size(); i++) {
			String linea =a.ContenidoArchivo(RUTACARRO).get(i);
			String[] conjuntoCarro = linea.split(";");
			
			Carro nuevoCarro = new Carro(conjuntoCarro[0], conjuntoCarro[1], conjuntoCarro[2], conjuntoCarro[3], conjuntoCarro[4], conjuntoCarro[5], conjuntoCarro[6], conjuntoCarro[7], conjuntoCarro[8], conjuntoCarro[9], conjuntoCarro[10]);
			
			listaCarros.add(nuevoCarro);
		}
	}
	
	//CARGA LA LISTA DE MOTOS CON LOS DATOS DE SU ARCHIVO PLANO
	public void cargarArrayListMotos() {
		for (int i = 0; i < a.ContenidoArchivo(RUTAMOTO).size(); i++) {
			String linea =a.ContenidoArchivo(RUTAMOTO).get(i);
			String[] conjuntoMoto = linea.split(";");
			
			Moto nuevaMoto = new Moto(conjuntoMoto[0], conjuntoMoto[1], conjuntoMoto[2], conjuntoMoto[3], conjuntoMoto[4], conjuntoMoto[5], conjuntoMoto[6], conjuntoMoto[7], conjuntoMoto[8], conjuntoMoto[9]);
			
			listaMotos.add(nuevaMoto);
		}
	}
	
	public void cargarArrayListFormularios() {
		for (int i = 0; i < a.ContenidoArchivo(RUTAFORMULARIO).size(); i++) {
			String linea =a.ContenidoArchivo(RUTAFORMULARIO).get(i);
			String[] conjuntoFormulario = linea.split(";");
			
			Formularios nuevoFormulario = new Formularios(conjuntoFormulario[0], conjuntoFormulario[1], conjuntoFormulario[2]);
			
			listaFormularios.add(nuevoFormulario);
		}
	}

}
