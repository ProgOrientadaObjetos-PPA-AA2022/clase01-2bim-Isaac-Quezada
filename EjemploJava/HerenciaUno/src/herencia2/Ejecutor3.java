/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2;

import herencia1.EstudianteDistancia;
import herencia1.EstudiantePresencial;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Matias Quezada
 */
public class Ejecutor3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Ingrese 1 Si es Estudiante Presencial - Ingrese 2 si es Estududiante a Distancia");
        int opcion1 = sc.nextByte();
        if (opcion1 != 1 && opcion1 != 2) {
            System.out.println("opcion incorrecta");
        } else {

            sc.nextLine();
            System.out.println("Ingrese el nombre del estudiante: ");
            String nom = sc.nextLine();
            System.out.println("Ingrese el apellido del estudiante: ");
            String ape = sc.nextLine();
            System.out.println("Ingrese el numero de cedula del estudiante: ");
            String ced = sc.nextLine();
            System.out.println("Ingrese la edad del estudiante: ");
            int edad = sc.nextInt();

            if (opcion1 == 1) {
                System.out.println("Ingrese el numero de creaditos: ");
                int numCred = sc.nextInt();
                System.out.println("Ingrese el costo de creditos: ");
                double costCr = sc.nextDouble();

                EstudiantePresencial e1 = new EstudiantePresencial();
                e1.establecerNombresEstudiante(nom);
                e1.establecerApellidoEstudiante(ape);
                e1.establecerIdentificacionEstudiante(ced);
                e1.establecerEdadEstudiante(edad);
                e1.establecerNumeroCreditos(numCred);
                e1.establecerCostoCredito(costCr);

                e1.calcularMatriculaPresencial();

                System.out.printf("%s\n", e1);

            } else {
                if (opcion1 == 2) {
                    System.out.println("Ingrese el numero de asignatura: ");
                    int numA = sc.nextInt();
                    System.out.println("Ingrese el costo de la asignatura: ");
                    double cost = sc.nextDouble();
                    EstudianteDistancia e1 = new EstudianteDistancia();
                    e1.establecerNombresEstudiante(nom);
                    e1.establecerApellidoEstudiante(ape);
                    e1.establecerIdentificacionEstudiante(ced);
                    e1.establecerEdadEstudiante(edad);
                    e1.establecerNumeroAsginaturas(numA);
                    e1.establecerCostoAsignatura(cost);

                    e1.calcularMatriculaDistancia();

                    System.out.printf("%s\n", e1);
                } 
            }
        }
    }
}
