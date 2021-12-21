/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package esi.uclm.gepi.Dominio;

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
public class CampaniaTest {
    
    public CampaniaTest() {
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
     * Test of getTipo method, of class Campania.
     */
    @Test
    public void testGetTipo() {
        System.out.println("getTipo");
        Campania instance = new Campania();
        String expResult = null;
        String result = instance.getTipo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTipo method, of class Campania.
     */
    @Test
    public void testSetTipo() {
        System.out.println("setTipo");
        String tipo = "";
        Campania instance = new Campania();
        instance.setTipo(tipo);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Campania.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Campania instance = new Campania();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Campania.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Campania instance = new Campania();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFecha method, of class Campania.
     */
    @Test
    public void testGetFecha() {
        System.out.println("getFecha");
        Campania instance = new Campania();
        String expResult = "";
        String result = instance.getFecha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFecha method, of class Campania.
     */
    @Test
    public void testSetFecha() {
        System.out.println("setFecha");
        String fecha = "";
        Campania instance = new Campania();
        instance.setFecha(fecha);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCoste method, of class Campania.
     */
    @Test
    public void testGetCoste() {
        System.out.println("getCoste");
        Campania instance = new Campania();
        double expResult = 0.0;
        double result = instance.getCoste();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCoste method, of class Campania.
     */
    @Test
    public void testSetCoste() {
        System.out.println("setCoste");
        double coste = 0.0;
        Campania instance = new Campania();
        instance.setCoste(coste);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTemporalidad method, of class Campania.
     */
    @Test
    public void testGetTemporalidad() {
        System.out.println("getTemporalidad");
        Campania instance = new Campania();
        int expResult = 0;
        int result = instance.getTemporalidad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTemporalidad method, of class Campania.
     */
    @Test
    public void testSetTemporalidad() {
        System.out.println("setTemporalidad");
        int temporalidad = 0;
        Campania instance = new Campania();
        instance.setTemporalidad(temporalidad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEfectividad method, of class Campania.
     */
    @Test
    public void testGetEfectividad() {
        System.out.println("getEfectividad");
        Campania instance = new Campania();
        double expResult = 0.0;
        double result = instance.getEfectividad();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEfectividad method, of class Campania.
     */
    @Test
    public void testSetEfectividad() {
        System.out.println("setEfectividad");
        double efectividad = 0.0;
        Campania instance = new Campania();
        instance.setEfectividad(efectividad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Campania.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Campania instance = new Campania();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
