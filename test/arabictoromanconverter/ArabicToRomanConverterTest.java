/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arabictoromanconverter;

import arabictoromanconverter.ArabicToRomanConverter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lipa
 */
public class ArabicToRomanConverterTest {
    
    private static ArabicToRomanConverter testInstance;
    
    
    public ArabicToRomanConverterTest() {
    }
    
    
    
    /*
    @Before
    public void makeTestInstance1(){
        testInstance = new ArabicToRomanConverter();
    }
    
    @After
    public void destroyTestInstance(){
        testInstance = null;
    }
    */
    

    /**
     * Test of makeRomanFromArabian method, of class ArabicToRomanConverter.
     */
    @Test
    public void testMakeRomanFromArabian() {
        
        testInstance = new ArabicToRomanConverter();
        
        assertEquals("I", testInstance.makeRomanFromArabian(1));
        assertEquals("II", testInstance.makeRomanFromArabian(2));
        assertEquals("III", testInstance.makeRomanFromArabian(3));
        assertEquals("IV", testInstance.makeRomanFromArabian(4));
        assertEquals("V", testInstance.makeRomanFromArabian(5));
        assertEquals("VI", testInstance.makeRomanFromArabian(6));
        assertEquals("VII", testInstance.makeRomanFromArabian(7));
        assertEquals("VIII", testInstance.makeRomanFromArabian(8));
        assertEquals("IX", testInstance.makeRomanFromArabian(9));
        assertEquals("X", testInstance.makeRomanFromArabian(10));
        
        assertEquals("L", testInstance.makeRomanFromArabian(50));
        
        assertEquals("XCIX", testInstance.makeRomanFromArabian(99));      
        assertEquals("CCLXXXIII", testInstance.makeRomanFromArabian(283));
        
        assertEquals("D", testInstance.makeRomanFromArabian(500));
        
        assertEquals("MCMLXXXVIII", testInstance.makeRomanFromArabian(1988));        
        assertEquals("MMMCMXCIX", testInstance.makeRomanFromArabian(3999));
        
        assertEquals(ArabicToRomanConverter.INCORRECT_ENTER, testInstance.makeRomanFromArabian(-50));
        assertEquals(ArabicToRomanConverter.INCORRECT_ENTER, testInstance.makeRomanFromArabian(5000));
        
        
    }
    
}
