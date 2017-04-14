package edu.lifeGame.logic;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fy5464yl
 */
public class Career {


      
  /* if the opponent owns the matching career card pay the opponent the amount on
    the space.
    if you own the matching career card pay nothing
    if no player owns this card pay the bank
    for example if you land on the ski accident space you have to pay the doctor 
    the amount on the card*/
    
    public static String getCareer(int spinValue) {
        
        /*pass the player object so you can set what career*/
        if (spinValue == 1) {
            return "Sales Person";
        } else if (spinValue == 2) {
            return "Police Officer";
        } else if (spinValue == 3) {
            return "Travel Agent";
        } else if (spinValue == 4) {
            return "Artist";
        } else if (spinValue == 5) {
            return "Accountant";

        } else if (spinValue == 6) {
            return "Super Star";
        } else if (spinValue == 7) {
            return "Teacher";

        } else if (spinValue == 8) {
            return "Doctor";

        } else if (spinValue == 9) {
            return "Athlete";

        } else {
            return "Programmer";
        }

    }
    
    
    
}
