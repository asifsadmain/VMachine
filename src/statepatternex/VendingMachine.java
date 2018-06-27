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
public class VendingMachine {

    private StateControl state;
    private int balance = 100;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public StateControl getState() {
        return state;
    }

    public void setState(StateControl state) {
        this.state = state;
    }

    public VendingMachine(StateControl state) {
        this.state = state;
    }
    
}
