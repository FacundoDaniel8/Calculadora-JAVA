package igu;

//import java.awt.EventQueue;
import javax.swing.JFrame;

import javax.swing.JPanel;
//import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
//import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
//import java.awt.event.MouseMotionAdapter;
//import java.awt.Toolkit;
//import java.awt.event.ComponentAdapter;
//import java.awt.event.ComponentEvent;
//import AppPackage.AnimationClass;
//import java.io.*;
//import java.lang.Thread;
//import java.awt.FlowLayout;

//import javax.swing.JOptionPane;
import java.awt.Toolkit;

public class Selector extends JFrame{
	//int alto_frame=520;
	//int ancho_frame=600;
	int alto_frame=600;
	int ancho_frame=650;

	//diferencia de altura entre los botones del MenúSelector:
	int diferencia=80;
	
	/**
	 * 
	 */
	
	
	private static final long serialVersionUID = 1L;
	//extends JFrame
	//implements Thread
	//extends Thread
	boolean i=true;
	int cont=1;
	
	JPanel panel,panel2, panel3, panel4, panel5;
	//private JLabel lblMasCerrado;
	
	//private JLabel lblMenosAbierto;
	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Selector frame = new Selector(Color, Color, Color);
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/
	/**
	 * Create the frame.
	 */
	public Selector (Color a1, Color a2, Color b,Color b2, Color c, Color c2) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Selector.class.getResource("/imagenes/logos/calcu-logo.png")));
		int btnAlto=45;
		setResizable(false);
		//setIconImage(Toolkit.getDefaultToolkit().getImage(Selector.class.getResource("/imagenes/caba-logo.jpg")));
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 964, 603);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(a1);
		panel.setForeground(new Color(163, 39, 221));
		panel.setBounds(0, 0, 948, 578);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("   Calculadora\r\n\r\n");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Malgun Gothic", Font.BOLD, 24));
		lblNewLabel_1.setBounds(0, 0, 948, 89);
		panel.add(lblNewLabel_1);
		
		JPanel contenido_principal = new JPanel();
		contenido_principal.setBackground(a2);
		contenido_principal.setBounds(332, 84, 300, 483 );
		panel.add(contenido_principal);
		contenido_principal.setVisible(false);
		contenido_principal.setLayout(null);
		
		JPanel pnlSelector = new JPanel();
		pnlSelector.setBackground(b);
		int y=88;
		pnlSelector.setBounds(0, 88, 300, btnAlto);
		contenido_principal.add(pnlSelector);
		pnlSelector.setLayout(null);
		
		JLabel lbl1 = new JLabel("        Básicas");
		lbl1.setForeground(new Color(255, 255, 255));
		lbl1.setBounds(0, 0, 300, btnAlto);
		pnlSelector.add(lbl1);
		//lbl1.addMouseMotionListener(new MouseMotionAdapter() {});
		
		lbl1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//dispose();
				Calculadora calculadora = new Calculadora(a1,a2,b,b2,c,c2);
				calculadora.setVisible(true);
				calculadora.setSize(ancho_frame, alto_frame);
				calculadora.setLocationRelativeTo(null);
				
				setVisible(false);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				pnlSelector.setBackground( b2 );
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pnlSelector.setBackground( b );
			}
		});
		lbl1.setBackground(new Color(12, 139, 243));
		lbl1.setHorizontalAlignment(SwingConstants.LEFT);
		lbl1.setFont(new Font("Malgun Gothic", Font.PLAIN, 20));
		
		JPanel panel2_1 = new JPanel();
		panel2_1.setBackground(b);
		y=y+diferencia;
		panel2_1.setBounds(0, y, 300, btnAlto);
		contenido_principal.add(panel2_1);
		panel2_1.setLayout(null);
		
		JLabel lbl2 = new JLabel("        Vectores");
		lbl2.setForeground(new Color(255, 255, 255));
		lbl2.setBounds(0, 0, 300, btnAlto);
		panel2_1.add(lbl2);
		lbl2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Vectores vector = new Vectores(a1,a2,b,b2,c,c2);
				vector.setVisible(true);
				vector.setSize(ancho_frame,alto_frame);
				vector.setLocationRelativeTo(null);
				//vector.showMessageDialog(null, "error");
				setVisible(false);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				panel2_1.setBackground( b2 );
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel2_1.setBackground( b );
			}
		});
		lbl2.setHorizontalAlignment(SwingConstants.LEFT);
		lbl2.setFont(new Font("Malgun Gothic", Font.PLAIN, 20));
		lbl2.setVisible(true);
		
		JPanel panel3 = new JPanel();
		panel3.setBackground(b);
		y=y+diferencia;
		panel3.setBounds(0, y, 300, btnAlto);
		contenido_principal.add(panel3);
		panel3.setLayout(null);
		
		JLabel lbl3 = new JLabel("        Matrices");
		lbl3.setForeground(new Color(255, 255, 255));
		lbl3.setBounds(0, 0, 300, btnAlto);
		panel3.add(lbl3);
		lbl3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//MATRICES HECHAS POR IULIANO:
				//DaniMatriz matriz= new DaniMatriz(a1,a2,b,b2,c,c2);
				
				IuliMatriz matriz= new IuliMatriz(a1,a2,b,b2,c,c2);
				matriz.setVisible(true);
				matriz.setSize(ancho_frame,alto_frame);
				matriz.setResizable(false);
				matriz.setLocationRelativeTo(null);
				setVisible(false);
				//recordar que:
				//alto_frame=600;
				//ancho_frame=650;
				
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				panel3.setBackground( b2 );
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel3.setBackground( b );
			}
		});
		lbl3.setFont(new Font("Malgun Gothic", Font.PLAIN, 20));
		lbl3.setHorizontalAlignment(SwingConstants.LEFT);
		lbl3.setVisible(true);
		
		JPanel panel4 = new JPanel();
		panel4.setBackground( b );
		y=y+diferencia;
		panel4.setBounds(0, y, 300, btnAlto);
		contenido_principal.add(panel4);
		panel4.setLayout(null);
		
		JLabel lbl4 = new JLabel("        Sistema de Ecuaciones");
		lbl4.setForeground(new Color(255, 255, 255));
		lbl4.setBounds(0, 0, 300, btnAlto);
		panel4.add(lbl4);
		lbl4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MenuOpciones menu = new MenuOpciones(a1,a2,b,b2,c,c2);
				menu.setVisible(true);
				
				menu.setSize(contenido_principal.getWidth(),contenido_principal.getHeight()+45);
				menu.setLocationRelativeTo(null);
				setVisible(false);

			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				panel4.setBackground( b2 );
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel4.setBackground( b );
			}
		});
		lbl4.setFont(new Font("Malgun Gothic", Font.PLAIN, 20));
		lbl4.setVisible(true);
		
		JPanel panel5 = new JPanel();
		panel5.setBackground(c);
		panel5.setLayout(null);
		y=y+diferencia;
		panel5.setBounds(0, y, 300, 45);
		contenido_principal.add(panel5);
		
		JLabel lbl5 = new JLabel("        Salir");
		lbl5.setForeground(new Color(0, 0, 0));
		lbl5.setBounds(0, 0, 300, 45);
		panel5.add(lbl5);
		lbl5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel5.setBackground( c2 );
				lbl5.setForeground(new Color(0,0,0) );
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel5.setBackground( c );
				lbl5.setForeground(new Color(0,0,0) );
			}
			
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lbl5.setFont(new Font("Malgun Gothic", Font.PLAIN, 20));
		lbl5.setVisible(true);
		
		JLabel lblNewLabel_5 = new JLabel("Seleccione tipo de operación");
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Malgun Gothic", Font.PLAIN, 22));
		lblNewLabel_5.setBounds(0, 0, 300, 55);
		contenido_principal.add(lblNewLabel_5);
		
		JPanel subrayado = new JPanel();
		subrayado.setBackground(new Color(0, 0, 0));
		subrayado.setBounds(405, 63, 156, 1);
		panel.add(subrayado);
		
		contenido_principal.setVisible(i);
		
	}
}
