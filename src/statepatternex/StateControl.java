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
public abstract class StateControl {

    public abstract void pressSwitch(VendingMachine context, Drinks drink, int money);
}
