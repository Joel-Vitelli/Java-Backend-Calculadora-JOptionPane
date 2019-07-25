/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author Dante
 */
public class Funciones {
    
    boolean salir2 = true;
    boolean cadena = true;
    
    public boolean Volver (int valor){
            
            valor = Integer.parseInt(JOptionPane.showInputDialog("Desea salir?"));
            if (valor == 2) {
                salir2 = false;
                return salir2;
            }else {
                if (valor == 1) {
                    salir2 = true;
                    System.out.println("mi valor es: "+salir2);
                return salir2;
                }else{
                    JOptionPane.showMessageDialog(null, "El valor ingresado es incorrecto");                                         
                    Volver(valor);
                                      
                }
            }
        return salir2;
    }
    
    public boolean esNumero (String numeroR){
         
        try {
            Integer.parseInt(numeroR);
            cadena = true;
        } catch (NumberFormatException excepcion) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un numero","Tipo incorrecto", JOptionPane.ERROR_MESSAGE);
            cadena = false;
        }

          
    return cadena;
    }
    
    
    
}


