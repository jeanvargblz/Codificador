/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoder;

/**
 *
 * @author Jean
 */
public class MensajeTipo3 {
    private double latitud;
    private double longitud;
    private double velocidad;
    private double altitud;
    public MensajeTipo3(){
        
    }
    @Override
    public String toString() {
        return "MensajeTipo3{" + "latitud=" + latitud + ", longitud=" + longitud + ", velocidad=" + velocidad + ", altitud=" + altitud + '}';
    }

    public MensajeTipo3(double latitud, double longitud, double velocidad, double altitud) {
        this.latitud = latitud;
        this.longitud = longitud;
        this.velocidad = velocidad;
        this.altitud = altitud;
    }

    public double getLatitud() {
        return latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public double getAltitud() {
        return altitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public void setAltitud(double altitud) {
        this.altitud = altitud;
    }

    
}
