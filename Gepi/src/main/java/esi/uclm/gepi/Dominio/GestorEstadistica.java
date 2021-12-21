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
    
    public Object getNumeroEnfermedades(){
        
        Vector<Object> numEnfermedades = null;
        java.util.Vector temp;
        Object numE;
        
        try {
            numEnfermedades = this.agente.select("SELECT COUNT(ID) FROM Enfermedad",1);
           
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
        temp = (java.util.Vector) numEnfermedades.remove(0);
        numE = temp.remove(0);
        return numE;
        
    }
    
    public LinkedList<Object> getNumeroPersonasEstados(){
        
        Vector<Object> num = null;
   
        java.util.Vector tempVector;
        Object tempObject;
        LinkedList<Object> numEstadosPersona = new LinkedList();
        
        try { 
            num = this.agente.select("SELECT COUNT(enfermo) FROM Persona WHERE enfermo=1",1);
            tempVector = (java.util.Vector) num.remove(0);
            tempObject = tempVector.remove(0);
            numEstadosPersona.add(tempObject);
            
            num = this.agente.select("SELECT COUNT(confinado) FROM Persona WHERE confinado=1",1);
            tempVector = (java.util.Vector) num.remove(0);
            tempObject = tempVector.remove(0);
            numEstadosPersona.add(tempObject);
            
            num = this.agente.select("SELECT COUNT(atencion) FROM Persona WHERE atencion=1",1);
            tempVector = (java.util.Vector) num.remove(0);
            tempObject = tempVector.remove(0);
            numEstadosPersona.add(tempObject);
            
            num = this.agente.select("SELECT COUNT(sano) FROM Persona WHERE sano=1",1);
            tempVector = (java.util.Vector) num.remove(0);
            tempObject = tempVector.remove(0);
            numEstadosPersona.add(tempObject);      
            
            num = this.agente.select("SELECT COUNT(cuarentena) FROM Persona WHERE cuarentena=1",1);
            tempVector = (java.util.Vector) num.remove(0);
            tempObject = tempVector.remove(0);
            numEstadosPersona.add(tempObject);     
            
            num = this.agente.select("SELECT COUNT(vulnerable) FROM Persona WHERE vulnerable=1",1);
            tempVector = (java.util.Vector) num.remove(0);
            tempObject = tempVector.remove(0);
            numEstadosPersona.add(tempObject);           
            
            num = this.agente.select("SELECT COUNT(vacunado) FROM Persona WHERE vacunado=1",1);
            tempVector = (java.util.Vector) num.remove(0);
            tempObject = tempVector.remove(0);
            numEstadosPersona.add(tempObject);
            
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
        return numEstadosPersona;
    }
    
    
    
}
