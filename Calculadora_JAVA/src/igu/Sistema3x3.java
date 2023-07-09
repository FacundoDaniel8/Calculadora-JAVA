package igu;

import java.awt.Color;

//import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import AppPackage.AnimationClass;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class Sistema3x3 extends JFrame {

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
	private JTextField vent7;
	private JTextField vent8;
	private JTextField vent9;
	private JTextField vent10;
	private JTextField vent11;
	private JTextField vent12;
	private JTextField resX;
	private JTextField resY;
	private JTextField resZ;
	private JPanel volver;
	private JLabel lblVolver;
	private JPanel renglon1;
	private JPanel renglones;
	private JPanel input;
	private JPanel output;
	private JPanel lineaDivisora1;
	private JLabel divisor_1A;
	private JLabel divisor_1B;
	private JPanel lineaDivisora2;
	private JLabel divisor_2A;
	private JLabel divisor_2B;
	private JPanel lineaDivisora3;
	private JLabel divisor_3A;
	private JLabel divisor_3B;
	private JPanel lineaDivisora4;
	private JLabel divisor_4A;
	private JLabel divisor_4B;
	private JLabel llave1;
	private JLabel llave2;
	
	//velocidad de los componentes:
	int v=4;
	int v_llaves=10;
	int aux=5;
	
	int A_adentro=0;
	int A_afuera=-230;
	
	int B_adentro=215;
	int B_afuera=445;

	AnimationClass llaves_salen = new AnimationClass();
	AnimationClass llaves_entran = new AnimationClass();
	int llave1_adentro=30;
	int llave1_afuera=-70;
	int llave2_adentro=530;
	int llave2_afuera=625;
	
	Color letra;
	
	private JLabel titulo;
	private JPanel home;
	private JLabel logoHome;
	private JPanel dividirMenu;
	private JButton borrar;
	private JTextArea txtrAjfoiajs;
	private JTextArea txtrY_1;
	private JTextArea txtrZ_1;
	private JPanel I;
	private JPanel I_2;
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sistema3x3 frame = new Sistema3x3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Sistema3x3(Color a1, Color a2, Color b,Color b2, Color c, Color c2) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Sistema3x3.class.getResource("/imagenes/logos/calcu-logo.png")));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				//Cuando entra en el panel contenedor, todas las lineas SALEN.
				//Sale del renglon 1
				AnimationClass salir_renglon1 = new AnimationClass();
				if((int)divisor_1A.getX()==A_adentro && (int)divisor_1B.getX()==B_adentro) {
					salir_renglon1.jLabelXLeft(A_adentro, A_afuera, v, 5, divisor_1A);
					salir_renglon1.jLabelXRight(B_adentro, B_afuera, v, 5, divisor_1B);
				}
				//Sale del renglon 2
				AnimationClass salir_renglon2 = new AnimationClass();
				if((int)divisor_2A.getX()==A_adentro && (int)divisor_2B.getX()==B_adentro) {
					salir_renglon2.jLabelXLeft(A_adentro, A_afuera, v, 5, divisor_2A);
					salir_renglon2.jLabelXRight(B_adentro, B_afuera, v, 5, divisor_2B);
				}
				//Sale del renglon 3
				AnimationClass salir_renglon3 = new AnimationClass();
				if((int)divisor_3A.getX()==A_adentro && (int)divisor_3B.getX()==B_adentro) {
					salir_renglon3.jLabelXLeft(A_adentro, A_afuera, v, 5, divisor_3A);
					salir_renglon3.jLabelXRight(B_adentro, B_afuera, v, 5, divisor_3B);
				}
				//Sale del renglon 4
				AnimationClass salir_renglon4 = new AnimationClass();
				if((int)divisor_4A.getX()==A_adentro && (int)divisor_4B.getX()==B_adentro) {
					salir_renglon4.jLabelXLeft(A_adentro,A_afuera, v, 5, divisor_4A);
					salir_renglon4.jLabelXRight(B_adentro, B_afuera, v, 5, divisor_4B);
				}
				
				
				//Las llaves SALEN:
				if((int)llave1.getX()==llave1_adentro && (int)llave2.getX()==llave2_adentro) {
					llaves_salen.jLabelXLeft(llave1_adentro,llave1_afuera, v_llaves, aux, llave1);
					llaves_salen.jLabelXRight(llave2_adentro,llave2_afuera , v_llaves, aux, llave2);
				}
			}
		});
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
			//Cuando entra en el panel contenedor, todas las lineas SALEN.
				//Sale del renglon 1
				AnimationClass salir_renglon1 = new AnimationClass();
				if((int)divisor_1A.getX()==A_adentro && (int)divisor_1B.getX()==B_adentro) {
					salir_renglon1.jLabelXLeft(A_adentro, A_afuera, v, 5, divisor_1A);
					salir_renglon1.jLabelXRight(B_adentro, B_afuera, v, 5, divisor_1B);
				}
				//Sale del renglon 2
				AnimationClass salir_renglon2 = new AnimationClass();
				if((int)divisor_2A.getX()==A_adentro && (int)divisor_2B.getX()==B_adentro) {
					salir_renglon2.jLabelXLeft(A_adentro, A_afuera, v, 5, divisor_2A);
					salir_renglon2.jLabelXRight(B_adentro, B_afuera, v, 5, divisor_2B);
				}
				//Sale del renglon 3
				AnimationClass salir_renglon3 = new AnimationClass();
				if((int)divisor_3A.getX()==A_adentro && (int)divisor_3B.getX()==B_adentro) {
					salir_renglon3.jLabelXLeft(A_adentro, A_afuera, v, 5, divisor_3A);
					salir_renglon3.jLabelXRight(B_adentro, B_afuera, v, 5, divisor_3B);
				}
				//Sale del renglon 4
				AnimationClass salir_renglon4 = new AnimationClass();
				if((int)divisor_4A.getX()==A_adentro && (int)divisor_4B.getX()==B_adentro) {
					salir_renglon4.jLabelXLeft(A_adentro,A_afuera, v, 5, divisor_4A);
					salir_renglon4.jLabelXRight(B_adentro, B_afuera, v, 5, divisor_4B);
				}
			
			}
		});
		contentPane.setBackground(a1);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lineaDivisora1 = new JPanel();
		lineaDivisora1.setLayout(null);
		lineaDivisora1.setBackground((Color) null);
		lineaDivisora1.setBounds(90, 85, 443, 23);
		contentPane.add(lineaDivisora1);
		
		divisor_1A = new JLabel("_______________________________");
		divisor_1A.setBounds(-230, 0, 228, 15);
		lineaDivisora1.add(divisor_1A);
		
		divisor_1B = new JLabel("_______________________________");
		divisor_1B.setBounds(445, 0, 262, 15);
		lineaDivisora1.add(divisor_1B);
		
		lineaDivisora2 = new JPanel();
		lineaDivisora2.setLayout(null);
		lineaDivisora2.setBackground((Color) null);
		lineaDivisora2.setBounds(90, 140, 443, 23);
		contentPane.add(lineaDivisora2);
		
		divisor_2A = new JLabel("_______________________________");
		divisor_2A.setBounds(-230, 0, 228, 15);
		lineaDivisora2.add(divisor_2A);
		
		divisor_2B = new JLabel("_______________________________");
		divisor_2B.setBounds(445, 0, 262, 15);
		lineaDivisora2.add(divisor_2B);
		
		lineaDivisora3 = new JPanel();
		lineaDivisora3.setLayout(null);
		lineaDivisora3.setBackground((Color) null);
		lineaDivisora3.setBounds(90, 195, 443, 23);
		contentPane.add(lineaDivisora3);
		
		divisor_3A = new JLabel("_______________________________");
		divisor_3A.setBounds(-230, 0, 228, 15);
		lineaDivisora3.add(divisor_3A);
		
		divisor_3B = new JLabel("_______________________________");
		divisor_3B.setBounds(445, 0, 262, 15);
		lineaDivisora3.add(divisor_3B);
		
		lineaDivisora4 = new JPanel();
		lineaDivisora4.setLayout(null);
		lineaDivisora4.setBackground((Color) null);
		lineaDivisora4.setBounds(90, 245, 443, 23);
		contentPane.add(lineaDivisora4);
		
		divisor_4A = new JLabel("_______________________________");
		divisor_4A.setBounds(-230, 0, 228, 15);
		lineaDivisora4.add(divisor_4A);
		
		divisor_4B = new JLabel("_______________________________");
		divisor_4B.setBounds(445, 0, 262, 15);
		lineaDivisora4.add(divisor_4B);
		
		volver = new JPanel();
		volver.setLayout(null);
		volver.setBackground(c);
		volver.setBounds(0, 0, 90, 45);
		contentPane.add(volver);
		
		lblVolver = new JLabel("");
		lblVolver.setIcon(new ImageIcon(Sistema3x3.class.getResource("/imagenes/logos/flecha-logo.png")));
		lblVolver.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				//Cuando entra en el panel contenedor, todas las lineas SALEN.
				//Sale del renglon 1
				AnimationClass salir_renglon1 = new AnimationClass();
				if((int)divisor_1A.getX()==A_adentro && (int)divisor_1B.getX()==B_adentro) {
					salir_renglon1.jLabelXLeft(A_adentro, A_afuera, v, 5, divisor_1A);
					salir_renglon1.jLabelXRight(B_adentro, B_afuera, v, 5, divisor_1B);
				}
				//Sale del renglon 2
				AnimationClass salir_renglon2 = new AnimationClass();
				if((int)divisor_2A.getX()==A_adentro && (int)divisor_2B.getX()==B_adentro) {
					salir_renglon2.jLabelXLeft(A_adentro, A_afuera, v, 5, divisor_2A);
					salir_renglon2.jLabelXRight(B_adentro, B_afuera, v, 5, divisor_2B);
				}
				//Sale del renglon 3
				AnimationClass salir_renglon3 = new AnimationClass();
				if((int)divisor_3A.getX()==A_adentro && (int)divisor_3B.getX()==B_adentro) {
					salir_renglon3.jLabelXLeft(A_adentro, A_afuera, v, 5, divisor_3A);
					salir_renglon3.jLabelXRight(B_adentro, B_afuera, v, 5, divisor_3B);
				}
				//Sale del renglon 4
				AnimationClass salir_renglon4 = new AnimationClass();
				if((int)divisor_4A.getX()==A_adentro && (int)divisor_4B.getX()==B_adentro) {
					salir_renglon4.jLabelXLeft(A_adentro,A_afuera, v, 5, divisor_4A);
					salir_renglon4.jLabelXRight(B_adentro, B_afuera, v, 5, divisor_4B);
				}
				
				//Las llaves SALEN:
				if((int)llave1.getX()==llave1_adentro && (int)llave2.getX()==llave2_adentro) {
					llaves_salen.jLabelXLeft(llave1_adentro,llave1_afuera, v_llaves, aux, llave1);
					llaves_salen.jLabelXRight(llave2_adentro,llave2_afuera , v_llaves, aux, llave2);
				}
				
			}
		});
		lblVolver.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MenuOpciones menu = new MenuOpciones(a1,a2,b,b2,c,c2);
				menu.setLocationRelativeTo(null);
				menu.setVisible(true);
				dispose();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				volver.setBackground(c2);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				volver.setBackground(c);
			}
		});
		lblVolver.setHorizontalAlignment(SwingConstants.CENTER);
		lblVolver.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblVolver.setBounds(0, 0, 90, 45);
		volver.add(lblVolver);
		
		input = new JPanel();
		input.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				//Las llaves entran:
				if((int)llave1.getX()==llave1_afuera && (int)llave2.getX()==llave2_afuera) {
					llaves_entran.jLabelXRight(llave1_afuera,llave1_adentro, v_llaves, aux, llave1);
					llaves_entran.jLabelXLeft(llave2_afuera, llave2_adentro, v_llaves, aux, llave2);
				}
			}
		});
		input.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				//Las llaves entran:
				if((int)llave1.getX()==llave1_afuera && (int)llave2.getX()==llave2_afuera) {
					llaves_entran.jLabelXRight(llave1_afuera,llave1_adentro, v_llaves, aux, llave1);
					llaves_entran.jLabelXLeft(llave2_afuera, llave2_adentro, v_llaves, aux, llave2);
				}
				
				
			}
		});
		input.setBounds(0, 103, 653, 170);
		contentPane.add(input);
		input.setLayout(null);
		input.setBackground(a1);
		
		renglones = new JPanel();
		renglones.setBounds(82, 0, 443, 165);
		input.add(renglones);
		renglones.setLayout(null);
		
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
		renglon1.setBounds(0, 0, 443, 55);
		renglones.add(renglon1);
		renglon1.setLayout(null);
		renglon1.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseEntered(MouseEvent e) {
				llave1.setVisible(true);
				llave2.setVisible(true);
				AnimationClass salir_renglon2 = new AnimationClass();
				//sale del renglon 2-->se desaparece la linea 3:
				if((int)divisor_3A.getX()==A_adentro && (int)divisor_3B.getX()==B_adentro) {
					salir_renglon2.jLabelXLeft(A_adentro,A_afuera, v, 5, divisor_3A);
					salir_renglon2.jLabelXRight(B_adentro, B_afuera, v, 5, divisor_3B);
				}
			
				AnimationClass entrar_renglon1 = new AnimationClass();
				if((int)divisor_1A.getX()==A_afuera && (int)divisor_1B.getX()==B_afuera) {
					entrar_renglon1.jLabelXRight(A_afuera, A_adentro, v, 5, divisor_1A);
					entrar_renglon1.jLabelXLeft(B_afuera, B_adentro, v, 5, divisor_1B);
				}
				
				if((int)divisor_2A.getX()==A_afuera && (int)divisor_2B.getX()==B_afuera) {
					entrar_renglon1.jLabelXRight(A_afuera, A_adentro, v, 5, divisor_2A);
					entrar_renglon1.jLabelXLeft(B_afuera, B_adentro, v, 5, divisor_2B);
				}
				
				AnimationClass salir_renglon4 = new AnimationClass();
				if((int)divisor_4A.getX()==A_adentro && (int)divisor_4B.getX()==B_adentro) {
					salir_renglon4.jLabelXLeft(A_adentro,A_afuera, v, 5, divisor_4A);
					salir_renglon4.jLabelXRight(B_adentro, B_afuera, v, 5, divisor_4B);
				}
			}

		});
		renglon1.setBackground(a1);
		
		vent1 = new JTextField();
		vent1.setBounds(10, 11, 67, 20);
		renglon1.add(vent1);
		vent1.setColumns(10);
		
		JTextArea txtrX = new JTextArea();
		txtrX.setFont(new Font("Malgun Gothic Semilight", Font.PLAIN, 18));
		txtrX.setBounds(89, 6, 38, 35);
		renglon1.add(txtrX);
		txtrX.setBackground(SystemColor.menu);
		txtrX.setText("X  +");
		txtrX.setEditable(false);
		
		vent2 = new JTextField();
		vent2.setBounds(137, 11, 67, 20);
		renglon1.add(vent2);
		vent2.setColumns(10);
		
		vent3 = new JTextField();
		vent3.setBounds(253, 11, 67, 20);
		renglon1.add(vent3);
		vent3.setColumns(10);
		
		vent4 = new JTextField();
		vent4.setBounds(373, 11, 67, 20);
		renglon1.add(vent4);
		vent4.setColumns(10);
		
		JTextArea txtrY = new JTextArea();
		txtrY.setText("Y  +");
		txtrY.setFont(new Font("Malgun Gothic Semilight", Font.PLAIN, 18));
		txtrY.setEditable(false);
		txtrY.setBackground(SystemColor.menu);
		txtrY.setBounds(213, 6, 38, 35);
		renglon1.add(txtrY);
		
		JTextArea txtrZ = new JTextArea();
		txtrZ.setText("Z =");
		txtrZ.setFont(new Font("Malgun Gothic Semilight", Font.PLAIN, 18));
		txtrZ.setEditable(false);
		txtrZ.setBackground(SystemColor.menu);
		txtrZ.setBounds(330, 6, 33, 35);
		renglon1.add(txtrZ);
		
		JPanel renglon2 = new JPanel();
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
		renglon2.setBounds(0, 55, 443, 55);
		renglones.add(renglon2);
		renglon2.setLayout(null);
		renglon2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				llave1.setVisible(true);
				llave2.setVisible(true);
				
				AnimationClass salir_renglon1 = new AnimationClass();
			//Sale del renglon 1
				if((int)divisor_1A.getX()==A_adentro && (int)divisor_1B.getX()==B_adentro) {
					salir_renglon1.jLabelXLeft(A_adentro, A_afuera, v, 5, divisor_1A);
					salir_renglon1.jLabelXRight(B_adentro, B_afuera, v, 5, divisor_1B);
				}
			//Sale del renglon 4
				AnimationClass salir_renglon4 = new AnimationClass();
				if((int)divisor_4A.getX()==A_adentro && (int)divisor_4B.getX()==B_adentro) {
					salir_renglon4.jLabelXLeft(A_adentro,A_afuera, v, 5, divisor_4A);
					salir_renglon4.jLabelXRight(B_adentro, B_afuera, v, 5, divisor_4B);
				}
				
			//Entra al renglon 2:
				//Las lineas divisorias 2 y 3 ENTRAN.
				AnimationClass entrar_renglon2 = new AnimationClass();
				if((int)divisor_2A.getX()==A_afuera && (int)divisor_2B.getX()==B_afuera) {
					entrar_renglon2.jLabelXRight(A_afuera, A_adentro, v, 5, divisor_2A);
					entrar_renglon2.jLabelXLeft(B_afuera, B_adentro, v, 5, divisor_2B);
				}
				if((int)divisor_3A.getX()==A_afuera && (int)divisor_3B.getX()==B_afuera) {
					entrar_renglon2.jLabelXRight(A_afuera, A_adentro, v, 5, divisor_3A);
					entrar_renglon2.jLabelXLeft(B_afuera, B_adentro, v, 5, divisor_3B);
				}
				
			
				
			}
		});
		
		JTextArea txtrX2 = new JTextArea();
		txtrX2.setText("X  +");
		txtrX2.setFont(new Font("Malgun Gothic Semilight", Font.PLAIN, 18));
		txtrX2.setEditable(false);
		txtrX2.setBackground(SystemColor.menu);
		txtrX2.setBounds(89, 6, 38, 35);
		renglon2.add(txtrX2);
		
		JTextArea txtrY2 = new JTextArea();
		txtrY2.setText("Y  +");
		txtrY2.setFont(new Font("Malgun Gothic Semilight", Font.PLAIN, 18));
		txtrY2.setEditable(false);
		txtrY2.setBackground(SystemColor.menu);
		txtrY2.setBounds(213, 6, 38, 35);
		renglon2.add(txtrY2);
		
		JTextArea txtrZ2 = new JTextArea();
		txtrZ2.setText("Z =");
		txtrZ2.setFont(new Font("Malgun Gothic Semilight", Font.PLAIN, 18));
		txtrZ2.setEditable(false);
		txtrZ2.setBackground(SystemColor.menu);
		txtrZ2.setBounds(330, 6, 33, 35);
		renglon2.add(txtrZ2);
		
		vent5 = new JTextField();
		vent5.setBounds(10, 11, 67, 20);
		renglon2.add(vent5);
		vent5.setColumns(10);
		
		vent6 = new JTextField();
		vent6.setBounds(137, 11, 67, 20);
		renglon2.add(vent6);
		vent6.setColumns(10);
		
		vent7 = new JTextField();
		vent7.setBounds(253, 11, 67, 20);
		renglon2.add(vent7);
		vent7.setColumns(10);
		
		vent8 = new JTextField();
		vent8.setBounds(373, 11, 67, 20);
		renglon2.add(vent8);
		vent8.setColumns(10);
		
		JPanel renglon3 = new JPanel();
		renglon3.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				//Las llaves entran:
				if((int)llave1.getX()==llave1_afuera && (int)llave2.getX()==llave2_afuera) {
					llaves_entran.jLabelXRight(llave1_afuera,llave1_adentro, v_llaves, aux, llave1);
					llaves_entran.jLabelXLeft(llave2_afuera, llave2_adentro, v_llaves, aux, llave2);
				}
			}
		});
		renglon3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
			//Entra al renglon 3:
				//Las lineas 1 y 2 SALEN.
				AnimationClass salir_renglon1 = new AnimationClass();
				if((int)divisor_1A.getX()==A_adentro && (int)divisor_1B.getX()==B_adentro) {
					salir_renglon1.jLabelXLeft(A_adentro,A_afuera, v, 5, divisor_1A);
					salir_renglon1.jLabelXRight(B_adentro, B_afuera, v, 5, divisor_1B);
				}
				AnimationClass salir_renglon2 = new AnimationClass();
				if((int)divisor_2A.getX()==A_adentro && (int)divisor_2B.getX()==B_adentro) {
					salir_renglon2.jLabelXLeft(A_adentro,A_afuera, v, 5, divisor_2A);
					salir_renglon2.jLabelXRight(B_adentro, B_afuera, v, 5, divisor_2B);
				}
				
				
				//Las lineas 3 y 4 ENTRAN.
				AnimationClass entrar_linea3 = new AnimationClass();
				if((int)divisor_3A.getX()==A_afuera && (int)divisor_3B.getX()==B_afuera) {
					entrar_linea3.jLabelXRight(A_afuera, A_adentro, v, 5, divisor_3A);
					entrar_linea3.jLabelXLeft(B_afuera, B_adentro, v, 5, divisor_3B);
				}
				AnimationClass entrar_linea4 = new AnimationClass();
				if((int)divisor_4A.getX()==A_afuera && (int)divisor_4B.getX()==B_afuera) {
					entrar_linea4.jLabelXRight(A_afuera, A_adentro, v, 5, divisor_4A);
					entrar_linea4.jLabelXLeft(B_afuera, B_adentro, v, 5, divisor_4B);
				}
			}
		});
		renglon3.setBounds(0, 110, 443, 55);
		renglones.add(renglon3);
		renglon3.setLayout(null);
		
		JTextArea txtrX3 = new JTextArea();
		txtrX3.setText("X  +");
		txtrX3.setFont(new Font("Malgun Gothic Semilight", Font.PLAIN, 18));
		txtrX3.setEditable(false);
		txtrX3.setBackground(SystemColor.menu);
		txtrX3.setBounds(89, 6, 38, 35);
		renglon3.add(txtrX3);
		
		JTextArea txtrY3 = new JTextArea();
		txtrY3.setText("Y  +");
		txtrY3.setFont(new Font("Malgun Gothic Semilight", Font.PLAIN, 18));
		txtrY3.setEditable(false);
		txtrY3.setBackground(SystemColor.menu);
		txtrY3.setBounds(213, 6, 38, 35);
		renglon3.add(txtrY3);
		
		JTextArea txtrZ3 = new JTextArea();
		txtrZ3.setText("Z =");
		txtrZ3.setFont(new Font("Malgun Gothic Semilight", Font.PLAIN, 18));
		txtrZ3.setEditable(false);
		txtrZ3.setBackground(SystemColor.menu);
		txtrZ3.setBounds(330, 6, 33, 35);
		renglon3.add(txtrZ3);
		
		vent9 = new JTextField();
		vent9.setBounds(10, 11, 67, 20);
		renglon3.add(vent9);
		vent9.setColumns(10);
		
		vent10 = new JTextField();
		vent10.setBounds(137, 11, 67, 20);
		renglon3.add(vent10);
		vent10.setColumns(10);
		
		vent11 = new JTextField();
		vent11.setBounds(253, 11, 67, 20);
		renglon3.add(vent11);
		vent11.setColumns(10);
		
		vent12 = new JTextField();
		vent12.setBounds(373, 11, 67, 20);
		renglon3.add(vent12);
		vent12.setColumns(10);
		
		llave1 = new JLabel("{");
		llave1.setHorizontalAlignment(SwingConstants.RIGHT);
		llave1.setFont(new Font("Yu Gothic", Font.PLAIN, 99));
		llave1.setBounds(llave1_afuera, 29, 51, 170);
		input.add(llave1);
		
		llave2 = new JLabel("}");
		llave2.setHorizontalAlignment(SwingConstants.CENTER);
		llave2.setFont(new Font("Yu Gothic", Font.PLAIN, 99));
		llave2.setBounds(llave2_afuera, 29, 51, 170);
		input.add(llave2);
		
		output = new JPanel();
		output.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				//Cuando entra en el panel contenedor, todas las lineas SALEN.
				//Sale del renglon 1
				AnimationClass salir_renglon1 = new AnimationClass();
				if((int)divisor_1A.getX()==A_adentro && (int)divisor_1B.getX()==B_adentro) {
					salir_renglon1.jLabelXLeft(A_adentro, A_afuera, v, 5, divisor_1A);
					salir_renglon1.jLabelXRight(B_adentro, B_afuera, v, 5, divisor_1B);
				}
				//Sale del renglon 2
				AnimationClass salir_renglon2 = new AnimationClass();
				if((int)divisor_2A.getX()==A_adentro && (int)divisor_2B.getX()==B_adentro) {
					salir_renglon2.jLabelXLeft(A_adentro, A_afuera, v, 5, divisor_2A);
					salir_renglon2.jLabelXRight(B_adentro, B_afuera, v, 5, divisor_2B);
				}
				//Sale del renglon 3
				AnimationClass salir_renglon3 = new AnimationClass();
				if((int)divisor_3A.getX()==A_adentro && (int)divisor_3B.getX()==B_adentro) {
					salir_renglon3.jLabelXLeft(A_adentro, A_afuera, v, 5, divisor_3A);
					salir_renglon3.jLabelXRight(B_adentro, B_afuera, v, 5, divisor_3B);
				}
				//Sale del renglon 4
				AnimationClass salir_renglon4 = new AnimationClass();
				if((int)divisor_4A.getX()==A_adentro && (int)divisor_4B.getX()==B_adentro) {
					salir_renglon4.jLabelXLeft(A_adentro,A_afuera, v, 5, divisor_4A);
					salir_renglon4.jLabelXRight(B_adentro, B_afuera, v, 5, divisor_4B);
				}
				
				//Las llaves SALEN:
				if((int)llave1.getX()==llave1_adentro && (int)llave2.getX()==llave2_adentro) {
					llaves_salen.jLabelXLeft(llave1_adentro,llave1_afuera, v_llaves, aux, llave1);
					llaves_salen.jLabelXRight(llave2_adentro,llave2_afuera , v_llaves, aux, llave2);
				}
			}
		});
		output.setBounds(20, 294, 584, 244);
		contentPane.add(output);
		output.setLayout(null);
		output.setBackground(a1);
		
		resX = new JTextField();
		resX.setFont(new Font("Malgun Gothic", Font.PLAIN, 19));
		resX.setBounds(64, 120, 101, 43);
		output.add(resX);
		resX.setEditable(false);
		resX.setColumns(10);
		
		resY = new JTextField();
		resY.setFont(new Font("Malgun Gothic", Font.PLAIN, 19));
		resY.setBounds(267, 120, 101, 43);
		output.add(resY);
		resY.setEditable(false);
		resY.setColumns(10);
		
		resZ = new JTextField();
		resZ.setFont(new Font("Malgun Gothic", Font.PLAIN, 19));
		resZ.setBounds(458, 120, 101, 43);
		output.add(resZ);
		resZ.setEditable(false);
		resZ.setColumns(10);
		
		JButton continuar = new JButton("Resolver");
		letra=continuar.getForeground();
		continuar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				continuar.setBackground(b2);
				continuar.setForeground(new Color(255,255,255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				continuar.setBackground(b);
				continuar.setForeground(letra);
			}
		});
		continuar.setBackground(b);
		continuar.setFont(new Font("Malgun Gothic", Font.BOLD, 18));
		continuar.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				//Cuando entra en el panel contenedor, todas las lineas SALEN.
				//Sale del renglon 1
				AnimationClass salir_renglon1 = new AnimationClass();
				if((int)divisor_1A.getX()==A_adentro && (int)divisor_1B.getX()==B_adentro) {
					salir_renglon1.jLabelXLeft(A_adentro, A_afuera, v, 5, divisor_1A);
					salir_renglon1.jLabelXRight(B_adentro, B_afuera, v, 5, divisor_1B);
				}
				//Sale del renglon 2
				AnimationClass salir_renglon2 = new AnimationClass();
				if((int)divisor_2A.getX()==A_adentro && (int)divisor_2B.getX()==B_adentro) {
					salir_renglon2.jLabelXLeft(A_adentro, A_afuera, v, 5, divisor_2A);
					salir_renglon2.jLabelXRight(B_adentro, B_afuera, v, 5, divisor_2B);
				}
				//Sale del renglon 3
				AnimationClass salir_renglon3 = new AnimationClass();
				if((int)divisor_3A.getX()==A_adentro && (int)divisor_3B.getX()==B_adentro) {
					salir_renglon3.jLabelXLeft(A_adentro, A_afuera, v, 5, divisor_3A);
					salir_renglon3.jLabelXRight(B_adentro, B_afuera, v, 5, divisor_3B);
				}
				//Sale del renglon 4
				AnimationClass salir_renglon4 = new AnimationClass();
				if((int)divisor_4A.getX()==A_adentro && (int)divisor_4B.getX()==B_adentro) {
					salir_renglon4.jLabelXLeft(A_adentro,A_afuera, v, 5, divisor_4A);
					salir_renglon4.jLabelXRight(B_adentro, B_afuera, v, 5, divisor_4B);
				}
				
				//Las llaves SALEN:
				if((int)llave1.getX()==llave1_adentro && (int)llave2.getX()==llave2_adentro) {
					llaves_salen.jLabelXLeft(llave1_adentro,llave1_afuera, v_llaves, aux, llave1);
					llaves_salen.jLabelXRight(llave2_adentro,llave2_afuera , v_llaves, aux, llave2);
				}
			}
		});
		continuar.setBounds(80, 0, 168, 60);
		output.add(continuar);
		
		borrar = new JButton("AC");
		borrar.setBackground(c);
		borrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				vent1.setText("");
				vent2.setText("");
				vent3.setText("");
				vent4.setText("");
				vent5.setText("");
				vent6.setText("");
				vent7.setText("");
				vent8.setText("");
				vent9.setText("");
				vent10.setText("");
				vent12.setText("");
				resX.setText("");
				resY.setText("");
				resZ.setText("");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				borrar.setBackground(c2);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				borrar.setBackground(c);
			}
		});
		borrar.setFont(new Font("Malgun Gothic", Font.BOLD, 18));
		borrar.setBounds(329, 0, 168, 60);
		output.add(borrar);
		
		txtrAjfoiajs = new JTextArea();
		txtrAjfoiajs.setText("X =");
		txtrAjfoiajs.setFont(new Font("Malgun Gothic Semilight", Font.PLAIN, 22));
		txtrAjfoiajs.setEditable(false);
		txtrAjfoiajs.setBackground((Color) null);
		txtrAjfoiajs.setBounds(14, 120, 50, 43);
		output.add(txtrAjfoiajs);
		
		txtrY_1 = new JTextArea();
		txtrY_1.setText("Y =");
		txtrY_1.setFont(new Font("Malgun Gothic Semilight", Font.PLAIN, 22));
		txtrY_1.setEditable(false);
		txtrY_1.setBackground((Color) null);
		txtrY_1.setBounds(213, 120, 54, 43);
		output.add(txtrY_1);
		
		txtrZ_1 = new JTextArea();
		txtrZ_1.setText("Z =");
		txtrZ_1.setFont(new Font("Malgun Gothic Semilight", Font.PLAIN, 22));
		txtrZ_1.setEditable(false);
		txtrZ_1.setBackground((Color) null);
		txtrZ_1.setBounds(403, 120, 54, 43);
		output.add(txtrZ_1);
		
		I = new JPanel();
		I.setBackground(new Color(0, 0, 0));
		I.setBounds(189, 93, 1, 110);
		output.add(I);
		
		I_2 = new JPanel();
		I_2.setBackground(new Color(0, 0, 0));
		I_2.setBounds(384, 93, 1, 110);
		output.add(I_2);
		
		titulo = new JLabel("Sistema 3x3");
		titulo.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				//Cuando entra en el titulo, todas las lineas SALEN.
				//Sale del renglon 1
				AnimationClass salir_renglon1 = new AnimationClass();
				if((int)divisor_1A.getX()==A_adentro && (int)divisor_1B.getX()==B_adentro) {
					salir_renglon1.jLabelXLeft(A_adentro, A_afuera, v, 5, divisor_1A);
					salir_renglon1.jLabelXRight(B_adentro, B_afuera, v, 5, divisor_1B);
				}
				//Sale del renglon 2
				AnimationClass salir_renglon2 = new AnimationClass();
				if((int)divisor_2A.getX()==A_adentro && (int)divisor_2B.getX()==B_adentro) {
					salir_renglon2.jLabelXLeft(A_adentro, A_afuera, v, 5, divisor_2A);
					salir_renglon2.jLabelXRight(B_adentro, B_afuera, v, 5, divisor_2B);
				}
				//Sale del renglon 3
				AnimationClass salir_renglon3 = new AnimationClass();
				if((int)divisor_3A.getX()==A_adentro && (int)divisor_3B.getX()==B_adentro) {
					salir_renglon3.jLabelXLeft(A_adentro, A_afuera, v, 5, divisor_3A);
					salir_renglon3.jLabelXRight(B_adentro, B_afuera, v, 5, divisor_3B);
				}
				//Sale del renglon 4
				AnimationClass salir_renglon4 = new AnimationClass();
				if((int)divisor_4A.getX()==A_adentro && (int)divisor_4B.getX()==B_adentro) {
					salir_renglon4.jLabelXLeft(A_adentro,A_afuera, v, 5, divisor_4A);
					salir_renglon4.jLabelXRight(B_adentro, B_afuera, v, 5, divisor_4B);
				}
				
				//Las llaves SALEN:
				if((int)llave1.getX()==llave1_adentro && (int)llave2.getX()==llave2_adentro) {
					llaves_salen.jLabelXLeft(llave1_adentro,llave1_afuera, v_llaves, aux, llave1);
					llaves_salen.jLabelXRight(llave2_adentro,llave2_afuera , v_llaves, aux, llave2);
				}
			}
		});
		titulo.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				//Las llaves SALEN:
				if((int)llave1.getX()==llave1_adentro && (int)llave2.getX()==llave2_adentro) {
					llaves_salen.jLabelXLeft(llave1_adentro,llave1_afuera, v_llaves, aux, llave1);
					llaves_salen.jLabelXRight(llave2_adentro,llave2_afuera , v_llaves, aux, llave2);
				}
			}
		});
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setFont(new Font("Malgun Gothic", Font.BOLD, 24));
		titulo.setBounds(100, 47, 404, 45);
		contentPane.add(titulo);
		
		home = new JPanel();
		home.setLayout(null);
		home.setBackground(c);
		home.setBounds(90, 0, 90, 45);
		contentPane.add(home);
		
		dividirMenu = new JPanel();
		dividirMenu.setBounds(0, 0, 1, 45);
		home.add(dividirMenu);
		dividirMenu.setBackground(new Color(0, 0, 0));
		
		logoHome = new JLabel("");
		logoHome.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				AnimationClass salir_renglon1 = new AnimationClass();
				if((int)divisor_1A.getX()==A_adentro && (int)divisor_1B.getX()==B_adentro) {
					salir_renglon1.jLabelXLeft(A_adentro, A_afuera, v, 5, divisor_1A);
					salir_renglon1.jLabelXRight(B_adentro, B_afuera, v, 5, divisor_1B);
				}
				//Sale del renglon 2
				AnimationClass salir_renglon2 = new AnimationClass();
				if((int)divisor_2A.getX()==A_adentro && (int)divisor_2B.getX()==B_adentro) {
					salir_renglon2.jLabelXLeft(A_adentro, A_afuera, v, 5, divisor_2A);
					salir_renglon2.jLabelXRight(B_adentro, B_afuera, v, 5, divisor_2B);
				}
				//Sale del renglon 3
				AnimationClass salir_renglon3 = new AnimationClass();
				if((int)divisor_3A.getX()==A_adentro && (int)divisor_3B.getX()==B_adentro) {
					salir_renglon3.jLabelXLeft(A_adentro, A_afuera, v, 5, divisor_3A);
					salir_renglon3.jLabelXRight(B_adentro, B_afuera, v, 5, divisor_3B);
				}
				//Sale del renglon 4
				AnimationClass salir_renglon4 = new AnimationClass();
				if((int)divisor_4A.getX()==A_adentro && (int)divisor_4B.getX()==B_adentro) {
					salir_renglon4.jLabelXLeft(A_adentro,A_afuera, v, 5, divisor_4A);
					salir_renglon4.jLabelXRight(B_adentro, B_afuera, v, 5, divisor_4B);
				}
				
				//Las llaves SALEN:
				if((int)llave1.getX()==llave1_adentro && (int)llave2.getX()==llave2_adentro) {
					llaves_salen.jLabelXLeft(llave1_adentro,llave1_afuera, v_llaves, aux, llave1);
					llaves_salen.jLabelXRight(llave2_adentro,llave2_afuera , v_llaves, aux, llave2);
				}
				
			}
		});
		logoHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				home.setBackground(c);
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				//Cuando entra en el panel contenedor, todas las lineas SALEN.
				//Sale del renglon 1
				AnimationClass salir_renglon1 = new AnimationClass();
				if((int)divisor_1A.getX()==A_adentro && (int)divisor_1B.getX()==B_adentro) {
					salir_renglon1.jLabelXLeft(A_adentro, A_afuera, v, 5, divisor_1A);
					salir_renglon1.jLabelXRight(B_adentro, B_afuera, v, 5, divisor_1B);
				}
				//Sale del renglon 2
				AnimationClass salir_renglon2 = new AnimationClass();
				if((int)divisor_2A.getX()==A_adentro && (int)divisor_2B.getX()==B_adentro) {
					salir_renglon2.jLabelXLeft(A_adentro, A_afuera, v, 5, divisor_2A);
					salir_renglon2.jLabelXRight(B_adentro, B_afuera, v, 5, divisor_2B);
				}
				//Sale del renglon 3
				AnimationClass salir_renglon3 = new AnimationClass();
				if((int)divisor_3A.getX()==A_adentro && (int)divisor_3B.getX()==B_adentro) {
					salir_renglon3.jLabelXLeft(A_adentro, A_afuera, v, 5, divisor_3A);
					salir_renglon3.jLabelXRight(B_adentro, B_afuera, v, 5, divisor_3B);
				}
				//Sale del renglon 4
				AnimationClass salir_renglon4 = new AnimationClass();
				if((int)divisor_4A.getX()==A_adentro && (int)divisor_4B.getX()==B_adentro) {
					salir_renglon4.jLabelXLeft(A_adentro,A_afuera, v, 5, divisor_4A);
					salir_renglon4.jLabelXRight(B_adentro, B_afuera, v, 5, divisor_4B);
				}
				
				//Las llaves SALEN:
				if((int)llave1.getX()==llave1_adentro && (int)llave2.getX()==llave2_adentro) {
					llaves_salen.jLabelXLeft(llave1_adentro,llave1_afuera, v_llaves, aux, llave1);
					llaves_salen.jLabelXRight(llave2_adentro,llave2_afuera , v_llaves, aux, llave2);
				}
				
				home.setBackground(c2);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				Selector selec = new Selector(a1,a2,b,b2,c,c2);
				selec.setLocationRelativeTo(null);
				selec.setVisible(true);
				dispose();
			}
		});
		logoHome.setIcon(new ImageIcon(Sistema3x3.class.getResource("/imagenes/logos/home-logo_clarito (1) (1).png")));
		logoHome.setHorizontalAlignment(SwingConstants.CENTER);
		logoHome.setFont(new Font("Tahoma", Font.PLAIN, 18));
		logoHome.setBackground((Color) null);
		logoHome.setBounds(0, 0, 90, 45);
		home.add(logoHome);
		renglon2.setBackground(a1);
		renglon3.setBackground(a1);
		txtrX.setBackground(a1);
		txtrX2.setBackground(a1);
		txtrX3.setBackground(a1);
		
		txtrY.setBackground(a1);
		txtrY2.setBackground(a1);
		txtrY3.setBackground(a1);
		
		txtrZ.setBackground(a1);
		txtrZ2.setBackground(a1);
		txtrZ3.setBackground(a1);
		
		continuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int deltaA=1,deltaX=1,deltaY=1,deltaZ=1;
				int valor[] = new int [12];
				int ValorX=1,ValorY=1,ValorZ=1;
				int i,j,check=0;
				try {
				 valor[0] = Integer.parseInt( vent1.getText() );
				 valor[1] = Integer.parseInt( vent2.getText() );
				 valor[2] = Integer.parseInt( vent3.getText() );
				 valor[3] = Integer.parseInt( vent4.getText() );
				 valor[4] = Integer.parseInt( vent5.getText() );
				 valor[5] = Integer.parseInt( vent6.getText() );
				 valor[6] = Integer.parseInt( vent7.getText() );
				 valor[7] = Integer.parseInt( vent8.getText() );
				 valor[8] = Integer.parseInt( vent9.getText() );
				 valor[9] = Integer.parseInt( vent10.getText() );
				 valor[10] = Integer.parseInt( vent11.getText() );
				 valor[11] = Integer.parseInt( vent12.getText() );
					}
				catch(Exception a){
					resX.setText( "Algún" );
					 resY.setText( "valor es" );
					 resZ.setText( "Erróneo" );
					return;
					 			  }
				 //checkeo
				 for(i=0;i<12;i++) {
					 for(j=0;j<12;j++) {
						 if(valor[i]==valor[j]) {
							 check++;
						 						}
					 				   }
				 				   }
				 if(check==144) {
					 resX.setText( "Sin" );
					 resY.setText( "Solucion" );
					 resZ.setText( "Posible" ); 	 
				 			    }
				 //formula
				 else {
				 deltaA=( ( (valor[0]*valor[5]*valor[10])+(valor[4]*valor[9]*valor[2])+(valor[8]*valor[1]*valor[6]) )-( (valor[10]*valor[1]*valor[4])+(valor[6]*valor[9]*valor[0])+(valor[2]*valor[5]*valor[8]) ) );
				 deltaX=( ( (valor[3]*valor[5]*valor[10])+(valor[7]*valor[9]*valor[2])+(valor[11]*valor[1]*valor[6]) )-( (valor[10]*valor[1]*valor[7])+(valor[6]*valor[9]*valor[3])+(valor[2]*valor[5]*valor[11]) ) );
				 deltaY=( ( (valor[0]*valor[7]*valor[10])+(valor[4]*valor[11]*valor[2])+(valor[8]*valor[3]*valor[6]) )-( (valor[10]*valor[3]*valor[4])+(valor[6]*valor[11]*valor[0])+(valor[2]*valor[7]*valor[8]) ) );
				 deltaZ=( ( (valor[0]*valor[5]*valor[11])+(valor[4]*valor[9]*valor[3])+(valor[8]*valor[1]*valor[7]) )-( (valor[11]*valor[1]*valor[4])+(valor[7]*valor[9]*valor[0])+(valor[3]*valor[5]*valor[8]) ) );
				 //pasar a los cuadros de valor
				 ValorX=deltaX/deltaA;//valor de X
				 ValorY=deltaY/deltaA;//valor de y
				 ValorZ=deltaZ/deltaA;//valor de z
				 //mostrar*/
				 resX.setText( String.valueOf(ValorX) );
				 resY.setText( String.valueOf(ValorY) );
				 resZ.setText( String.valueOf(ValorZ) ); 
				 	  }
														}
		});
	}
}
