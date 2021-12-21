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
public class PersonaTest {
    
    public PersonaTest() {
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
     * Test of getId method, of class Persona.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Persona instance = new Persona();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Persona.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Persona instance = new Persona();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Persona.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Persona instance = new Persona();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Persona.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Persona instance = new Persona();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getApellidos method, of class Persona.
     */
    @Test
    public void testGetApellidos() {
        System.out.println("getApellidos");
        Persona instance = new Persona();
        String expResult = "";
        String result = instance.getApellidos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setApellidos method, of class Persona.
     */
    @Test
    public void testSetApellidos() {
        System.out.println("setApellidos");
        String apellidos = "";
        Persona instance = new Persona();
        instance.setApellidos(apellidos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTelefono method, of class Persona.
     */
    @Test
    public void testGetTelefono() {
        System.out.println("getTelefono");
        Persona instance = new Persona();
        int expResult = 0;
        int result = instance.getTelefono();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTelefono method, of class Persona.
     */
    @Test
    public void testSetTelefono() {
        System.out.println("setTelefono");
        int telefono = 0;
        Persona instance = new Persona();
        instance.setTelefono(telefono);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechanac method, of class Persona.
     */
    @Test
    public void testGetFechanac() {
        System.out.println("getFechanac");
        Persona instance = new Persona();
        String expResult = "";
        String result = instance.getFechanac();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechanac method, of class Persona.
     */
    @Test
    public void testSetFechanac() {
        System.out.println("setFechanac");
        String fechanac = "";
        Persona instance = new Persona();
        instance.setFechanac(fechanac);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEnfermo method, of class Persona.
     */
    @Test
    public void testIsEnfermo() {
        System.out.println("isEnfermo");
        Persona instance = new Persona();
        boolean expResult = false;
        boolean result = instance.isEnfermo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEnfermo method, of class Persona.
     */
    @Test
    public void testSetEnfermo() {
        System.out.println("setEnfermo");
        boolean enfermo = false;
        Persona instance = new Persona();
        instance.setEnfermo(enfermo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isConfinado method, of class Persona.
     */
    @Test
    public void testIsConfinado() {
        System.out.println("isConfinado");
        Persona instance = new Persona();
        boolean expResult = false;
        boolean result = instance.isConfinado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setConfinado method, of class Persona.
     */
    @Test
    public void testSetConfinado() {
        System.out.println("setConfinado");
        boolean confinado = false;
        Persona instance = new Persona();
        instance.setConfinado(confinado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isAtencion method, of class Persona.
     */
    @Test
    public void testIsAtencion() {
        System.out.println("isAtencion");
        Persona instance = new Persona();
        boolean expResult = false;
        boolean result = instance.isAtencion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAtencion method, of class Persona.
     */
    @Test
    public void testSetAtencion() {
        System.out.println("setAtencion");
        boolean atencion = false;
        Persona instance = new Persona();
        instance.setAtencion(atencion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isSano method, of class Persona.
     */
    @Test
    public void testIsSano() {
        System.out.println("isSano");
        Persona instance = new Persona();
        boolean expResult = false;
        boolean result = instance.isSano();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSano method, of class Persona.
     */
    @Test
    public void testSetSano() {
        System.out.println("setSano");
        boolean sano = false;
        Persona instance = new Persona();
        instance.setSano(sano);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isCuarentena method, of class Persona.
     */
    @Test
    public void testIsCuarentena() {
        System.out.println("isCuarentena");
        Persona instance = new Persona();
        boolean expResult = false;
        boolean result = instance.isCuarentena();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCuarentena method, of class Persona.
     */
    @Test
    public void testSetCuarentena() {
        System.out.println("setCuarentena");
        boolean cuarentena = false;
        Persona instance = new Persona();
        instance.setCuarentena(cuarentena);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isVulnerable method, of class Persona.
     */
    @Test
    public void testIsVulnerable() {
        System.out.println("isVulnerable");
        Persona instance = new Persona();
        boolean expResult = false;
        boolean result = instance.isVulnerable();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVulnerable method, of class Persona.
     */
    @Test
    public void testSetVulnerable() {
        System.out.println("setVulnerable");
        boolean vulnerable = false;
        Persona instance = new Persona();
        instance.setVulnerable(vulnerable);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isVacunado method, of class Persona.
     */
    @Test
    public void testIsVacunado() {
        System.out.println("isVacunado");
        Persona instance = new Persona();
        boolean expResult = false;
        boolean result = instance.isVacunado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVacunado method, of class Persona.
     */
    @Test
    public void testSetVacunado() {
        System.out.println("setVacunado");
        boolean vacunado = false;
        Persona instance = new Persona();
        instance.setVacunado(vacunado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId_contactos method, of class Persona.
     */
    @Test
    public void testGetId_contactos() {
        System.out.println("getId_contactos");
        Persona instance = new Persona();
        String expResult = "";
        String result = instance.getId_contactos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId_contactos method, of class Persona.
     */
    @Test
    public void testSetId_contactos() {
        System.out.println("setId_contactos");
        String id_contactos = "";
        Persona instance = new Persona();
        instance.setId_contactos(id_contactos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Persona.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Persona instance = new Persona();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
