/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia.pkg1;

import javax.swing.JOptionPane;
import dia.pkg1.Funciones;
import jdk.nashorn.internal.runtime.JSType;

/**
 *
 * @author Dante
 */
public class Dia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int resultado = 0;
        boolean salir = true;
        int aux = 0;       
        
        String as = "";
        
        while (salir) {
            
            
            String numero1Aux = "";
            String numero2Aux = "";
            String operacionAux = "";
                        
            do {                
                numero1Aux = JOptionPane.showInputDialog("Ingrese valor 1");
            } while (new Funciones().esNumero(numero1Aux) == false);
            do {                
                numero2Aux = JOptionPane.showInputDialog("Ingrese valor 2");
            } while (new Funciones().esNumero(numero2Aux) == false);
            do {                
                operacionAux = JOptionPane.showInputDialog("Ingrese Operación");
            } while (new Funciones().esNumero(operacionAux) == false);

            int numero1 = Integer.parseInt(numero1Aux);
            int numero2 = Integer.parseInt(numero2Aux);
            int operacion = Integer.parseInt(operacionAux);
            
            switch (operacion) {
            case 1:
                resultado = numero1 + numero2;
                JOptionPane.showMessageDialog(null, "El resultado de la suma es: "+resultado);                
                break;
            case 2:
                resultado = numero1 - numero2;
                JOptionPane.showMessageDialog(null, "El resultado de la resta es: "+resultado);
                break;
            case 3:
                resultado = numero1 * numero2;
                JOptionPane.showMessageDialog(null, "El resultado de la multiplicación es: "+resultado);
                break;
            case 4:
                resultado = numero1 / numero2;
                JOptionPane.showMessageDialog(null, "El resultado de la divición es: "+resultado);
                break;
            case 5:
                resultado = numero1 % numero2;
                JOptionPane.showMessageDialog(null, "El resto es: "+resultado);
            break;
            default:
                throw new AssertionError();
            }
            salir = new Funciones().Volver(operacion);
            
        }
                
        
        
    }
       
    
}



