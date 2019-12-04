/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest.database;

import java.util.ArrayList;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dharma
 */
public class KategoriTest extends TestCase {

    Kategori instance;

    public KategoriTest() {
    }

    

    @Before
    public void setUp() {
        instance = new Kategori("Comics", "Comic is combination words and pictures");
        System.out.format("Start Testing : %s\n", this.getName());
    }

    @After
    public void tearDown() {
        System.out.format("Finish Test %s\n", this.getName());
    }

    /**
     * Test of setIdKategori method, of class Kategori.
     */
    

    /**
     * Test of getIdKategori method, of class Kategori.
     */
    

    /**
     * Test of setKeterangan method, of class Kategori.
     */
    

    /**
     * Test of getKeterangan method, of class Kategori.
     */
    

    /**
     * Test of setName method, of class Kategori.
     */
    

    /**
     * Test of getName method, of class Kategori.
     */
   
    /**
     * Test of getById method, of class Kategori.
     */
    

    /**
     * Test of getAll method, of class Kategori.
     */
    

    /**
     * Test of search method, of class Kategori.
     */
    @Test
    public void testSearch() {
        System.out.println("search test");
        String keyword = "Comics";
        ArrayList<Kategori> result = instance.search(keyword);
        ArrayList<Kategori> expResult = instance.getByNamaAndKeterangan(keyword, "");
        assertEquals(expResult.size(), result.size());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of save method, of class Kategori.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        instance.save();
        ArrayList<Kategori> expectedResult = instance.getByNamaAndKeterangan(instance.getName(), instance.getKeterangan());
        assertTrue(expectedResult.size() > 0);
    }

    

    /**
     * Test of toString method, of class Kategori.
     */
    

    /**
     * Test of delete method, of class Kategori.
     */
    

}
