/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2;
import herencia1.EstudianteDistancia;
import herencia1.EstudiantePresencial;
/**
 *
 * @author Matias Quezada
 */
public class Ejecutor {
    public static void main(String[] args){
       EstudiantePresencial e1 = new EstudiantePresencial();
       
       e1.establecerNombresEstudiante("Isaac Matias");
       e1.establecerApellidoEstudiante("Quezada Alvarez");
       e1.establecerIdentificacionEstudiante("1106012527");
       e1.establecerEdadEstudiante(18);
       e1.establecerNumeroCreditos(30);
       e1.establecerCostoCredito(15);
       e1.calcularMatriculaPresencial();
    
       System.out.printf("Nombre: %s\nApellido: %s\nIdentificacion: %s\nEdad: %s\n"
                + "Numero de Creditos: %d\nCosto Credito: %.2f\nCosto: %.2f\n",e1.obtenerNombresEstudiante(),
                e1.obtenerApellidoEstudiante(),e1.obtenerIdentificacionEstudiante(),e1.obtenerEdadEstudiante(),
                e1.obtenerNumeroCreditos(),e1.obtenerCostoCredito(),e1.obtenerMatriculaPresencial());
    }        
}
