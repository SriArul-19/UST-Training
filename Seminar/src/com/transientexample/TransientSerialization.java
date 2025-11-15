package com.transientexample;

import java.io.*;

public class TransientSerialization 
{
    public static void main(String[] args) 
    {
        try 
        {
            User u = new User("Arul", "pass123");
            
            FileOutputStream fos=new FileOutputStream("C:\\FileExamples\\D.ser");
            ObjectOutputStream oos =new ObjectOutputStream(fos);

            oos.writeObject(u);
            oos.close();
            fos.close();
            
            System.out.println("User Serialized");
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}
