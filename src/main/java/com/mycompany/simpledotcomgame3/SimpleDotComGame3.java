/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.simpledotcomgame3;

/**
 *
 * @author nicho
 */
public class SimpleDotComGame3 {

    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();
        int [ ] locations = {2,3,4};
        dot.setLocationCells(locations);
        String userGuess = "2"; 
        String result = dot.checkYourself(userGuess);
    }
}
