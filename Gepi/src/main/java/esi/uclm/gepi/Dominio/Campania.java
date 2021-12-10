/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;


public class Campania {
    
    String tipo;
    String nombre;
    String fecha;
    double coste;
    int temporalidad;
    double efectividad;

    public Campania(String tipo, String nombre, String fecha, double coste, int temporalidad, double efectividad) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.fecha = fecha;
        this.coste = coste;
        this.temporalidad = temporalidad;
        this.efectividad = efectividad;
    }

    public Campania() {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }

    public int getTemporalidad() {
        return temporalidad;
    }

    public void setTemporalidad(int temporalidad) {
        this.temporalidad = temporalidad;
    }

    public double getEfectividad() {
        return efectividad;
    }

    public void setEfectividad(double efectividad) {
        this.efectividad = efectividad;
    }

    public String toString() {
        return "Campanias{" + "tipo=" + tipo + ", nombre=" + nombre + ", fecha=" + fecha + ", coste=" + coste + ", temporalidad=" + temporalidad + ", efectividad=" + efectividad + '}';
    }
    
    
    
    
    
}
