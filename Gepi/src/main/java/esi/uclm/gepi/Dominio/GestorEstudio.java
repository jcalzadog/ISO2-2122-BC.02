/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esi.uclm.gepi.Dominio;

import esi.uclm.gepi.Persistencia.Agente;
import java.util.Vector;

/**
 *
 * @author alex_
 */
public class GestorEstudio {
    
    Agente agente;
    
    public GestorEstudio() throws Exception {
        this.agente = Agente.getAgente();
    }
    
    public Vector getEstudios(){
        
        Vector<Object> estudios = null;
        
        try {
            estudios = this.agente.select("SELECT es.ID, en.Nombre, c.Tipo, es.Municipio FROM Estudio es, Enfermedad en, Campania c WHERE es.Enfermedad = en.ID AND es.Campania = c.ID",4);
           
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
        return estudios;
        
    }
}
