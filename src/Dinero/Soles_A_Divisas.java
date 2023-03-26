package Dinero;

import javax.swing.JOptionPane;

public class Soles_A_Divisas {
	
	public void Soles_A_Dolares(double valor) {
		double tipo = 3.77;
		double dolares = valor/tipo;
		dolares = (double) Math.round(dolares*100)/100;
		JOptionPane.showMessageDialog(null, "Los S/ "+valor+" soles con el tipo de cambio de "+tipo+" soles por cada dolar, equivalen a $ "+dolares+" Estadounidenses");
	}
	
	public void Soles_A_Euros(double valor) {
		double tipo = 4.07;
		double euros = valor/tipo;
		euros = (double) Math.round(euros*100)/100;
		JOptionPane.showMessageDialog(null, "Los S/ "+valor+" soles con el tipo de cambio de "+tipo+" soles por cada euro,  equivalen a € "+euros);
	}
	
	public void Soles_A_Libras(double valor) {
		double tipo = 4.61;
		double libras = valor/tipo;
		libras = (double) Math.round(libras*100)/100;
		JOptionPane.showMessageDialog(null, "Los S/ "+valor+" soles con el tipo de cambio de "+tipo+" soles por cada libra, equivalen a £ "+libras+" libras esterlinas");
	}
	
	public void Soles_A_Yenes(double valor) {
		double tipo = 0.029;
		double yenes = valor/tipo;
		yenes = (double) Math.round(yenes*100)/100;
		JOptionPane.showMessageDialog(null, "Los S/ "+valor+" soles con el tipo de cambio de "+tipo+" soles por cada yen, equivalen a ¥ "+yenes+" japoneses");
	}
	
	public void Soles_A_Wones(double valor) {
		double tipo = 0.0029;
		double wones = valor/tipo;
		wones = (double) Math.round(wones*100)/100;
		JOptionPane.showMessageDialog(null, "Los S/ "+valor+" soles con el tipo de cambio de "+tipo+" soles por cada won, equivalen a ₩ "+wones+" wones surcoreanos");
	}
	
}