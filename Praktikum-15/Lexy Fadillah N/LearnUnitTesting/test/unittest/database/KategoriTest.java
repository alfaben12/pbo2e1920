/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest.database;

import java.sql.ResultSet;
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
 * @author asus
 */
public class KategoriTest extends TestCase {
    
    Kategori instance;
    
    public KategoriTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new Kategori("Comics", "Comic is combination words and pictures");
        System.out.format("Start Testing : %s \n", this.getName());
    }
    
    @After
    public void tearDown() {
        System.out.format("Finish test %s\n", this.getName());
    }
    
    @Test
    public void testSave(){
        System.out.println("save test");
        this.instance.save();
        ArrayList<Kategori> expResult = instance.getByNamaAndKeterangan(instance.getNama(), instance.getKeterangan());
        assertTrue(expResult.size()>0);
    }
    @Test
    public void testSearch(){
        System.out.println("search test");
        String keyword = "Comics";
        ArrayList<Kategori> result = instance.search(keyword);
        ArrayList<Kategori> expResult = instance.getByNamaAndKeterangan(keyword, "");
        assertEquals(expResult.size(), result.size());
    }
    /**
     * Test of setIdkategori method, of class Kategori.
     */
//    @Test
//    public void testSetIdkategori() {
//        System.out.println("setIdkategori");
//        int idkategori = 0;
//        Kategori instance = new Kategori();
//        instance.setIdkategori(idkategori);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setNama method, of class Kategori.
//     */
//    @Test
//    public void testSetNama() {
//        System.out.println("setNama");
//        String nama = "";
//        Kategori instance = new Kategori();
//        instance.setNama(nama);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setKeterangan method, of class Kategori.
//     */
//    @Test
//    public void testSetKeterangan() {
//        System.out.println("setKeterangan");
//        String keterangan = "";
//        Kategori instance = new Kategori();
//        instance.setKeterangan(keterangan);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getIdkategori method, of class Kategori.
//     */
//    @Test
//    public void testGetIdkategori() {
//        System.out.println("getIdkategori");
//        Kategori instance = new Kategori();
//        int expResult = 0;
//        int result = instance.getIdkategori();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getNama method, of class Kategori.
//     */
//    @Test
//    public void testGetNama() {
//        System.out.println("getNama");
//        Kategori instance = new Kategori();
//        String expResult = "";
//        String result = instance.getNama();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getKeterangan method, of class Kategori.
//     */
//    @Test
//    public void testGetKeterangan() {
//        System.out.println("getKeterangan");
//        Kategori instance = new Kategori();
//        String expResult = "";
//        String result = instance.getKeterangan();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getById method, of class Kategori.
//     */
//    @Test
//    public void testGetById() {
//        System.out.println("getById");
//        int id = 0;
//        Kategori instance = new Kategori();
//        Kategori expResult = null;
//        Kategori result = instance.getById(id);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getAll method, of class Kategori.
//     */
//    @Test
//    public void testGetAll() {
//        System.out.println("getAll");
//        Kategori instance = new Kategori();
//        ArrayList<Kategori> expResult = null;
//        ArrayList<Kategori> result = instance.getAll();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of search method, of class Kategori.
//     */
//    @Test
//    public void testSearch() {
//        System.out.println("search");
//        String keyword = "";
//        Kategori instance = new Kategori();
//        ArrayList<Kategori> expResult = null;
//        ArrayList<Kategori> result = instance.search(keyword);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of save method, of class Kategori.
//     */
//    @Test
//    public void testSave() {
//        System.out.println("save");
//        Kategori instance = new Kategori();
//        instance.save();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of delete method, of class Kategori.
//     */
//    @Test
//    public void testDelete() {
//        System.out.println("delete");
//        Kategori instance = new Kategori();
//        instance.delete();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
