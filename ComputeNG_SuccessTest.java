/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */

import static org.testng.Assert.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Administrateur
 */
public class ComputeNGTest {
    
    public ComputeNGTest() {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        
    }

    @Test
    public void testSomeMethod() {
        int a = 9 , b= 4; 
        assertEquals(Compute.computeThat(a, b) , 0);
        assertEquals(Compute.computeThat(a, b) , 0);
        assertEquals(Compute.computeThat(a, b) , 0);
    }
    
}
