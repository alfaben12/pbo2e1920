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
public class AnggotaTest extends TestCase{

    Anggota instance;

    public AnggotaTest() {
    }

    @Before
    public void setUp() {
        instance = new Anggota("Rez4", "Jl. Soehatt" , "081231425543");
        System.out.format("Start testing : %s\n", this.getName());
    }

    @After
    public void tearDown() {
        System.out.format("Finish Test %s\n", this.getName());
    }

    /**
     * Test of setIdAnggota method, of class Anggota.
     */
    /**
     * Test of getIdAnggota method, of class Anggota.
     */
    /**
     * Test of search method, of class Anggota.
     */
    @Test
    public void testSearch() {
        System.out.println("search test");
        String keyword = "Rez4";
        ArrayList<Anggota> result = instance.search(keyword);
        ArrayList<Anggota> expResult = instance.getByNamaAlamatAndTelepon(instance.getNama(), "", "");
        assertEquals(expResult.size(), result.size());
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of save method, of class Anggota.
     */
    @Test
    public void testSave() {
        System.out.println("save test");
        instance.save();
        ArrayList<Anggota> expResult = instance.getByNamaAlamatAndTelepon(instance.getNama(), instance.getAlamat(), instance.getTelepon());
        assertTrue(expResult.size() > 0);
        // TODO review the generated test code and remove the default call to fail.

    }
}
