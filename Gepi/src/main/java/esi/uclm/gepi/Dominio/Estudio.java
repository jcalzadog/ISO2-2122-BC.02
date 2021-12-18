/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;

import esi.uclm.gepi.Dominio.Enfermedad;


public class Estudio {
    
 Enfermedad enfermedad;
 Campania campaniaVacunacion;
 String municipio;

    public Estudio(Enfermedad enfermedad, Campania campaniaVacunacion, String municipio) {
        this.enfermedad = enfermedad;
        this.campaniaVacunacion = campaniaVacunacion;
        this.municipio = municipio;
    }

    public Estudio() {
    }

    public Enfermedad getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(Enfermedad enfermedad) {
        this.enfermedad = enfermedad;
    }

    public Campania getCampaniaVacunacion() {
        return campaniaVacunacion;
    }

    public void setCampaniaVacunacion(Campania campaniaVacunacion) {
        this.campaniaVacunacion = campaniaVacunacion;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    
    public String toString() {
        return "Estudio{" + "enfermedad=" + enfermedad + ", campaniaVacunacion=" + campaniaVacunacion + ", municipio=" + municipio + '}';
    }
 
 
 
}
