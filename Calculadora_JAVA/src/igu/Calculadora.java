package igu;


//import java.awt.EventQueue;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

//import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//import javax.swing.JSlider;
//import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
//import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
//import java.awt.FlowLayout;

//import AppPackage.AnimationClass;

//import Appimport;

///////////////////////////////////////////////////
//import AppPackage.AnimationClass;


public class Calculadora extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCampoNum1;
	private JTextField txtCampoNum2;
	private JTextField txtResultado;
	private JLabel lblResultado;
	
	JButton btnSuma1, btnResta, btnMult, btnDiv, btnPotencia, btnRaiz, btnBorrar;
	int anchoTotal=java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
	int altoTotal=java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
	private JPanel Botonera;
	private JPanel divisor;
	private JPanel divisor_1;
	/**
	 * Launch the application.
	 
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				//setVisible(false);
				try {
					Calculadora frame = new Calculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	public Calculadora(Color a1, Color a2, Color b, Color b2, Color c, Color c2) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Calculadora.class.getResource("/imagenes/logos/calcu-logo.png")));
		setResizable(false);
		addContainerListener(new ContainerAdapter() {
			@Override
			public void componentRemoved(ContainerEvent e) {
				Selector selec = new Selector(a1,a2,b,b2,c,c2);
				selec.setVisible(true);
				selec.setLocationRelativeTo(null);
			}
		});
		setTitle("Operaciones Básicas");
		
		iniciarComponentes(a1,a2,b,b2,c,c2);
	}

	
	
	private void iniciarComponentes(Color a1, Color a2, Color b, Color b2, Color c, Color c2) {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 650);
		contentPane = new JPanel();
		contentPane.setBackground(a1);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pnlTodo = new JPanel();
		pnlTodo.setBackground(a1);
		pnlTodo.setBounds(0, 45, 584, 566);
		contentPane.add(pnlTodo);
		pnlTodo.setLayout(null);
		
		
		
		JLabel lblTitulo = new JLabel("  Operaciones Matemáticas: ");
		lblTitulo.setBounds(29, 0, 555, 45);
		pnlTodo.add(lblTitulo);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setForeground(new Color(0, 0, 0));
		lblTitulo.setBackground(new Color(255, 255, 255));
		lblTitulo.setFont(new Font("Malgun Gothic", Font.BOLD, 24));
		
		txtCampoNum1 = new JTextField();
		txtCampoNum1.setFont(new Font("Malgun Gothic Semilight", Font.PLAIN, 18));
		txtCampoNum1.setBounds(68, 125, 177, 45);
		pnlTodo.add(txtCampoNum1);
		txtCampoNum1.setForeground(new Color(0, 0, 0));
		txtCampoNum1.setBackground(new Color(225,255,255));
		txtCampoNum1.setColumns(10);
		
		txtCampoNum2 = new JTextField();
		txtCampoNum2.setFont(new Font("Malgun Gothic Semilight", Font.PLAIN, 18));
		txtCampoNum2.setBounds(350, 125, 182, 45);
		pnlTodo.add(txtCampoNum2);
		txtCampoNum2.setBackground(new Color(225,255,255));
		txtCampoNum2.setForeground(new Color(0, 0, 0));
		txtCampoNum2.setColumns(10);
		
		JLabel lblNum1 = new JLabel("Número 1");
		lblNum1.setBounds(68, 75, 177, 45);
		pnlTodo.add(lblNum1);
		lblNum1.setForeground(new Color(255, 255, 255));
		lblNum1.setFont(new Font("Malgun Gothic Semilight", Font.PLAIN, 20));
		
		JLabel lblNum2 = new JLabel("Número 2");
		lblNum2.setBounds(350, 75, 182, 45);
		pnlTodo.add(lblNum2);
		lblNum2.setForeground(new Color(255, 255, 255));
		lblNum2.setFont(new Font("Malgun Gothic Semilight", Font.PLAIN, 20));
		
		txtResultado = new JTextField();
		txtResultado.setFont(new Font("Malgun Gothic", Font.BOLD, 20));
		txtResultado.setEditable(false);
		txtResultado.setBounds(255, 450, 277, 45);
		pnlTodo.add(txtResultado);
		txtResultado.setBackground(new Color(225,255,255));
		txtResultado.setForeground(new Color(0, 0, 0));
		txtResultado.setColumns(10);
		
		lblResultado = new JLabel("Resultado");
		lblResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lblResultado.setBounds(68, 450, 177, 45);
		pnlTodo.add(lblResultado);
		lblResultado.setForeground(new Color(255, 255, 255));
		lblResultado.setFont(new Font("Malgun Gothic Semilight", Font.BOLD, 22));
		
		Botonera = new JPanel();
		Botonera.setBounds(68, 228, 464, 160);
		pnlTodo.add(Botonera);
		Botonera.setBackground(a1);
		Botonera.setLayout(null);
		
		btnSuma1 = new JButton("+");
		btnSuma1.setBounds(0, 0, 60, 60);
		Botonera.add(btnSuma1);
		btnSuma1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnSuma1.setBackground(b2);
				btnSuma1.setForeground(new Color(255,255,255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnSuma1.setBackground(b);
				btnSuma1.setForeground(new Color(0,0,0));
			}
		});
		btnSuma1.setForeground(new Color(0, 0, 0));
		btnSuma1.setBackground(b);
		btnSuma1.setFont(new Font("Malgun Gothic", Font.BOLD, 25));
		
		btnResta = new JButton("-");
		btnResta.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnResta.setBackground(b2);
				btnResta.setForeground(new Color(255,255,255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnResta.setBackground(b);
				btnResta.setForeground(new Color(0,0,0));
			}
		});
		btnResta.setForeground(new Color(0, 0, 0));
		btnResta.setBounds(0, 100, 60, 60);
		Botonera.add(btnResta);
		btnResta.setBackground(b);
		btnResta.setFont(new Font("Malgun Gothic", Font.PLAIN, 35));
		
		btnMult = new JButton("x");
		btnMult.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnMult.setBackground(b2);
				btnMult.setForeground(new Color(255,255,255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnMult.setBackground(b);
				btnMult.setForeground(new Color(0,0,0));
			}
		});
		btnMult.setForeground(new Color(0, 0, 0));
		btnMult.setBounds(100, 0, 60, 60);
		Botonera.add(btnMult);
		btnMult.setBackground(b);
		btnMult.setFont(new Font("Malgun Gothic Semilight", Font.BOLD, 25));
		
		btnDiv = new JButton("\u00F7");
		btnDiv.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnDiv.setBackground(b2);
				btnDiv.setForeground(new Color(255,255,255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnDiv.setBackground(b);
				btnDiv.setForeground(new Color(0,0,0));
			}
		});
		btnDiv.setForeground(new Color(0, 0, 0));
		btnDiv.setBounds(100, 100, 60, 60);
		Botonera.add(btnDiv);
		btnDiv.setBackground(b);
		btnDiv.setFont(new Font("Malgun Gothic", Font.BOLD, 25));
		
		btnPotencia = new JButton("x^");
		btnPotencia.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnPotencia.setBackground(b2);
				btnPotencia.setForeground(new Color(255,255,255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnPotencia.setBackground(b);
				btnPotencia.setForeground(new Color(0,0,0));
			}
		});
		btnPotencia.setForeground(new Color(0, 0, 0));
		btnPotencia.setBounds(200, 0, 60, 60);
		Botonera.add(btnPotencia);
		btnPotencia.setBackground(b);
		btnPotencia.setFont(new Font("Malgun Gothic", Font.BOLD, 18));
		
		btnRaiz = new JButton("√(");
		btnRaiz.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnRaiz.setBackground(b2);
				btnRaiz.setForeground(new Color(255,255,255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnRaiz.setBackground(b);
				btnRaiz.setForeground(new Color(0,0,0));
			}
		});
		btnRaiz.setForeground(new Color(0, 0, 0));
		btnRaiz.setBounds(200, 100, 60, 60);
		Botonera.add(btnRaiz);
		btnRaiz.setBackground(b);
		btnRaiz.setFont(new Font("Malgun Gothic", Font.BOLD, 23));
		
		btnBorrar = new JButton("AC");
		btnBorrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnBorrar.setBackground(c2);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnBorrar.setBackground(c);
			}
		});
		btnBorrar.setBounds(305, 0, 159, 58);
		Botonera.add(btnBorrar);
		btnBorrar.setBackground(c);
		btnBorrar.setFont(new Font("Malgun Gothic", Font.BOLD, 16));
		
		divisor = new JPanel();
		divisor.setBackground(new Color(0, 0, 0));
		divisor.setBounds(286, 95, 1, 100);
		pnlTodo.add(divisor);
		
		divisor_1 = new JPanel();
		divisor_1.setBackground(Color.BLACK);
		divisor_1.setBounds(313, 95, 1, 100);
		pnlTodo.add(divisor_1);
		btnBorrar.addActionListener(this);
		btnRaiz.addActionListener(this);
		btnPotencia.addActionListener(this);
		btnDiv.addActionListener(this);
		btnMult.addActionListener(this);
		btnResta.addActionListener(this);
		btnSuma1.addActionListener(this);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(a1);
		panel_1.setBounds(0, 0, 90, 45);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(c);
		panel_2.setBounds(0, 0, 90, 45);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblVolver = new JLabel("");
		lblVolver.setIcon(new ImageIcon(Calculadora.class.getResource("/imagenes/logos/flecha-logo.png")));
		lblVolver.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblVolver.setBackground(c);
		lblVolver.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				Selector selector2 = new Selector(a1,a2,b,b2,c,c2);
				selector2.setVisible(true);
				selector2.setLocationRelativeTo(null);
				
				//setVisible(false);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_2.setBackground( c2 );
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_2.setBackground(c);
			}
		});
		lblVolver.setHorizontalAlignment(SwingConstants.CENTER);
		lblVolver.setBounds(0, 0, 90, 45);
		panel_2.add(lblVolver);
		
	}
	
	
	
	 public void cerrar(){
		 Object [] opciones ={"Aceptar","Cancelar"};
		 int eleccion = JOptionPane.showOptionDialog(rootPane,"En realidad desea realizar cerrar la aplicacion","Mensaje de Confirmacion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,null,opciones,"Aceptar");
		 if (eleccion == JOptionPane.YES_OPTION){
		 System.exit(0);
		 }else{
			 
		 }
	}
	
	
	
	public void actionPerformed(ActionEvent e) {
		int num1;
		int num2;
		
		try{
			num1=Integer.parseInt(txtCampoNum1.getText());//letura de datos y pasaje a int
			num2=Integer.parseInt(txtCampoNum2.getText());
		}
		catch(Exception a){                 //si hay error al pasar ejecuta catch
			txtResultado.setText("Error");//si el jtextfield tiro error al no ser posible pasarlo a integro tira error y en catch ejecuta un ensaje
			txtCampoNum1.setText("");
			txtCampoNum2.setText("");
			
			if(btnBorrar==e.getSource()) {
				txtCampoNum1.setText("");
				txtCampoNum2.setText("");
				txtResultado.setText("");
			}
			return;					      //termina el proceso del boton sin continuar el resto
		}
		//finaly existe pero se usa en casos donde se ejecuta con o sin error,no se usarlo,busca vago				 	

		if(btnSuma1==e.getSource()) {
			txtResultado.setText(String.valueOf(num1+num2));
		}
		if(btnResta==e.getSource()) {
			txtResultado.setText(String.valueOf(num1-num2));
		}
		if(btnMult==e.getSource()) {
			txtResultado.setText(String.valueOf(num1*num2));
		}
		if(btnDiv==e.getSource()) {
			txtResultado.setText(String.valueOf(num1/num2));
		}
		if(btnPotencia==e.getSource()) {
			txtResultado.setText(String.valueOf(Math.pow(num1, num2)));
		}
		if(btnRaiz==e.getSource()) {
			//Math.pow(num1, (double)1/num2)
			txtResultado.setText(String.valueOf(Math.pow(num1, (double)1/num2)));
		}
		if(btnBorrar==e.getSource()) {
			txtCampoNum1.setText("");
			txtCampoNum2.setText("");
			txtResultado.setText("");
		}
	}
}
