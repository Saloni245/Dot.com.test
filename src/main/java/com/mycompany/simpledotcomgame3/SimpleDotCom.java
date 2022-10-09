/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simpledotcomgame3;

/**
 *
 * @author nicho
 */
public class SimpleDotCom {
    int [] locationsCells; 
    int numOfHits = 0 ; 
 
 public void setLocationCells(int[]locs){
        locationsCells =locs ;
     
 }
    
   public String checkYourself(String stringGuees){
         int guess = Integer.parseInt(stringGuees);
         String result ="miss";
       
          for( int cell : locationsCells){
            if (guess == cell){
                result ="hit";
                numOfHits++;
                break;
            }
   }
            if(numOfHits == locationsCells.length ){
                result = " kill"; 
            }
                
             System.out.println("result");
              return result; 
        }
        
        
    }
    
    
    
    
    
    
    

