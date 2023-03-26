package Convertidor_Soles;

import javax.swing.JOptionPane;

//Importa las funciones de los demas paquetes
import Dinero.FunctionDinero;
import Temperatura.FunctionTemperatura;

public class principal {
	public static void main (String[] args) {
		FunctionDinero  dinero = new FunctionDinero();
		FunctionTemperatura temperatura = new FunctionTemperatura();
		
		boolean comodin =true;
		while(comodin) {
			// (parentComponent, message,title, JOptionPane.QUESTION_MESSAGE null, initialSelectionValue 
			
			String opciones = (JOptionPane.showInputDialog(null,"Por favor, seleccione el tipo de Convertor que desea emplear",
					"Menu", JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Conversor de Divisas","Conversor de Temperatura"},
					"Seleccion")).toString();
			
			switch(opciones) {
        	
			//Caso Usuario seleccion Conversor de divisas
			case "Conversor de Divisas":
        		 String input = JOptionPane.showInputDialog("Por favor, ingrese la cantidad de dinero que usted desea convertir: ");
                 
        		 if(ValidarNumero(input) == true) {
                     double Minput = Double.parseDouble(input);
                     dinero.ConvertirMonedas(Minput);

                     int respuesta=JOptionPane.showConfirmDialog(null,"¿Deseas realizar otra conversión?");
                     
                     if (JOptionPane.OK_OPTION == respuesta){
                     	System.out.println("Selecciona opción Afirmativa");
                     }else{
                    	 	comodin = false;
                        	JOptionPane.showMessageDialog(null, "Programa terminado");  
                     }
                     
                 }else {
                        JOptionPane.showMessageDialog(null, "Valor inválido");                
                    	}
                     	break;
            
            //Caso Usuario seleccion Conversor de Temperatura
			case "Conversor de Temperatura":
	        	 input = JOptionPane.showInputDialog("Por favor, ingrese el valor de la temperatura que deseas convertir ");
	             if(ValidarNumero(input) == true) {
	                 double Minput = Double.parseDouble(input);
	                 temperatura.ConvertirTemperatura(Minput);

	                 int respuesta = 0;
	                 respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?");
	                 if((respuesta == 0) && (ValidarNumero(input) == true)) { 
	                 } else {
	                	 comodin = false;
	                     JOptionPane.showMessageDialog(null, "Programa terminado");                     
	                 }

	             } else {
	                 JOptionPane.showMessageDialog(null, "Valor inválido");                
	             }
	             break; 
			}
	             
		}//Fin del While
			
			
	}//Fin del static void
	
	public static boolean ValidarNumero(String input) {
        try {
            double x = Double.parseDouble(input);
            if(x >= 0 || x < 0);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
	}
}