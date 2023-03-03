package ConversorMoneda;

import javax.swing.JOptionPane;

public class opcionesDeMoneda {

	public static void main(String[] args) {
		Object [] opcionesMoneda = {"Peso a Dollar", "Peso a Euro", "Peso a Libras", "Peso a Yen", "Peso a Won Coreano", "Dollar a peso", "Euro a peso", "Libras a Peso",
				"Yen a peso", "Won Coreano a Peso"};
        
        Object opcion = JOptionPane.showInputDialog(null,"Selecciona una moneda", "Monedas",JOptionPane.QUESTION_MESSAGE,null, opcionesMoneda, opcionesMoneda[0]);
	}

}