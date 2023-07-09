package logica;

//import javax.swing.JOptionPane;

import java.awt.Color;

import igu.Selector;

//import AppPackage.AnimationClass;


public class Main {

	public static void main(String[] args) {
		
		
		//Color c7 mas nuevo (un poco mas claro): 
		//Color c7 = new Color(12,124,147);
		//Conjunto 1:
		/*
			Color c1 = new Color(7,153,182);
			Color c2 = new Color(74, 110, 176);
			Color c3 = new Color(17, 76, 95);
			Color c4 = new Color(156, 210, 211);
			Color c5 = new Color(242, 230, 207);
		*/
		
		
		//Conjunto 2:
		
			Color c6 = new Color(17,157,164);
			Color c7 = new Color(12,116,137);
			Color c8 = new Color(19,70,83);
		/*	Color c9 = new Color(24,24,24);
			Color beige= new Color(215,217,206);
		*/
		//
		
		//Conjunto 3: Amarillos y Verdes suaves
		Color yell_intenso= new Color(249,212,35);
		Color yell_suave= new Color(237,229,116);
		/*Color yell_green= new Color(225,245,196);
		Color green_suave= new Color(173,214,188);
		Color green_medio= new Color(121,183,180);*/
		//Conjunto 4: Verdes "oscuros"
		Color green= new Color(119,184,133);
		
		//Conjuntos Posibles:
		//Selector selector = new Selector(beige,c6,c7,c8,c9,c10);//
		//Selector selector = new Selector(green_suave,c6,c7,c8,yell_suave,yell_intenso);//
		
		Selector selector = new Selector(green,c6,c7,c8,yell_suave,yell_intenso);
		int alto_frame=selector.getHeight();
		int ancho_frame=selector.getWidth();
		selector.setSize(ancho_frame,alto_frame);
		selector.setVisible(true);
		selector.setLocationRelativeTo(null);
		
		
	}
	

}
