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
        
        Vector<Object> numConfinados = null;
   
        java.util.Vector tempVector;
        Object tempObject;
        LinkedList<Object> numEstadosPersona = new LinkedList();
        
        try {
            numConfinados = this.agente.select("SELECT COUNT(confinado) FROM Persona WHERE confinado=1",1);
            tempVector = (java.util.Vector) numConfinados.remove(0);
            tempObject = tempVector.remove(0);
            numEstadosPersona.add(tempObject);
           
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
        
        
        return numEstadosPersona;
        
    }
    
    
    
}
