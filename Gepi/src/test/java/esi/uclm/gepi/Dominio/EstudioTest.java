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
public class EstudioTest {
    
    public EstudioTest() {
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
     * Test of getEnfermedad method, of class Estudio.
     */
    @Test
    public void testGetEnfermedad() {
        System.out.println("getEnfermedad");
        Estudio instance = new Estudio();
        Enfermedad expResult = null;
        Enfermedad result = instance.getEnfermedad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEnfermedad method, of class Estudio.
     */
    @Test
    public void testSetEnfermedad() {
        System.out.println("setEnfermedad");
        Enfermedad enfermedad = null;
        Estudio instance = new Estudio();
        instance.setEnfermedad(enfermedad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCampaniaVacunacion method, of class Estudio.
     */
    @Test
    public void testGetCampaniaVacunacion() {
        System.out.println("getCampaniaVacunacion");
        Estudio instance = new Estudio();
        Campania expResult = null;
        Campania result = instance.getCampaniaVacunacion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCampaniaVacunacion method, of class Estudio.
     */
    @Test
    public void testSetCampaniaVacunacion() {
        System.out.println("setCampaniaVacunacion");
        Campania campaniaVacunacion = null;
        Estudio instance = new Estudio();
        instance.setCampaniaVacunacion(campaniaVacunacion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMunicipio method, of class Estudio.
     */
    @Test
    public void testGetMunicipio() {
        System.out.println("getMunicipio");
        Estudio instance = new Estudio();
        String expResult = "";
        String result = instance.getMunicipio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMunicipio method, of class Estudio.
     */
    @Test
    public void testSetMunicipio() {
        System.out.println("setMunicipio");
        String municipio = "";
        Estudio instance = new Estudio();
        instance.setMunicipio(municipio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Estudio.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Estudio instance = new Estudio();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
