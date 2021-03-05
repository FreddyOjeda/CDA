package co.edu.uptc.presentacion;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PanelMostrarServicios extends JPanel{
	
	private JPanel contenedor;
	
	private DefaultTableModel defaultTableModelCarros;
	private JTable tablaCarros;
	
	private DefaultTableModel defaultTableModelMotos;
	private JTable tablaMotos;
	
	private JButton casa;
	
	public PanelMostrarServicios() {
		this.setOpaque(true);
		this.setLayout(null);
		
		agregarpanel();
		agregarLabels();
		agregarTablaCarros();
		agregarTablaMotos();
		agregarBotones();
		agregarFondo();
	}
	
	public void agregarFondo() {
		ImageIcon imagen = new ImageIcon("src/Imagenes/CrearServicio.jpeg");
		JLabel fondo = new JLabel();
		fondo.setBounds(0, 0, 300, 500);
		fondo.setIcon(imagen);
		this.add(fondo);
	}
	
	public void agregarLabels() {
		JLabel label1 = new JLabel("Carros");
		label1.setBounds(120, 50, 60, 25);
		label1.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 17));
		label1.setForeground(Color.BLACK);
		this.add(label1);
		
		JLabel label2 = new JLabel("Motos");
		label2.setBounds(120, 255, 60, 25);
		label2.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 17));
		label2.setForeground(Color.BLACK);
		this.add(label2);
	}
	
	public void agregarpanel() {
		contenedor= new JPanel(new GridLayout(2, 1, 20, 50));
		contenedor.setBackground(new Color(0,0,0,0));
		contenedor.setBounds(40,90,210,350);
		this.add(contenedor);
	}
	
	public void agregarBotones() {
		casa = new JButton(new ImageIcon("src/Imagenes/iconoCasa.png"));
		casa.setBounds(133,465,32,32);
		casa.setOpaque(false);
		casa.setBackground(new Color(0,0,0,0));
		casa.setFocusable(false);
		casa.setBorder(null);
		this.add(casa);
	}
	
	public void agregarTablaCarros() {
		String[] nombreDeColumnas = {"Propietario","Placa","Marca","Modelo","Cilindraje","Serivicio", "Color","T. Carroceria", "Combustible", "Estilo", "Nº Puertas"};
		
		defaultTableModelCarros = new DefaultTableModel();
		defaultTableModelCarros.setColumnIdentifiers(nombreDeColumnas);
		
		tablaCarros = new JTable(defaultTableModelCarros){
			@Override
			public Dimension getPreferredScrollableViewportSize() {
				return new Dimension(200, 305);
			}
		};
		
		tablaCarros.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		JScrollPane jScrollPane = new JScrollPane(tablaCarros);
		contenedor.add(jScrollPane);
	}
	
	public void agregarTablaMotos() {
		String[] nombreDeColumnas = {"Propietario","Placa","Marca","Modelo","Cilindraje","Serivicio", "Color","T. Carroceria", "Combustible", "Estilo"};
		
		defaultTableModelMotos = new DefaultTableModel();
		defaultTableModelMotos.setColumnIdentifiers(nombreDeColumnas);
		
		tablaMotos = new JTable(defaultTableModelMotos){
			@Override
			public Dimension getPreferredScrollableViewportSize() {
				return new Dimension(200, 305);
			}
		};
		
		tablaMotos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		JScrollPane jScrollPane = new JScrollPane(tablaMotos);
		contenedor.add(jScrollPane);
	}

	public JButton getCasa() {
		return casa;
	}

	public DefaultTableModel getDefaultTableModelCarros() {
		return defaultTableModelCarros;
	}

	public JTable getTablaCarros() {
		return tablaCarros;
	}

	public void setDefaultTableModelCarros(DefaultTableModel defaultTableModelCarros) {
		this.defaultTableModelCarros = defaultTableModelCarros;
	}

	public void setTablaCarros(JTable tablaCarros) {
		this.tablaCarros = tablaCarros;
	}

	public DefaultTableModel getDefaultTableModelMotos() {
		return defaultTableModelMotos;
	}

	public JTable getTablaMotos() {
		return tablaMotos;
	}

	public void setDefaultTableModelMotos(DefaultTableModel defaultTableModelMotos) {
		this.defaultTableModelMotos = defaultTableModelMotos;
	}

	public void setTablaMotos(JTable tablaMotos) {
		this.tablaMotos = tablaMotos;
	}

	
	
	
}
