package com.task.exceptionalhandling;

class InvalidCardException extends Exception 
{
    InvalidCardException(String msg) 
    {
        super(msg);
    }
}

public class PaymentSystem 
{
    public static void main(String[] args) 
    {
        String cardNumber = "12345678"; // invalid (less than 16 digits)

        try 
        {
            if (cardNumber.length() < 16) 
            {
                throw new InvalidCardException("Error: Card number must be 16 digits.");
            }
            System.out.println("Payment Processed Successfully!");
        } 
        catch (InvalidCardException e) 
        {
            System.out.println(e.getMessage());
        }
    }
}
