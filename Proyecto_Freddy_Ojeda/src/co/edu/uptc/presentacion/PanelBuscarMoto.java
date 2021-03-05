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

public class PanelBuscarMoto extends JPanel{
	
	private JLabel labelMoto;
	
	private JTextField textoMoto;
	
	private JButton buscarMoto;
	private JButton borrarMoto;
	private JButton casa;
	private JButton regresar;
	
	private DefaultTableModel defaultTableModelMoto;
	private JTable tablaMoto;
	private DefaultTableModel defaultTableModelMoto2;
	private JTable tablaMoto2;

	public PanelBuscarMoto() {
		this.setOpaque(true);
		this.setLayout(null);
		

		labelMoto();
		textoMoto();
		botonMoto();	
		tablaMoto();
		agregarFondo();
	}
	
	public void agregarFondo() {
		ImageIcon imagen = new ImageIcon("src/Imagenes/CrearServicio.jpeg");
		JLabel fondo = new JLabel();
		fondo.setBounds(0, 0, 300, 500);
		fondo.setIcon(imagen);
		this.add(fondo);
	}
	
	public void labelMoto() {
		labelMoto = new JLabel("Placa");
		labelMoto.setBounds(120, 55, 60, 25);
		labelMoto.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
		labelMoto.setForeground(Color.BLACK);
		this.add(labelMoto);
		
		JLabel labelMoto2 = new JLabel("Historial");
		labelMoto2.setBounds(105, 215, 100, 25);
		labelMoto2.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
		labelMoto2.setForeground(Color.BLACK);
		this.add(labelMoto2);
	}
	
	public void textoMoto() {
		textoMoto = new JTextField();
		textoMoto.setBounds(70, 80, 150, 25);
		this.add(textoMoto);
	}
	
	public void botonMoto() {
		buscarMoto = new JButton(new ImageIcon("src/Imagenes/iconoLupa.png"));
		buscarMoto.setBounds(130, 110, 32, 32);
		buscarMoto.setOpaque(false);
		buscarMoto.setBackground(new Color(0,0,0,0));
		buscarMoto.setFocusable(false);
		buscarMoto.setBorder(null);
		this.add(buscarMoto);
		
		borrarMoto = new JButton(new ImageIcon("src/Imagenes/iconoPapelera.png"));
		borrarMoto.setBounds(130, 410, 32, 32);
		borrarMoto.setOpaque(false);
		borrarMoto.setBackground(new Color(0,0,0,0));
		borrarMoto.setFocusable(false);
		borrarMoto.setBorder(null);
		this.add(borrarMoto);
		
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

	public void tablaMoto() {
		JPanel panel = new JPanel();
		panel.setBounds(60, 150, 170, 62);
		String[] nombreDeColumnas = {"Propietario","Placa","Marca","Modelo","Cilindraje","Serivicio", "Color","T. Carroceria", "Combustible", "Estilo"};
		
		defaultTableModelMoto = new DefaultTableModel();
		defaultTableModelMoto.setColumnIdentifiers(nombreDeColumnas);
		
		tablaMoto = new JTable(defaultTableModelMoto){
			@Override
			public Dimension getPreferredScrollableViewportSize() {
				return new Dimension(150, 17);
			}
		};
		
		tablaMoto.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		JScrollPane jScrollPane = new JScrollPane(tablaMoto);
		panel.add(jScrollPane);
		this.add(panel);
		
		JPanel panel2 = new JPanel();
		panel2.setBounds(60, 240, 170, 160);
		String[] nombreDeColumnas2 = {"Fecha Actual","Placa","Siguiente fecha"};
		
		defaultTableModelMoto2 = new DefaultTableModel();
		defaultTableModelMoto2.setColumnIdentifiers(nombreDeColumnas2);
		
		tablaMoto2 = new JTable(defaultTableModelMoto2){
			@Override
			public Dimension getPreferredScrollableViewportSize() {
				return new Dimension(150, 115);
			}
		};
		
		tablaMoto2.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		
		JScrollPane jScrollPane2 = new JScrollPane(tablaMoto2);
		panel2.add(jScrollPane2);
		this.add(panel2);
	}

	public JTextField getTextoMoto() {
		return textoMoto;
	}

	public JButton getBuscarMoto() {
		return buscarMoto;
	}

	public JButton getBorrarMoto() {
		return borrarMoto;
	}

	public DefaultTableModel getDefaultTableModelMoto() {
		return defaultTableModelMoto;
	}

	public JTable getTablaMoto() {
		return tablaMoto;
	}

	public JButton getCasa() {
		return casa;
	}
	public JButton getRegresar() {
		return regresar;
	}

	public DefaultTableModel getDefaultTableModelMoto2() {
		return defaultTableModelMoto2;
	}

	public JTable getTablaMoto2() {
		return tablaMoto2;
	}
	
}
