/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roulette;

import java.util.Scanner;
/**
 *
 * @author bluebackdev
 */
public class Roulette {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("0 " + RoulettePocket.getPocketColor(0));
        System.out.println("1 " + RoulettePocket.getPocketColor(1));
        System.out.println("2 " + RoulettePocket.getPocketColor(2));
        System.out.println("13 " + RoulettePocket.getPocketColor(13));
        System.out.println("14 " + RoulettePocket.getPocketColor(14));
        System.out.println("21 " + RoulettePocket.getPocketColor(21));
        System.out.println("22 " + RoulettePocket.getPocketColor(22));
        System.out.println("30 " + RoulettePocket.getPocketColor(30));
        System.out.println("31 " + RoulettePocket.getPocketColor(31));
        
        System.out.print("\nPlease enter a pocket number: ");
        System.out.println(RoulettePocket.getPocketColor(keyboard.nextInt()));
    }
    
}
