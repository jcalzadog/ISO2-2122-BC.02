/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esi.uclm.gepi.Dominio;

import Persistencia.Agente;
import java.util.Vector;

/**
 *
 * @author alex_
 */
public class GestorCampania {
    
     Agente agente;
    
    public GestorCampania() throws Exception {
        this.agente = Agente.getAgente();
    }
    
    public Vector getCampanias(){
        
        Vector<Object> campanias = null;
        
        try {
            campanias = this.agente.select("SELECT * FROM Campania",7);
           
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
        return campanias;
        
    }
    
}
