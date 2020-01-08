package main;

import java.awt.BorderLayout;

import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.text.StyledEditorKit;

public class Main extends JFrame {
	
	JPanel contentPane = new JPanel();
	JMenuBar barraMenu = new JMenuBar();
	JTextPane text = new JTextPane();
	JScrollPane scroll = new JScrollPane(text);
	
	JMenu[] m = {new JMenu("Tipo de Letra"), new JMenu("Estilo"), new JMenu("Tamaño")};
	
	JMenuItem[] tl = {new JMenuItem("Arial"), new JMenuItem("Courier"), new JMenuItem("Verdana"), new JMenuItem("Serif"), new JMenuItem("Console")};
	JCheckBoxMenuItem[] e = {new JCheckBoxMenuItem("Negrita"), new JCheckBoxMenuItem("Cursiva"), new JCheckBoxMenuItem("Subrayado")};
	JRadioButtonMenuItem[] t12 = {new JRadioButtonMenuItem("12"), new JRadioButtonMenuItem("14"), new JRadioButtonMenuItem("16"), new JRadioButtonMenuItem("18"), new JRadioButtonMenuItem("20"),
			new JRadioButtonMenuItem("22"), new JRadioButtonMenuItem("24")};
	
	public static void main(String[] args) {
		
		Main m = new Main();
		m.setVisible(true);
		
	}
	
	public Main() {
		
		setSize(450, 400);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Mini Practica nº2 - Mini Procesador de Texto");
		setContentPane(contentPane);
		setJMenuBar(barraMenu);
		setLayout(new BorderLayout());
		
		for(int i = 0; i < 3;i++) {
			barraMenu.add(m[i]);
		}
		
		for(int i = 0; i < 5;i++) {
			m[0].add(tl[i]);
			tl[i].addActionListener(new StyledEditorKit.FontFamilyAction("", tl[i].getActionCommand()));
		}
		
		for(int i = 0; i < 3;i++) {
			m[1].add(e[i]);
		}
		
		e[0].addActionListener(new StyledEditorKit.BoldAction());
		e[1].addActionListener(new StyledEditorKit.ItalicAction());
		e[2].addActionListener(new StyledEditorKit.UnderlineAction());
		
		for(int i = 0, k = 12; i < 7; i++, k++, k++) {
			m[2].add(t12[i]);
			t12[i].addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamano", k));
		}
		
		add(scroll, BorderLayout.CENTER);
		
	}
	
}