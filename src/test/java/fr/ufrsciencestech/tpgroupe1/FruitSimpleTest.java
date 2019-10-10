/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.tpgroupe1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mp861554
 */
public class FruitSimpleTest {
    
    private FruitSimple f1, f2, f3, f4, f5, f6;
    
    public FruitSimpleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws PrixNegatifException, Exception{
        f1= new Orange(15,"France");
        f2= new Orange(15,"France");
        f3= new Orange(13,"Suisse");
        f4= new Banane(13,"Suisse");
        f5= new Cerise(13,"Suisse");
        f6= new Cerise(12,"Suisse");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getPrix method, of class FruitSimple.
     */
    @Test
    public void testGetPrix() {
       
    }

    /**
     * Test of getOrigine method, of class FruitSimple.
     */
    @Test
    public void testGetOrigine() {
        
    }

    /**
     * Test of setPrix method, of class FruitSimple.
     */
    @Test
    public void testSetPrix() {
        
    }

    /**
     * Test of setOrigine method, of class FruitSimple.
     */
    @Test
    public void testSetOrigine() {
      
    }

    /**
     * Test of isSeedless method, of class FruitSimple.
     */
    @Test
    public void testIsSeedless() {
       
    }

    /**
     * Test of affiche method, of class FruitSimple.
     */
    @Test
    public void testAffiche() {
        
    }

    /**
     * Test of toString method, of class FruitSimple.
     */
    @Test
    public void testToString() {
        
    }

    /**
     * Test of equals method, of class FruitSimple.
     */
    @Test
    public void testEquals() {
        assertEquals(true,f2.equals(f1));
        assertEquals(false,f4.equals(f3));
       
    }

    public class FruitSimpleImpl extends FruitSimple {

        public String toString() {
            return "";
        }
    }
    
}
