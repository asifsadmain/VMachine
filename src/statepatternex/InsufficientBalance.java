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
public class InsufficientBalance extends StateControl{

    @Override
    public void pressSwitch(VendingMachine context, int money) {
        if (context.getQuantity() == 0) {
            System.out.println("Sorry!!There are no drinks available in the stock!!");
            context.setState(new NoDrink());
        }
        else{
            if(money == 50){
               System.out.println("Congratulations!!You have successfully purchased the drink!!");
                context.setQuantity(context.getQuantity()-1);
                context.setBalance(50+context.getBalance());
                context.setState(new DrinkWithoutChange()); 
            }
            else if(money < 50){
                System.out.println("Sorry!! You do not have sufficient money to buy the drink!!");
                context.setState(new InsufficientBalance());
            }
            else if((money > 50) && ((money-50)<context.getBalance())){
                System.out.println("You have successfully purchased with a change of Tk. "+(money-50));
                context.setQuantity(context.getQuantity()-1);
                context.setBalance(50+context.getBalance());
                context.setState(new DrinkWithChange());
            }
        }
    }
    
}
