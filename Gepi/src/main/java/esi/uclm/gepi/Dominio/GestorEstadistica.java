/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esi.uclm.gepi.Dominio;

import Persistencia.Agente;
import java.util.LinkedList;
import java.util.Vector;

/**
 *
 * @author Diego Alba Ruiz
 */
public class GestorEstadistica {

    Agente agente;

    public GestorEstadistica() throws Exception {
        this.agente = Agente.getAgente();
    }

    public Object getNumeroEnfermedades() {

        Vector<Object> numEnfermedades = null;
        java.util.Vector temp;
        Object numE;

        try {
            numEnfermedades = this.agente.select("SELECT COUNT(ID) FROM Enfermedad", 1);

        } catch (Exception ex) {
            System.out.println(ex);
        }

        temp = (java.util.Vector) numEnfermedades.remove(0);
        numE = temp.remove(0);
        return numE;

    }

    public LinkedList<Object> getNumeroPersonasEstados() {

        Vector<Object> num = null;

        java.util.Vector tempVector;
        Object tempObject;
        LinkedList<Object> numEstadosPersona = new LinkedList();

        try {
            num = this.agente.select("SELECT COUNT(enfermo) FROM Persona WHERE enfermo=1", 1);
            tempVector = (java.util.Vector) num.remove(0);
            tempObject = tempVector.remove(0);
            numEstadosPersona.add(tempObject);

            num = this.agente.select("SELECT COUNT(confinado) FROM Persona WHERE confinado=1", 1);
            tempVector = (java.util.Vector) num.remove(0);
            tempObject = tempVector.remove(0);
            numEstadosPersona.add(tempObject);

            num = this.agente.select("SELECT COUNT(atencion) FROM Persona WHERE atencion=1", 1);
            tempVector = (java.util.Vector) num.remove(0);
            tempObject = tempVector.remove(0);
            numEstadosPersona.add(tempObject);

            num = this.agente.select("SELECT COUNT(sano) FROM Persona WHERE sano=1", 1);
            tempVector = (java.util.Vector) num.remove(0);
            tempObject = tempVector.remove(0);
            numEstadosPersona.add(tempObject);

            num = this.agente.select("SELECT COUNT(cuarentena) FROM Persona WHERE cuarentena=1", 1);
            tempVector = (java.util.Vector) num.remove(0);
            tempObject = tempVector.remove(0);
            numEstadosPersona.add(tempObject);

            num = this.agente.select("SELECT COUNT(vulnerable) FROM Persona WHERE vulnerable=1", 1);
            tempVector = (java.util.Vector) num.remove(0);
            tempObject = tempVector.remove(0);
            numEstadosPersona.add(tempObject);

            num = this.agente.select("SELECT COUNT(vacunado) FROM Persona WHERE vacunado=1", 1);
            tempVector = (java.util.Vector) num.remove(0);
            tempObject = tempVector.remove(0);
            numEstadosPersona.add(tempObject);

        } catch (Exception ex) {
            System.out.println(ex);
        }

        return numEstadosPersona;
    }

    public LinkedList<String> getEnfermedades() {

        Vector<Object> num = null;

        java.util.Vector tempVector;
        Object tempObject;
        LinkedList<String> enfermedades = new LinkedList();

        try {
            num = this.agente.select("SELECT Nombre FROM Enfermedad", 1);

            for (int i = 0; i < num.size(); i++) {
                tempVector = (java.util.Vector) num.get(i);
                tempObject = tempVector.remove(0);
                enfermedades.add(String.valueOf(tempObject));
            }

        } catch (Exception ex) {
            System.out.println(ex);
        }

        return enfermedades;
    }

    public LinkedList<String> getNumCampañaEnfermedad(String enfermedad) {

        Vector<Object> num = null;

        java.util.Vector tempVector;
        Object tempObject;
        LinkedList<String> numCampañiasEnfermedades = new LinkedList();

        try {
            num = this.agente.select("SELECT COUNT(ID) FROM `Campania` WHERE Tipo='Informativa' AND Nombre='"+enfermedad+"'", 1);
            tempVector = (java.util.Vector) num.get(0);
            tempObject = tempVector.remove(0);
            numCampañiasEnfermedades.add(String.valueOf(tempObject));
            
            num = this.agente.select("SELECT COUNT(ID) FROM `Campania` WHERE Tipo='Vacunacion' AND Nombre='"+enfermedad+"'", 1);
            tempVector = (java.util.Vector) num.get(0);
            tempObject = tempVector.remove(0);
            numCampañiasEnfermedades.add(String.valueOf(tempObject));

        } catch (Exception ex) {
            System.out.println(ex);
        }

        return numCampañiasEnfermedades;
    }
    
    
    public Vector getEvolucionEnfermedad(String Enfermedad) {
        Vector<Object> evolucion = null;
        try {
            evolucion = this.agente.select("SELECT Fecha,Contagios FROM Evolucion WHERE Enfermedad='"+Enfermedad+"' ORDER By Fecha DESC", 2);

        } catch (Exception ex) {
            System.out.println(ex);
        }
        return evolucion;
    }
    
    public LinkedList getEvolucionCuatrimestres(String enfermedad) {

        Vector<Object> num = null;

        java.util.Vector tempVector;
        Object tempObject;
        LinkedList evolucion = new LinkedList();

        try {
            //PARA 2020
            num = this.agente.select("SELECT COALESCE(SUM(Contagios),0) FROM `Evolucion` WHERE Enfermedad='"+enfermedad+"' AND Fecha >= '2020-01-01' AND Fecha < '2020-03-30'", 1);
            tempVector = (java.util.Vector) num.get(0);
            tempObject = tempVector.remove(0);
            evolucion.add(String.valueOf(tempObject));
            
            num = this.agente.select("SELECT COALESCE(SUM(Contagios),0) FROM `Evolucion` WHERE Enfermedad='"+enfermedad+"' AND Fecha >= '2020-03-30' AND Fecha < '2020-06-30'", 1);
            tempVector = (java.util.Vector) num.get(0);
            tempObject = tempVector.remove(0);
            evolucion.add(String.valueOf(tempObject));
            
            num = this.agente.select("SELECT COALESCE(SUM(Contagios),0) FROM `Evolucion` WHERE Enfermedad='"+enfermedad+"' AND Fecha >= '2020-06-30' AND Fecha < '2020-09-30'", 1);
            tempVector = (java.util.Vector) num.get(0);
            tempObject = tempVector.remove(0);
            evolucion.add(String.valueOf(tempObject));
            
            num = this.agente.select("SELECT COALESCE(SUM(Contagios),0) FROM `Evolucion` WHERE Enfermedad='"+enfermedad+"' AND Fecha >= '2020-09-01' AND Fecha < '2020-12-30'", 1);
            tempVector = (java.util.Vector) num.get(0);
            tempObject = tempVector.remove(0);
            evolucion.add(String.valueOf(tempObject));
            
            //PARA 2021
            num = this.agente.select("SELECT COALESCE(SUM(Contagios),0) FROM `Evolucion` WHERE Enfermedad='"+enfermedad+"' AND Fecha >= '2021-01-01' AND Fecha < '2021-03-30'", 1);
            tempVector = (java.util.Vector) num.get(0);
            tempObject = tempVector.remove(0);
            evolucion.add(String.valueOf(tempObject));
            
            num = this.agente.select("SELECT COALESCE(SUM(Contagios),0) FROM `Evolucion` WHERE Enfermedad='"+enfermedad+"' AND Fecha >= '2021-03-30' AND Fecha < '2021-06-30'", 1);
            tempVector = (java.util.Vector) num.get(0);
            tempObject = tempVector.remove(0);
            evolucion.add(String.valueOf(tempObject));
            
            num = this.agente.select("SELECT COALESCE(SUM(Contagios),0) FROM `Evolucion` WHERE Enfermedad='"+enfermedad+"' AND Fecha >= '2021-06-30' AND Fecha < '2021-09-30'", 1);
            tempVector = (java.util.Vector) num.get(0);
            tempObject = tempVector.remove(0);
            evolucion.add(String.valueOf(tempObject));
            
            num = this.agente.select("SELECT COALESCE(SUM(Contagios),0) FROM `Evolucion` WHERE Enfermedad='"+enfermedad+"' AND Fecha >= '2021-09-01' AND Fecha < '2021-12-30'", 1);
            tempVector = (java.util.Vector) num.get(0);
            tempObject = tempVector.remove(0);
            evolucion.add(String.valueOf(tempObject));

        } catch (Exception ex) {
            System.out.println(ex);
        }

        return evolucion;
    }
    
    public Vector getVacunasEnfermedades() {
        Vector<Object> evolucion = null;
        try {
            evolucion = this.agente.select("SELECT Nombre,Vacunas FROM Enfermedad ", 2);

        } catch (Exception ex) {
            System.out.println(ex);
        }
        return evolucion;
    }
    
    public Vector getAprovisionamientoVacunas() {
        Vector<Object> evolucion = null;
        try {
            evolucion = this.agente.select("SELECT Nombre, Cantidad FROM Aprovisionamiento", 2);

        } catch (Exception ex) {
            System.out.println(ex);
        }
        return evolucion;
    }
    
}
