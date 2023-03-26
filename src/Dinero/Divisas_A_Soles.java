package Dinero;

import javax.swing.JOptionPane;

public class Divisas_A_Soles {
	
		public void Dolares_A_Soles(double valor) {
			double tipo = 3.77;
			double soles = valor * tipo;
			soles = (double) Math.round(soles *100d)/100;
	        JOptionPane.showMessageDialog(null, "Los $ "+valor+" dolares con el tipo de cambio a "+tipo+" ,  por cada dolar equivale a S/ " +soles+ " Soles");
		}
		
		public void Euros_A_Soles(double valor) {
			double tipo = 4.07;
			double soles = valor * tipo;
			soles = (double) Math.round(soles *100d)/100;
			JOptionPane.showMessageDialog(null, "Los € "+valor+" euros con el tipo de cambio a "+tipo+" , por cada euro equivale a S/ " +soles+ " Soles");
		}
		
		public void Libras_A_Soles(double valor) {
			double tipo = 4.61;
			double soles = valor * tipo;
	        soles = (double) Math.round(soles *100d)/100;
	        JOptionPane.showMessageDialog(null, "Los £ "+valor+" libras con el tipo de cambio a "+tipo+" , por cada libra equivale a S/ " +soles+ " Soles");
		}
		
		public void Yenes_A_Soles(double valor) {
			double tipo = 0.029;
			double soles = valor * tipo;
	        soles = (double) Math.round(soles *100d)/100;
	        JOptionPane.showMessageDialog(null, "Los ¥ "+valor+" yenes con el tipo de cambio a "+tipo+" , por cada yen equivale a S/ " +soles+ " Soles");
		}
		
		public void Wones_A_Soles(double valor) {
			double tipo = 0.0029;
			double soles = valor * tipo;
	        soles = (double) Math.round(soles *100d)/100;
	        JOptionPane.showMessageDialog(null, "Los ₩ "+valor+" wones con el tipo de cambio a "+tipo+" , por cada won equivale a S/ " +soles+ " Soles");
		}
}