/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testeo;

import java.util.Scanner;

/**
 *
 * @author marce
 */
public class Primo {

    public boolean CalcularPrimo(int n) {

        int a = 0;
        for (int i = 1; i < (n + 1); i++) {
            if (n % i == 0) {
                a++;
            }
        }
        return a == 2;

    }

}
