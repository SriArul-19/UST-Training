package com.serialization;

import java.io.*;

public class DeserializeObject 
{
    public static void main(String[] args) 
    {
        try 
        {
            FileInputStream fis = new FileInputStream("C:\\FileExamples\\C.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Employee e = (Employee) ois.readObject();

            System.out.println("ID: " + e.id);
            System.out.println("Name: " + e.name);

            ois.close();
            fis.close();
        } 
        catch (Exception ex) 
        {
            ex.printStackTrace();
        }
    }
}
