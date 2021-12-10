/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dominio;


public class Iteracion1 {
    
    public static void main(String args[]){
        
        String []  vacuna1 = {"Pfizer","Moderna","Janssen"};
        String [] sintomas1 = {"Tos","Anginas","Fiebre"};
        String []  vacuna2 = {"Intanza","Fluarix","Gripavac"};
        String [] sintomas3 = {"Tos con sangre","Dolor al respirar","Escalofrios"};
        String []  vacuna3 = {"Bcg"};
        
        Enfermedad e_covid = new Enfermedad("Covid",sintomas1,15,"Ninguna",true,vacuna1);
        Enfermedad e_gripe = new Enfermedad("Gripe",sintomas1,7,"Paracetamol",true,vacuna2);
        Enfermedad e_tuberculosis = new Enfermedad("Tuberculosis",sintomas3,40,"Etanbutol",true,vacuna3);
        
        
        Campania c_covid = new Campania("Vacunacion","Covid","1/12/2020",500000000.0,300,75.4);
        Campania c_covid1 = new Campania("Informativa","Covid","1/03/2020",200000000.0,360,50);
        Campania c_gripe = new Campania("Vacunación","Gripe","1/09/2020",9000000.0,90,90);
        
        Estudio s_covid = new Estudio(e_covid,c_covid,"Daimiel");
        Estudio s_covid1 = new Estudio(e_covid,c_covid1,"Ciudad Real");
        Estudio s_gripe = new Estudio(e_gripe,c_gripe,"Miguelturra");
        
       
    }
    
}
