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
public class GestorAprovisionamientoTest {
    
    public GestorAprovisionamientoTest() {
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
     * Test of aniadirAprovisionamiento method, of class GestorAprovisionamiento.
     */
    @Test
    public void testAniadirAprovisionamiento() throws Exception {
        System.out.println("aniadirAprovisionamiento");
        String nombre = "";
        String num = "";
        GestorAprovisionamiento instance = new GestorAprovisionamiento();
        int expResult = 0;
        int result = instance.aniadirAprovisionamiento(nombre, num);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
