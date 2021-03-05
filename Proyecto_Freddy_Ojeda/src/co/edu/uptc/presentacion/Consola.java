package co.edu.uptc.presentacion;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import co.edu.uptc.logica.control.CDA;

public class Consola extends JFrame{

	private PanelPrincipal panelprincipal;
	private PanelCrearServicio panelCrearServicio;
	private PanelCrearCarro panelCrearCarro;
	private PanelCrearMoto panelCrearMoto;
	private PanelMostrarServicios panelMostrarServicios;
	private PanelBuscarYEliminar panelBuscarYEliminar;
	private PanelBuscarCarro panelBuscarCarro;
	private PanelBuscarMoto panelBuscarMoto;
	
	CDA cda = new CDA();
	
	public Consola() {
		panelprincipal = new PanelPrincipal();
		panelCrearServicio = new PanelCrearServicio();
		panelCrearCarro = new PanelCrearCarro();
		panelCrearMoto = new PanelCrearMoto();
		panelMostrarServicios = new PanelMostrarServicios();
		panelBuscarYEliminar = new PanelBuscarYEliminar();
		panelBuscarCarro= new PanelBuscarCarro();
		panelBuscarMoto = new PanelBuscarMoto();
		
		this.setSize(300, 530);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("MecaPrime 2020");
		this.setResizable(false);
		
		cda.cargarArrayListCarros();
		cda.cargarArrayListMotos();
		cda.cargarArrayListFormularios();
		agregarPanelPrincipal();
		eventos();
	}
	
	
	//CONTROLPRINCIPAL
	private void agregarPanelPrincipal() {
		this.add(panelprincipal);
		panelprincipal.setVisible(true);
	}
	private void quitarPrincipal() {
		panelprincipal.setVisible(false);
		this.remove(panelprincipal);
	}
	
	
	//CONTROLSERVICIO
	public void iniciarCrearServicio() {
		this.add(panelCrearServicio);
		panelCrearServicio.setVisible(true);
	}
	public void finalizarCrearServicio() {
		panelCrearServicio.setVisible(false);
		this.remove(panelCrearServicio);
	}

	
	//CONTROLCARRO
	public void iniciarCrearCarro() {
		this.add(panelCrearCarro);
		panelCrearCarro.setVisible(true);
	}
	public void finalizarCrearCarro() {
		panelCrearCarro.setVisible(false);
		this.remove(panelCrearCarro);
	}
	
	
	//CONTROLMOTO
	public void iniciarCrearMoto() {
		this.add(panelCrearMoto);
		panelCrearMoto.setVisible(true);
	}
	public void finalizarCrearMoto() {
		panelCrearMoto.setVisible(false);
		this.remove(panelCrearMoto);
	}
	
	
	//CONTROLMOSTRAR
	public void iniciarmostrarServicios() {
		this.add(panelMostrarServicios);
		panelMostrarServicios.setVisible(true);
	}
	public void finalizarmostrarServicios() {
		panelMostrarServicios.setVisible(false);
		this.remove(panelMostrarServicios);
	}
	
	
	//CONTROLBUSCARYELIMINAR
	public void iniciarBuscarYEliminar() {
		this.add(panelBuscarYEliminar);
		panelBuscarYEliminar.setVisible(true);
	}
	public void finalizarBuscarYEliminar() {
		panelBuscarYEliminar.setVisible(false);
		this.remove(panelBuscarYEliminar);
	}
	
	//CONTROL BUSCAR CARRO
	public void iniciarBuscarCarro() {
		this.add(panelBuscarCarro);
		panelBuscarCarro.setVisible(true);
	}
	public void finalizarBuscarCarro() {
		panelBuscarCarro.setVisible(false);
		this.remove(panelBuscarCarro);
	}
	
	//CONTROL BUSCAR MOTO
	public void iniciarBuscarMoto() {
		this.add(panelBuscarMoto);
		panelBuscarMoto.setVisible(true);
	}
	public void finalizarBuscarMoto() {
		panelBuscarMoto.setVisible(false);
		this.remove(panelBuscarMoto);
	}
	
	public void mostrarListaCarros(String matriz[][]) {
		limpiarTablaCarros();
		for (int i = 0; i < matriz.length; i++) {
			panelMostrarServicios.getDefaultTableModelCarros().addRow(matriz[i]);
		}
	}
	public void limpiarTablaCarros() {
		for (int i = 0; i < panelMostrarServicios.getDefaultTableModelCarros().getRowCount(); i++) {
			panelMostrarServicios.getDefaultTableModelCarros().removeRow(i);
			i--;
		}
	}
	
	public void mostrarCarro(String vector[]) {
		limpiarCarro();
		panelBuscarCarro.getDefaultTableModelCarro().addRow(vector);
	}
	public void limpiarCarro() {
		for (int i = 0; i < panelBuscarCarro.getDefaultTableModelCarro().getRowCount(); i++) {
			panelBuscarCarro.getDefaultTableModelCarro().removeRow(i);
			i--;
		}
	}
	
	public void mostrarFormularioCarro(String matriz[][]) {
		limpiarTablaFormulariosCarro();
		for (int i = 0; i < matriz.length; i++) {
			panelBuscarCarro.getDefaultTableModelCarro2().addRow(matriz[i]);
		}
	}
	public void limpiarTablaFormulariosCarro() {
		for (int i = 0; i < panelBuscarCarro.getDefaultTableModelCarro2().getRowCount(); i++) {
			panelBuscarCarro.getDefaultTableModelCarro2().removeRow(i);
			i--;
		}
	}
	
	public void mostrarMoto(String vector[]) {
		limpiarCarro();
		panelBuscarMoto.getDefaultTableModelMoto().addRow(vector);
	}
	public void limpiarMoto() {
		for (int i = 0; i < panelBuscarMoto.getDefaultTableModelMoto().getRowCount(); i++) {
			panelBuscarMoto.getDefaultTableModelMoto().removeRow(i);
			i--;
		}
	}
	
	public void mostrarFormularioMoto(String matriz[][]) {
		limpiarTablaFormulariosMoto();
		for (int i = 0; i < matriz.length; i++) {
			panelBuscarMoto.getDefaultTableModelMoto2().addRow(matriz[i]);
		}
	}
	public void limpiarTablaFormulariosMoto() {
		for (int i = 0; i < panelBuscarMoto.getDefaultTableModelMoto2().getRowCount(); i++) {
			panelBuscarMoto.getDefaultTableModelMoto2().removeRow(i);
			i--;
		}
	}
	
	public void mostrarListaMotos(String matriz[][]) {
		limpiarTablaMotos();
		for (int i = 0; i < matriz.length; i++) {
			panelMostrarServicios.getDefaultTableModelMotos().addRow(matriz[i]);
		}
	}
	public void limpiarTablaMotos() {
		for (int i = 0; i < panelMostrarServicios.getDefaultTableModelMotos().getRowCount(); i++) {
			panelMostrarServicios.getDefaultTableModelMotos().removeRow(i);
			i--;
		}
	}
	
	
	private void eventos() {

		ActionListener accion = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//ACCIONES DE BOTONES
				if (panelprincipal.getCrear().equals(e.getSource())) {//PRINCIPAL A CREAR
					quitarPrincipal();
					iniciarCrearServicio();
				}
				if (panelCrearServicio.getCasa().equals(e.getSource())) {//CREAR A PRINCIPAL
					finalizarCrearServicio();
					agregarPanelPrincipal();
				}
				if (panelCrearServicio.getBoton1().equals(e.getSource())) {//CREAR A CARRO
					finalizarCrearServicio();
					iniciarCrearCarro();
				}
				if (panelCrearCarro.getRegresar().equals(e.getSource())) {//CARRO A CREAR
					finalizarCrearCarro();
					iniciarCrearServicio();
				}
				if (panelCrearCarro.getCasa().equals(e.getSource())) {//CARRO A PRINCIPAL
					finalizarCrearCarro();
					agregarPanelPrincipal();
				}
				if (panelCrearServicio.getBoton2().equals(e.getSource())) {//CREAR A MOTO
					finalizarCrearServicio();
					iniciarCrearMoto();
				}
				if (panelCrearMoto.getRegresar().equals(e.getSource())) {//MOTO A CREAR
					finalizarCrearMoto();;
					iniciarCrearServicio();
				}
				if (panelCrearMoto.getCasa().equals(e.getSource())) {//MOTO A PRINCIPAL
					finalizarCrearMoto();
					agregarPanelPrincipal();
				}
				if (panelprincipal.getMostrar().equals(e.getSource())) {//PRINCIPAL A MOSTRAR
					mostrarListaCarros(cda.mostrarCarros());
					mostrarListaMotos(cda.mostrarMotos());
					quitarPrincipal();
					iniciarmostrarServicios();
				}
				if (panelMostrarServicios.getCasa().equals(e.getSource())) {//MOSTRAR A PRINCIPAL
					finalizarmostrarServicios();
					agregarPanelPrincipal();
				}
				if (panelprincipal.getEliminar().equals(e.getSource())) {//PRINCIPAL A BUSCAR
					quitarPrincipal();
					iniciarBuscarYEliminar();
				}
				if (panelBuscarYEliminar.getCasa().equals(e.getSource())) {//buscar a primcipal
					finalizarBuscarYEliminar();
					agregarPanelPrincipal();
				}
				if (panelBuscarYEliminar.getOpciones().getSelectedItem().toString().equals("Carros")) {//BUSCAR A BUSCAR CARRO
					panelBuscarYEliminar.getOpciones().setSelectedItem("Seleccione una opcion");
					limpiarCarro();
					limpiarTablaFormulariosCarro();
					finalizarBuscarYEliminar();
					iniciarBuscarCarro();
				}
				if (panelBuscarYEliminar.getOpciones().getSelectedItem().toString().equals("Motos")) {//BUSCAR A BUSCAR MOTO
					panelBuscarYEliminar.getOpciones().setSelectedItem("Seleccione una opcion");
					limpiarMoto();
					limpiarTablaFormulariosMoto();
					finalizarBuscarYEliminar();
					iniciarBuscarMoto();
				}
				if (panelBuscarCarro.getCasa().equals(e.getSource())) {
					finalizarBuscarCarro();
					agregarPanelPrincipal();
				}
				if (panelBuscarCarro.getRegresar().equals(e.getSource())) {
					finalizarBuscarCarro();
					iniciarBuscarYEliminar();
				}
				if (panelBuscarCarro.getBuscarCarro().equals(e.getSource())) {//BUSCA UN CARO CON SU HISTORIAL
					mostrarCarro(cda.buscarCarro(panelBuscarCarro.getTextoCarro().getText()));
					mostrarFormularioCarro(cda.buscarFormulario(panelBuscarCarro.getTextoCarro().getText()));
					//cda.cargarArrayListFormularios();
				}
				if (panelBuscarCarro.getBorrarCarro().equals(e.getSource())) {
					cda.eliminarCarro(panelBuscarCarro.getTextoCarro().getText());
					cda.eliminarFormulario(panelBuscarCarro.getTextoCarro().getText());
					panelBuscarCarro.getTextoCarro().setText("");
					cda.cargartxtFormulario();
					cda.cargartxtCarro();
					finalizarBuscarCarro();
					iniciarBuscarYEliminar();
				}
				if (panelBuscarMoto.getCasa().equals(e.getSource())) {
					finalizarBuscarMoto();
					agregarPanelPrincipal();
				}
				if (panelBuscarMoto.getRegresar().equals(e.getSource())) {
					finalizarBuscarMoto();
					iniciarBuscarYEliminar();
				}
				if (panelBuscarMoto.getBuscarMoto().equals(e.getSource())) {
					mostrarMoto(cda.buscarMoto(panelBuscarMoto.getTextoMoto().getText()));
					mostrarFormularioMoto(cda.buscarFormulario(panelBuscarMoto.getTextoMoto().getText()));
					//cda.cargarArrayListFormularios();
				}
				if (panelBuscarMoto.getBorrarMoto().equals(e.getSource())) {
					cda.eliminarMoto(panelBuscarMoto.getTextoMoto().getText());
					cda.eliminarFormulario(panelBuscarMoto.getTextoMoto().getText());
					panelBuscarMoto.getTextoMoto().setText("");
					cda.cargartxtFormulario();
					cda.cargartxtMoto();
					finalizarBuscarMoto();
					iniciarBuscarYEliminar();
				}
				
				//ACCIONES DE TEXFIELDS
				
				if (panelCrearMoto.getBoton1().equals(e.getSource())) {//EN ESTA ACCION SE ESTA CREANDO LA MOTO NUEVA
					if (cda.confirmarDatosMoto(panelCrearMoto.getTexto1().getText(),
								panelCrearMoto.getTexto2().getText(),
								panelCrearMoto.getTexto3().getText(),
								panelCrearMoto.getTexto7().getText(),
								panelCrearMoto.getTexto6().getText(),
								panelCrearMoto.getTexto8().getText(),
								panelCrearMoto.getTexto9().getText(),
								panelCrearMoto.getTexto4().getText(),
								panelCrearMoto.getTexto5().getText(),
								panelCrearMoto.getTexto10().getText())) {
						cda.registrarFormulario(panelCrearMoto.getTexto2().getText());
						JOptionPane.showMessageDialog(null, "Servicio creado exitosamente");
						panelCrearMoto.getTexto1().setText("");
						panelCrearMoto.getTexto2().setText("");
						panelCrearMoto.getTexto3().setText("");
						panelCrearMoto.getTexto4().setText("");
						panelCrearMoto.getTexto5().setText("");
						panelCrearMoto.getTexto6().setText("");
						panelCrearMoto.getTexto7().setText("");
						panelCrearMoto.getTexto8().setText("");
						panelCrearMoto.getTexto9().setText("");
						panelCrearMoto.getTexto10().setText("");
					}else {
						if (cda.confirmarPlacaVehiculo(panelCrearMoto.getTexto2().getText())==false) {
							cda.registrarMoto(panelCrearMoto.getTexto1().getText(),
									panelCrearMoto.getTexto2().getText(),
									panelCrearMoto.getTexto3().getText(),
									panelCrearMoto.getTexto7().getText(),
									panelCrearMoto.getTexto6().getText(),
									panelCrearMoto.getTexto8().getText(),
									panelCrearMoto.getTexto9().getText(),
									panelCrearMoto.getTexto4().getText(),
									panelCrearMoto.getTexto5().getText(),
									panelCrearMoto.getTexto10().getText());
							JOptionPane.showMessageDialog(null, "moto creada exitosamente");
							panelCrearMoto.getTexto1().setText("");
							panelCrearMoto.getTexto2().setText("");
							panelCrearMoto.getTexto3().setText("");
							panelCrearMoto.getTexto4().setText("");
							panelCrearMoto.getTexto5().setText("");
							panelCrearMoto.getTexto6().setText("");
							panelCrearMoto.getTexto7().setText("");
							panelCrearMoto.getTexto8().setText("");
							panelCrearMoto.getTexto9().setText("");
							panelCrearMoto.getTexto10().setText("");
						}else {
							JOptionPane.showMessageDialog(null, "La placa ingresada es incorrecta o es de otro vehiculo");
						}
					}
					cda.cargartxtMoto();
					cda.cargartxtFormulario();
				}
				
				if (panelCrearCarro.getCrear().equals(e.getSource())) {//EN ESTA ACCION SE ESTA CREANDO EL CARRO NUEVO
					if (cda.confirmarDatosCarro(panelCrearCarro.getTexto1().getText(),
								panelCrearCarro.getTexto2().getText(),
								panelCrearCarro.getTexto3().getText(),
								panelCrearCarro.getTexto7().getText(),
								panelCrearCarro.getTexto6().getText(),
								panelCrearCarro.getTexto8().getText(),
								panelCrearCarro.getTexto9().getText(),
								panelCrearCarro.getTexto4().getText(),
								panelCrearCarro.getTexto5().getText(),
								panelCrearCarro.getTexto10().getText(),
								panelCrearCarro.getTexto11().getText())) {
						cda.registrarFormulario(panelCrearCarro.getTexto2().getText());
						JOptionPane.showMessageDialog(null, "Servicio creado exitosamente");
						panelCrearCarro.getTexto1().setText("");
						panelCrearCarro.getTexto2().setText("");
						panelCrearCarro.getTexto3().setText("");
						panelCrearCarro.getTexto4().setText("");
						panelCrearCarro.getTexto5().setText("");
						panelCrearCarro.getTexto6().setText("");
						panelCrearCarro.getTexto7().setText("");
						panelCrearCarro.getTexto8().setText("");
						panelCrearCarro.getTexto9().setText("");
						panelCrearCarro.getTexto10().setText("");
						panelCrearCarro.getTexto11().setText("");
					}else {
						if (cda.confirmarPlacaVehiculo(panelCrearCarro.getTexto2().getText())==false) {
							cda.registrarCarro(panelCrearCarro.getTexto1().getText(),
									panelCrearCarro.getTexto2().getText(),
									panelCrearCarro.getTexto3().getText(),
									panelCrearCarro.getTexto7().getText(),
									panelCrearCarro.getTexto6().getText(),
									panelCrearCarro.getTexto8().getText(),
									panelCrearCarro.getTexto9().getText(),
									panelCrearCarro.getTexto4().getText(),
									panelCrearCarro.getTexto5().getText(),
									panelCrearCarro.getTexto10().getText(),
									panelCrearCarro.getTexto11().getText());
							//mostrarListaCarros(cda.mostrarCarros());
							JOptionPane.showMessageDialog(null, "carro creado exitosamente");
							panelCrearCarro.getTexto1().setText("");
							panelCrearCarro.getTexto2().setText("");
							panelCrearCarro.getTexto3().setText("");
							panelCrearCarro.getTexto4().setText("");
							panelCrearCarro.getTexto5().setText("");
							panelCrearCarro.getTexto6().setText("");
							panelCrearCarro.getTexto7().setText("");
							panelCrearCarro.getTexto8().setText("");
							panelCrearCarro.getTexto9().setText("");
							panelCrearCarro.getTexto10().setText("");
							panelCrearCarro.getTexto11().setText("");
						}else {
							JOptionPane.showMessageDialog(null, "La placa ingresada es incorrecta o es de otro vehiculo");
						}
					}
					cda.cargartxtFormulario();
					cda.cargartxtCarro();					
				}
			}
		};
		
		//BOTONES DEL PANEL PRINCIPAL
		panelprincipal.getCrear().addActionListener(accion);
		panelprincipal.getMostrar().addActionListener(accion);
		panelprincipal.getEliminar().addActionListener(accion);
		
		//BOTONES DE CREAR SERVICIO
		panelCrearServicio.getBoton1().addActionListener(accion);
		panelCrearServicio.getBoton2().addActionListener(accion);
		panelCrearServicio.getCasa().addActionListener(accion);
		
		//BOTONES DEL CARRO
		panelCrearCarro.getCrear().addActionListener(accion);
		panelCrearCarro.getCasa().addActionListener(accion);
		panelCrearCarro.getRegresar().addActionListener(accion);
		
		//BOTONES DE LA MOTO
		panelCrearMoto.getBoton1().addActionListener(accion);
		panelCrearMoto.getCasa().addActionListener(accion);
		panelCrearMoto.getRegresar().addActionListener(accion);
		
		//BOTONES DEL PANEL DE MOSTRAR TODO
		panelMostrarServicios.getCasa().addActionListener(accion);
		
		//BOTONES DEL BUSCAR Y ELIMINAR
		panelBuscarYEliminar.getCasa().addActionListener(accion);
		panelBuscarYEliminar.getOpciones().addActionListener(accion);
		//panelBuscarYEliminar.getBorrar().addActionListener(accion);
		//panelBuscarYEliminar.getBuscar().addActionListener(accion);
		
		//BOTONES DE BUSCAR CARRO
		panelBuscarCarro.getCasa().addActionListener(accion);
		panelBuscarCarro.getRegresar().addActionListener(accion);
		panelBuscarCarro.getBuscarCarro().addActionListener(accion);
		panelBuscarCarro.getBorrarCarro().addActionListener(accion);
		
		//BOTONES DE BUSCAR MOTO
		panelBuscarMoto.getCasa().addActionListener(accion);
		panelBuscarMoto.getRegresar().addActionListener(accion);
		panelBuscarMoto.getBuscarMoto().addActionListener(accion);
		panelBuscarMoto.getBorrarMoto().addActionListener(accion);
	}
	
	
}
