package ConversorMoneda;

import javax.swing.JOptionPane;

public class MenuPrincipal {
    public static void main(String[] args){
    	
    	//desde este metodo se elgira el tipo de cambio si es de moneda o de temperatura
        Object [] tipoDeCambio = {"Conversor de moneda", "Conversor de temperatura"};
        
        Object opcion = JOptionPane.showInputDialog(null,"Selecciona una opción de conversión", "Menu",JOptionPane.QUESTION_MESSAGE,null,tipoDeCambio, tipoDeCambio[0]);
        
        if(opcion == tipoDeCambio[0]) {
        	Object [] opcionesMoneda = {"Peso a Dollar", "Peso a Euro", "Peso a Libras", "Peso a Yen", "Peso a Won Coreano", "Dollar a peso", "Euro a peso", "Libras a Peso",
    				"Yen a peso", "Won Coreano a Peso"};
            
            Object opcionMoneda = JOptionPane.showInputDialog(null,"Selecciona una moneda", "Monedas",JOptionPane.QUESTION_MESSAGE,null, opcionesMoneda, opcionesMoneda[0]);
            
            if(opcionesMoneda == opcionesMoneda[0]) {
            	
            }
        }
    }
}