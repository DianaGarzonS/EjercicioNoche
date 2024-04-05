/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioman;

import javax.swing.JOptionPane;

/**
 *
 * @author idiomas
*/
public class EjercicioMan {

    public static void main(String[] args) {
       
        //atributos
        
        int kilos;
        double valorPagar;
        double valorReal;
        double descuento;
        
        kilos =Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de manzanas en kilos" ));
        if (kilos<=2) {
            valorPagar=kilos*4200;
            JOptionPane.showMessageDialog(null, "La compra de "
            + kilos + " Kg de manzanas tiene un valor de: " + valorPagar + " Usted tendrá "
                    + " que pagar la suma de: " +valorPagar
                    + " ya que no tiene descuento. ");
            }else if (kilos<=5) {
            valorPagar=(kilos*4200)-(kilos*4200)*0.1;
            valorReal=kilos*4200;
            descuento=(kilos*4200)*0.1;
            JOptionPane.showMessageDialog(null, "La compra de "
            + kilos + " Kg de manzanas Tiene un valor de: " + valorReal + " Pero usted tiene "
                    + " un descuento de: " + descuento
                    + " Por lo tanto el valor a pagar es: " + valorPagar);
            }else if (kilos<=10) {
            valorPagar=(kilos*4200)-(kilos*4200)*0.15;
            valorReal=kilos*4200;
            descuento=(kilos*4200)*0.15;
            JOptionPane.showMessageDialog(null, "La compra de "
            + kilos + " Kg de manzanas Tiene un valor de: " + valorReal + " Pero usted tiene "
                    + " un descuento de: " + descuento
                    + " Por lo tanto el valor a pagar es: " + valorPagar);
        }else{
            valorPagar=(kilos*4200)-(kilos*4200)*0.2;
            valorReal=kilos*4200;
            descuento=(kilos*4200)*0.2;
            JOptionPane.showMessageDialog(null, "La compra de "
            + kilos + " Kg de manzanas Tiene un valor de: " + valorReal + "\n"+ "Pero usted tiene "
                    + " un descuento de: " + descuento
                    + "\n"+  "Por lo tanto el valor a pagar es: " + valorPagar);
        }
    }
}
    
