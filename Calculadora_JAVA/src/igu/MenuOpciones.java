package igu;

//import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
//import java.awt.BorderLayout;
//import javax.swing.JButton;
//import javax.swing.JTextField;
//import javax.swing.JTextArea;
//import net.miginfocom.swing.MigLayout;
//import javax.swing.GroupLayout;
//import javax.swing.GroupLayout.Alignment;
//import com.jgoodies.forms.layout.FormLayout;
//import com.jgoodies.forms.layout.ColumnSpec;
//import com.jgoodies.forms.layout.FormSpecs;
//import com.jgoodies.forms.layout.RowSpec;
//import javax.swing.SpringLayout;
//import java.awt.event.ActionListener;
//import java.awt.event.ActionEvent;
//import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class MenuOpciones extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel sistema2x2;
	//int alto_frame=520;
	//int ancho_frame=600;
	
	int alto_frame=610;
	int ancho_frame=650;
	
	
	//Valores de los botones:
	int diferencia=80;
	int alto=45;
	int ancho=300;
	/**
	 * Launch the application.
	 */
	
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuOpciones frame = new MenuOpciones();
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
	public MenuOpciones(Color a1, Color a2, Color b,Color b2, Color c, Color c2) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MenuOpciones.class.getResource("/imagenes/logos/calcu-logo.png")));
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 311, 483);
		sistema2x2 = new JPanel();
		sistema2x2.setBackground(a2);
		sistema2x2.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(sistema2x2);
		sistema2x2.setLayout(null);
		
		JPanel fondoVolver = new JPanel();
		fondoVolver.setBackground(c);
		fondoVolver.setBounds(0, 0, 90, 45);
		sistema2x2.add(fondoVolver);
		fondoVolver.setLayout(null);
		
		JLabel lblVolver = new JLabel("");
		lblVolver.setIcon(new ImageIcon(MenuOpciones.class.getResource("/imagenes/logos/flecha-logo.png")));
		lblVolver.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				fondoVolver.setBackground(c2);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				fondoVolver.setBackground(c);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				Selector seli = new Selector(a1,a2,b,b2,c,c2);
				seli.setVisible(true);
				seli.setLocationRelativeTo(null);
			}
		});
		lblVolver.setBounds(0, 0, 90, 45);
		fondoVolver.add(lblVolver);
		lblVolver.setHorizontalAlignment(SwingConstants.CENTER);
		lblVolver.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblVolver.setBackground((Color) null);
		
		JLabel lblNewLabel_5 = new JLabel("Elije el tipo de Sistema");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Malgun Gothic", Font.PLAIN, 22));
		lblNewLabel_5.setBounds(0, 50, 295, 55);
		sistema2x2.add(lblNewLabel_5);
		
		JPanel panel = new JPanel();
		panel.setBackground(b);
		int y=150;
		panel.setBounds(0, y, ancho, alto);
		sistema2x2.add(panel);
		panel.setLayout(null);
		
		JLabel lblSiste2x2 = new JLabel("       Sistema 2x2");
		lblSiste2x2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Sistema2x2 in2 =  new Sistema2x2(a1,a2,b,b2,c,c2);//se debe llamar a la variable con mismo nombre
				in2.setSize(ancho_frame, alto_frame);
				in2.setLocationRelativeTo(null);
				in2.setVisible(true);//se le dice que a ventana es visible
				dispose();//elimina la anterior ventana
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				panel.setBackground(b2);
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel.setBackground(b);
			}
		});
		lblSiste2x2.setBounds(0, 0, ancho, alto);
		panel.add(lblSiste2x2);
		lblSiste2x2.setHorizontalAlignment(SwingConstants.LEFT);
		lblSiste2x2.setForeground(Color.WHITE);
		lblSiste2x2.setFont(new Font("Malgun Gothic", Font.PLAIN, 20));
		lblSiste2x2.setBackground(new Color(255, 255, 255));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(b);
		panel_1.setLayout(null);
		y=y+diferencia;
		panel_1.setBounds(0, y, ancho, alto);
		sistema2x2.add(panel_1);
		
		JLabel lblSistemaDeEcuaciones = new JLabel("       Sistema 3x3");
		lblSistemaDeEcuaciones.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Sistema3x3 in2 =  new Sistema3x3(a1,a2,b,b2,c,c2);//se debe llamar a la variable con mismo nombre
				in2.setSize(ancho_frame, alto_frame);
				in2.setLocationRelativeTo(null);
				in2.setVisible(true);//se le dice que a ventana es visible
				dispose();//elimina la anterior ventana
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_1.setBackground(b2);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel_1.setBackground(b);
			}
		});
		lblSistemaDeEcuaciones.setBounds(0, 0, ancho, alto);
		panel_1.add(lblSistemaDeEcuaciones);
		lblSistemaDeEcuaciones.setHorizontalAlignment(SwingConstants.LEFT);
		lblSistemaDeEcuaciones.setForeground(Color.WHITE);
		lblSistemaDeEcuaciones.setFont(new Font("Malgun Gothic", Font.PLAIN, 20));
		lblSistemaDeEcuaciones.setBackground(new Color(128, 128, 64));
	}
}

