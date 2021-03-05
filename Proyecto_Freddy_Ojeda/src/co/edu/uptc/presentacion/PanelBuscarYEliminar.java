package co.edu.uptc.presentacion;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class PanelBuscarYEliminar extends JPanel{
	
	private JButton casa;
	
	private JComboBox opciones;
	
	public PanelBuscarYEliminar() {
		this.setOpaque(true);
		this.setLayout(null);
		
		agregarBotones();
		agregarLabels();
		agregarListaDesplegable();
		agregarFondo();
	}
	
	private void agregarBotones() {
		casa = new JButton(new ImageIcon("src/Imagenes/iconoCasa.png"));
		casa.setBounds(133,465,32,32);
		casa.setOpaque(false);
		casa.setBackground(new Color(0,0,0,0));
		casa.setFocusable(false);
		casa.setBorder(null);
		this.add(casa);
	}
	
	public void agregarLabels() {
		JLabel label = new JLabel(new ImageIcon("src/Imagenes/carro.png"));
		label.setBounds(25, 50, 233, 160);
		this.add(label);
		
		JLabel label2 = new JLabel(new ImageIcon("src/Imagenes/moto.png"));
		label2.setBounds(25, 280, 233, 160);
		this.add(label2);
	}

	public void agregarFondo() {
		ImageIcon imagen = new ImageIcon("src/Imagenes/CrearServicio.jpeg");
		JLabel fondo = new JLabel();
		fondo.setBounds(0, 0, 300, 500);
		fondo.setIcon(imagen);
		this.add(fondo);
	}
	
	public void agregarListaDesplegable() {
		String [] vehiculos = {"Seleccione una opcion", "Carros", "Motos"};
		
		opciones = new JComboBox(vehiculos);
		opciones.setBounds(72, 230, 150, 25);
		this.add(opciones);
	}
	
	public JButton getCasa() {
		return casa;
	}

	public JComboBox getOpciones() {
		return opciones;
	}

	public void setOpciones(JComboBox opciones) {
		this.opciones = opciones;
	}
	
}
