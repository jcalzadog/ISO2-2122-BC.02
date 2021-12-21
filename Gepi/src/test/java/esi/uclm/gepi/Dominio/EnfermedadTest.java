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
public class EnfermedadTest {
    
    public EnfermedadTest() {
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
     * Test of getNombre method, of class Enfermedad.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Enfermedad instance = new Enfermedad("Covid",null, 0, "", false, null);
        String expResult = "Covid";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Enfermedad.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "Covid";
        Enfermedad instance = new Enfermedad();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSintomas method, of class Enfermedad.
     */
    @Test
    public void testGetSintomas() {
        System.out.println("getSintomas");
        Enfermedad instance = new Enfermedad("Covid",null, 0,"", false, null);
        String[] expResult = null;
        String[] result = instance.getSintomas();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of setSintomas method, of class Enfermedad.
     */
    @Test
    public void testSetSintomas() {
        System.out.println("setSintomas");
        String[] sintomas = null;
        Enfermedad instance = new Enfermedad();
        instance.setSintomas(sintomas);
    }

    /**
     * Test of getTemporalidad method, of class Enfermedad.
     */
    @Test
    public void testGetTemporalidad() {
        System.out.println("getTemporalidad");
        Enfermedad instance = new Enfermedad("Covid",null, 12,"", false, null);
        int expResult = 12;
        int result = instance.getTemporalidad();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTemporalidad method, of class Enfermedad.
     */
    @Test
    public void testSetTemporalidad() {
        System.out.println("setTemporalidad");
        int temporalidad = 0;
        Enfermedad instance = new Enfermedad();
        instance.setTemporalidad(temporalidad);
    }

    /**
     * Test of getMedicinas method, of class Enfermedad.
     */
    @Test
    public void testGetMedicinas() {
        System.out.println("getMedicinas");
        Enfermedad instance = new Enfermedad("Covid",null, 0,"Paracetamol", false, null);
        String expResult = "Paracetamol";
        String result = instance.getMedicinas();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMedicinas method, of class Enfermedad.
     */
    @Test
    public void testSetMedicinas() {
        System.out.println("setMedicinas");
        String medicinas = "Paracetamol";
        Enfermedad instance = new Enfermedad();
        instance.setMedicinas(medicinas);
    }

    /**
     * Test of isConfinamiento method, of class Enfermedad.
     */
    @Test
    public void testIsConfinamiento() {
        System.out.println("isConfinamiento");
        Enfermedad instance = new Enfermedad("Covid",null, 12,"", false, null);
        boolean expResult = false;
        boolean result = instance.isConfinamiento();
        assertEquals(expResult, result);
    }

    /**
     * Test of setConfinamiento method, of class Enfermedad.
     */
    @Test
    public void testSetConfinamiento() {
        System.out.println("setConfinamiento");
        boolean confinamiento = false;
        Enfermedad instance = new Enfermedad();
        instance.setConfinamiento(confinamiento);
    }

    /**
     * Test of getVacunas method, of class Enfermedad.
     */
    @Test
    public void testGetVacunas() {
        System.out.println("getVacunas");
        Enfermedad instance = new Enfermedad("Covid",null, 12,"", false, null);
        String[] expResult = null;
        String[] result = instance.getVacunas();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of setVacunas method, of class Enfermedad.
     */
    @Test
    public void testSetVacunas() {
        System.out.println("setVacunas");
        String[] vacunas = null;
        Enfermedad instance = new Enfermedad();
        instance.setVacunas(vacunas);
    }  
}
