package Dinero;

import javax.swing.JOptionPane;

public class FunctionDinero {
	
	Soles_A_Divisas soles = new Soles_A_Divisas();
	Divisas_A_Soles extranjera = new Divisas_A_Soles();
		
    public void ConvertirMonedas(double Minput) {
    	String opcion = (JOptionPane.showInputDialog(null, 
    			"Por favor elija el tipo de cambio que desea realizar", "extranjera",
    			JOptionPane.PLAIN_MESSAGE, null, new Object[] 
    			{"De Soles a Dolares", "De Soles a Euros", "De Soles a Libras","De Soles a Yenes","De Soles a Wones Sur Coreano",
    			"De Dolares a Soles", "De Euros a Soles", "De Libras a Soles","De Yenes a Soles","De Wones Sur Coreano a Soles"}, 
    			"Seleccion")).toString();
        
    	switch(opcion) {
    	
        case "De Soles a Dolares":
        	soles.Soles_A_Dolares(Minput);
        	break;
        case "De Soles a Euros":
        	soles.Soles_A_Euros(Minput);
        	break;
        case "De Soles a Libras":
        	soles.Soles_A_Libras(Minput);
        	break;
        case "De Soles a Yenes":
        	soles.Soles_A_Yenes(Minput);
        	break;
        case "De Soles a Wones Sur Coreano":
        	soles.Soles_A_Wones(Minput);
        	break;  
        	
        case "De Dolares a Soles":
        	extranjera.Dolares_A_Soles(Minput);
        	break;
        case "De Euros a Soles":
        	extranjera.Euros_A_Soles(Minput);
        	break;
        case "De Libras a Soles":
        	extranjera.Libras_A_Soles(Minput);
        	break;
        case "De Yenes a Soles":
        	extranjera.Yenes_A_Soles(Minput);
        	break;
        case "De Wones Sur Coreano a Soles":
        	extranjera.Wones_A_Soles(Minput);
            break;
        }      
    }
}