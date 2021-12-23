/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package esi.uclm.gepi.Dominio;

import java.util.Vector;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 05739349
 */
public class GestorPersonaTest {
    
    public GestorPersonaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getPersonas method, of class GestorPersona.
     */
    @Test
    public void testGetPersonas_0args() {
        System.out.println("getPersonas");
        GestorPersona instance = new GestorPersona();
        Vector expResult = null;
        Vector result = instance.getPersonas();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPersonas method, of class GestorPersona.
     */
    @Test
    public void testGetPersonas_int() {
        System.out.println("getPersonas");
        int id = 0;
        GestorPersona instance = new GestorPersona();
        Vector expResult = null;
        Vector result = instance.getPersonas(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of getContactos method, of class GestorPersona.
     */
    @Test
    public void testGetContactos() {
        System.out.println("getContactos");
        int id = 1;
        GestorPersona instance = new GestorPersona();
        Vector expResult = null;
        Vector result = instance.getContactos(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of insertarPersona method, of class GestorPersona.
     */
    @Test
    public void testInsertarPersona() throws Exception {
        System.out.println("insertarPersona");
        int id = 0;
        String nombre = "";
        String apellidos = "";
        int telefono = 0;
        String fechanac = "2021-12-10";
        boolean enfermo = false;
        boolean confinado = false;
        boolean atencion = false;
        boolean sano = false;
        boolean cuarentena = false;
        boolean vulnerable = false;
        boolean vacunado = false;
        String id_contactos = "";
        GestorPersona instance = new GestorPersona();
        instance.insertarPersona(id, nombre, apellidos, telefono, fechanac, enfermo, confinado, atencion, sano, cuarentena, vulnerable, vacunado, id_contactos);
    }

    /**
     * Test of insertarContactos method, of class GestorPersona.
     */
    @Test
    public void testInsertarContactos() throws Exception {
        System.out.println("insertarContactos");
        int id = 0;
        int identificadores = 0;
        GestorPersona instance = new GestorPersona();
        instance.insertarContactos(id, identificadores);
    }
    
}
