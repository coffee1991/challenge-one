package ConversorMoneda;

import javax.swing.JOptionPane;

public class MenuPrincipal {
    public static void main(String[] args){
    	
    	//desde este metodo se elgira el tipo de cambio si es de moneda o de temperatura
        Object [] tipoDeCambio = {"Conversor de moneda", "Conversor de temperatura"};
        
        Object opcion = JOptionPane.showInputDialog(null,"Selecciona una opción de conversión", "Menu",JOptionPane.QUESTION_MESSAGE,null,tipoDeCambio, tipoDeCambio[0]);
        
        
        //este if ayuda a mirar si el cliente elige conrtir a moneda, los tipos de moneda que hay
        if(opcion == tipoDeCambio[0]) {
        	Object [] opcionesMoneda = {"Peso a Dollar", "Peso a Euro", "Peso a Libras", "Peso a Yen", "Peso a Won Coreano", "Dollar a peso", "Euro a peso", "Libras a Peso",
    				"Yen a peso", "Won Coreano a Peso"};
            
            Object opcionMoneda = JOptionPane.showInputDialog(null,"Selecciona una moneda", "Monedas",JOptionPane.QUESTION_MESSAGE,null, opcionesMoneda, opcionesMoneda[0]);
            
          //este es el metodo donde se ingresara el valor en numero de la cantidad a convertir
            String cantidadMonedaString = JOptionPane.showInputDialog(null, "Ingrese la cantidad de dinero que desea convertir:",
                    "Entrada", JOptionPane.QUESTION_MESSAGE);
            
            //convertir la moneda a un entero
           int cantidadMoneda = Integer.parseInt(cantidadMonedaString);
                   
            		
           if(opcionMoneda == opcionesMoneda[0]) {
           	double resultado = cantidadMoneda * 0.00021;
           	System.out.println(resultado);
           }
           else if (opcionMoneda == opcionesMoneda[1]) {
        	   double resultado = cantidadMoneda * 0.00020;
        	   System.out.println(resultado);
			}
           else if (opcionMoneda == opcionesMoneda[2]) {
           	double resultado = cantidadMoneda * 0.00018;
           	System.out.println(resultado);
           }
           else if (opcionMoneda == opcionesMoneda[3]) {
           	double resultado = cantidadMoneda * 0.029;
           	System.out.println(resultado);
           }
           else if (opcionMoneda == opcionesMoneda[4]) {
           	double resultado = cantidadMoneda * 0.28;
           	System.out.println(resultado);
           }
           else if(opcionMoneda == opcionesMoneda[5]) {
            	double resultado = cantidadMoneda * 4700;
            	System.out.println(resultado);
            }
            else if (opcionMoneda == opcionesMoneda[6]) {
				double resultado = cantidadMoneda * 5000;
				System.out.println(resultado);
			}
            else if (opcionMoneda == opcionesMoneda[7]) {
            	double resultado = cantidadMoneda * 5600;
            	System.out.println(resultado);
            }
            else if (opcionMoneda == opcionesMoneda[8]) {
            	double resultado = cantidadMoneda * 34;
            	System.out.println(resultado);
            }
            else if (opcionMoneda == opcionesMoneda[9]) {
            	double resultado = cantidadMoneda * 3.6;
            	System.out.println(resultado);
            }
        }
    }
}