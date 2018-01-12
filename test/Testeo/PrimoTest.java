/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testeo;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marce
 */
public class PrimoTest {
    

    @Test
    public void testCalcularPrimo() {
        Primo NumPrimo = new Primo();
        assertTrue(NumPrimo.CalcularPrimo(4));
    }
    
}
