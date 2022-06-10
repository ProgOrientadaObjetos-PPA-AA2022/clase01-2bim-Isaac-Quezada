/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author Matias Quezada
 */
public class Vehiculos {
    private String tipo;
    private String matricula;
    private double valor;
     
    public Vehiculos(String tp , String ma , double va){
        tipo = tp;
        matricula = ma;
        valor = va;
    }
    
    public void establecerTipo(String tp){
        tipo = tp;
    }
    
    public void establecerMatricula(String ma){
        matricula = ma;
    }
    
    public void establecerValor(double va){
        valor = va;
    }
    
    public String obtenerTipo(){
        return tipo;
    }    
   
    public String obtenerMatricula(){
        return matricula;
    }    
    
    public double obtenerValor(){
        return valor;
    }    
    @Override
        public String toString(){
            String cadena = String.format("Tipo del vehiculo: %s\n Matricula: %s\n"
                    + "Costo del Vehiculo: %.2f\n",tipo, matricula, valor);
        return cadena; 
        }   
}
