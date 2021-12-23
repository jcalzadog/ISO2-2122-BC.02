/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esi.uclm.gepi.Dominio;

public class Enfermedad {
    
    String nombre;
    String sintomas[];
    int temporalidad;
    String medicinas;
    boolean confinamiento;
    String vacunas [];

    public Enfermedad(String nombre, String[] sintomas, int temporalidad, String medicinas, boolean confinamiento, String vacunas[]) {
        this.nombre = nombre;
        this.sintomas = sintomas;
        this.temporalidad = temporalidad;
        this.medicinas = medicinas;
        this.confinamiento = confinamiento;
        this.vacunas = vacunas;
    }

    public Enfermedad() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String[] getSintomas() {
        return sintomas;
    }

    public void setSintomas(String[] sintomas) {
        this.sintomas = sintomas;
    }

    public int getTemporalidad() {
        return temporalidad;
    }

    public void setTemporalidad(int temporalidad) {
        this.temporalidad = temporalidad;
    }

    public String getMedicinas() {
        return medicinas;
    }

    public void setMedicinas(String medicinas) {
        this.medicinas = medicinas;
    }

    public boolean isConfinamiento() {
        return confinamiento;
    }

    public void setConfinamiento(boolean confinamiento) {
        this.confinamiento = confinamiento;
    }

    public String [] getVacunas() {
        return vacunas;
    }

    public void setVacunas(String [] vacunas) {
        this.vacunas = vacunas;
    }

    
    public String toString() {
        return "Enfermedad{" + "nombre=" + nombre + ", sintomas=" + sintomas + ", temporalidad=" + temporalidad + ", medicinas=" + medicinas + ", confinamiento=" + confinamiento + ", vacunas=" + vacunas + '}';
    }

    
    
}
