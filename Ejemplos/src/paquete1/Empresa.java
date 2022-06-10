/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Empresa {

    private String nombre;
    private Edificio[] edificios;
    private Vehiculos[] vehiculos; // tipo , matricula , valor 
    private double costoBienesInmuebles;
    private double costovehiculos;
    private double costoTotalBienes;

    public void establecerNombre(String m) {
        nombre = m;
    }

    public void establecerEdificios(Edificio[] m) {
        edificios = m;
    }

    public void establecerVehiculos(Vehiculos[] m) {
        vehiculos = m;
    }

    public void establecercostoBienesInmuebles() {
        double suma = 0;
        for (int i = 0; i < edificios.length; i++) {
            suma = suma + edificios[i].obtenerCosto();

        }
        costoBienesInmuebles = suma;
    }

    public void establecercostovehiculos() {
        double suma = 0;
        for (int i = 0; i < vehiculos.length; i++) {
            suma = suma + vehiculos[i].obtenerValor();

        }
        costovehiculos = suma;
    }

    public void establecercostoTotalBienes() {
        costoTotalBienes = costoBienesInmuebles + costovehiculos;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public Edificio[] obtenerEdificios() {
        return edificios;
    }

    public Vehiculos[] obtenerVehiculos() {
        return vehiculos;
    }

    public double obtenercostoBienesInmuebles() {
        return costoBienesInmuebles;
    }

    public double obtenercostoTotalBienes() {
        return costoTotalBienes;
    }

    public double obtenercostovehiculos() {
        return costovehiculos;
    }

    @Override
    public String toString() {
        String reporte = String.format("%s\nLista De Edificios\n",
                obtenerNombre());
        for (int i = 0; i < edificios.length; i++) {
            reporte = String.format("%s%d.  %s (%.2f)\n", reporte, i + 1,
                    edificios[i].obtenerNombre().toUpperCase(),
                    edificios[i].obtenerCosto());
        }
        reporte = String.format("%sTotal de Inmuebles: %.2f\n",
                reporte, costoBienesInmuebles);
        reporte = String.format("%s Lista vehiculos: \n", reporte);
        for (int i = 0; i < vehiculos.length; i++) {
            reporte = String.format("%s%d. %s %s (%.2f)\n", reporte, i + 1, vehiculos[i].obtenerTipo(),
                    vehiculos[i].obtenerMatricula().toUpperCase(), vehiculos[i].obtenerValor());
        }
        reporte = String.format("%sTotal de inmueble: %.2f\n\n", reporte, costovehiculos);

        reporte = String.format("%s Total bienes: %s\n", reporte, costoTotalBienes);
        return reporte;

    }

}
