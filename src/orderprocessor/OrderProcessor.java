/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orderprocessor;

import java.util.ArrayList;

/**
 *
 * @author Mark
 */
public class OrderProcessor {

    public static CashRegister register1;
    public static CashRegister register2;
    public static CashRegister register3;
    public static CashRegister register4;
    public static ArrayList<Item> inventory;
   public static BusinessAccount mainAccount;
    public static int transactions;// = 0;
   
   
   
    public static void main(String[] args) {
        transactions = 0;
        inventory = new ArrayList();
        mainAccount = new BusinessAccount();
        register1 = new CashRegister(1);
        register2 = new CashRegister(2);
        register3 = new CashRegister(3);
        register4 = new CashRegister(4);
        register1.start();
        register2.start();
        register3.start();
        register4.start();
    }
    
}
