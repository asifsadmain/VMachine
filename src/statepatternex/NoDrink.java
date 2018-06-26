/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statepatternex;

/**
 *
 * @author asif
 */
public class NoDrink extends StateControl {

    @Override
    public void pressSwitch(VendingMachine context, int money) {
        System.out.println("Sorry!!There are no drinks available in the stock!!");
        context.setState(new NoDrink());
    }
}
