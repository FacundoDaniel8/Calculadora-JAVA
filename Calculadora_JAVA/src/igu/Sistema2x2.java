package igu;

//import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import AppPackage.AnimationClass;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Color;
//import java.awt.SystemColor;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class Sistema2x2 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField vent1;
	private JTextField vent2;
	private JTextField vent3;
	private JTextField vent4;
	private JTextField vent5;
	private JTextField vent6;
	private JTextField res1;
	private JTextField res2;
	private JTextArea txtrY_1;
	private JTextArea txtrY_2;
	private JPanel volver;
	private JLabel lblVolver;
	private JPanel renglon1;
	private JPanel renglon2;
	private JPanel renglones;
	private JPanel output;
	private JLabel llave1;
	private JLabel llave2;
	private JPanel input;
	private JLabel divisor_1A;
	private JLabel divisor_1B;
	private JPanel lineaDivisora1;
	private JPanel lineaDivisora2;
	private JLabel divisor_2A;
	private JLabel divisor_2B;
	private JPanel lineaDivisora3;
	private JLabel divisor_3A;
	private JLabel divisor_3B;
	int cursor=0;
	//velocidad de los objetos:
	int v=4;
	int v_llaves=10;
	int aux=5;
	
	
	Color letra;
	
	
	AnimationClass llaves_salen = new AnimationClass();
	AnimationClass llaves_entran = new AnimationClass();
	//40
	int llave1_adentro=40;
	int llave1_afuera=-60;
	
	int llave2_adentro=492;
	int llave2_afuera=577;
	
	private JButton borrar;
	private JLabel lblSistemax;
	private JPanel home;
	private JLabel logoHome;
	private JPanel dividirMenu;
	private JPanel I;
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sistema2x2 frame = new Sistema2x2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public Sistema2x2(Color a1, Color a2, Color b,Color b2, Color c, Color c2) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Sistema2x2.class.getResource("/imagenes/logos/calcu-logo.png")));
		
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 520);
		contentPane = new JPanel();
		contentPane.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				//Llaves salen: 
				if((int)llave1.getX()==llave1_adentro || (int)llave2.getX()==llave2_adentro) {
					llaves_salen.jLabelXLeft(llave1_adentro, llave1_afuera, v_llaves, aux, llave1);
					llaves_salen.jLabelXRight(llave2_adentro, llave2_afuera, v_llaves, aux, llave2);
				}
			}
		});
		contentPane.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseMoved(MouseEvent e) {
				//cuando el mouse se apoya en el Panel Contenedor todas las lineas se bajan:
				AnimationClass salir_renglon1 = new AnimationClass();
				//sale del renglon 1
				if((int)divisor_1A.getX()==0 && (int)divisor_1B.getX()==190) {
					salir_renglon1.jLabelXLeft(0,-210, v, 5, divisor_1A);
					salir_renglon1.jLabelXRight(190,430, v, 5, divisor_1B);
				}
				AnimationClass salir_renglon2 = new AnimationClass();
				if((int)divisor_2A.getX()==0 && (int)divisor_2B.getX()==190) {
					salir_renglon2.jLabelXLeft(0,-210, v, 5, divisor_2A);
					salir_renglon2.jLabelXRight(190,430, v, 5, divisor_2B);
				}
				
				AnimationClass salir_renglon3 = new AnimationClass();
				if((int)divisor_3A.getX()==0 && (int)divisor_3B.getX()==190) {
					salir_renglon3.jLabelXLeft(0,-210, v, 5, divisor_3A);
					salir_renglon3.jLabelXRight(190,430, v, 5, divisor_3B);
				}

			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				//cuando el mouse se apoya en el Panel Contenedor todas las lineas se bajan:
				AnimationClass salir_renglon1 = new AnimationClass();
				//sale del renglon 1
				if((int)divisor_1A.getX()==0 && (int)divisor_1B.getX()==190) {
					salir_renglon1.jLabelXLeft(0,-210, v, 5, divisor_1A);
					salir_renglon1.jLabelXRight(190,430, v, 5, divisor_1B);
				}
				AnimationClass salir_renglon2 = new AnimationClass();
				if((int)divisor_2A.getX()==0 && (int)divisor_2B.getX()==190) {
					salir_renglon2.jLabelXLeft(0,-210, v, 5, divisor_2A);
					salir_renglon2.jLabelXRight(190,430, v, 5, divisor_2B);
				}
				
				AnimationClass salir_renglon3 = new AnimationClass();
				if((int)divisor_3A.getX()==0 && (int)divisor_3B.getX()==190) {
					salir_renglon3.jLabelXLeft(0,-210, v, 5, divisor_3A);
					salir_renglon3.jLabelXRight(190,430, v, 5, divisor_3B);
				}
				
				
				//Llaves salen: 
				if((int)llave1.getX()==llave1_adentro || (int)llave2.getX()==llave2_adentro) {
					llaves_salen.jLabelXLeft(llave1_adentro, llave1_afuera, v_llaves, aux, llave1);
					llaves_salen.jLabelXRight(llave2_adentro, llave2_afuera, v_llaves, aux, llave2);
				}

				
				
				
			}
		});
		contentPane.setBackground(a1);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		dividirMenu = new JPanel();
		dividirMenu.setBackground(new Color(0, 0, 0));
		dividirMenu.setBounds(89, 0, 1, 45);
		contentPane.add(dividirMenu);
		
		lineaDivisora3 = new JPanel();
		lineaDivisora3.setLayout(null);
		lineaDivisora3.setBounds(98, 215, 404, 23);
		lineaDivisora3.setBackground(a1);
		contentPane.add(lineaDivisora3);
		
		
		divisor_3A = new JLabel("_____________________________");
		divisor_3A.setBounds(-210, 0, 228, 15);
		lineaDivisora3.add(divisor_3A);
		
		divisor_3B = new JLabel("_____________________________");
		divisor_3B.setBounds(430, 0, 262, 15);
		lineaDivisora3.add(divisor_3B);
		
		lineaDivisora2 = new JPanel();
		lineaDivisora2.setBounds(98, 160, 404, 23);
		lineaDivisora2.setBackground(a1);
		contentPane.add(lineaDivisora2);
		lineaDivisora2.setLayout(null);
		
		divisor_2A = new JLabel("_____________________________");
		divisor_2A.setBounds(-210, 0, 228, 15);
		lineaDivisora2.add(divisor_2A);
		
		divisor_2B = new JLabel("_____________________________");
		divisor_2B.setBounds(430, 0, 262, 15);
		lineaDivisora2.add(divisor_2B);
		
	/*	public void isNumeric (String cadena){
			try {
				Integer.parseInt(cadena);
				return true;
			} catch (NumberFormatException nfe){
				return false;
			}
		}*/
		
		volver = new JPanel();
		volver.setLayout(null);
		volver.setBackground(c);
		volver.setBounds(0, 0, 89, 45);
		contentPane.add(volver);
		
		lblVolver = new JLabel("");
		lblVolver.setIcon(new ImageIcon(Sistema2x2.class.getResource("/imagenes/logos/flecha-logo.png")));
		lblVolver.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				//cuando el mouse se apoya en el Panel Contenedor todas las lineas se bajan:
				AnimationClass salir_renglon1 = new AnimationClass();
				//sale del renglon 1
				if((int)divisor_1A.getX()==0 && (int)divisor_1B.getX()==190) {
					salir_renglon1.jLabelXLeft(0,-210, v, 5, divisor_1A);
					salir_renglon1.jLabelXRight(190,430, v, 5, divisor_1B);
				}
				AnimationClass salir_renglon2 = new AnimationClass();
				if((int)divisor_2A.getX()==0 && (int)divisor_2B.getX()==190) {
					salir_renglon2.jLabelXLeft(0,-210, v, 5, divisor_2A);
					salir_renglon2.jLabelXRight(190,430, v, 5, divisor_2B);
				}
				
				AnimationClass salir_renglon3 = new AnimationClass();
				if((int)divisor_3A.getX()==0 && (int)divisor_3B.getX()==190) {
					salir_renglon3.jLabelXLeft(0,-210, v, 5, divisor_3A);
					salir_renglon3.jLabelXRight(190,430, v, 5, divisor_3B);
				}

			}
		});
		lblVolver.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				volver.setBackground(c2);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				volver.setBackground(c);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				MenuOpciones menu = new MenuOpciones(a1,a2,b,b2,c,c2);
				menu.setLocationRelativeTo(null);
				menu.setVisible(true);
				dispose();
				
			}
		});
		lblVolver.setHorizontalAlignment(SwingConstants.CENTER);
		lblVolver.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblVolver.setBackground((Color) null);
		lblVolver.setBounds(0, 0, 90, 45);
		volver.add(lblVolver);
		
		output = new JPanel();
		output.addMouseMotionListener(new MouseMotionAdapter() {

				@Override
				public void mouseMoved(MouseEvent e) {
					//cuando el mouse se apoya en el Panel Contenedor todas las lineas se bajan:
					AnimationClass salir_renglon1 = new AnimationClass();
					//sale del renglon 1
					if((int)divisor_1A.getX()==0 && (int)divisor_1B.getX()==190) {
						salir_renglon1.jLabelXLeft(0,-210, v, 5, divisor_1A);
						salir_renglon1.jLabelXRight(190,430, v, 5, divisor_1B);
					}
					AnimationClass salir_renglon2 = new AnimationClass();
					if((int)divisor_2A.getX()==0 && (int)divisor_2B.getX()==190) {
						salir_renglon2.jLabelXLeft(0,-210, v, 5, divisor_2A);
						salir_renglon2.jLabelXRight(190,430, v, 5, divisor_2B);
					}
					
					AnimationClass salir_renglon3 = new AnimationClass();
					if((int)divisor_3A.getX()==0 && (int)divisor_3B.getX()==190) {
						salir_renglon3.jLabelXLeft(0,-210, v, 5, divisor_3A);
						salir_renglon3.jLabelXRight(190,430, v, 5, divisor_3B);
					}
					
					//Llaves salen: 
					if((int)llave1.getX()==llave1_adentro || (int)llave2.getX()==llave2_adentro) {
						llaves_salen.jLabelXLeft(llave1_adentro, llave1_afuera, v_llaves, aux, llave1);
						llaves_salen.jLabelXRight(llave2_adentro, llave2_afuera, v_llaves, aux, llave2);
					}

				}
			
		});
		output.setBackground(a1);
		output.setBounds(0, 270, 584, 200);
		contentPane.add(output);
		output.setLayout(null);
		
		JTextArea txtrAjfoiajs = new JTextArea();
		txtrAjfoiajs.setFont(new Font("Malgun Gothic Semilight", Font.PLAIN, 22));
		txtrAjfoiajs.setBounds(90, 100, 54, 43);
		output.add(txtrAjfoiajs);
		txtrAjfoiajs.setBackground(a1);
		txtrAjfoiajs.setEditable(false);
		txtrAjfoiajs.setText("X =");
		
		res1 = new JTextField();
		res1.setFont(new Font("Malgun Gothic", Font.PLAIN, 19));
		res1.setBounds(144, 100, 101, 43);
		output.add(res1);
		res1.setEditable(false);
		res1.setColumns(10);
		
		JTextArea txtrY = new JTextArea();
		txtrY.setFont(new Font("Malgun Gothic Semilight", Font.PLAIN, 22));
		txtrY.setBounds(335, 100, 54, 43);
		output.add(txtrY);
		txtrY.setBackground(a1);
		txtrY.setEditable(false);
		txtrY.setText("Y =");
		
		res2 = new JTextField();
		res2.setFont(new Font("Malgun Gothic", Font.PLAIN, 19));
		res2.setBounds(389, 100, 101, 43);
		output.add(res2);
		res2.setEditable(false);
		res2.setColumns(10);
		
		JButton boton = new JButton("Resolver");
		boton.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				//cuando el mouse se apoya en el Panel Contenedor todas las lineas se bajan:
				AnimationClass salir_renglon1 = new AnimationClass();
				//sale del renglon 1
				if((int)divisor_1A.getX()==0 && (int)divisor_1B.getX()==190) {
					salir_renglon1.jLabelXLeft(0,-210, v, 5, divisor_1A);
					salir_renglon1.jLabelXRight(190,430, v, 5, divisor_1B);
				}
				AnimationClass salir_renglon2 = new AnimationClass();
				if((int)divisor_2A.getX()==0 && (int)divisor_2B.getX()==190) {
					salir_renglon2.jLabelXLeft(0,-210, v, 5, divisor_2A);
					salir_renglon2.jLabelXRight(190,430, v, 5, divisor_2B);
				}
				
				AnimationClass salir_renglon3 = new AnimationClass();
				if((int)divisor_3A.getX()==0 && (int)divisor_3B.getX()==190) {
					salir_renglon3.jLabelXLeft(0,-210, v, 5, divisor_3A);
					salir_renglon3.jLabelXRight(190,430, v, 5, divisor_3B);
				}
				
				//Llaves salen: 
				if((int)llave1.getX()==llave1_adentro || (int)llave2.getX()==llave2_adentro) {
					llaves_salen.jLabelXLeft(llave1_adentro, llave1_afuera, v_llaves, aux, llave1);
					llaves_salen.jLabelXRight(llave2_adentro, llave2_afuera, v_llaves, aux, llave2);
				}

			}
		});
		letra = boton.getForeground();
		boton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				boton.setBackground(b2);
				boton.setForeground(new Color(255,255,255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				boton.setBackground(b);
				boton.setForeground(letra);
			}
			
		});
		boton.setFont(new Font("Malgun Gothic", Font.BOLD, 18));
		boton.setBounds(90, 0, 168, 60);
		boton.setBackground(b);
		output.add(boton);
		
		borrar = new JButton("AC");
		borrar.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				//cuando el mouse se apoya en el Panel Contenedor todas las lineas se bajan:
				AnimationClass salir_renglon1 = new AnimationClass();
				//sale del renglon 1
				if((int)divisor_1A.getX()==0 && (int)divisor_1B.getX()==190) {
					salir_renglon1.jLabelXLeft(0,-210, v, 5, divisor_1A);
					salir_renglon1.jLabelXRight(190,430, v, 5, divisor_1B);
				}
				AnimationClass salir_renglon2 = new AnimationClass();
				if((int)divisor_2A.getX()==0 && (int)divisor_2B.getX()==190) {
					salir_renglon2.jLabelXLeft(0,-210, v, 5, divisor_2A);
					salir_renglon2.jLabelXRight(190,430, v, 5, divisor_2B);
				}
				
				AnimationClass salir_renglon3 = new AnimationClass();
				if((int)divisor_3A.getX()==0 && (int)divisor_3B.getX()==190) {
					salir_renglon3.jLabelXLeft(0,-210, v, 5, divisor_3A);
					salir_renglon3.jLabelXRight(190,430, v, 5, divisor_3B);
				}
				
				//Llaves salen: 
				if((int)llave1.getX()==llave1_adentro || (int)llave2.getX()==llave2_adentro) {
					llaves_salen.jLabelXLeft(llave1_adentro, llave1_afuera, v_llaves, aux, llave1);
					llaves_salen.jLabelXRight(llave2_adentro, llave2_afuera, v_llaves, aux, llave2);
				}

			}
		});
		borrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				borrar.setBackground(c2);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				borrar.setBackground(c);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				vent1.setText("");
				vent2.setText("");
				vent3.setText("");
				vent4.setText("");
				vent5.setText("");
				vent6.setText("");
				res1.setText("");
				res2.setText("");
			}
		});
		borrar.setFont(new Font("Malgun Gothic", Font.BOLD, 18));
		borrar.setBackground(c);
		borrar.setBounds(335, 0, 168, 60);
		output.add(borrar);
		
		I = new JPanel();
		I.setBackground(Color.BLACK);
		I.setBounds(294, 67, 1, 110);
		output.add(I);
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//funciones con el boton
				 int val [] =new int [6];
				 int deltaX,deltaY,deltaA;
				 int result1,result2;
				 int check=0;
				 int i,j;
				 //
				 try {//que lo intenta
				 val[0] = Integer.parseInt( vent1.getText() );
				 val[1] = Integer.parseInt( vent2.getText() );
				 val[2] = Integer.parseInt( vent3.getText() );
				 val[3] = Integer.parseInt( vent4.getText() );
				 val[4] = Integer.parseInt( vent5.getText() );
				 val[5] = Integer.parseInt( vent6.getText() );
				/* SimpleTesting obj = new SimpleTesting();
				 for(i=0;i<6;i++) {
					 if( val[i] != null ) {
						 Esta parte Esta incompleta se deberia que tiene que buscar un valor nulo pero no anda
					 					  }
					 else{
					 res1.setText("Valores");
					 res2.setText("Incompletos");
					 return;
					 	 }					  
				 				  }*/
				 	}//si detecta excepciones 
				 catch(Exception a) {
					 res1.setText("Valores");
					 res2.setText("Erróneos");
					 return;
				 					}
				 //
				for(i=0;i<6;i++) {
					for(j=0;j<6;j++) {
						if(val[i]==val[j]) {
							check++;
										   }
									 }
								 }
				
				if(check==36) {
					res1.setText( "Sin" );
					res2.setText( "Solucion" );
							  }
				else {
				 deltaA = (val[0]*val[4]) - (val[3]*val[1]);
				 deltaX = ( val[4]*val[2] ) - ( val[1]*val[5] );
				 deltaY = ( val[0]*val[5] ) - ( val[3]*val[2] );
				
				 result1 = deltaX/deltaA;
				 result2 = deltaY/deltaA;
				 
				 res1.setText( String.valueOf(result1) );
				 res2.setText( String.valueOf(result2) );
					 }
													   }
		});
		
		input = new JPanel();
		input.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				//AnimationClass entrar_llaves = new AnimationClass();
				if((int)llave1.getX()==llave1_afuera || (int)llave2.getX()==llave2_afuera) {
					llaves_entran.jLabelXRight(llave1_afuera, llave1_adentro, v_llaves, aux, llave1);
					llaves_entran.jLabelXLeft(llave2_afuera, llave2_adentro, v_llaves, aux, llave2);
				}				

				
			}
		});
		input.setBounds(0, 120, 584, 127);
		contentPane.add(input);
		input.setLayout(null);
		input.setBackground(a1);
		
		llave1 = new JLabel("{");
		llave1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				//Las llaves entran:
				if((int)llave1.getX()==llave1_afuera && (int)llave2.getX()==llave2_afuera) {
					llaves_entran.jLabelXRight(llave1_afuera,llave1_adentro, v_llaves, aux, llave1);
					llaves_entran.jLabelXLeft(llave2_afuera, llave2_adentro, v_llaves, aux, llave2);
				}
			}
		});
		llave1.setBounds(llave1_afuera, 0, 62, 110);
		input.add(llave1);
		llave1.setHorizontalAlignment(SwingConstants.RIGHT);
		llave1.setVerticalAlignment(SwingConstants.TOP);
		llave1.setFont(new Font("Yu Gothic", Font.PLAIN, 99));
		llave1.setVisible(true);
		
		llave2 = new JLabel("}");
		llave2.setBounds(llave2_afuera, 0, 62, 110);
		input.add(llave2);
		llave2.setVerticalAlignment(SwingConstants.TOP);
		llave2.setHorizontalAlignment(SwingConstants.CENTER);
		llave2.setFont(new Font("Yu Gothic", Font.PLAIN, 99));
		llave2.setVisible(true);
		
		renglones = new JPanel();
		renglones.setBounds(102, 0, 395, 110);
		input.add(renglones);
		renglones.setLayout(null);
		
		renglon2 = new JPanel();
		renglon2.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				//Las llaves entran:
				if((int)llave1.getX()==llave1_afuera && (int)llave2.getX()==llave2_afuera) {
					llaves_entran.jLabelXRight(llave1_afuera,llave1_adentro, v_llaves, aux, llave1);
					llaves_entran.jLabelXLeft(llave2_afuera, llave2_adentro, v_llaves, aux, llave2);
				}
			}
		});
		renglon2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {

				AnimationClass salir_renglon1 = new AnimationClass();
				//sale del renglon 1
				if((int)divisor_1A.getX()==0 && (int)divisor_1B.getX()==190) {
					salir_renglon1.jLabelXLeft(0,-210, v, 5, divisor_1A);
					salir_renglon1.jLabelXRight(190,430, v, 5, divisor_1B);
				}
				//entra al renglon 2
				AnimationClass entrar_renglon2 = new AnimationClass();
				if((int)divisor_2A.getX()==-210 && (int)divisor_2B.getX()==430) {
					entrar_renglon2.jLabelXRight(-210,0, v, 5, divisor_2A);
					entrar_renglon2.jLabelXLeft(430, 190, v, 5, divisor_2B);
				}
				if((int)divisor_3A.getX()==-210 && (int)divisor_3B.getX()==430) {
					entrar_renglon2.jLabelXRight(-210,0, v, 5, divisor_3A);
					entrar_renglon2.jLabelXLeft(430, 190, v, 5, divisor_3B);
				}
				
			
				//Las llaves entran:
				if((int)llave1.getX()==llave1_afuera && (int)llave2.getX()==llave2_afuera) {
					llaves_entran.jLabelXRight(llave1_afuera,llave1_adentro, v_llaves, aux, llave1);
					llaves_entran.jLabelXLeft(llave2_afuera, llave2_adentro, v_llaves, aux, llave2);
				}
			}
		});
		renglon2.setBounds(0, 55, 395, 55);
		renglones.add(renglon2);
		renglon2.setLayout(null);
		renglon2.setBackground(a1);
		
		vent4 = new JTextField();
		vent4.setFont(new Font("Malgun Gothic Semilight", Font.PLAIN, 13));
		vent4.setBounds(20, 11, 86, 20);
		renglon2.add(vent4);
		vent4.setColumns(10);
		
		JTextArea txtrX_1 = new JTextArea();
		txtrX_1.setFont(new Font("Malgun Gothic Semilight", Font.PLAIN, 18));
		txtrX_1.setBounds(107, 6, 49, 38);
		renglon2.add(txtrX_1);
		txtrX_1.setBackground(a1);
		txtrX_1.setText("X    +");
		txtrX_1.setEditable(false);
		
		vent5 = new JTextField();
		vent5.setFont(new Font("Malgun Gothic Semilight", Font.PLAIN, 13));
		vent5.setBounds(156, 11, 86, 20);
		renglon2.add(vent5);
		vent5.setColumns(10);
		
		txtrY_2 = new JTextArea();
		txtrY_2.setFont(new Font("Malgun Gothic Semilight", Font.PLAIN, 18));
		txtrY_2.setBounds(243, 6, 39, 38);
		renglon2.add(txtrY_2);
		txtrY_2.setBackground(a1);
		txtrY_2.setText("Y =");
		txtrY_2.setEditable(false);
		
		vent6 = new JTextField();
		vent6.setFont(new Font("Malgun Gothic Semilight", Font.PLAIN, 13));
		vent6.setBounds(298, 11, 86, 20);
		renglon2.add(vent6);
		vent6.setColumns(10);
		
		renglon1 = new JPanel();
		renglon1.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				//Las llaves entran:
				if((int)llave1.getX()==llave1_afuera && (int)llave2.getX()==llave2_afuera) {
					llaves_entran.jLabelXRight(llave1_afuera,llave1_adentro, v_llaves, aux, llave1);
					llaves_entran.jLabelXLeft(llave2_afuera, llave2_adentro, v_llaves, aux, llave2);
				}
			}
		});
		renglon1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {

				AnimationClass salir_renglon2 = new AnimationClass();
				//sale del renglon 2-->se desaparece la linea 3:
				if((int)divisor_3A.getX()==0 && (int)divisor_3B.getX()==190) {
					salir_renglon2.jLabelXLeft(0,-210, v, 5, divisor_3A);
					salir_renglon2.jLabelXRight(190, 430, v, 5, divisor_3B);
				}
				
				//Las lineas 1 y 2 ENTRAN
				AnimationClass entrar_renglon1 = new AnimationClass();
				if((int)divisor_1A.getX()==-210 && (int)divisor_1B.getX()==430) {
					entrar_renglon1.jLabelXRight(-210,0, v, 5, divisor_1A);
					entrar_renglon1.jLabelXLeft(430, 190, v, 5, divisor_1B);
				}
				
				if((int)divisor_2A.getX()==-210 && (int)divisor_2B.getX()==430) {
					entrar_renglon1.jLabelXRight(-210,0, v, 5, divisor_2A);
					entrar_renglon1.jLabelXLeft(430, 190, v, 5, divisor_2B);
				}
				
				//Las llaves entran:
				if((int)llave1.getX()==llave1_afuera && (int)llave2.getX()==llave2_afuera) {
					llaves_entran.jLabelXRight(llave1_afuera,llave1_adentro, v_llaves, aux, llave1);
					llaves_entran.jLabelXLeft(llave2_afuera, llave2_adentro, v_llaves, aux, llave2);
				}
			}

		});
		renglon1.setBounds(0, 0, 395, 55);
		renglones.add(renglon1);
		renglon1.setBackground(a1);
		renglon1.setLayout(null);
		
		vent1 = new JTextField();
		vent1.setFont(new Font("Malgun Gothic Semilight", Font.PLAIN, 13));
		vent1.setBounds(20, 11, 86, 20);
		renglon1.add(vent1);
		vent1.setColumns(10);
		
		JTextArea txtrX = new JTextArea();
		txtrX.setFont(new Font("Malgun Gothic Semilight", Font.PLAIN, 18));
		txtrX.setBounds(107, 6, 49, 35);
		renglon1.add(txtrX);
		txtrX.setBackground(a1);
		txtrX.setText("X    +");
		txtrX.setEditable(false);
		
		vent2 = new JTextField();
		vent2.setFont(new Font("Malgun Gothic Semilight", Font.PLAIN, 13));
		vent2.setBounds(156, 11, 86, 20);
		renglon1.add(vent2);
		vent2.setColumns(10);
		
		txtrY_1 = new JTextArea();
		txtrY_1.setFont(new Font("Malgun Gothic Semilight", Font.PLAIN, 18));
		txtrY_1.setBounds(243, 6, 39, 35);
		renglon1.add(txtrY_1);
		txtrY_1.setBackground(a1);
		txtrY_1.setText("Y =");
		txtrY_1.setEditable(false);
		
		vent3 = new JTextField();
		vent3.setFont(new Font("Malgun Gothic Semilight", Font.PLAIN, 13));
		vent3.setBounds(298, 11, 86, 20);
		renglon1.add(vent3);
		vent3.setColumns(10);
		
		lineaDivisora1 = new JPanel();
		lineaDivisora1.setBounds(98, 105, 404, 23);
		contentPane.add(lineaDivisora1);
		lineaDivisora1.setBackground(a1);
		lineaDivisora1.setLayout(null);
		
		divisor_1A = new JLabel("_____________________________");
		divisor_1A.setBounds(-210, 0, 228, 15);
		lineaDivisora1.add(divisor_1A);
		
		divisor_1B = new JLabel("_____________________________");
		divisor_1B.setBounds(430, 0, 262, 15);
		lineaDivisora1.add(divisor_1B);
		
		lblSistemax = new JLabel("  Sistema 2x2");
		lblSistemax.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				//cuando el mouse se apoya en el Panel Contenedor todas las lineas se bajan:
				AnimationClass salir_renglon1 = new AnimationClass();
				//sale del renglon 1
				if((int)divisor_1A.getX()==0 && (int)divisor_1B.getX()==190) {
					salir_renglon1.jLabelXLeft(0,-210, v, 5, divisor_1A);
					salir_renglon1.jLabelXRight(190,430, v, 5, divisor_1B);
				}
				AnimationClass salir_renglon2 = new AnimationClass();
				if((int)divisor_2A.getX()==0 && (int)divisor_2B.getX()==190) {
					salir_renglon2.jLabelXLeft(0,-210, v, 5, divisor_2A);
					salir_renglon2.jLabelXRight(190,430, v, 5, divisor_2B);
				}
				
				AnimationClass salir_renglon3 = new AnimationClass();
				if((int)divisor_3A.getX()==0 && (int)divisor_3B.getX()==190) {
					salir_renglon3.jLabelXLeft(0,-210, v, 5, divisor_3A);
					salir_renglon3.jLabelXRight(190,430, v, 5, divisor_3B);
				}

			}
		});
		lblSistemax.setHorizontalAlignment(SwingConstants.LEFT);
		lblSistemax.setFont(new Font("Malgun Gothic", Font.BOLD, 24));
		lblSistemax.setBounds(194, 70, 308, 45);
		contentPane.add(lblSistemax);
		
		home = new JPanel();
		home.setLayout(null);
		home.setBackground(c);
		home.setBounds(90, 0, 91, 45);
		contentPane.add(home);
		
		logoHome = new JLabel("");
		logoHome.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				//cuando el mouse se apoya en el Panel Contenedor todas las lineas se bajan:
				AnimationClass salir_renglon1 = new AnimationClass();
				//sale del renglon 1
				if((int)divisor_1A.getX()==0 && (int)divisor_1B.getX()==190) {
					salir_renglon1.jLabelXLeft(0,-210, v, 5, divisor_1A);
					salir_renglon1.jLabelXRight(190,430, v, 5, divisor_1B);
				}
				AnimationClass salir_renglon2 = new AnimationClass();
				if((int)divisor_2A.getX()==0 && (int)divisor_2B.getX()==190) {
					salir_renglon2.jLabelXLeft(0,-210, v, 5, divisor_2A);
					salir_renglon2.jLabelXRight(190,430, v, 5, divisor_2B);
				}
				
				AnimationClass salir_renglon3 = new AnimationClass();
				if((int)divisor_3A.getX()==0 && (int)divisor_3B.getX()==190) {
					salir_renglon3.jLabelXLeft(0,-210, v, 5, divisor_3A);
					salir_renglon3.jLabelXRight(190,430, v, 5, divisor_3B);
				}
				
				//Llaves salen: 
				if((int)llave1.getX()==llave1_adentro || (int)llave2.getX()==llave2_adentro) {
					llaves_salen.jLabelXLeft(llave1_adentro, llave1_afuera, v_llaves, aux, llave1);
					llaves_salen.jLabelXRight(llave2_adentro, llave2_afuera, v_llaves, aux, llave2);
				}
			}
		});
		logoHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				//cuando el mouse se apoya en el Panel Contenedor todas las lineas se bajan:
				AnimationClass salir_renglon1 = new AnimationClass();
				//sale del renglon 1
				if((int)divisor_1A.getX()==0 && (int)divisor_1B.getX()==190) {
					salir_renglon1.jLabelXLeft(0,-210, v, 5, divisor_1A);
					salir_renglon1.jLabelXRight(190,430, v, 5, divisor_1B);
				}
				AnimationClass salir_renglon2 = new AnimationClass();
				if((int)divisor_2A.getX()==0 && (int)divisor_2B.getX()==190) {
					salir_renglon2.jLabelXLeft(0,-210, v, 5, divisor_2A);
					salir_renglon2.jLabelXRight(190,430, v, 5, divisor_2B);
				}
				
				AnimationClass salir_renglon3 = new AnimationClass();
				if((int)divisor_3A.getX()==0 && (int)divisor_3B.getX()==190) {
					salir_renglon3.jLabelXLeft(0,-210, v, 5, divisor_3A);
					salir_renglon3.jLabelXRight(190,430, v, 5, divisor_3B);
				}
				
				//Llaves salen: 
				if((int)llave1.getX()==llave1_adentro || (int)llave2.getX()==llave2_adentro) {
					llaves_salen.jLabelXLeft(llave1_adentro, llave1_afuera, v_llaves, aux, llave1);
					llaves_salen.jLabelXRight(llave2_adentro, llave2_afuera, v_llaves, aux, llave2);
				}
				
				home.setBackground(c2);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				home.setBackground(c);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Selector selec = new Selector(a1, a2, b, b2, c, c2);
				selec.setLocationRelativeTo(null);
				selec.setVisible(true);
				
			}
		});
		logoHome.setIcon(new ImageIcon(Sistema2x2.class.getResource("/imagenes/logos/home-logo_clarito (1) (1).png")));
		logoHome.setHorizontalAlignment(SwingConstants.CENTER);
		logoHome.setFont(new Font("Tahoma", Font.PLAIN, 18));
		logoHome.setBackground((Color) null);
		logoHome.setBounds(0, 0, 91, 45);
		home.add(logoHome);
		
		borrar.setBackground(c);
		
	}
}