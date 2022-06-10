/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2;
import herencia1.EstudianteDistancia;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Matias Quezada
 */
public class Ejecutor2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        System.out.println("Ingrese el nombre: ");
        String nom = sc.nextLine();
        
        System.out.println("Ingrese el apellido: ");
        String ape = sc.nextLine();
        
        System.out.println("Ingrese la identificacion");
        String ide = sc.nextLine();
        
        System.out.println("Ingrese la edad");
        int edad = sc.nextInt();
        
        System.out.println("Ingrese el numero de asignatura");
        int asignatura = sc.nextInt();
        
        System.out.println("Ingrese el costo de la asignatura");
        int costoasignatura = sc.nextInt();
    
        
        EstudianteDistancia e1 = new EstudianteDistancia();
        
        e1.establecerNombresEstudiante(nom);
        e1.establecerApellidoEstudiante(ape);
        e1.establecerIdentificacionEstudiante(ide);
        e1.establecerEdadEstudiante(edad);
        e1.establecerNumeroAsginaturas(asignatura);
        e1.establecerCostoAsignatura(costoasignatura);
        
         System.out.println(e1);
    }
    
}
