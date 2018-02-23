/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roulette;

/**
 *
 * @author bluebackdev
 */
public class RoulettePocket {
    public RoulettePocket(int pocket) {
        getPocketColor(pocket);
    }
    
    public static String getPocketColor(int pocket) {
        if(pocket == 0) {
            return "Green";
        }
        else if(pocket >= 1 && pocket <= 10) {
            if(pocket % 2 == 0)
                return "Black";
            else if(pocket % 2 == 1)
                return "Red";
        }
        else if(pocket >= 11 && pocket <= 18) {
            if(pocket % 2 == 0)
                return "Red";
            else if(pocket % 2 == 1)
                return "Black";
        }
        else if(pocket >= 19 && pocket <= 28) {
            if(pocket % 2 == 0)
                return "Black";
            else if(pocket % 2 == 1)
                return "Red";
        }
        else if(pocket >= 29 && pocket <= 36) {
            if(pocket % 2 == 0)
                return "Red";
            else if(pocket % 2 == 1)
                return "Black";
        }
        
        return "ERROR";
    }
}
