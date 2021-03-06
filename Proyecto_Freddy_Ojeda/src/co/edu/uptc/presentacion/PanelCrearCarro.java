package co.edu.uptc.presentacion;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class PanelCrearCarro extends JPanel{
	
	private JPanel contenedor;
	private JScrollPane scrollPane;
	private JButton casa;
	private JButton regresar;
	private JButton crear ;
	
	private JTextField texto1;
	private JTextField texto2;
	private JTextField texto3;
	private JTextField texto4;
	private JTextField texto5;
	private JTextField texto6;
	private JTextField texto7;
	private JTextField texto8;
	private JTextField texto9;
	private JTextField texto10;
	private JTextField texto11;
	
	public PanelCrearCarro() {
		this.setOpaque(true);
		this.setLayout(null);
		
		agregarPanel();
		iniciarLabels();
		iniciarBotones();
		iniciarEntradasDeTexto();
		agregarFondo();
	}
	
	public void agregarFondo() {
		ImageIcon imagen = new ImageIcon("src/Imagenes/CrearServicio.jpeg");
		JLabel fondo = new JLabel();
		fondo.setBounds(0, 0, 300, 500);
		fondo.setIcon(imagen);
		this.add(fondo);
	}
	
	public void agregarPanel() {
		
		scrollPane = new  JScrollPane();
		scrollPane.setBackground(new Color(0,0,0,0));
		scrollPane.setBounds(50, 70, 190, 360);
		
		contenedor = new JPanel();
		contenedor.setBackground(Color.LIGHT_GRAY);
		contenedor.setLayout(null);
		contenedor.setPreferredSize(new Dimension(160,700));
		
		scrollPane.setViewportView(contenedor);
		
		this.add(scrollPane);
	}
	
	public void iniciarLabels() {
		JLabel label1 = new JLabel("Propietario");
		label1.setBounds(56,0,150,25);
		contenedor.add(label1);
		
		JLabel label2 = new JLabel("Placa");
		label2.setBounds(69,60,150,25);
		contenedor.add(label2);
		
		JLabel label3 = new JLabel("Marca");
		label3.setBounds(69,120,150,25);
		contenedor.add(label3);
		
		JLabel label4 = new JLabel("Modelo");
		label4.setBounds(67,180,150,25);
		contenedor.add(label4);
		
		JLabel label5 = new JLabel("Cilindraje");
		label5.setBounds(62,240,150,25);
		contenedor.add(label5);
		
		JLabel label6 = new JLabel("Servicio");
		label6.setBounds(64,300,150,25);
		contenedor.add(label6);
		
		JLabel label7 = new JLabel("Color");
		label7.setBounds(70,360,150,25);
		contenedor.add(label7);
		
		JLabel label8 = new JLabel("Tipo De Carroceria");
		label8.setBounds(32,420,150,25);
		contenedor.add(label8);
		
		JLabel label9 = new JLabel("Combustible");
		label9.setBounds(50,480,150,25);
		contenedor.add(label9);
		
		JLabel label10 = new JLabel("Estilo de Carro");
		label10.setBounds(50,540,150,25);
		contenedor.add(label10);
		
		JLabel label11 = new JLabel("N? De Puertas");
		label11.setBounds(50,600,150,25);
		contenedor.add(label11);
	}
	
	public void iniciarBotones() {
		casa = new JButton(new ImageIcon("src/Imagenes/iconoCasa.png"));
		casa.setBounds(133,465,32,32);
		casa.setOpaque(false);
		casa.setBackground(new Color(0,0,0,0));
		casa.setFocusable(false);
		casa.setBorder(null);
		this.add(casa);
		
		regresar = new JButton(new ImageIcon("src/Imagenes/iconoRegresar.png"));
		regresar.setBounds(30,465,32,32);
		regresar.setOpaque(false);
		regresar.setBackground(new Color(0,0,0,0));
		regresar.setFocusable(false);
		regresar.setBorder(null);
		this.add(regresar);
		
		crear = new JButton();
		crear.setBounds(12, 660, 150, 35);
		crear.setText("Crear Carro");
		contenedor.add(crear);
	}
	
	public void iniciarEntradasDeTexto() {
		texto1 = new JTextField();
		texto1.setBounds(12,20,150,25);
		contenedor.add(texto1);
		
		texto2 = new JTextField();
		texto2.setBounds(12,80,150,25);
		contenedor.add(texto2);
		
		texto3 = new JTextField();
		texto3.setBounds(12,140,150,25);
		contenedor.add(texto3);
		
		texto4 = new JTextField();
		texto4.setBounds(12,200,150,25);
		contenedor.add(texto4);
		
		texto5 = new JTextField();
		texto5.setBounds(12,260,150,25);
		contenedor.add(texto5);
		
		texto6 = new JTextField();
		texto6.setBounds(12,320,150,25);
		contenedor.add(texto6);
		
		texto7 = new JTextField();
		texto7.setBounds(12,380,150,25);
		contenedor.add(texto7);
		
		texto8 = new JTextField();
		texto8.setBounds(12,440,150,25);
		contenedor.add(texto8);
		
		texto9 = new JTextField();
		texto9.setBounds(12,500,150,25);
		contenedor.add(texto9);
		
		texto10 = new JTextField();
		texto10.setBounds(12,560,150,25);
		contenedor.add(texto10);
		
		texto11 = new JTextField();
		texto11.setBounds(12,620,150,25);
		contenedor.add(texto11);
	}

	public JButton getCasa() {
		return casa;
	}

	public JButton getRegresar() {
		return regresar;
	}
	

	public JButton getCrear() {
		return crear;
	}

	public JTextField getTexto1() {
		return texto1;
	}

	public JTextField getTexto2() {
		return texto2;
	}

	public JTextField getTexto3() {
		return texto3;
	}

	public JTextField getTexto4() {
		return texto4;
	}

	public JTextField getTexto5() {
		return texto5;
	}

	public JTextField getTexto6() {
		return texto6;
	}

	public JTextField getTexto7() {
		return texto7;
	}

	public JTextField getTexto8() {
		return texto8;
	}

	public JTextField getTexto9() {
		return texto9;
	}

	public JTextField getTexto10() {
		return texto10;
	}
	
	public JTextField getTexto11() {
		return texto11;
	}
}
