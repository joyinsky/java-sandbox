/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava;
import java.util.Scanner;

/**
 *
 * @author luisfernando
 */
public class SueldoEmpleado {
    public static void main() {
        Scanner teclado = new Scanner(System.in);
        int horasTrabajadas;
        float costoHora;
        float sueldo;
        
        System.out.print("Ingrese la cantidad de horas trabajadas por el empleado: ");
        horasTrabajadas = teclado.nextInt();
        
        System.out.print("Ingrese el costo por hora: ");
        costoHora = teclado.nextFloat();
        
        sueldo = costoHora * horasTrabajadas;
        
        System.out.print("El sueldo del empleado es: ");
        System.out.print(sueldo);
        System.out.println("");
    }
}
