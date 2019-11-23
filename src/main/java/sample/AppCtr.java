/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

/**
 *
 * @author marhoum
 */
public class AppCtr {

    public static void main(String[] args) {
        String variable1 = args[0];
        String variable2 = args[1];
        args[3] = sample.Utils.concatWords(variable1 + variable2);
        System.out.println("Resultat" + args[3]);
    }
}
