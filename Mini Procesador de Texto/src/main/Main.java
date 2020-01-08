package main;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Main extends JFrame {
	
	cambiaLetra l = new cambiaLetra();
	cambiaTama�o t = new cambiaTama�o();
	
	JPanel contentPane = new JPanel();
	JMenuBar barraMenu = new JMenuBar();
	JTextArea text = new JTextArea();
	JScrollPane scroll = new JScrollPane(text);
	
	JMenu letra = new JMenu("Tipo de Letra");
	JMenu estilo = new JMenu("Estilo");
	JMenu tama�o = new JMenu("Tama�o");
	
	JMenuItem arial = new JMenuItem("Arial");
	JMenuItem courier = new JMenuItem("Courier");
	JMenuItem verdana = new JMenuItem("Verdana");
	JMenuItem serif = new JMenuItem("Serif");
	JMenuItem console = new JMenuItem("Console");
	
	JMenuItem negrita = new JMenuItem("Negrita");
	JMenuItem cursiva = new JMenuItem("Cursiva");
	
	JMenuItem t12 = new JMenuItem("12");
	JMenuItem t14 = new JMenuItem("14");
	JMenuItem t16 = new JMenuItem("16");
	JMenuItem t18 = new JMenuItem("18");
	JMenuItem t20 = new JMenuItem("20");
	JMenuItem t22 = new JMenuItem("22");
	
	String tipo_letra = "Arial";
	
	int tama�o_letra = 12;
	int estilo_letra = 0;
	
	boolean n = true;
	boolean c = true;
	
	public static void main(String[] args) {
		
		Main m = new Main();
		m.setVisible(true);
		
	}
	
	public Main() {
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Mini Practica n�2 - Mini Procesador de Texto");
		setContentPane(contentPane);
		setJMenuBar(barraMenu);
		setLayout(new BorderLayout());
		setSize(450, 400);
		
		barraMenu.add(letra);
		barraMenu.add(estilo);
		barraMenu.add(tama�o);
		
		letra.add(arial);
		letra.add(courier);
		letra.add(verdana);
		letra.add(serif);
		letra.add(console);
		
		estilo.add(negrita);
		estilo.add(cursiva);
		
		tama�o.add(t12);
		tama�o.add(t14);
		tama�o.add(t16);
		tama�o.add(t18);
		tama�o.add(t20);
		tama�o.add(t22);
		
		arial.addActionListener(l);
		courier.addActionListener(l);
		verdana.addActionListener(l);
		serif.addActionListener(l);
		console.addActionListener(l);
		
		negrita.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				if(n) {
					
					estilo_letra += Font.BOLD;
					n=false;
					
				}else {
					
					estilo_letra -= Font.BOLD;
					n=true;
					
				}
				
				text.setFont(new Font(tipo_letra, estilo_letra, tama�o_letra));
			}
			
		});
		cursiva.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				if(c) {
					
					estilo_letra += Font.ITALIC;
					c=false;
					
				}else {
					
					estilo_letra -= Font.ITALIC;
					c=true;
					
				}
				
				text.setFont(new Font(tipo_letra, estilo_letra, tama�o_letra));
			}
			
		});
		
		t12.addActionListener(t);
		t14.addActionListener(t);
		t16.addActionListener(t);
		t18.addActionListener(t);
		t20.addActionListener(t);
		t22.addActionListener(t);
		
		add(scroll, BorderLayout.CENTER);
		
	}
	
	private class cambiaLetra implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			tipo_letra = e.getActionCommand();
			
			text.setFont(new Font(tipo_letra, estilo_letra, tama�o_letra));
			
		}
		
	}
	
	private class cambiaTama�o implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			tama�o_letra = Integer.parseInt(e.getActionCommand());
			
			text.setFont(new Font(tipo_letra, estilo_letra, tama�o_letra));
			
		}
		
	}
	
}