package ConversorMoneda;

import javax.swing.JOptionPane;

public class MenuPrincipal {
    public static void main(String[] args){
        Object [] tipoDeCambio = {"Conversor de moneda", "Conversor de temperatura"};
        
        Object opcion = JOptionPane.showInputDialog(null,"Selecciona una opción de conversión", "Menu",JOptionPane.QUESTION_MESSAGE,null,tipoDeCambio, tipoDeCambio[0]);
    }
}