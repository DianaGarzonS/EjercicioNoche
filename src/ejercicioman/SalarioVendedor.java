/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioman;

/**
 *
 * @author idiomas
 */
public class SalarioVendedor {

     /**
     * @param args the command line arguments
     */
   
    //ATRIBUTOS
     
    private String cedula;
    private String nombre;
    private double salarioBasico;
    private int diasLaborados;
    private double comision;
    private double prestamos;

    public static void main(String[] args) {
        Vendedor2 calcular = new Vendedor2 ();
        calcular.obtenerInformacion();
        calcular.calcularSalario();
    }

    public void obtenerInformacion() {
        cedula = JOptionPane.showInputDialog("Ingrese el numero de cédula del vendedor: ");
        nombre = JOptionPane.showInputDialog("Ingrese el nombre del vendedor: ");
        salarioBasico = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario básico del vendedor: "));
        diasLaborados = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los días laborados del vendedor (entre 1 y 30): "));
        comision = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de ventas del mes del vendedor: "));
        prestamos = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el total de préstamos del vendedor: "));
    }

    
    public void calcularSalario() {
     
        double sueldoDevengado = salarioBasico / 30 * diasLaborados;

        // Calcular auxilio de transporte
        double auxilioTransporte = 0;
        double salarioMinimo = 1300000; 
        if (salarioBasico <= (2 * salarioMinimo)) {
            auxilioTransporte = 162000 * diasLaborados / 30;
        }

        // Calcular comisión de ventas
        double comisionVentas = comision * 0.02;

        // Calcular total devengado
        double totalDevengado = sueldoDevengado + comisionVentas;

        // Calcular total deducciones
        double totalDeducciones = prestamos;

        // Calcular salario neto
        double salarioNeto = totalDevengado - totalDeducciones;

        // Imprimir en pantalla  
        JOptionPane.showMessageDialog(null, "Cedula empleado: " + cedula + "\n"
        + "Nombre empleado: " + nombre + "\n" + "Salario basico: " + salarioBasico
        + "\n" + "Auxilio de transporte: " + auxilioTransporte + "\n" 
                + "Comisicion de ventas: " + comision + "\n" + "Prestamos: "
                + prestamos + "\n" + "Salario neto a recibir: " + salarioNeto);
    }
}
    
    

