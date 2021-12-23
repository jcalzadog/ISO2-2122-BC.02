/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esi.uclm.gepi.Dominio;

import java.util.LinkedList;

/**
 *
 * @author Enrique
 */
public class Persona {
    private int id;
    private String nombre;
    private String apellidos;
    private int telefono; 
    private String fechanac;
    private boolean enfermo;
    private boolean confinado;
    private boolean atencion;
    private boolean sano;
    private boolean cuarentena;
    private boolean vulnerable;
    private boolean vacunado;
    private String id_contactos;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getFechanac() {
        return fechanac;
    }

    public void setFechanac(String fechanac) {
        this.fechanac = fechanac;
    }

    public boolean isEnfermo() {
        return enfermo;
    }

    public void setEnfermo(boolean enfermo) {
        this.enfermo = enfermo;
    }

    public boolean isConfinado() {
        return confinado;
    }

    public void setConfinado(boolean confinado) {
        this.confinado = confinado;
    }

    public boolean isAtencion() {
        return atencion;
    }

    public void setAtencion(boolean atencion) {
        this.atencion = atencion;
    }

    public boolean isSano() {
        return sano;
    }

    public void setSano(boolean sano) {
        this.sano = sano;
    }

    public boolean isCuarentena() {
        return cuarentena;
    }

    public void setCuarentena(boolean cuarentena) {
        this.cuarentena = cuarentena;
    }

    public boolean isVulnerable() {
        return vulnerable;
    }

    public void setVulnerable(boolean vulnerable) {
        this.vulnerable = vulnerable;
    }

    public boolean isVacunado() {
        return vacunado;
    }

    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
    }

    public String getId_contactos() {
        return id_contactos;
    }

    public void setId_contactos(String id_contactos) {
        this.id_contactos = id_contactos;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono + ", fechanac=" + fechanac + ", enfermo=" + enfermo + ", confinado=" + confinado + ", atencion=" + atencion + ", sano=" + sano + ", cuarentena=" + cuarentena + ", vulnerable=" + vulnerable + ", vacunado=" + vacunado + ", id_contactos=" + id_contactos + '}';
    }
        
}
