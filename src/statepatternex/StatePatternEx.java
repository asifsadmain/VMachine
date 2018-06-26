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
        VendingMachine vm = new VendingMachine(initialState);
        Scanner input = new Scanner(System.in);
        int cash;
//First time press
        while(true){
            System.out.println("Want a drink? please enter cash: ");
            cash = input.nextInt();
            vm.pressButton(cash);
        }
    }

}
