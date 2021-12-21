/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package esi.uclm.gepi.Persistencia;

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
public class AgenteTest {
    
    public AgenteTest() {
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
     * Test of getAgente method, of class Agente.
     */
    @Test
    public void testGetAgente() throws Exception {
        System.out.println("getAgente");
        Agente expResult = null;
        Agente result = Agente.getAgente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of desconectar method, of class Agente.
     */
    @Test
    public void testDesconectar() throws Exception {
        System.out.println("desconectar");
        Agente instance = null;
        instance.desconectar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class Agente.
     */
    @Test
    public void testInsert() throws Exception {
        System.out.println("insert");
        String SQL = "";
        Agente instance = null;
        int expResult = 0;
        int result = instance.insert(SQL);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class Agente.
     */
    @Test
    public void testDelete() throws Exception {
        System.out.println("delete");
        String SQL = "";
        Agente instance = null;
        int expResult = 0;
        int result = instance.delete(SQL);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class Agente.
     */
    @Test
    public void testUpdate() throws Exception {
        System.out.println("update");
        String SQL = "";
        Agente instance = null;
        int expResult = 0;
        int result = instance.update(SQL);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of select method, of class Agente.
     */
    @Test
    public void testSelect() throws Exception {
        System.out.println("select");
        String SQL = "";
        int num = 0;
        Agente instance = null;
        Vector<Object> expResult = null;
        Vector<Object> result = instance.select(SQL, num);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
