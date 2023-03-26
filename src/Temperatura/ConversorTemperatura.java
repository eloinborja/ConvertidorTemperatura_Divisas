package Temperatura;

import javax.swing.JOptionPane;

public class ConversorTemperatura {
	
	public void CelciusAFarenheit(double valor) {
		double farenheit = (valor*1.8) + 32;
    	farenheit = (double) Math.round(farenheit *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ "°C (Grados Celcius) son " +farenheit+ " °F (Grados Farenheit) ");
	}
	
	public void CelciusAKelvin(double valor){
		double kelvin = valor + 273.15;
        kelvin = (double) Math.round(kelvin *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ "°C (Grados Celcius) son " +kelvin+ " K (Grados Kevin) ");
	}
	
	
	
	public void FarenheitACelcius(double valor) {
		double celcius = (valor - 32) / 1.8;
        celcius = (double) Math.round(celcius *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " °F (Grados Farenheit) son " +celcius+ " °C (Grados Celcius)");
	}
	
	public void FarenheitAKelvin(double valor) {
		double kelvin = (valor - 32)*5/9+273.15;
        kelvin = (double) Math.round(kelvin *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ "  °F (Grados Farenheit) son  " +kelvin+ " K (Grados Kelvin) ");
	}
	
	
	
	public void KelvinACelcius(double valor) {
		 double celcius = valor - 273.15;
         celcius = (double) Math.round(celcius *100d)/100;
         JOptionPane.showMessageDialog(null, +valor+ " K (Grados Kelvin) son " +celcius+ " °C (Grados Celcius)");
	}
	
	//(0 K − 273.15) × 9/5 + 32
	public void KelvinAFarenheit(double valor) {
		double farenheit = (valor-273.15)*9/5+32;
		farenheit= (double) Math.round(farenheit *100d)/100;
        JOptionPane.showMessageDialog(null, +valor+ " K (Grados Kelvin) son" +farenheit+ " °F (Grados Farenheit) ");
	}

}
