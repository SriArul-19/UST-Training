package com.task.thread;

class Stock extends Thread 
{
    String name;
    double price;

    Stock(String name, double price) 
    {
        this.name = name;
        this.price = price;
    }

    public void run() 
    {
        try 
        {
            while (true) 
            {
                price = price + (Math.random() * 10 - 5);
                Thread.sleep(3000);
            }
        } 
        catch (Exception e) 
        {
        	System.out.println(e);
        }
    }
}

public class StockMarket 
{
    public static void main(String[] args) 
    {
        Stock s1 = new Stock("UST", 3500);
        Stock s2 = new Stock("INFOSYS", 1500);

        s1.start();
        s2.start();

        while (true) 
        {
            System.out.println("UST Price: " + s1.price);
            System.out.println("INFOSYS Price: " + s2.price);
            System.out.println("------------------------");

            try 
            { 
            	Thread.sleep(2000); 
            } 
            catch (Exception e) 
            {
            	System.out.println(e);
            }
        }
    }
}
