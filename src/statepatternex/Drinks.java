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
public class Drinks {
    private String name;
    private int quantity;
    private int price;
    private StateControl state;

    public Drinks(String name, int quantity, int price, StateControl state) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.state = state;
    }

    public Drinks() {
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public StateControl getState() {
        return state;
    }

    public void setState(StateControl state) {
        this.state = state;
    }
    
    
    
    public void pressButton(VendingMachine vm, Drinks drink, int money) {
        state.pressSwitch(vm, drink, money);
    }

}
