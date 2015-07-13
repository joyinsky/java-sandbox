/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava;

/**
 *
 * @author luisfernando
 */
public class ArrayDemo {
    public ArrayDemo() {
        int[] anArray = {
            100, 200, 300,
            400, 500, 600, 
            700, 800, 900, 1000
        };
        
        for (int n=0; n < anArray.length; n++) {
            System.out.println(n + " " + anArray[n]);
        }
    }
}
