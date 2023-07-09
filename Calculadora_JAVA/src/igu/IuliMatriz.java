package igu;

//import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
//import javax.swing.JTextField;
import javax.swing.SwingConstants;
//import javax.swing.JTextArea;
//import javax.swing.DropMode;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
//import java.awt.Component;
//import javax.swing.Box;
import javax.swing.ImageIcon;
import java.awt.Toolkit;




public class IuliMatriz extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel all;
	private JTextPane Tmatriz1, Tmatriz2, Tresul; 
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IuliMatriz frame = new IuliMatriz();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/
	
	Color letra;
	
	/**
	 * Create the frame.
	 */
	public IuliMatriz(Color a1, Color a2, Color b,Color b2, Color c, Color c2) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(IuliMatriz.class.getResource("/imagenes/logos/calcu-logo.png")));
		setResizable(false);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 570);
		all = new JPanel();
		all.setBackground(a1);
		all.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		all.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(all);
		all.setLayout(null);
		
		JPanel panelTextoInfo = new JPanel();
		panelTextoInfo.setBounds(0, 82, 634, 489);
		all.add(panelTextoInfo);
		panelTextoInfo.setLayout(null);
		panelTextoInfo.setBackground(a1);
		
		JPanel info = new JPanel();
		info.setBounds(65, 0, 559, 489);
		panelTextoInfo.add(info);
		info.setLayout(null);
		info.setBackground(a1);
		
		JLabel lblNewLabel_1_1 = new JLabel("- Separar números de una misma fila usando una coma-->  \" , \"");
		lblNewLabel_1_1.setBounds(0, 54, 559, 72);
		info.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setFont(new Font("Malgun Gothic", Font.PLAIN, 17));
		
		JLabel lblNewLabel_1_1_1 = new JLabel("- Separar filas usando el Enter (salto de línea)");
		lblNewLabel_1_1_1.setFont(new Font("Malgun Gothic", Font.PLAIN, 17));
		lblNewLabel_1_1_1.setBounds(0, 142, 559, 72);
		info.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("- Ejemplo: ");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Malgun Gothic", Font.PLAIN, 17));
		lblNewLabel_1_1_1_1_1.setBounds(0, 212, 211, 72);
		info.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("                       1,4,9 \r\n");
		lblNewLabel_3.setFont(new Font("Malgun Gothic", Font.BOLD, 20));
		lblNewLabel_3.setBounds(170, 300, 309, 51);
		info.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("                       4,7,35 \r\n");
		lblNewLabel_3_1.setFont(new Font("Malgun Gothic", Font.BOLD, 20));
		lblNewLabel_3_1.setBounds(170, 351, 309, 51);
		info.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("                       8,2,6 \r\n");
		lblNewLabel_3_1_1.setFont(new Font("Malgun Gothic", Font.BOLD, 20));
		lblNewLabel_3_1_1.setBounds(170, 402, 309, 51);
		info.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Matriz 1:");
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3_2.setFont(new Font("Malgun Gothic", Font.BOLD, 20));
		lblNewLabel_3_2.setBounds(0, 270, 180, 51);
		info.add(lblNewLabel_3_2);
		
		JLabel llave1 = new JLabel("{");
		llave1.setHorizontalAlignment(SwingConstants.RIGHT);
		llave1.setFont(new Font("Yu Gothic", Font.PLAIN, 99));
		llave1.setBounds(266, 323, 51, 170);
		info.add(llave1);
		
		JLabel llave1_1 = new JLabel("}");
		llave1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		llave1_1.setFont(new Font("Yu Gothic", Font.PLAIN, 99));
		llave1_1.setBounds(377, 323, 51, 170);
		info.add(llave1_1);
		
		JLabel lblNewLabel = new JLabel("Matriz 1");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Malgun Gothic", Font.BOLD, 20));
		lblNewLabel.setBounds(59, 114, 99, 30);
		all.add(lblNewLabel);
		
		JLabel lblMatriz = new JLabel("Matriz 2");
		lblMatriz.setHorizontalAlignment(SwingConstants.CENTER);
		lblMatriz.setFont(new Font("Malgun Gothic", Font.BOLD, 21));
		lblMatriz.setBounds(251, 114, 129, 30);
		all.add(lblMatriz);
		
		JLabel lblNewLabel_1 = new JLabel("Matrices");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Malgun Gothic", Font.BOLD, 24));
		lblNewLabel_1.setBounds(186, 43, 278, 42);
		all.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Resultado");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Malgun Gothic", Font.BOLD, 21));
		lblNewLabel_2.setBounds(460, 114, 125, 26);
		all.add(lblNewLabel_2);
		
		JLabel lblEscalar = new JLabel("Escalar");
		lblEscalar.setVisible(false);
		lblEscalar.setHorizontalAlignment(SwingConstants.CENTER);
		lblEscalar.setFont(new Font("Malgun Gothic", Font.BOLD, 21));
		lblEscalar.setBounds(269, 114, 99, 30);
		all.add(lblEscalar);
		
		JTextPane Tmatriz1 = new JTextPane();
		Tmatriz1.setFont(new Font("Malgun Gothic", Font.PLAIN, 14));
		Tmatriz1.setBounds(34, 155, 134, 104);
		all.add(Tmatriz1);
		
		
		JTextPane Tmatriz2 = new JTextPane();
		Tmatriz2.setFont(new Font("Malgun Gothic", Font.PLAIN, 14));
		Tmatriz2.setBounds(246, 155, 134, 104);
		all.add(Tmatriz2);
		
		JTextPane Tresul = new JTextPane();
		Tresul.setEditable(false);
		Tresul.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Tresul.setBounds(451, 155, 134, 104);
		all.add(Tresul);
		
		
		
		// DECLARACIÓN DE BOTONES
		
		// SUMAR
		JButton sumar = new JButton("+");
		sumar.setBackground(b);
		letra=sumar.getForeground();
		// RESTAR
		JButton restar = new JButton("-");
		restar.setBackground(b);
		// MULTIPLICAR
		JButton multiplicar = new JButton("x");
		multiplicar.setBackground(b);
		// DIVIDIR
		JButton dividir = new JButton("\u00F7");
		dividir.setBackground(b);
		// MATRIZ * ESCALAR
		JButton m_esc = new JButton("MATRIZ * ESCALAR");
		m_esc.setBackground(b);
		// DETERMINANTE (Matriz 1 y 2)
		JButton Matriz1Button = new JButton("Matriz 1");
		Matriz1Button.setBackground(b);
		Matriz1Button.setFont(new Font("Malgun Gothic Semilight", Font.PLAIN, 13));
		JButton Matriz2Button= new JButton("Matriz 2");
		Matriz2Button.setBackground(b);
		Matriz2Button.setFont(new Font("Malgun Gothic", Font.PLAIN, 13));
		// INVERSA (Matriz 1 y 2)
		JButton Matriz1Button2 = new JButton("Matriz 1");
		Matriz1Button2.setBackground(b);
		Matriz1Button2.setFont(new Font("Malgun Gothic", Font.PLAIN, 13));
		JButton Matriz2Button2 = new JButton("Matriz 2");
		Matriz2Button2.setBackground(b);
		Matriz2Button2.setFont(new Font("Malgun Gothic", Font.PLAIN, 13));
		
		
		// BOTÓN DE SUMAR
		sumar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				// Todos estos setVisible se aplican a cada boton para dar una estética positiva al programa
				lblEscalar.setVisible(false);
				lblMatriz.setVisible(true);
				Matriz1Button2.setVisible(false);
				Matriz2Button2.setVisible(false);
				Matriz1Button.setVisible(false);
				Matriz2Button.setVisible(false);
				
				/* Este condicional se encuentra igual o modificado (dependiendo si se trabajan con una o dos matrices) el cual realiza la operación siempre y cuando
				las tablas donde se ingresen las matrices no se encuentren vacías */
				if (Tmatriz1.getText()!="" && Tmatriz2.getText()!="") {
				
					// Se declaran en variables de tipo String las matrices ingresadas por el usuario
					String texto=Tmatriz1.getText();
					String texto2=Tmatriz2.getText();
					
					// En el cuadro del resultado se mostrará el producto obtenido mediante la función escanear_matrices_proceso
					Tresul.setText(escanear_matrices_proceso(1, texto, texto2));
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				sumar.setBackground(b2);
				sumar.setForeground(new Color(255,255,255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				sumar.setBackground(b);
				sumar.setForeground(letra);
			}
		});
		
		sumar.setFont(new Font("Malgun Gothic", Font.PLAIN, 39));
		sumar.setBounds(51, 294, 66, 60);
		all.add(sumar);
		
		
		// BOTÓN DE RESTAR
		restar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				lblEscalar.setVisible(false);
				lblMatriz.setVisible(true);
				Matriz1Button2.setVisible(false);
				Matriz2Button2.setVisible(false);
				Matriz1Button.setVisible(false);
				Matriz2Button.setVisible(false);
				
				if (Tmatriz1.getText()!="" && Tmatriz2.getText()!="") {
					
					String texto=Tmatriz1.getText();
					String texto2=Tmatriz2.getText();
					Tresul.setText(escanear_matrices_proceso(2, texto, texto2));
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				restar.setBackground(b2);
				restar.setForeground(new Color(255,255,255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				restar.setBackground(b);
				restar.setForeground(letra);
			}
		});
		restar.setFont(new Font("Malgun Gothic", Font.PLAIN, 39));
		restar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		restar.setBounds(159, 294, 60, 60);
		all.add(restar);
		
		
		// BOTÓN DE MULTIPLICAR
		multiplicar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				lblEscalar.setVisible(false);
				lblMatriz.setVisible(true);
				Matriz1Button2.setVisible(false);
				Matriz2Button2.setVisible(false);
				Matriz1Button.setVisible(false);
				Matriz2Button.setVisible(false);
				
				if (Tmatriz1.getText()!="" && Tmatriz2.getText()!="") {

					String texto=Tmatriz1.getText();
					String texto2=Tmatriz2.getText();
					Tresul.setText(escanear_matrices_proceso(3, texto, texto2));
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				multiplicar.setBackground(b2);
				multiplicar.setForeground(new Color(255,255,255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				multiplicar.setBackground(b);
				multiplicar.setForeground(letra);
			}
		});
		
		multiplicar.setFont(new Font("Malgun Gothic", Font.PLAIN, 35));
		multiplicar.setBounds(240, 294, 60, 60);
		all.add(multiplicar);
		
		
		// BOTÓN DE MATRIZ * ESCALAR
		m_esc.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				lblEscalar.setVisible(true);
				lblMatriz.setVisible(false);
				Matriz1Button2.setVisible(false);
				Matriz2Button2.setVisible(false);
				Matriz1Button.setVisible(false);
				Matriz2Button.setVisible(false);
				
				if (Tmatriz1.getText()!="" && Tmatriz2.getText()!="") {
					
					String texto=Tmatriz1.getText();
					String escalar=Tmatriz2.getText();
				
					Tresul.setText(escanear_matrices_proceso(4, texto, escalar));
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				m_esc.setBackground(b2);
				m_esc.setForeground(new Color(255,255,255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				m_esc.setBackground(b);
				m_esc.setForeground(letra);
			}
		});
		
		m_esc.setFont(new Font("Malgun Gothic", Font.BOLD, 14));
		m_esc.setBounds(51, 379, 168, 60);
		all.add(m_esc);
		
		
		//  BOTÓN DE CALCULAR DETERMINANTE PARA MATRIZ 1
		Matriz1Button.setVisible(false);
		Matriz1Button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if (Tmatriz1.getText()!="") {
					String texto=Tmatriz1.getText();
				
					Matriz1Button.setVisible(false);
					Matriz2Button.setVisible(false);
				
					Tresul.setText(escanear_matrices_proceso(5, texto, "1"));
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				Matriz1Button.setBackground(b2);
				Matriz1Button.setForeground(new Color(255,255,255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Matriz1Button.setBackground(b);
				Matriz1Button.setForeground(letra);
			}
		});
		Matriz1Button.setBounds(224, 450, 89, 35);
		all.add(Matriz1Button);
		
		
		// BOTÓN DE CALCULAR DETERMINANTE PARA MATRIZ 2
		Matriz2Button.setVisible(false);
		Matriz2Button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if (Tmatriz2.getText()!="") {
					
					String texto2=Tmatriz2.getText();
				
					Matriz1Button.setVisible(false);
					Matriz2Button.setVisible(false);
					
				
					Tresul.setText(escanear_matrices_proceso(6, "1", texto2));
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				Matriz2Button.setBackground(b2);
				Matriz2Button.setForeground(new Color(255,255,255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Matriz2Button.setBackground(b);
				Matriz2Button.setForeground(letra);
			}
		});
		Matriz2Button.setBounds(333, 450, 89, 35);
		all.add(Matriz2Button);
		
		// BOTÓN QUE MUESTRA LAS OPCIONES PARA CALCULAR DETERMINANTE
		JButton determinar = new JButton("DETERMINANTE");
		determinar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				lblEscalar.setVisible(false);
				lblMatriz.setVisible(true);
				Matriz1Button2.setVisible(false);
				Matriz2Button2.setVisible(false);
				
				if (Tmatriz1.getText()!="" || Tmatriz2.getText()!="") {
				
					Matriz1Button.setVisible(true);
					Matriz2Button.setVisible(true);
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				determinar.setBackground(b2);
				determinar.setForeground(new Color(255,255,255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				determinar.setBackground(b);
				determinar.setForeground(letra);
			}
		});
		determinar.setFont(new Font("Malgun Gothic", Font.BOLD, 15));
		determinar.setBounds(240, 379, 168, 60);
		determinar.setBackground(b);
		all.add(determinar);
		
		
		// BOTÓN PARA CALCULAR INVERSA DE LA MATRIZ 1
		Matriz1Button2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if (Tmatriz1.getText()!="") {
					
					String texto=Tmatriz1.getText();
				
					Matriz1Button2.setVisible(false);
					Matriz2Button2.setVisible(false);
				
					Tresul.setText(escanear_matrices_proceso(7, texto, "1"));
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				Matriz1Button2.setBackground(b2);
				Matriz1Button2.setForeground(new Color(255,255,255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Matriz1Button2.setBackground(b);
				Matriz1Button2.setForeground(letra);
			}
		});
		Matriz1Button2.setVisible(false);
		Matriz1Button2.setBounds(402, 450, 89, 35);
		all.add(Matriz1Button2);
		
		
		// BOTÓN PARA CALCULAR LA INVERSA DE LA MATRIZ 2
		Matriz2Button2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if (Tmatriz2.getText()!="") {
					
					String texto2=Tmatriz2.getText();
				
					Matriz1Button2.setVisible(false);
					Matriz2Button2.setVisible(false);
				
					Tresul.setText(escanear_matrices_proceso(8, "1", texto2));
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				Matriz2Button2.setBackground(b2);
				Matriz2Button2.setForeground(new Color(255,255,255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Matriz2Button2.setBackground(b);
				Matriz2Button2.setForeground(letra);
			}
		});
		Matriz2Button2.setVisible(false);
		Matriz2Button2.setBounds(516, 450, 89, 35);
		all.add(Matriz2Button2);
		
		
		// BOTÓN QUE MUESTRA LAS OPCIONES PARA CALCULAR INVERSA
		
		JButton invertir = new JButton("INVERSA");
		invertir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				lblEscalar.setVisible(false);
				lblMatriz.setVisible(true);
				Matriz1Button.setVisible(false);
				Matriz2Button.setVisible(false);
				
				if (Tmatriz1.getText()!="" || Tmatriz2.getText()!="") {
					
					Matriz2Button2.setVisible(true);
					Matriz1Button2.setVisible(true);
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				invertir.setBackground(b2);
				invertir.setForeground(new Color(255,255,255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				invertir.setBackground(b);
				invertir.setForeground(letra);
			}
		});
		invertir.setFont(new Font("Malgun Gothic", Font.BOLD, 16));
		invertir.setBounds(425, 379, 168, 60);
		invertir.setBackground(b);
		all.add(invertir);
		
		// BOTÓN PARA DIVIDIR MATRICES
		dividir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				lblEscalar.setVisible(false);
				lblMatriz.setVisible(true);
				Matriz1Button2.setVisible(false);
				Matriz2Button2.setVisible(false);
				Matriz1Button.setVisible(false);
				Matriz2Button.setVisible(false);
				
				if (Tmatriz1.getText()!="" && Tmatriz2.getText()!="") {
					
					String texto2=Tmatriz2.getText();
					String texto=Tmatriz1.getText();
				
					Tresul.setText(escanear_matrices_proceso(9, texto, texto2));
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				dividir.setBackground(b2);
				dividir.setForeground(new Color(255,255,255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				dividir.setBackground(b);
				dividir.setForeground(letra);
			}
			
		});
		dividir.setFont(new Font("Malgun Gothic", Font.PLAIN, 38));
		dividir.setBounds(342, 294, 66, 60);
		all.add(dividir);
		
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setBounds(25, 145, 154, 124);
		textPane.setBackground(b);
		all.add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setEditable(false);
		textPane_1.setBounds(237, 145, 154, 124);
		textPane_1.setBackground(b);
		all.add(textPane_1);
		
		JTextPane textPane_1_1 = new JTextPane();
		textPane_1_1.setEditable(false);
		textPane_1_1.setBounds(441, 145, 154, 124);
		textPane_1_1.setBackground(b);
		all.add(textPane_1_1);
		
		JButton btnBorrar = new JButton("AC");
		btnBorrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnBorrar.setBackground(c2);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnBorrar.setBackground(c);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				Tmatriz1.setText("");
				Tmatriz2.setText("");
				Tresul.setText("");
			}
		});
		btnBorrar.setFont(new Font("Malgun Gothic", Font.BOLD, 18));
		btnBorrar.setBackground(c);
		btnBorrar.setBounds(425, 294, 168, 60);
		all.add(btnBorrar);
		
		JPanel volver = new JPanel();
		volver.setLayout(null);
		volver.setBackground(c);
		volver.setBounds(0, 0, 90, 45);
		all.add(volver);
		
		JLabel lblVolver = new JLabel("");
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
				Selector selec = new Selector(a1,a2,b,b2,c,c2);
				selec.setLocationRelativeTo(null);
				selec.setVisible(true);
				dispose();
			}
		});
		lblVolver.setIcon(new ImageIcon(IuliMatriz.class.getResource("/imagenes/logos/flecha-logo.png")));
		lblVolver.setHorizontalAlignment(SwingConstants.CENTER);
		lblVolver.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblVolver.setBounds(0, 0, 90, 45);
		volver.add(lblVolver);
		
		JPanel home = new JPanel();
		home.setLayout(null);
		home.setBackground(c);
		home.setBounds(90, 0, 90, 45);
		all.add(home);
		
		JPanel dividirMenu = new JPanel();
		dividirMenu.setBackground(Color.BLACK);
		dividirMenu.setBounds(0, 0, 1, 45);
		home.add(dividirMenu);
		panelTextoInfo.setVisible(false);
		JLabel logoHome = new JLabel("");
		logoHome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				sumar.setVisible(false);
				restar.setVisible(false);
				home.setBackground(c2);
				panelTextoInfo.setVisible(true);
				Tmatriz1.setVisible(false);
				Tmatriz2.setVisible(false);
				Tresul.setVisible(false);
				multiplicar.setVisible(false);
				dividir.setVisible(false);
				btnBorrar.setVisible(false);
				m_esc.setVisible(false);
				determinar.setVisible(false);
				invertir.setVisible(false);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				sumar.setVisible(true);
				restar.setVisible(true);
				Tmatriz1.setVisible(true);
				Tmatriz2.setVisible(true);
				Tresul.setVisible(true);
				home.setBackground(c);
				panelTextoInfo.setVisible(false);
				multiplicar.setVisible(true);
				dividir.setVisible(true);
				btnBorrar.setVisible(true);
				m_esc.setVisible(true);
				determinar.setVisible(true);
				invertir.setVisible(true);
			}
		});
		logoHome.setIcon(new ImageIcon(IuliMatriz.class.getResource("/imagenes/logos/download-removebg-preview (5).png")));
		logoHome.setHorizontalAlignment(SwingConstants.CENTER);
		logoHome.setFont(new Font("Tahoma", Font.PLAIN, 18));
		logoHome.setBackground((Color) null);
		logoHome.setBounds(0, 0, 90, 45);
		home.add(logoHome);
		
	}
	
	// -------------------------------------FUNCION QUE ESCANEA Y REALIZA LOS PROCESOS DE SUMA, RESTA, MULTIPLICACION, DIVISION, ETC.-------------------------------------------
	
	String escanear_matrices_proceso(int opcion, String texto, String texto2) { // Como parámetros se encuentran la opción de la operación a realizar y las matrices en String
		
			String div_filas[] = texto.split("\\R"); // Divide la cadena en filas, ej: 1,2,3 4,5,6 y 7,8,9

			String div_columnas[]; // Dividir la división previa para que queden elementos individuales

			int[][] matriz1 = new int[20][20];
			
			int ifila1=0; // Indice para ver la pocicion de la fila
			int icolumna1=0; // Indice para ver la pocicion en la columna.
			int fil1=0; // Almacena la cantidad de filas totales (puesto que el índice previo se reinicia en el ciclo a continuación)
			
			for(String fil: div_filas) {	// Este for se realiza por cada division de filas
	            div_columnas=fil.split(","); // Divide cada cúmulo en numeros individuales
	            
				for(String num : div_columnas) { // Se repite por la cantidad de digitos en el cumulo dividido
					
					matriz1[icolumna1][ifila1]=Integer.parseInt(num); // Convierte el numero individual a int y lo inserta en la matriz
					ifila1++; // Aumenta para ir ubicando los numeros en la fila de matriz
					fil1=ifila1; // Guarda la cantidad maxima de filas en cantfila
				}
				ifila1=0; // Se reinicia indice de fila para ingresar a partir del 0 en la columna siguiente
				 icolumna1++;// Incrementa el indice de columna para pasar a la siguiente columna		
			}
		
		// -----------------------------------------MISMO PROCESO PARA LA SEGUNDA MATRIZ------------------------------------------------------
			
		String div_filas2[]= texto2.split("\\R"); 
		
		String div_columnas2[];

		int[][] matriz2 = new int[20][20];
		int ifila2=0; 
		int icolumna2=0; 
		int fil2=0;
		
		for(String fil: div_filas2) {	
            div_columnas2=fil.split(","); 
            
			for(String num : div_columnas2) { 
				
				matriz2[icolumna2][ifila2]=Integer.parseInt(num); 
				ifila2++; 
				fil2=ifila2;
			}
			ifila2=0; 
			 icolumna2++;
		}
		
		// Resultados de la matriz en entero, string y punto flotante
		int[][] matriz_resul = new int[20][20];
		String S_matriz_resul="";
		double[][] matriz_resul2 = new double[20][20];
		
		// Traspuesta de matriz
		double[][] traspuesta = new double[20][20];
		// Matriz adjunta
		double [][] adjunta = new double[20][20];
		// Matriz Inversa
		double[][] m_inversa = new double[20][20];
		
		
		// ------------------------------------------------------ PROCESO DE OPERACIONES ------------------------------------------------------- 
		
		switch (opcion) {
			
			// Caso 1: Suma de matrices
			case 1:
				
				// Verificación de matrices cuadradas
				if (fil1==fil2 && icolumna1==icolumna2) {
						
					for(int i=0;i<icolumna1;i++) {
							
						for(int j=0;j<fil2;j++) {
							
							/* Se almacena la matriz en formato String a través de la función valueOf (que transforma int en String) para mostrarla en el Jpane del 
							resultado (Tresul)*/
							S_matriz_resul = (S_matriz_resul+String.valueOf(" "+(matriz1[i][j]+matriz2[i][j])+","));
						}
						S_matriz_resul = S_matriz_resul+"\n";
					}
				}
				else {
					S_matriz_resul = "ERROR: Las dimensiones de ambas matrices debe ser la misma.";
				}
				
			break;
			
			// Caso 2: Resta de matrices
			case 2:
				
				// Mismo proceso que con suma, pero en vez de sumar, se resta
				if (fil1==fil2 && icolumna1==icolumna2) {
					
					for(int i=0;i<icolumna1;i++) {
							
						for(int j=0;j<fil2;j++) {
							
							S_matriz_resul = (S_matriz_resul+String.valueOf(" "+(matriz1[i][j]-matriz2[i][j])+","));
						}
						S_matriz_resul = S_matriz_resul+"\n";
					}
				}
				else {
					S_matriz_resul = "ERROR: Las dimensiones de ambas matrices debe ser la misma.";
				}
				
			break;
			
			// Caso 3: Multiplicación de matrices
			case 3:
				
				if (icolumna1 == fil2) {
					
					// La matriz que contiene el resultado integra la dimensión de columnas de la primera matriz
					for (int i=0; i<icolumna1; i++){
						// y la dimensión de filas de la segunda
						for (int j=0; j<fil2; j++){			
							// Cada posición del resultado es considerada como un sumador que es iniciada en 0
							matriz_resul[i][j]=0;
							// Se crea un tercer ciclo para ejecutar eficientemente el sumador
							for (int k=0; k<fil1; k++){
								// El número "k" funciona tanto número de columnas de la matriz 1 como de filas para la matriz 2, ya que son iguales en valor
								matriz_resul[i][j]=matriz_resul[i][j]+((matriz1[i][k])*(matriz2[k][j]));
								
							}
							S_matriz_resul = (S_matriz_resul+String.valueOf(" "+matriz_resul[i][j]+","));
						}
						S_matriz_resul = S_matriz_resul+"\n";
					}
				}
				
				else {
					
					S_matriz_resul = "ERROR: El número de columnas de la primera matriz debe coincidir con el número de filas de la segunda";
				}
				
			break;
			
			// Caso 4: Matriz por escalar
			case 4:
				
				for (int i=0; i<icolumna1; i++){	
					for (int j=0; j<fil1; j++){
						// El escalar se obtendrá de la tabla de la matriz 2
						matriz_resul[i][j]=matriz1[i][j]*matriz2[0][0];
						S_matriz_resul = (S_matriz_resul+String.valueOf(" "+matriz_resul[i][j]+","));
					}
					S_matriz_resul = S_matriz_resul+"\n";
				}
				
			break;
			
			// Caso 5: Determinante para la primera matriz
			case 5:
				
				if (fil1==icolumna1) {
					
					// Ver función: determinante()
					S_matriz_resul = String.valueOf(determinante(matriz1, fil1));
				}
				else {
					
					S_matriz_resul = "ERROR: La matriz debe ser cuadrada (nºcolumnas = nºfilas)";
				}
				
			break;
			
			
			// Caso 6: Determinante para la segunda matriz
			case 6:
				
				if (fil2==icolumna2) {
					
					S_matriz_resul = String.valueOf(determinante(matriz2, fil2));
				}
				else {
					S_matriz_resul = "ERROR: La matriz debe ser cuadrada (nºcolumnas = nºfilas)";
				}
				
			break;
			
			// Caso 7: Inversa de la primera matriz
			case 7:
				
				if (fil1==icolumna1) {
					
					if (determinante(matriz1, fil1)!=0) {
						
						// Se aplica el proceso para calcular la inversa de la matriz
	
						// Adjunta de la matriz por método de cofactores (ver función: cofactor())
						for (int i=0; i<fil1; i++){
							for (int j=0; j<fil1; j++){
								adjunta[i][j]=cofactor(matriz1, fil1, i, j);
							}
						}
						// Traspuesta de la adjunta (intercambio de valores entre filas y columnas)
						for (int i=0; i<fil1; i++){
							for (int j=0; j<fil1; j++){
								traspuesta[i][j]=adjunta[j][i];
							}
						}
						// Inversa de la matriz
						for (int i=0; i<fil1; i++){	
							for (int j=0; j<fil1; j++){
								m_inversa[i][j]= (double) traspuesta[i][j]/determinante(matriz1, fil1);
								m_inversa[i][j]= (double) Math.round( m_inversa[i][j]*100d) / 100; // Redondeo de cifra
								S_matriz_resul = (S_matriz_resul+String.valueOf(" "+m_inversa[i][j]+","));
							}
							S_matriz_resul = S_matriz_resul + "\n";
						}
						
						
					}
					else {
						
						S_matriz_resul = "ERROR: La matriz no posee inversa por ser su determinante igual a 0 (cero)";
					}
				}
				else {
					
					S_matriz_resul = "ERROR: La matriz debe ser cuadrada (nºcolumnas = nºfilas)";
				}
				
			break;
			
			// Caso 8: Inversa de la segunda matriz
			case 8:
				
				if (fil2==icolumna2) {
					
					if (determinante(matriz2, fil2)!=0) {
	
						// Adjunta de la matriz
						for (int i=0; i<fil2; i++){
							for (int j=0; j<fil2; j++){
								adjunta[i][j]=cofactor(matriz2, fil2, i, j);
							}
						}
						// Traspuesta de la adjunta
						for (int i=0; i<fil2; i++){
							for (int j=0; j<fil2; j++){
								traspuesta[i][j]=adjunta[j][i];
							}
						}
						// Inversa de la matriz
						for (int i=0; i<fil2; i++){	
							for (int j=0; j<fil2; j++){
								m_inversa[i][j]= (double) traspuesta[i][j]/determinante(matriz2, fil2);
								m_inversa[i][j]= (double) Math.round( m_inversa[i][j]*100d) / 100;
								S_matriz_resul = (S_matriz_resul+String.valueOf(" "+m_inversa[i][j]+","));
							}
							S_matriz_resul = S_matriz_resul + "\n";
						}
						
						
					}
					else {
						
						S_matriz_resul = "ERROR: La matriz no posee inversa por ser su determinante igual a 0 (cero)";
					}
				}
				else {
					
					S_matriz_resul = "ERROR: La matriz debe ser cuadrada (nºcolumnas = nºfilas)";
				}
				
			break;
			
			// Caso 9: División entre matrices
			case 9:
				
				matriz_resul2 = new double[fil1][fil1];
				
				if (icolumna1==fil2) {
					
					if (determinante(matriz2, fil2)!=0) {
						
						// Se aplica el proceso para calcular la inversa de la segunda matriz
		
						// Adjunta de la segunda matriz
						for (int i=0; i<fil1; i++){
							for (int j=0; j<fil1; j++){
								adjunta[i][j]=cofactor(matriz2, fil2, i, j);
							}
						}
						// Traspuesta de la adjunta
						for (int i=0; i<fil1; i++){
							for (int j=0; j<fil1; j++){
								traspuesta[i][j]=adjunta[j][i];
							}
						}
						// Inversa de la matriz
						for (int i=0; i<fil1; i++){	
							for (int j=0; j<fil1; j++){
								m_inversa[i][j]=(double) traspuesta[i][j]/determinante(matriz2, fil2);
							}
						}
						// Aplico el proceso de multiplicación entre la primera matriz y la inversa de la segunda (resultado de división)
						for (int i=0; i<fil1; i++){
							for (int j=0; j<fil1; j++){
								matriz_resul2[i][j]=0;
								
								for (int k=0; k<fil1; k++){
									matriz_resul2[i][j]=matriz_resul2[i][j]+((matriz1[i][k])*(m_inversa[k][j]));
									
								}
								matriz_resul2[i][j]=(double) Math.round( matriz_resul2[i][j]*100d) / 100; // Redondeo de cifra
								S_matriz_resul = (S_matriz_resul+String.valueOf(" "+matriz_resul2[i][j]+","));
							}
							S_matriz_resul = S_matriz_resul + "\n";
						}
					}
					else {
						
						S_matriz_resul = "ERROR: No se puede realizar la división. La segunda matriz no posee inversa por ser su determinante igual a 0 (cero).";
					}
				}
				else {
					
					S_matriz_resul = "ERROR: El número de columnas de la primera matriz debe coincidir con el número de filas de la segunda";
				}
				
				
				
			break;
		}
		
		return S_matriz_resul;
	}
	
	static double determinante(int matriz1[][], int fil1) {
		
		double det=0.0;
		// Determinante de una matriz 1x1 (es el único número)
		if (fil1==1){
			det=matriz1[0][0];
		}
		// Determinante de matrices 2x2 en adelante
		else{	
			// Nos ubicamos en las columnas, pero uso como variable "fila 1" ya que posee el mismo valor
			for (int j=0; j<fil1; j++){
				// Cada columna de la matriz es multiplicada por el cofactor
				det = det+matriz1[0][j]*cofactor(matriz1, fil1, 0, j);
			}
		}
		return det;
	}
	
	static double cofactor(int matriz1[][], int fil1, int fil_aux, int col_aux) {
		
		/* Declaro una submatriz que va a tratarse de una matriz que contendrá los valores de la original pero una vez eliminadas
		la primera columna y la primera fila */
		int[][] submatriz = new int[20][20];
		// Dimensión de la submatriz
		int dim_sub=fil1-1;
		// Coordenadas de la submatriz
		int x=0;
		int y=0;
		// fil1 = dimensión de matriz
		// fil_aux = número de fila
		for (int i=0; i<fil1; i++){
			for (int j=0; j<fil1; j++){
				// Proceso de colocación de datos a la submatriz los cuales no pertenecen a la primera columna ni a la primera fila de la matriz original
				if (i!=fil_aux && j!=col_aux){
					
					submatriz[x][y]=matriz1[i][j];
					y++;
					// Cuando el número de columna de la submatriz llegue a su máximo, salta a la siguiente fila y la columna se reinicia
					if (y>=dim_sub){
						x++;
						y=0;
					}
				}
			}
		}
		/* Se retorna el producto de -1 elevado a la suma de la fila y columna que se eliminan, y luego se multiplica por la determinante de la submatriz 
		calculada mediante la función "determinante()", obteniendo como resultado el cofactor de la matriz. */
		
		return Math.pow(-1.0, (fil_aux+col_aux)) * determinante(submatriz, dim_sub);
	}
}



