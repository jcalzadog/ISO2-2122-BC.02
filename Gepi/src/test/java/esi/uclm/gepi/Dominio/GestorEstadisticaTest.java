/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package esi.uclm.gepi.Dominio;

import java.util.LinkedList;
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
public class GestorEstadisticaTest {
    
    public GestorEstadisticaTest() {
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
     * Test of getNumeroEnfermedades method, of class GestorEstadistica.
     */
    @Test
    public void testGetNumeroEnfermedades() {
        System.out.println("getNumeroEnfermedades");
        GestorEstadistica instance = new GestorEstadistica();
        Object expResult = null;
        Object result = instance.getNumeroEnfermedades();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumeroPersonasEstados method, of class GestorEstadistica.
     */
    @Test
    public void testGetNumeroPersonasEstados() {
        System.out.println("getNumeroPersonasEstados");
        GestorEstadistica instance = new GestorEstadistica();
        LinkedList<Object> expResult = null;
        LinkedList<Object> result = instance.getNumeroPersonasEstados();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEnfermedades method, of class GestorEstadistica.
     */
    @Test
    public void testGetEnfermedades() {
        System.out.println("getEnfermedades");
        GestorEstadistica instance = new GestorEstadistica();
        LinkedList<String> expResult = null;
        LinkedList<String> result = instance.getEnfermedades();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumCampaniaEnfermedad method, of class GestorEstadistica.
     */
    @Test
    public void testGetNumCampaniaEnfermedad() {
        System.out.println("getNumCampaniaEnfermedad");
        String enfermedad = "";
        GestorEstadistica instance = new GestorEstadistica();
        LinkedList<String> expResult = null;
        LinkedList<String> result = instance.getNumCampaniaEnfermedad(enfermedad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEvolucionEnfermedad method, of class GestorEstadistica.
     */
    @Test
    public void testGetEvolucionEnfermedad() {
        System.out.println("getEvolucionEnfermedad");
        String Enfermedad = "";
        GestorEstadistica instance = new GestorEstadistica();
        Vector expResult = null;
        Vector result = instance.getEvolucionEnfermedad(Enfermedad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEvolucionCuatrimestres method, of class GestorEstadistica.
     */
    @Test
    public void testGetEvolucionCuatrimestres() {
        System.out.println("getEvolucionCuatrimestres");
        String enfermedad = "";
        GestorEstadistica instance = new GestorEstadistica();
        LinkedList expResult = null;
        LinkedList result = instance.getEvolucionCuatrimestres(enfermedad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVacunasEnfermedades method, of class GestorEstadistica.
     */
    @Test
    public void testGetVacunasEnfermedades() {
        System.out.println("getVacunasEnfermedades");
        GestorEstadistica instance = new GestorEstadistica();
        Vector expResult = null;
        Vector result = instance.getVacunasEnfermedades();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAprovisionamientoVacunas method, of class GestorEstadistica.
     */
    @Test
    public void testGetAprovisionamientoVacunas() {
        System.out.println("getAprovisionamientoVacunas");
        GestorEstadistica instance = new GestorEstadistica();
        Vector expResult = null;
        Vector result = instance.getAprovisionamientoVacunas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
