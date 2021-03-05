package co.edu.uptc.presentacion;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class PanelBuscarCarro extends JPanel{

	private JLabel labelCarro;
	
	private JTextField textoCarro;
	
	private JButton buscarCarro;
	private JButton borrarCarro;
	private JButton casa;
	private JButton regresar;
	
	private DefaultTableModel defaultTableModelCarro;
	private JTable tablaCarro;
	private DefaultTableModel defaultTableModelCarro2;
	private JTable tablaCarro2;
	
	public PanelBuscarCarro() {
		this.setOpaque(true);
		this.setLayout(null);
		
		
		labelCarro();
		textoCarro();
		botonCarro();	
		tablaCarro();
		agregarFondo();
	}
	
	public void agregarFondo() {
		ImageIcon imagen = new ImageIcon("src/Imagenes/CrearServicio.jpeg");
		JLabel fondo = new JLabel();
		fondo.setBounds(0, 0, 300, 500);
		fondo.setIcon(imagen);
		this.add(fondo);
	}
	
	public void labelCarro() {
		labelCarro = new JLabel("Placa");
		labelCarro.setBounds(120, 55, 60, 25);
		labelCarro.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
		labelCarro.setForeground(Color.BLACK);
		this.add(labelCarro);
		
		JLabel labelCarro2 = new JLabel("Historial");
		labelCarro2.setBounds(105, 215, 100, 25);
		labelCarro2.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
		labelCarro2.setForeground(Color.BLACK);
		this.add(labelCarro2);
	}
	
	public void textoCarro() {
		textoCarro = new JTextField();
		textoCarro.setBounds(70, 80, 150, 25);
		this.add(textoCarro);
	}
	
	public void botonCarro() {
		buscarCarro = new JButton(new ImageIcon("src/Imagenes/iconoLupa.png"));
		buscarCarro.setBounds(130, 110, 32, 32);
		buscarCarro.setOpaque(false);
		buscarCarro.setBackground(new Color(0,0,0,0));
		buscarCarro.setFocusable(false);
		buscarCarro.setBorder(null);
		this.add(buscarCarro);
		
		borrarCarro = new JButton(new ImageIcon("src/Imagenes/iconoPapelera.png"));
		borrarCarro.setBounds(130, 410, 32, 32);
		borrarCarro.setOpaque(false);
		borrarCarro.setBackground(new Color(0,0,0,0));
		borrarCarro.setFocusable(false);
		borrarCarro.setBorder(null);
		this.add(borrarCarro);
		
		regresar = new JButton(new ImageIcon("src/Imagenes/iconoRegresar.png"));
		regresar.setBounds(30,465,32,32);
		regresar.setOpaque(false);
		regresar.setBackground(new Color(0,0,0,0));
		regresar.setFocusable(false);
		regresar.setBorder(null);
		this.add(regresar);
		
		casa = new JButton(new ImageIcon("src/Imagenes/iconoCasa.png"));
		casa.setBounds(133,465,32,32);
		casa.setOpaque(false);
		casa.setBackground(new Color(0,0,0,0));
		casa.setFocusable(false);
		casa.setBorder(null);
		this.add(casa);
	}

	public void tablaCarro() {
		JPanel panel = new JPanel();
		panel.setBounds(60, 150, 170, 62);
		String[] nombreDeColumnas = {"Propietario","Placa","Marca","Modelo","Cilindraje","Serivicio", "Color","T. Carroceria", "Combustible", "Estilo", "Nº Puertas"};
		
		defaultTableModelCarro = new DefaultTableModel();
		defaultTableModelCarro.setColumnIdentifiers(nombreDeColumnas);
		
		tablaCarro = new JTable(defaultTableModelCarro){
			@Override
			public Dimension getPreferredScrollableViewportSize() {
				return new Dimension(150, 17);
			}
		};
		
		tablaCarro.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		JScrollPane jScrollPane = new JScrollPane(tablaCarro);
		panel.add(jScrollPane);
		this.add(panel);
		
		JPanel panel2 = new JPanel();
		panel2.setBounds(60, 240, 170, 160);
		String[] nombreDeColumnas2 = {"Fecha Actual","Placa","Siguiente fecha"};
		
		defaultTableModelCarro2 = new DefaultTableModel();
		defaultTableModelCarro2.setColumnIdentifiers(nombreDeColumnas2);
		
		tablaCarro2 = new JTable(defaultTableModelCarro2){
			@Override
			public Dimension getPreferredScrollableViewportSize() {
				return new Dimension(150, 115);
			}
		};
		
		tablaCarro2.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		JScrollPane jScrollPane2 = new JScrollPane(tablaCarro2);
		panel2.add(jScrollPane2);
		this.add(panel2);
	}

	public JTextField getTextoCarro() {
		return textoCarro;
	}

	public JButton getBuscarCarro() {
		return buscarCarro;
	}

	public JButton getBorrarCarro() {
		return borrarCarro;
	}

	public DefaultTableModel getDefaultTableModelCarro() {
		return defaultTableModelCarro;
	}

	public JTable getTablaCarro() {
		return tablaCarro;
	}

	public JButton getCasa() {
		return casa;
	}

	public JButton getRegresar() {
		return regresar;
	}

	public DefaultTableModel getDefaultTableModelCarro2() {
		return defaultTableModelCarro2;
	}

	public JTable getTablaCarro2() {
		return tablaCarro2;
	}
	
	
}
