package main;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Main2 extends JFrame {
	
	JPanel cp = new JPanel();
	JLabel i = new JLabel();
	JButton po = new JButton(), so = new JButton();
	
	public static void main(String[] args) {
		
		
		
	}
	
	public Main2() {
		
		setSize(350, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("Mini Practica nº2 - Mini Procesador de Texto");
		setContentPane(cp);
		cp.setLayout(new BorderLayout());
		
		
		
	}
	
}
