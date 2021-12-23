/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esi.uclm.gepi.Dominio;

import esi.uclm.gepi.Persistencia.Agente;

/**
 *
 * @author alex_
 */
public class GestorAprovisionamiento {
    
    Agente agente;
    
    public GestorAprovisionamiento() throws Exception {
        this.agente = Agente.getAgente();
    }
    
    public int aniadirAprovisionamiento(String nombre, String num) throws Exception{
        Aprovisionamiento aprovisionamiento = new Aprovisionamiento();
        
        aprovisionamiento.setNombre(nombre);
        aprovisionamiento.setCantidad(Integer.parseInt(num));
        
        String consulta = "INSERT INTO Aprovisionamiento VALUES(null,'"+ aprovisionamiento.getNombre()+"',"+ aprovisionamiento.getCantidad() +")";
        
        int resultado = this.agente.insert(consulta);
        
        return resultado;
    }
    
}
