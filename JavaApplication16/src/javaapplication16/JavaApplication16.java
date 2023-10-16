/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication16;

/**
 *
 * @author 24dom
 */
public class JavaApplication16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int count, k, n;
        for (k = 1; k < 11; k++) {
            count = 0;
            for (n = 2; n <= k; n++) {
                if (n % k == 0) {
                    count++;
                }

            }
            if (count > 1) {
                System.out.println(k);
            }

        }
    }

}
