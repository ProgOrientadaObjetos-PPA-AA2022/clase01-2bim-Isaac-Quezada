/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
import paquete1.Edificio;
import paquete1.Empresa;
import paquete1.Vehiculos;
/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        
        // Crear una arreglo de 4 elementos de tipo Edificio
        Edificio edf1 = new Edificio("Edificio Central");
        edf1.establecerCostos(20000);
        Edificio edf2 = new Edificio("Edificio Norte");
        edf2.establecerCostos(30000);
        Edificio edf3 = new Edificio("Edificio Sur");
        edf3.establecerCostos(10000);
        Edificio edf4 = new Edificio("Edificio Secundario");
        edf4.establecerCostos(5000);
        
        Edificio [] listaEdificios = {edf1, edf2 , edf3 , edf4};
        
        Empresa MiEmpresa = new Empresa();
        MiEmpresa.establecerNombre("Empresa de Hojas");
        MiEmpresa.establecerEdificios(listaEdificios);
        MiEmpresa.establecercostoBienesInmuebles();
        
        Vehiculos vehs1 = new Vehiculos("Auto", "lbb0011",10000);
        Vehiculos vehs2 = new Vehiculos("Camioneta", "lbc0011",20000);
        Vehiculos vehs3 = new Vehiculos("Auto", "lbd0012",6000);
        Vehiculos vehs4 = new Vehiculos("Camioneta", "lcc0011",10000);
        Vehiculos vehs5 = new Vehiculos("Camioneta", "ldc0011",25000);
        
        Vehiculos[] listaVehiculos = {vehs1,vehs2,vehs3,vehs4,vehs5};
        System.out.printf("%s\n", MiEmpresa);
        
        MiEmpresa.establecerNombre("Empresa de Hojas");
        MiEmpresa.establecerEdificios(listaEdificios);
        MiEmpresa.establecercostoBienesInmuebles();
        MiEmpresa.establecerVehiculos(listaVehiculos);       
        MiEmpresa.establecercostovehiculos();
        MiEmpresa.establecercostoTotalBienes();
        //System.out.printf("%.2f\n" , MiEmpresa.obtenercostoBienesInmuebles());
        //double c = listaEdificios[2].obtenerCosto();
        //System.out.println(c);
        // Crear un objeto de tipo Empresa:
        //  Nombre: Empresa de Hojas
        //  Lista de edificio: edf1, edf2, edf3, edf4
        
        // Imprimir el costo de los bienes inmuebles de la empresa
    }
}
