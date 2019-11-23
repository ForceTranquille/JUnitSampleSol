/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import static sample.Utils.concatWords;

/**
 *
 * @author marhoum
 */
public class AppCtr {

    public static void main(String[] args) {

        System.out.println(concatWords(args[1] ,args[0]));

    }
}
