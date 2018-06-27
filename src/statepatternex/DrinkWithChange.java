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
public class DrinkWithChange extends StateControl{

    @Override
    public void pressSwitch(VendingMachine context, Drinks drink, int money) {
        if (drink.getQuantity() == 0) {
            System.out.println("Sorry!!This Drink is not available in the stock!!");
            drink.setState(new NoDrink());
        }
        else{
            if(money == drink.getPrice()){
               System.out.println("Congratulations!!You have successfully purchased the drink!!");
                drink.setQuantity(drink.getQuantity()-1);
                context.setBalance(drink.getPrice()+context.getBalance());
                drink.setState(new DrinkWithoutChange()); 
            }
            else if(money < drink.getPrice()){
                System.out.println("Sorry!! You do not have sufficient money to buy the drink!!");
                drink.setState(new InsufficientBalance());
            }
            else if((money > drink.getPrice()) && ((money-drink.getPrice())<context.getBalance())){
                System.out.println("You have successfully purchased with a change of Tk. "+(money-drink.getPrice()));
                drink.setQuantity(drink.getQuantity()-1);
                context.setBalance(drink.getPrice()+context.getBalance());
                drink.setState(new DrinkWithChange());
            }
        }
    }
    
}
