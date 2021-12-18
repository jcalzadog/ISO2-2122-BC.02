/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esi.uclm.gepi.Dominio;

import Persistencia.Agente;
import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author alex_
 */
public class GestorEnfermedades {
    
    Agente agente;

    public GestorEnfermedades() throws Exception {
        this.agente = Agente.getAgente();
    }
    
    public Vector getEnfermedades(){
        
        Vector<Object> enfermedades = null;
        
        try {
            enfermedades = this.agente.select("SELECT * FROM Enfermedad",7);
           
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
        return enfermedades;
        
    }
    
}
