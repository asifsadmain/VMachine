/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statepatternex;

import java.util.Scanner;

/**
 *
 * @author asif
 */
public class StatePatternEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DrinkWithoutChange initialState = new DrinkWithoutChange();
        Drinks pepsi = new Drinks("Pepsi", 3, 40, initialState);
        Drinks fanta = new Drinks("Fanta", 2, 50, initialState);
        Drinks dew = new Drinks("Mountain Dew", 3, 60, initialState);
        Drinks myDrink = new Drinks();
        VendingMachine vm = new VendingMachine(initialState);
        Scanner input = new Scanner(System.in);
        int cash, choice;
//First time press
        while(true){
            System.out.println("\nAvailable Drinks:");
            System.out.println("1.Pepsi  2.Fanta  3.Mountain Dew");
            System.out.println("Please press the corresponding number of the drinks mentioned above:");
            choice = input.nextInt();
            System.out.println("Please deposit money now!");
            cash = input.nextInt();
            if(choice==1){
                myDrink = pepsi;
            }
            else if(choice==2){
                myDrink = fanta;
            }
            else if(choice==3){
                myDrink = dew;
            }
            myDrink.pressButton(vm, myDrink, cash);
        }
    }

}
