package co.edu.uptc.presentacion;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelCrearServicio extends JPanel{

	private JPanel panelBotones;
	private JButton boton1;
	private JButton boton2;
	private JButton casa;
	
	
	public PanelCrearServicio() {
		this.setOpaque(true);
		this.setLayout(null);
		
		iniciarLabels();
		iniciarBotones();
		agregarFondo();
	}
	
	private void iniciarLabels() {
		JLabel label1 = new JLabel("¿Que Servicio Quieres?");
		label1.setBounds(50,70,200,25);
		label1.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 17));
		label1.setForeground(Color.BLACK);
		this.add(label1);
	}

	private void iniciarBotones() {
		casa = new JButton(new ImageIcon("src/Imagenes/iconoCasa.png"));
		casa.setBounds(133,465,32,32);
		casa.setOpaque(false);
		casa.setBackground(new Color(0,0,0,0));
		casa.setFocusable(false);
		casa.setBorder(null);
		this.add(casa);
		
		
		panelBotones = new JPanel(new GridLayout(2, 1, 50, 20));
		panelBotones.setBackground(new Color(0,0,0,0));
		panelBotones.setBounds(70, 100, 150, 300);
		this.add(panelBotones);
		
		boton1 = new JButton();
		boton1.setText("Carro");
		boton1.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 17));
		panelBotones.add(boton1);
		
		boton2 = new JButton();
		boton2.setText("Moto");
		boton2.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 17));
		panelBotones.add(boton2);
		
		
	}

	public void agregarFondo() {
		ImageIcon imagen = new ImageIcon("src/Imagenes/CrearServicio.jpeg");
		JLabel fondo = new JLabel();
		fondo.setBounds(0, 0, 300, 500);
		fondo.setIcon(imagen);
		this.add(fondo);
	}

	public JButton getBoton1() {
		return boton1;
	}

	public JButton getBoton2() {
		return boton2;
	}

	public JButton getCasa() {
		return casa;
	}
	
	
}
