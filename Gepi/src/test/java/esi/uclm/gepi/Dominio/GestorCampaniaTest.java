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
public class GestorCampaniaTest {
    
    public GestorCampaniaTest() {
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
     * Test of getCampanias method, of class GestorCampania.
     */
    @Test
    public void testGetCampanias() {
        System.out.println("getCampanias");
        //GestorCampania instance = new GestorCampania();
        Vector expResult = null;
        //Vector result = instance.getCampanias();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of anadirCampania method, of class GestorCampania.
     */
    @Test
    public void testAnadirCampania() throws Exception {
        System.out.println("anadirCampania");
        String tipo = "";
        String nombre = "";
        String fecha = "";
        String coste = "";
        String tempo = "";
        String efec = "";
        GestorCampania instance = new GestorCampania();
        int expResult = 0;
        int result = instance.anadirCampania(tipo, nombre, fecha, coste, tempo, efec);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
