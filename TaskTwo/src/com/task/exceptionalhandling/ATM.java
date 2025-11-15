package com.task.exceptionalhandling;

class InsufficientFundsException extends Exception 
{
    InsufficientFundsException(String msg) 
    {
        super(msg);
    }
}

public class ATM 
{
    public static void main(String[] args) 
    {
        double balance = 5000;
        double withdraw = 7000;

        try 
        {
            if (withdraw > balance) 
            {
                throw new InsufficientFundsException("Alert: Insufficient funds!");
            }
            System.out.println("Withdraw Successful!");
        }
        catch (InsufficientFundsException e) 
        {
            System.out.println(e.getMessage());
        }
    }
}
