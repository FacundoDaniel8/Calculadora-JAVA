package igu;

//import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//import javax.swing.JOptionPane;
//import javax.swing.JMenuBar;
//import javax.swing.JPopupMenu;
//import java.awt.Component;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class Vectores extends JFrame {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField v1;
	private JTextField v2;
	private final JLabel txres = new JLabel("Resultado");
	private JTextField res;
	Color letra;
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			int alto_frame=600;
			int ancho_frame=520;
			public void run() {
				try {
					Vectores frame = new Vectores();
					frame.setSize(alto_frame, ancho_frame);
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
	public Vectores(Color a1, Color a2, Color b, Color b2, Color c, Color c2) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Vectores.class.getResource("/imagenes/logos/calcu-logo.png")));
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 521);
		contentPane = new JPanel();
		contentPane.setBackground(a1);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		
		JPanel panelTextoInfo = new JPanel();
		panelTextoInfo.setBackground(a1);
		panelTextoInfo.setBounds(0, 90, 584, 392);
		contentPane.add(panelTextoInfo);
		panelTextoInfo.setLayout(null);
		panelTextoInfo.setVisible(false);
		
		JPanel panel = new JPanel();
		panel.setBackground(a1);
		panel.setBounds(75, 0, 499, 333);
		panelTextoInfo.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("-Separar cada posición del vector usando una coma-->  \" , \"");
		lblNewLabel_1.setBounds(0, 33, 474, 72);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Malgun Gothic", Font.PLAIN, 17));
		
		JLabel lblNewLabel_2 = new JLabel("-Ejemplo:      ");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setBounds(0, 116, 197, 40);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Malgun Gothic", Font.PLAIN, 17));
		
		JLabel lblNewLabel_3 = new JLabel(" Vector 2  {12,10,109}");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setBounds(167, 252, 227, 42);
		panel.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Malgun Gothic", Font.BOLD, 20));
		
		JLabel lblNewLabel_4 = new JLabel(" Vector 1  {56,34,126} ");
		lblNewLabel_4.setFont(new Font("Malgun Gothic", Font.BOLD, 20));
		lblNewLabel_4.setBounds(167, 201, 227, 40);
		panel.add(lblNewLabel_4);
		
		JLabel titulo = new JLabel("Vectores");
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setBounds(110, 45, 387, 45);
		titulo.setFont(new Font("Malgun Gothic", Font.BOLD, 24));
		contentPane.add(titulo);
		
		v1 = new JTextField();
		v1.setBounds(208, 101, 231, 20);
		contentPane.add(v1);
		v1.setColumns(10);
		
		JLabel txv1 = new JLabel("Vector 1");
		txv1.setBounds(127, 91, 89, 34);
		txv1.setFont(new Font("Malgun Gothic Semilight", Font.PLAIN, 15));
		contentPane.add(txv1);
		
		JLabel txv2 = new JLabel("Vector 2");
		txv2.setBounds(127, 139, 89, 34);
		txv2.setFont(new Font("Malgun Gothic Semilight", Font.PLAIN, 15));
		contentPane.add(txv2);
		
		JLabel finvec = new JLabel("}");
		finvec.setFont(new Font("Tahoma", Font.PLAIN, 25));
		finvec.setBounds(445, 91, 89, 34);
		contentPane.add(finvec);
		
		JLabel inivect = new JLabel("{");
		inivect.setFont(new Font("Tahoma", Font.PLAIN, 25));
		inivect.setBounds(192, 93, 66, 28);
		contentPane.add(inivect);
		
		JLabel finvec_1 = new JLabel("}");
		finvec_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		finvec_1.setBounds(445, 139, 89, 34);
		contentPane.add(finvec_1);
		
		JLabel inivect_1 = new JLabel("{");
		inivect_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		inivect_1.setBounds(192, 140, 66, 28);
		contentPane.add(inivect_1);
		v2 = new JTextField();
		v2.setBounds(208, 148, 231, 20);
		contentPane.add(v2);
		v2.setColumns(10);
		
		JLabel inivect_2 = new JLabel("{");
		inivect_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		inivect_2.setBounds(192, 212, 66, 28);
		contentPane.add(inivect_2);
		
		JLabel finvec_2 = new JLabel("}");
		finvec_2.setFont(new Font("Tahoma", Font.PLAIN, 25));
		finvec_2.setBounds(445, 212, 66, 31);
		contentPane.add(finvec_2);
		
		
		JButton suma = new JButton("+");
		suma.setBackground(b);
		suma.setForeground(letra);
		suma.setFont(new Font("Malgun Gothic Semilight", Font.BOLD, 37));
		suma.setBounds(61, 292, 60, 60);
		suma.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			res.setText(calcular(v1.getText(),v2.getText(),1));	
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				txv2.setText("Vector 2");
				finvec.setText("}");
				inivect.setText("{");
				finvec_1.setText("}");
				inivect_1.setText("{");
				finvec_2.setText("}");
				inivect_2.setText("{");
				suma.setBackground(b2);
				suma.setForeground(new Color(255,255,255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				suma.setBackground(b);
				suma.setForeground(letra);
			}
		});
		contentPane.add(suma);
		txres.setBounds(110, 210, 99, 31);
		txres.setFont(new Font("Malgun Gothic", Font.PLAIN, 15));
		contentPane.add(txres);
		
		res = new JTextField();
		res.setBounds(208, 218, 231, 20);
		res.setEditable(false);
		contentPane.add(res);
		res.setColumns(10);
		
		JButton Resta = new JButton("-");
		Resta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Resta.setFont(new Font("Malgun Gothic", Font.PLAIN, 38));
		Resta.setBounds(61, 377, 60, 60);
		Resta.setBackground(b);
		suma.setForeground(letra);
		Resta.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				res.setText(calcular(v1.getText(),v2.getText(),2));
			
			}
			@Override
			public void mouseEntered(MouseEvent e) {
					txv2.setText("Vector 2");	
					finvec.setText("}");
					inivect.setText("{");
					finvec_1.setText("}");
					inivect_1.setText("{");
					finvec_2.setText("}");
					inivect_2.setText("{");
					Resta.setBackground(b2);
					Resta.setForeground(new Color(255,255,255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Resta.setBackground(b);
				Resta.setForeground(letra);
			}
		});
		contentPane.add(Resta);
		
		JButton escvect = new JButton("Vector*Escalar");
		escvect.setFont(new Font("Malgun Gothic", Font.BOLD, 16));
		escvect.setBackground(b);
		suma.setForeground(letra);
		escvect.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
	
				res.setText(calcular(v1.getText(),v2.getText(),3));
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				txv2.setText("Escalar");
				finvec.setText("}");
				inivect.setText("{");
				finvec_1.setText("");
				inivect_1.setText("");
				finvec_2.setText("}");
				inivect_2.setText("{");
				escvect.setBackground(b2);
				escvect.setForeground(new Color(255,255,255));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				escvect.setBackground(b);
				escvect.setForeground(letra);
			}
		});
		escvect.setBounds(356, 292, 178, 60);
		contentPane.add(escvect);
		
		JButton Producescal = new JButton("Producto escalar");
		Producescal.setFont(new Font("Malgun Gothic", Font.BOLD, 16));
		Producescal.setBackground(b);
		letra = Producescal.getForeground();
		suma.setForeground(letra);
		Producescal.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				res.setText(calcular(v1.getText(),v2.getText(),4));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				txv2.setText("Vector 2");
				finvec.setText("}");
				inivect.setText("{");
				finvec_1.setText("}");
				inivect_1.setText("{");
				finvec_2.setText("");
				inivect_2.setText("");
				Producescal.setBackground(b2);
				Producescal.setForeground(new Color(255,255,255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Producescal.setBackground(b);
				Producescal.setForeground(letra);
			}
		});
		Producescal.setBounds(157, 377, 178, 60);
		contentPane.add(Producescal);
		
		JButton Productovectorial = new JButton("Producto en R3");
		Productovectorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Productovectorial.setFont(new Font("Malgun Gothic", Font.BOLD, 16));
		Productovectorial.setBackground(b);
		Productovectorial.setForeground(letra);
		Productovectorial.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				res.setText(calcular(v1.getText(),v2.getText(),5));
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				txv2.setText("Vector 2");
				finvec.setText("}");
				inivect.setText("{");
				finvec_1.setText("}");
				inivect_1.setText("{");
				finvec_2.setText("}");
				inivect_2.setText("{");
				Productovectorial.setBackground(b2);
				Productovectorial.setForeground(new Color(255,255,255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Productovectorial.setBackground(b);
				Productovectorial.setForeground(letra);
			}
		});
		Productovectorial.setBounds(157, 292, 178, 60);
		contentPane.add(Productovectorial);
		
		JPanel volver = new JPanel();
		volver.setBackground(c);
		volver.setBounds(0, 0, 90, 45);
		contentPane.add(volver);
		volver.setLayout(null);
		
		JPanel linea_divisora = new JPanel();
		linea_divisora.setBounds(89, 0, 1, 45);
		volver.add(linea_divisora);
		linea_divisora.setBackground(new Color(0, 0, 0));
		
		JLabel lblVolver = new JLabel("");
		lblVolver.setIcon(new ImageIcon(Vectores.class.getResource("/imagenes/logos/flecha-logo.png")));
		lblVolver.setBounds(0, 0, 90, 45);
		volver.add(lblVolver);
		lblVolver.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				Selector selecter = new Selector(a1,a2,b,b2,c,c2);
				selecter.setVisible(true);
				selecter.setLocationRelativeTo(null);
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
		lblVolver.setBackground((Color) null);
		
		JButton btnBorrar = new JButton("AC");
		btnBorrar.setBackground(c);
		btnBorrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				v1.setText("");
				v2.setText("");
				res.setText("");
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnBorrar.setBackground(c2);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnBorrar.setBackground(c);
			}
		});
		btnBorrar.setFont(new Font("Malgun Gothic", Font.BOLD, 16));
		btnBorrar.setBounds(356, 377, 178, 60);
		contentPane.add(btnBorrar);
		
		JPanel info = new JPanel();
		info.setLayout(null);
		info.setBackground(c);
		info.setBounds(89, 0, 90, 45);
		contentPane.add(info);
		
		JLabel lblinfo = new JLabel("");
		lblinfo.setIcon(new ImageIcon(Vectores.class.getResource("/imagenes/logos/download-removebg-preview (5).png")));
		lblinfo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				titulo.setText("Ingresar Vectores");
				v1.setVisible(false);
				v2.setVisible(false);
				panelTextoInfo.setVisible(true);
				info.setBackground(c2);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				titulo.setText("Vectores");
				v1.setVisible(true);
				v2.setVisible(true);
				panelTextoInfo.setVisible(false);
				info.setBackground(c);
			}
			
		});
		lblinfo.setBounds(0, 0, 90, 45);
		info.add(lblinfo);
		lblinfo.setHorizontalAlignment(SwingConstants.CENTER);
		lblinfo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblinfo.setBackground((Color) null);
		
		
	}
static String calcular(String tvect1,String tvalor2, int opcion) {
	
	String tresultado="";
	String svect1[] = tvect1.split(",");
	int[] vector1 = new int[20];
	int cont1=0;
	int cont2=0;
	int[] vector2 = new int[20];
	int escalar=0;
try {		
	for(String car: svect1) {
		vector1[cont1]=Integer.parseInt(car);
		cont1++;
	}
	
	
	if(opcion!=3) {
	
		String svect2[] = tvalor2.split(",");
		for(String car: svect2) {
			vector2[cont2]=Integer.parseInt(car);
			cont2++;
		
		}
		
}
	if(opcion==3) {
		
	escalar=Integer.parseInt(tvalor2);
	}
}catch(Exception e) {
	return "Error, valor/es no valido/s";
}
	int[] resultado=new int[20];
	
	boolean comprobar=true;	
	if(opcion!=3) {
	if(cont1!=cont2) {
		comprobar=false;
	}
	}
	
	if(comprobar==true) {
		
	//operaciones
	switch(opcion) {
	
	case 1:
	for(int i=0;i<cont1;i++) {
		
	
		resultado[i]=vector1[i]+vector2[i];
	
	}
	break;
	
	case 2:
		
	for(int i=0;i<cont1;i++) {
		resultado[i]=vector1[i]-vector2[i];
	}
	break;
	
	case 3:
	
	for(int i=0;i<cont1;i++){
	
	resultado[i]=vector1[i]*escalar;
	}
	break;
	
	case 4:
		escalar=0;
		for(int i=0;i<cont1;i++){	
		escalar=escalar+vector1[i]*vector2[i];	
		}
		
		tresultado=String.valueOf(escalar);
		
	break;	
	case 5:
		
		resultado[0]=vector1[1]*vector2[2]-vector1[2]*vector2[1];
		resultado[1]=vector1[0]*vector2[2]-vector1[2]*vector2[0];
		resultado[1]=resultado[1]*-1;
		resultado[2]=vector1[0]*vector2[1]-vector1[1]*vector2[0];	
	break;
	
	}
	
	}
	
	//pasaje de int a String
	if(opcion!=4) {
		for(int i=0;i<cont1;i++) {	
			tresultado=tresultado+String.valueOf(resultado[i]);				
			if(i!=cont1-1) {
				tresultado=tresultado+",";
			}
			}
	}
	
	
	if(comprobar==false) {
		tresultado="Los vectores tienen largos diferentes";
	}
	
	if((cont1!=3 || cont2!=3 )&& opcion==5) {
		tresultado="Ingrese vectores en r3";
	}
	
	return tresultado;	
}
	/*private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}*/
}