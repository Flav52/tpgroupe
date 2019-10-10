package fr.ufrsciencestech.tpgroupe1;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.*;
import static org.mockito.Mockito.*;

/**
 *
 * @author lm242188
 */
public class PanierTest {
    private static Panier p_plein3,p_vide3,p_presqueplein3,p_vide0,p_vide_2,p_1el3,p_plein3o;
    private static Orange mock_o1,mock_o2,mock_o3,o1,o2,o3;
    private static Banane mock_b1,mock_b2,mock_b3;
    
    public PanierTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() throws PrixNegatifException, Exception {
        p_vide3 = new Panier(3);
        mock_o1 = mock(Orange.class);
        mock_o2 = mock(Orange.class);
        mock_o3 = mock(Orange.class);
        mock_b1 = mock(Banane.class);
        mock_b2 = mock(Banane.class);
        mock_b3 = mock(Banane.class);
        when(mock_o1.getPrix()).thenReturn(0.5);
        when(mock_o2.getPrix()).thenReturn(0.4);  
        when(mock_o3.getPrix()).thenReturn(0.8);
        when(mock_b1.getPrix()).thenReturn(0.4);
        when(mock_b2.getPrix()).thenReturn(0.5);  
        when(mock_b3.getPrix()).thenReturn(0.7);
        p_vide0 = new Panier(0);
        p_vide_2 = new Panier(-2);
        p_1el3 = new Panier(3);
        p_1el3.ajoute(mock_o1);
        p_plein3 = new Panier(3);
        p_plein3.ajoute(mock_o1);
        p_plein3.ajoute(mock_o1);
        p_plein3.ajoute(mock_o1);
        /*o1 = new Orange(0.5,"France");
        o2 = new Orange(0.4,"Espagne");
        o3 = new Orange(0.8,"Italie");
        p_plein3o = new Panier(3);
        p_plein3o.ajoute(o1);
        p_plein3o.ajoute(o2);
        p_plein3o.ajoute(o3);
        */
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

    @Test
    public void testGetListe() {
        
    }

    @Test
    public void testSetListe() {
        
    }

    @Test
    public void testGetMax() {
        
    }

    @Test
    public void testGetNbElements() {
        
    }

    @Test
    public void testEstPlein() {
        
    }

    @Test
    public void testEstVide() {
        
    }

    @Test
    public void testAjoutePanierVideOrange() throws PanierPleinException {
        p_vide3.ajoute(mock_o1);
        assertEquals(p_vide3.getListe().get(0),mock_o1);
    }
    



    @Test (expected=PanierPleinException.class)
    public void testAjoutePanierPlein() throws PanierPleinException {
        p_plein3.ajoute(mock_o1);
    }
    
   
    
    /*@Test
    public void testAjoutePanierVideSansParam() throws PanierPleinException {
        p_vide3.ajoute();
        assertTrue(p_vide3.getNbElements() == 1);
    }*/

    @Test (expected=PanierPleinException.class)
    public void testAjoutePanierPleinSansParam() throws PanierPleinException {
        p_plein3.ajoute();
    }

    @Test (expected=PanierVideException.class)
    public void testRetirePanierVide() throws PanierVideException {
        p_vide3.retire();
    }


    @Test
    public void testGetPrixPanierVideContMax3() {
        assertTrue(p_vide3.getPrix()==0);
    }

    @Test (expected=PanierPleinException.class)
    public void testAjoute2Fruits() throws PanierPleinException {
        p_vide3.ajoute(mock_o1);
        p_vide3.ajoute(mock_o2);
        assertTrue(p_vide3.getNbElements()==2);
    }
    
      @Test 
    public void testGetPrixPanierPlein3Elements() {
        assertTrue(p_plein3.getPrix()==(mock_o1.getPrix()+mock_o1.getPrix()+mock_o1.getPrix()));
        verify(mock_o1,times(6)).getPrix();
    }
    
    @Test
    public void testBoycottOrigine() {
        
    }

    @Test
    public void testToString() {
        
    }

    @Test
    public void testAffiche() {
        
    }

    @Test
    public void testEquals() {
        
    }
    
}
