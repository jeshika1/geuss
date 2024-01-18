/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.geussinggame;

/**
 *
 * @author Dell
 */
import javax.swing.*;
public class Geussinggame {

    public static void main(String[] args) {
       int computerNumber = 5;
       int userAnswer = 0;
       System.out.println("The correct guess would be " + computerNumber);
       int count = 1;
       
       while(userAnswer != computerNumber){
           String response = JOptionPane.showInputDialog(null,"Enter a geuss between 1 and 100","guessing game", 3 );
           userAnswer = Integer.parseInt(response);
           JOptionPane.showMessageDialog(null,""+ determineGuess(userAnswer, computerNumber, count));
           count++;
       }
    }
    public static String determineGuess(int userAnswer, int computerNumber, int count){
   if (userAnswer <=0 || userAnswer>100){
       return "your guess is invalid";
   }     
   else if (userAnswer == computerNumber){
       return "correct!\n Total Guesses:"+count;
   }
   else if(userAnswer > computerNumber){
       return "your guess is too high,try again"+count;
   }
   else if(userAnswer < computerNumber){
       return "your guess is too low, try again"+count;
   }
   else{
       return "your guess is incorrect\n Try again"+count;
   }
    }
    
}
