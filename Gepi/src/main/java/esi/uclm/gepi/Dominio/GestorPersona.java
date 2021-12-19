/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esi.uclm.gepi.Dominio;

import Persistencia.Agente;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Enrique
 */
public class GestorPersona {
    Agente agente;
    
    public GestorPersona(){
        try {
            this.agente = Agente.getAgente();
        } catch (Exception ex) {
            Logger.getLogger(GestorPersona.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public Vector getPersonas(){   
        Vector<Object> personas = null;
        try {
            personas = this.agente.select("SELECT * FROM Persona",13);
            
        } catch (Exception ex) {
            System.out.println(ex);
        }     
        return personas;  
    }
     
    public void insertarPersona( int id, String nombre,String apellidos,int telefono,String fechanac,boolean enfermo, 
            boolean confinado, boolean atencion, boolean sano, boolean cuarentena,boolean vulnerable,boolean vacunado,
            String id_contactos) throws Exception{
        
       String sql = "INSERT INTO Persona VALUES ("+id+",'"+nombre+"','"+apellidos+"',"+telefono+",'"+fechanac+"',"+enfermo+","+
               confinado+","+atencion+","+sano+","+cuarentena+","+vulnerable+","+vacunado+",'"+id_contactos+"')";
       this.agente.insert(sql);
    }
}
