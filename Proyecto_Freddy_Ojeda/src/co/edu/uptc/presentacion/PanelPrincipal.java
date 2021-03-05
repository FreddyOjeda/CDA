package co.edu.uptc.presentacion;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ResourceBundle.Control;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelPrincipal extends JPanel{
	
	private JButton crear;
	private JButton mostrar;
	private JButton eliminar;
	
	public PanelPrincipal() {
		this.setOpaque(true);
		this.setLayout(null);
		
		iniciarLabels();
		iniciarBotones();
		agregarComponentes();
	}
	
	private void agregarComponentes() {
		ImageIcon imagen = new ImageIcon("src/Imagenes/menu1.jpeg");
		JLabel fondo = new JLabel();
		fondo.setBounds(0, 0, 300, 500);
		fondo.setIcon(imagen);
		this.add(fondo);
	}
	
	private void iniciarLabels() {
		JLabel etiqueta1 = new JLabel("MENU");
		etiqueta1.setBounds(120,160,100,20);
		etiqueta1.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
		etiqueta1.setForeground(Color.BLACK);
		this.add(etiqueta1);
	}
	
	private void iniciarBotones() {
		crear = new JButton();
		crear.setBounds(75,190,150,50);
		crear.setText("Crear Servicio");
		this.add(crear);
		
		mostrar = new JButton();
		mostrar.setBounds(75,265,150,50);
		mostrar.setText("Mostrar Servicios");
		this.add(mostrar);
		
		eliminar = new JButton();
		eliminar.setBounds(75,340,150,50);
		eliminar.setText("Buscar y Eliminar");
		this.add(eliminar);
		
	}

	public JButton getCrear() {
		return crear;
	}

	public JButton getMostrar() {
		return mostrar;
	}
	public JButton getEliminar() {
		return eliminar;
	}

	
}
