package com.task.thread;

class StatusUpdater extends Thread 
{
    public void run() 
    {
        try
        {
            for (int i = 1; i <= 5; i++) 
            {
                System.out.println("Status: Order is on the way... " + i);
                Thread.sleep(5000);
            }
        } 
        catch (Exception e) 
        {
        	System.out.println(e);
        }
    }
}

class DeliveryTimePrinter extends Thread 
{
    public void run() 
    {
        try 
        {
            for (int i = 30; i >= 10; i -= 5) 
            {
                System.out.println("Estimated Delivery: " + i + " minutes");
                Thread.sleep(5000);
            }
        } 
        catch (Exception e) 
        {
        	System.out.println(e);
        }
    }
}

public class FoodDeliveryApp 
{
    public static void main(String[] args) 
    {
        new StatusUpdater().start();
        new DeliveryTimePrinter().start();
    }
}
