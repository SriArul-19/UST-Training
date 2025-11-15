package com.task.methodsynchronization;

import java.io.*;

class Account implements Serializable 
{
    int accNo;
    double balance;

    Account(int accNo, double balance) 
    {
        this.accNo = accNo;
        this.balance = balance;
    }
}

class AccountSerializer 
{
    synchronized void saveTransaction(Account a) throws Exception 
    {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\MethodSynchronization\\account.ser", true));
        oos.writeObject(a);
        oos.close();
        System.out.println("Transaction saved for Acc No: " + a.accNo);
    }
}

public class AccountMain 
{
    public static void main(String[] args) 
    {
        AccountSerializer as = new AccountSerializer();

        Thread t1 = new Thread(() -> {
            try 
            { 
            	as.saveTransaction(new Account(101, 5000)); 
            } 
            catch (Exception e)
            {
            	System.out.println(e);
            }
        });

        Thread t2 = new Thread(() -> {
            try 
            { 
            	as.saveTransaction(new Account(102, 7000)); 
            }
            catch (Exception e) 
            {
            	System.out.println(e);
            }
        });

        t1.start();
        t2.start();
    }
}
